package com.kp.random_malayalam_quote_generator.exception.handler;

import com.kp.random_malayalam_quote_generator.controller.impl.RandomQuoteGeneratorControllerImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;

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
}
