package com.kp.random_malayalam_quote_generator.client.fallback;

import com.fasterxml.jackson.databind.JsonNode;
import com.kp.random_malayalam_quote_generator.client.QuoteClient;
import com.kp.random_malayalam_quote_generator.dto.AdviceDTO;
import com.kp.random_malayalam_quote_generator.dto.SlipDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestHeader;

import static com.kp.random_malayalam_quote_generator.constant.RandomQuoteGeneratorConstant.SERVICE_UNAVAILABLE;

/**
 * Fallback
 * This is the fallback for QuoteClient
 *
 * @author Krishna Prasad A
 * @since 20-02-2025
 */
@Component
public class QuoteClientFallback implements QuoteClient {

    /**
     * This method is invoked when QuoteService is not available for this method.
     * @return QuoteResponseDTO
     */
    @Override
    public ResponseEntity<String> getRandomQuote(@RequestHeader("Accept") String accept) {
        AdviceDTO adviceDTO = new AdviceDTO(-1, SERVICE_UNAVAILABLE);
        SlipDTO quoteResponse = new SlipDTO(adviceDTO);
        return null;
    }
}

