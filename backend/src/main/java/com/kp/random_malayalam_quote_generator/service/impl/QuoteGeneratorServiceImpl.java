package com.kp.random_malayalam_quote_generator.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.kp.random_malayalam_quote_generator.client.QuoteClient;
import com.kp.random_malayalam_quote_generator.document.QuoteGeneratedCounter;
import com.kp.random_malayalam_quote_generator.dto.AdviceDTO;
import com.kp.random_malayalam_quote_generator.dto.QuoteResponseDTO;
import com.kp.random_malayalam_quote_generator.dto.SlipDTO;
import com.kp.random_malayalam_quote_generator.repository.QuoteGeneratedCounterRepository;
import com.kp.random_malayalam_quote_generator.service.QuoteGeneratorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.kp.random_malayalam_quote_generator.constant.RandomQuoteGeneratorConstant.SERVICE_UNAVAILABLE;

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
    private final QuoteClient quoteClient;

    /**
     * This method is used to get random malayalam quote.
     *
     * @return QuoteResponseDTO
     */
    @Override
    public QuoteResponseDTO getMyMalayalamQuote() {

        log.info("[+] ഫംഗ്ഷൻ ഉദിച്ചുയരുന്നു : എന്റെ മലയാളം ഉദ്ധരണി നൽകുക().");

        log.info("[+] പ്രവർത്തന വിവരങ്ങൾ : എന്റെ മലയാളം ഉദ്ധരണി നൽകുക() : ഉദ്ധരണി എണ്ണൽ ശേഖരം വിളിക്കുന്നു.");

        QuoteGeneratedCounter counter = quoteGeneratedCounterRepository
                .findById("clicks")
                .orElseGet(
                        () -> {
                            QuoteGeneratedCounter quoteCounter = new QuoteGeneratedCounter();
                            quoteCounter.setCount(0);
                            quoteCounter.setId("clicks");
                            return quoteCounter;
                        }
                );

        log.info("[+] പ്രവർത്തന വിവരങ്ങൾ : എന്റെ മലയാളം ഉദ്ധരണി നൽകുക() : ഉദ്ധരണി എണ്ണൽ ശേഖരം : ഫലം -> {}.", counter);

        JsonNode response = quoteClient.getRandomQuote("application/json");


        QuoteResponseDTO quoteResponse = new QuoteResponseDTO();
//        quoteResponse.setMalayalamQuote(Optional.of(response).map(SlipDTO::getSlip).map(AdviceDTO::getAdvice).orElse(SERVICE_UNAVAILABLE));
        quoteResponse.setCount(counter.getCount());
        counter.incrementCount();

        quoteGeneratedCounterRepository.save(counter);

        log.info("[+] പ്രവർത്തന വിവരങ്ങൾ : എന്റെ മലയാളം ഉദ്ധരണി നൽകുക() : ഉദ്ധരണി എണ്ണൽ ശേഖരം : ഫലം രക്ഷിച്ചു -> {}.", counter);

        log.info("[+] പ്രവർത്തനം പൂർത്തിയായി : എന്റെ മലയാളം ഉദ്ധരണി നൽകുക() : ഉദ്ധരണി -> {}.", quoteResponse);

        return quoteResponse;
    }
}
