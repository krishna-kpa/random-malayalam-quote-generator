package com.kp.random_malayalam_quote_generator.service.impl;

import com.kp.random_malayalam_quote_generator.dto.QuoteResponseDTO;
import com.kp.random_malayalam_quote_generator.repository.QuoteGeneratedCounterRepository;
import com.kp.random_malayalam_quote_generator.service.QuoteGeneratorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Service
 * This Service is used to get all quote related functionalities
 *
 * @author Krishna Prasad A
 * @since 20-02-2025
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class QuoteGeneratorServiceImpl implements QuoteGeneratorService {

    private final QuoteGeneratedCounterRepository quoteGeneratedCounterRepository;

    /**
     * This method is used to get random malayalam quote.
     *
     * @return QuoteResponseDTO
     */
    @Override
    public QuoteResponseDTO getMyMalayalamQuote() {

        log.info("[+] ഫംഗ്ഷൻ ഉദിച്ചുയരുന്നു : എന്റെ മലയാളം ഉദ്ധരണി നൽകുക().");

        QuoteResponseDTO quoteResponse = new QuoteResponseDTO();
        quoteResponse.setMalayalamQuote("Hi");
        quoteResponse.setCount(10);

        log.info("[+] പ്രവർത്തനം പൂർത്തിയായി : എന്റെ മലയാളം ഉദ്ധരണി നൽകുക() : ഉദ്ധരണി -> {}.", quoteResponse);

        return quoteResponse;
    }
}
