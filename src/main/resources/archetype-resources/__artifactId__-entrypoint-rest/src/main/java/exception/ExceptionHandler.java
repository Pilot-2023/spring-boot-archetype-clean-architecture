package ${package}.exception;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import ${package}.mapper.${domain}MapperEntryPointRest;

@RestControllerAdvice
@RequiredArgsConstructor
public class ExceptionHandler {

    private final ${domain}MapperEntryPointRest mapper;

    @org.springframework.web.bind.annotation.ExceptionHandler(BusinessException.class)
    public ResponseEntity<ExceptionDto> handleBusinessException(BusinessException e, WebRequest request) {
        ExceptionDto exception = mapper.toExceptionDto(e);
        return new ResponseEntity<>(
                exception,
                new HttpHeaders(),
                HttpStatus.valueOf(exception.getStatus())
        );
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionDto> handleGenericException(Exception e, WebRequest request) {
        BusinessException businessException = new BusinessException(ExceptionCode.INTERNAL_SERVER_ERROR, e.getMessage());
        return handleBusinessException(businessException, request);
    }

}