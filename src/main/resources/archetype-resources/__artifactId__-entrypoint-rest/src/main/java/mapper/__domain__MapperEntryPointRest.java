package ${package}.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import ${package}.exception.BusinessException;
import ${package}.exception.ExceptionDto;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ${domain}MapperEntryPointRest {

    @Mapping(target = "status", source = "httpStatusCode")
    ExceptionDto toExceptionDto(BusinessException e);

}