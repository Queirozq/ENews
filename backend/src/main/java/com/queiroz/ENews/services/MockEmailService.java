package com.queiroz.ENews.services;

import com.queiroz.ENews.entities.EmailDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MockEmailService implements EmailService{

    private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);


    @Override
    public void sendEmail(EmailDTO email) {
        LOG.info("Sending email to " + email.getTo());
        LOG.info("Email sent!");
    }
}
