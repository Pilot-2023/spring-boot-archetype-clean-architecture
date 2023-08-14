package ${package}.usecases;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import ${package}.dataprovider.${domain}DataProviderPersistence;
import ${package}.domain.${domain};

@RequiredArgsConstructor
@Service
public class ${domain}UseCaseRead {

    private final ${domain}DataProviderPersistence dataProvider;

    public Output execute(Input input) {
        ${domain} ${domain.toLowerCase()} = dataProvider.getById(input.getId());
        return Output.builder()
                .${domain.toLowerCase()}(${domain.toLowerCase()})
                .build();
    }

    @Getter
    @Builder
    public static class Input {
        private String id;
    }

    @Getter
    @Builder
    public static class Output {
        private ${domain} ${domain.toLowerCase()};
    }

}