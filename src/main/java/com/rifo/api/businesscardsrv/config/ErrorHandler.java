package com.rifo.api.businesscardsrv.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

/**
 * For service controller
 * > Return 400 for bad request
 * > Return 424 for back end service interaction errors
 * > Return 500 for all other unknown errors
 * <p>
 * Refer to swagger files for the contract
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
public class ErrorHandler {

    private static final Logger logger = LoggerFactory.getLogger(ErrorHandler.class);

    @ExceptionHandler(Exception.class)
    public ResponseEntity handleInvalidResponseException(Exception ex) {
        logger.error("Exception occurred with detail:", ex);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ex.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity handleMcpBusinessRuleException(RuntimeException ex) {
        logger.error("RuntimeException occurred with detail:", ex);
        return ResponseEntity.status(BAD_REQUEST)
                .body(ex.getMessage());
    }
}
