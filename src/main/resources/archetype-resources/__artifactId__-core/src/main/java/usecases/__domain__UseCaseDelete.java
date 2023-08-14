package ${package}.usecases;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import ${package}.dataprovider.${domain}DataProviderPersistence;

@RequiredArgsConstructor
@Service
public class ${domain}UseCaseDelete {

    private final ${domain}DataProviderPersistence dataProvider;

    public Output execute(Input input) {
        dataProvider.deleteById(input.getId());
        return Output.builder().build();
    }

    @Getter
    @Builder
    public static class Input {
        private String id;
    }

    @Getter
    @Builder
    public static class Output {

    }

}