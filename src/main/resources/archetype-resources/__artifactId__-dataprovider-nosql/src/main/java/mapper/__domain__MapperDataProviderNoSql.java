package ${package}.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import ${package}.document.${domain}Document;
import ${package}.domain.${domain};

@Mapper(componentModel = "spring")
public interface ${domain}MapperDataProviderNoSql {

    ${domain} to${domain}(${domain}Document document);

    @Mapping(target = "dbId", ignore = true)
    @Mapping(target = "id", ignore = true) // do no let update the ID
    void update${domain}Document(@MappingTarget ${domain}Document document, ${domain} ${domain.toLowerCase()});

    @Mapping(target = "dbId", ignore = true)
    ${domain}Document to${domain}Document(${domain} ${domain.toLowerCase()});

}