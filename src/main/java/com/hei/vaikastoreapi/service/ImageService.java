package com.hei.vaikastoreapi.service;

import com.hei.vaikastoreapi.model.Image;
import com.hei.vaikastoreapi.repository.ImageRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ImageService {
    private ImageRepository repository;
    @Transactional
    public Image save(Image toSave) {
        return repository.save(toSave);
    }
    @Transactional
    public void toDelete(String id) {
        repository.deleteById(id);
    }
    @Transactional
    public Image getById(String id) {
        return repository.getReferenceById(id);
    }
    @Transactional
    public List<Image> findALl() {
        return repository.findAll();
    }
}
