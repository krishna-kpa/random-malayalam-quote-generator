package com.kp.random_malayalam_quote_generator.exception.handler;

import com.kp.random_malayalam_quote_generator.controller.impl.RandomQuoteGeneratorControllerImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Controller Advice
 * This Controller Advice used for handling exceptions generated within Random Quote Generator
 *
 * @author Krishna Prasad A
 * @since 20-02-2025
 */
@ControllerAdvice(assignableTypes = {RandomQuoteGeneratorControllerImpl.class})
@Slf4j
public class RandomQuoteGeneratorControllerAdvice {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> generalExceptionHandler(Exception ex) {
        log.info("[+] ഫംഗ്ഷൻ ഉദിച്ചുയരുന്നു : സാമാന്യ വ്യതിയാന കൈകാര്യം().");
        log.error("[+] പിശക് -> {}.", ex.getMessage());
        return new ResponseEntity<>("എന്തോ തകരാറു സംഭവിച്ചു !", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
