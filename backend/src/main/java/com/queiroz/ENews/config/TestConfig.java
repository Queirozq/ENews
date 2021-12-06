package com.queiroz.ENews.config;

import com.queiroz.ENews.services.EmailService;
import com.queiroz.ENews.services.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {


    @Bean
    public EmailService emailService(){
        return new MockEmailService();
    }
}
