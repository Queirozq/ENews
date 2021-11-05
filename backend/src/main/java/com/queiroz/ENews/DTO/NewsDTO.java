package com.queiroz.ENews.DTO;

import com.queiroz.ENews.entities.News;

import java.io.Serializable;
import java.time.Instant;

public class NewsDTO implements Serializable {

    private Long id;
    private String text;
    private Instant moment;
    private String image;
    private String subject;

    public NewsDTO() {
    }

    public NewsDTO(News obj) {
        this.id = obj.getId();
        this.text = obj.getText();
        this.moment = obj.getMoment();
        this.image = obj.getImage();
        this.subject = obj.getSubject();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
