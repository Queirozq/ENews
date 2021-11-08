package com.queiroz.ENews.resources;

import com.queiroz.ENews.DTO.NewsDTO;
import com.queiroz.ENews.entities.News;
import com.queiroz.ENews.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

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
    public ResponseEntity<News> findById(@PathVariable Long id){
        News news = service.findById(id);
        return ResponseEntity.ok().body(news);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<NewsDTO> update(@PathVariable Long id, @RequestBody NewsDTO obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<NewsDTO> insert(@RequestBody NewsDTO obj){
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }
}
