package com.kp.random_malayalam_quote_generator.client;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * Client
 * This will be the client for getting quote
 *
 * @author Krishna Prasad A
 * @since 20-02-2025
 */

@FeignClient(name = "quote-client", url = "https://api.adviceslip.com")
public interface QuoteClient {

    @GetMapping(value = "/advice", produces = "application/json")
    ResponseEntity<String> getRandomQuote(@RequestHeader("Accept") String accept);
}


