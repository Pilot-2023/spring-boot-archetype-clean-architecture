package ${package}.dataprovider;

import com.mongodb.client.result.DeleteResult;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;
import java.util.UUID;

import ${package}.document.${domain}Document;
import ${package}.mapper.${domain}MapperDataProviderNoSql;
import ${package}.domain.${domain};
import ${package}.exception.BusinessException;
import ${package}.exception.ExceptionCode;

@Service("${domain}DataProviderNoSql")
@RequiredArgsConstructor
public class ${domain}DataProviderNoSql implements ${domain}DataProviderPersistence {

    private final MongoTemplate mongo;
    private final ${domain}MapperDataProviderNoSql mapper;

    @Override
    public ${domain} create(${domain}  ${domain.toLowerCase()}) {
        ${domain}Document document = mapper.to${domain}Document( ${domain.toLowerCase()});
        // if the ID is not given, generate a random one
        if (!StringUtils.hasText(document.getId())) {
            document.setId(UUID.randomUUID().toString());
        }
        document = mongo.save(document);
        return mapper.to${domain}(document);
    }

    @Override
    public ${domain} getById(String id) {
        ${domain}Document document = getDocumentById(id);
        return mapper.to${domain}(document);
    }

    @Override
    public ${domain} update(String id, ${domain} ${domain.toLowerCase()}) {
        ${domain}Document document = getDocumentById(id);
        mapper.update${domain}Document(document,  ${domain.toLowerCase()});
        document = mongo.save(document);
        return mapper.to${domain}(document);
    }

    @Override
    public void deleteById(String id) {
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        DeleteResult result = mongo.remove(query, ${domain}Document.class);
        if (result.getDeletedCount() == 0) {
            throw new BusinessException(ExceptionCode.NOT_FOUND, String.format(" ${domain.toLowerCase()} %s not found", id));
        }
    }

    private ${domain}Document getDocumentById(String id) {
        Query query = new Query().addCriteria(Criteria.where("id").is(id));
        ${domain}Document document = mongo.findOne(query, ${domain}Document.class);
        document = Optional.ofNullable(document).orElseThrow(() ->
                new BusinessException(ExceptionCode.NOT_FOUND, String.format(" ${domain.toLowerCase()} %s not found", id))
        );
        return document;
    }

}