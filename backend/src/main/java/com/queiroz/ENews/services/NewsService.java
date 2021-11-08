package com.queiroz.ENews.services;

import com.queiroz.ENews.DTO.NewsDTO;
import com.queiroz.ENews.entities.News;
import com.queiroz.ENews.repositories.NewsRepository;
import com.queiroz.ENews.services.exceptions.DatabaseException;
import com.queiroz.ENews.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class NewsService {

    @Autowired
    private NewsRepository repository;


    @Transactional(readOnly = true)
    public Page<NewsDTO> findAllPaged(Pageable pageable){
        Page<News> news = repository.findAll(pageable);
        return news.map(x -> new NewsDTO(x));
    }

    @Transactional(readOnly = true)
    public News findById(Long id){
        Optional<News> news = repository.findById(id);
         return news.orElseThrow(() -> new ResourceNotFoundException("Id não encontrado"));
    }

    @Transactional
    public NewsDTO update(Long id, NewsDTO obj){
        try {
            News news = repository.getById(id);
            fromDTO(news, obj);
            news = repository.save(news);
            return new NewsDTO(news);
        }
        catch(EntityNotFoundException e){
            throw  new DatabaseException("Id não encontrado");
        }
    }

    @Transactional
    public NewsDTO insert(NewsDTO obj){
        News news = new News();
        fromDTO(news, obj);
        news = repository.save(news);
        return new NewsDTO(news);
    }

    private void fromDTO(News news, NewsDTO obj) {
        news.setText(obj.getText());
        news.setImage(obj.getImage());
        news.setSubject(obj.getSubject());
    }
}
