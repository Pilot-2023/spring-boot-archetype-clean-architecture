package ${package}.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import ${package}.api.${domain}Api;
import ${package}.domain.${domain};
import ${package}.usecases.${domain}UseCaseCreate;
import ${package}.usecases.${domain}UseCaseDelete;
import ${package}.usecases.${domain}UseCaseRead;
import ${package}.usecases.${domain}UseCaseUpdate;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ${domain}Controller implements ${domain}Api {

    private final ${domain}UseCaseCreate createUseCase;
    private final ${domain}UseCaseRead readUseCase;
    private final ${domain}UseCaseUpdate updateUseCase;
    private final ${domain}UseCaseDelete deleteUseCase;

    public ResponseEntity<${domain}> create${domain}(${domain} ${domain.toLowerCase()}) {
        log.info("creating ${domain.toLowerCase()} {}", ${domain.toLowerCase()});
        ${domain}UseCaseCreate.Input input = ${domain}UseCaseCreate.Input.builder()
            .${domain.toLowerCase()}(${domain.toLowerCase()})
            .build();
        ${domain}UseCaseCreate.Output output = createUseCase.execute(input);
        return new ResponseEntity<>(output.get${domain}(), HttpStatus.CREATED);
    }

    public ResponseEntity<${domain}> get${domain}(String id) {
        log.info("getting ${domain.toLowerCase()} {}", id);
        ${domain}UseCaseRead.Input input = ${domain}UseCaseRead.Input.builder()
            .id(id)
            .build();
        ${domain}UseCaseRead.Output output = readUseCase.execute(input);
        return new ResponseEntity<>(output.get${domain}(), HttpStatus.OK);
    }

    public ResponseEntity<${domain}> update${domain}(String id, ${domain} ${domain.toLowerCase()}) {
        log.info("updating ${domain.toLowerCase()} {} {}", id, ${domain.toLowerCase()});
        ${domain}UseCaseUpdate.Input input = ${domain}UseCaseUpdate.Input.builder()
            .id(id)
            .${domain.toLowerCase()}(${domain.toLowerCase()})
            .build();
        ${domain}UseCaseUpdate.Output output = updateUseCase.execute(input);
        return new ResponseEntity<>(output.get${domain}(), HttpStatus.OK);
    }

    public ResponseEntity<Void> delete${domain}(String id) {
        log.info("deleting ${domain.toLowerCase()} {}", id);
        ${domain}UseCaseDelete.Input input = ${domain}UseCaseDelete.Input.builder()
            .id(id)
            .build();
        ${domain}UseCaseDelete.Output output = deleteUseCase.execute(input);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}