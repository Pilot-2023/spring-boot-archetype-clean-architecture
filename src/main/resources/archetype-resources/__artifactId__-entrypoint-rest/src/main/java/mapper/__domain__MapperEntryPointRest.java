package ${package}.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import ${package}.exception.BusinessException;
import ${package}.exception.ExceptionDto;

@Mapper(componentModel = "spring")
public interface ${domain}MapperEntryPointRest {

    @Mapping(target = "status", source = "httpStatusCode")
    ExceptionDto toExceptionDto(BusinessException e);

}