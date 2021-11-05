package com.queiroz.ENews.resources;

import com.queiroz.ENews.DTO.NewsDTO;
import com.queiroz.ENews.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/news")
public class NewsResource {

    @Autowired
    private NewsService service;

    @GetMapping
    public ResponseEntity<Page<NewsDTO>> findAllPaged(Pageable pageable){
        Page<NewsDTO> news = service.findAllPaged(pageable);
        return ResponseEntity.ok().body(news);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<NewsDTO> findById(@PathVariable Long id){
        NewsDTO newsDTO = service.findById(id);
        return ResponseEntity.ok().body(newsDTO);
    }
}
