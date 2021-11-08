package com.queiroz.ENews.DTO;

import com.queiroz.ENews.entities.News;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class NewsDTO implements Serializable {

    private Long id;
    @NotBlank(message = "Não pode ser vazio")
    private String text;
    private String image;
    @NotBlank(message = "Precisa de um assunto")
    private String subject;

    public NewsDTO() {
    }

    public NewsDTO(News obj) {
        this.id = obj.getId();
        this.text = obj.getText();
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
