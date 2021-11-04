package com.queiroz.ENews.services;

import com.queiroz.ENews.entities.Section;
import com.queiroz.ENews.repositories.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SectionService {

    @Autowired
    private SectionRepository repository;

    public Page<Section> findAllPaged(Pageable pageable){
        return repository.findAll(pageable);
    }

    public Section findById(Long id){
        Optional<Section> section = repository.findById(id);
        return section.get();
    }
}
