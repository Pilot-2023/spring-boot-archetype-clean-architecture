package ${package}.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@ToString
@RequiredArgsConstructor
public enum ExceptionCode {
    INTERNAL_SERVER_ERROR("${domain.toUpperCase()}-001", HttpStatus.INTERNAL_SERVER_ERROR.value()),
    NOT_FOUND("${domain.toUpperCase()}-002", HttpStatus.NOT_FOUND.value()),
    ALREADY_EXISTS("${domain.toUpperCase()}-003", HttpStatus.CONFLICT.value());

    private final String code;
    private final int httpStatusCode;

}