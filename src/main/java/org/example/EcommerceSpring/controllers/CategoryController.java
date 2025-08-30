package org.example.EcommerceSpring.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @GetMapping
    public String getCategories() {
        return "Electronics";
    }

    @GetMapping("/count")
    public String getCategoryCount() {
        return "5" ;
    }
    @DeleteMapping
    public String deleteCategory() {
        return "Category deleted" ;
    }
    
}
