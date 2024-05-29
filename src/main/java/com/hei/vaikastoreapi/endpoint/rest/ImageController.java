package com.hei.vaikastoreapi.endpoint.rest;

import com.hei.vaikastoreapi.model.Image;
import com.hei.vaikastoreapi.service.ImageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("image")
@AllArgsConstructor
public class ImageController {

    private ImageService imageService;


    @GetMapping
    public List<Image> getAllImage() {
        return imageService.findALl();
    }

    @DeleteMapping("/{id}")
    public void deleteImageById(@PathVariable String id) {
        imageService.toDelete(id);
    }

    @GetMapping("/{id}")
    public Image getById(@PathVariable String id) {
        return imageService.getById(id);
    }

    @PostMapping
    public Image save(@RequestBody Image image) {
        return imageService.save(image);
    }

}
