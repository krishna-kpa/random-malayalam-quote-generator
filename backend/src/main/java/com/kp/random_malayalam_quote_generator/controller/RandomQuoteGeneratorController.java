package com.kp.random_malayalam_quote_generator.controller;

import com.kp.random_malayalam_quote_generator.dto.QuoteResponseDTO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;

/**
 * Controller
 * This controller is used for getting all the information related to quote
 *
 * @author Krishna Prasad A
 * @since 20-02-2025
 */
@OpenAPIDefinition(
        info = @Info(
                title = "Random Quote Generator Controller",
                description = "Controller for the Application, All requests are served with this controllers help"
        )
)
public interface RandomQuoteGeneratorController {

    /**
     * This method is used to Random Generated Malayalam Quote
     *
     * @return Response Entity of QuoteResponseDTO
     */
    @ApiResponse(
            responseCode = "200",
            description = "This method is used for getting random malayalam quote"
    )
    ResponseEntity<QuoteResponseDTO> getMyMalayalamQuote();
}
