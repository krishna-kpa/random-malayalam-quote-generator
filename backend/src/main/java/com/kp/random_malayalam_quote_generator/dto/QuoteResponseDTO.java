package com.kp.random_malayalam_quote_generator.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;

import static com.kp.random_malayalam_quote_generator.constant.RandomQuoteGeneratorConstant.*;

/**
 * DTO
 * This DTO will be the response for Quote Generator
 *
 * @author Krishna Prasad A
 * @since 20-02-2025
 */
@Setter
public class QuoteResponseDTO {

    @JsonProperty(QUOTE)
    private String malayalamQuote;

    @JsonProperty(COUNTED_VALUE)
    private Integer count;

    @JsonProperty(DEVELOPER)
    private String developer = KRISHNA_PRASAD_A;
}
