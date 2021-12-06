package com.queiroz.ENews.config;

import com.queiroz.ENews.services.EmailService;
import com.queiroz.ENews.services.SendGridEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

    @Bean
    public EmailService emailService(){
        return new SendGridEmailService();
    }
}
