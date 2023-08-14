package ${package}.exception;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

    private final String code;
    private String reason;
    private final String message;
    private final int httpStatusCode;

    public BusinessException(ExceptionCode code, String reason, String message) {
        super(message);
        this.code = code.getCode();
        this.reason = reason;
        this.message = message;
        this.httpStatusCode = code.getHttpStatusCode();
    }

    public BusinessException(ExceptionCode code, String message) {
        super(message);
        this.code = code.getCode();
        this.message = message;
        this.httpStatusCode = code.getHttpStatusCode();
    }

}
