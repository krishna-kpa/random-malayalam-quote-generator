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
public class റാൻഡംമലയാളംഉദ്ധരണിജനറേറ്റർആപ്ലിക്കേഷൻ {

    public static void main(String[] args) {
        SpringApplication.run(റാൻഡംമലയാളംഉദ്ധരണിജനറേറ്റർആപ്ലിക്കേഷൻ.class, args);
    }

}
