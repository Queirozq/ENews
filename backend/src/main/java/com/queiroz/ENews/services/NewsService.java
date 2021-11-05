package com.queiroz.ENews.services;

import com.queiroz.ENews.DTO.NewsDTO;
import com.queiroz.ENews.entities.News;
import com.queiroz.ENews.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public NewsDTO findById(Long id){
        Optional<News> news = repository.findById(id);
        return new NewsDTO(news.get());
    }
}
