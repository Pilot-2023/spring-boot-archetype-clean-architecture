package ${package}.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import ${package}.domain.${domain};

@RequestMapping("/api/v1/${domain.toLowerCase()}")
public interface ${domain}Api {

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    ResponseEntity<${domain}> create${domain}(@RequestBody ${domain} ${domain.toLowerCase()});

    @GetMapping(
            path = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    ResponseEntity<${domain}> get${domain}(@PathVariable String id);

    @PatchMapping(
            path = "/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    ResponseEntity<${domain}> update${domain}(
            @PathVariable String id,
            @RequestBody ${domain} ${domain.toLowerCase()}
    );

    @DeleteMapping(path = "/{id}")
    ResponseEntity<Void> delete${domain}(@PathVariable String id);

}