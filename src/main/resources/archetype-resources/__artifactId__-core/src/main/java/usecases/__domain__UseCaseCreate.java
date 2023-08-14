package ${package}.usecases;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import ${package}.dataprovider.${domain}DataProviderPersistence;
import ${package}.domain.${domain};

@RequiredArgsConstructor
@Service
public class ${domain}UseCaseCreate {

    private final ${domain}DataProviderPersistence dataProvider;

    public Output execute(Input input) {
        ${domain} ${domain.toLowerCase()} = dataProvider.create(input.get${domain}());
        return Output.builder()
                .${domain.toLowerCase()}(${domain.toLowerCase()})
                .build();
    }

    @Getter
    @Builder
    public static class Input {
        private ${domain} ${domain.toLowerCase()};
    }

    @Getter
    @Builder
    public static class Output {
        private ${domain} ${domain.toLowerCase()};
    }

}