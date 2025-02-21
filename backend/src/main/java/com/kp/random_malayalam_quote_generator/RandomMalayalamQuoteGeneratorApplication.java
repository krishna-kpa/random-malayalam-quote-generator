package com.kp.random_malayalam_quote_generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * പ്രധാന ക്ലാസ്
 *
 * @author Krishna Prasad A
 * @since 20-02-2025
 */
@SpringBootApplication
@EnableFeignClients
public class RandomMalayalamQuoteGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(RandomMalayalamQuoteGeneratorApplication.class, args);
    }

}
