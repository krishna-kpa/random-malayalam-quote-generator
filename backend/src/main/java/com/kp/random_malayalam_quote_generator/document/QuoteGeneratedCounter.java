package com.kp.random_malayalam_quote_generator.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Document
 * This document is used to store, the number of times user generated the quote.
 *
 * @author Krishna Prasad A
 * @since 20-02-2025
 */
@Document("click-counter")
@Getter
@Setter
@AllArgsConstructor
public class QuoteGeneratedCounter {

    @Id
    private String id = "clicks";

    private Integer count;

    /**
     * This method is used to increment the count value.
     */
    public synchronized void incrementCount(){
            count ++;
    }
}
