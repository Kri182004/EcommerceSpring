package org.example.EcommerceSpring.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

import org.example.EcommerceSpring.dto.CategoryDTO;
import org.example.EcommerceSpring.services.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private ICategoryService categoryService;
     CategoryController(ICategoryService _categoryService){
        this.categoryService=_categoryService;
    }
    @GetMapping
    public List<CategoryDTO> getAllCategories() throws IOException{
         return this.categoryService.getALLCategories();
    }
}
