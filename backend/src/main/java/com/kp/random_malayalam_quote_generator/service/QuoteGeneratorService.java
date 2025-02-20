package com.kp.random_malayalam_quote_generator.service;

import com.kp.random_malayalam_quote_generator.dto.QuoteResponseDTO;

/**
 * Service
 * This Service is used to get all quote related functionalities
 *
 * @author Krishna Prasad A
 * @since 20-02-2025
 */
public interface QuoteGeneratorService {

    /**
     * This method is used to get random malayalam quote.
     *
     * @return QuoteResponseDTO
     */
    QuoteResponseDTO getMyMalayalamQuote();
}
