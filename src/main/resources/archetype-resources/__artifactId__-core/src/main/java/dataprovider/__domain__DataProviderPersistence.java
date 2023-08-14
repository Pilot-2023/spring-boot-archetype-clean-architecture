package ${package}.dataprovider;

import ${package}.domain.${domain};

public interface ${domain}DataProviderPersistence {

    ${domain} create(${domain} ${domain.toLowerCase()});
    ${domain} getById(String id);
    ${domain} update(String id, ${domain} ${domain.toLowerCase()});
    void deleteById(String id);

}