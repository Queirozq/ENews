package com.queiroz.ENews.resources;

import com.queiroz.ENews.entities.Section;
import com.queiroz.ENews.services.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sections")
public class SectionResource {

    @Autowired
    private SectionService service;

    @GetMapping
    public ResponseEntity<Page<Section>> findAll(Pageable pageable){
        Page<Section> sections = service.findAllPaged(pageable);
        return ResponseEntity.ok().body(sections);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Section> findById(@PathVariable Long id){
        Section section = service.findById(id);
        return ResponseEntity.ok().body(section);
    }
}
