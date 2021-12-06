package com.queiroz.ENews.services;

import com.queiroz.ENews.entities.EmailDTO;

public interface EmailService {

    void sendEmail(EmailDTO email);
}
