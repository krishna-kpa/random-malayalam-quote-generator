package com.kp.random_malayalam_quote_generator.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * Exception
 * This Exception is used when any external service are not working as expected
 *
 * @author Krishna Prasad A
 * @since 20-02-2025
 */
@Getter
public class RandomQuoteGeneratorServiceException extends RuntimeException {

    private final String applicationPropertyMessage;
    private final HttpStatus httpStatus;

    public RandomQuoteGeneratorServiceException(String applicationPropertyMessage, HttpStatus httpStatus, String message) {
        super(message);
        this.applicationPropertyMessage = applicationPropertyMessage;
        this.httpStatus = httpStatus;
    }
}
