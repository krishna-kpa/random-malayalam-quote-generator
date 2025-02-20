package com.kp.random_malayalam_quote_generator.repository;

import com.kp.random_malayalam_quote_generator.document.QuoteGeneratedCounter;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repository
 * This repository is used for finding QuoteGeneratedCounter Document
 *
 * @author Krishna Prasad A
 * @since 20-02-2025
 */
public interface QuoteGeneratedCounterRepository extends MongoRepository<QuoteGeneratedCounter, String> {
}
