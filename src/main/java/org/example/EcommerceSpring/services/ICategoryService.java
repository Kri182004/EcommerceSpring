package org.example.EcommerceSpring.services;

import java.io.IOException;
import java.util.List;

import org.example.EcommerceSpring.dto.CategoryDTO;

public interface ICategoryService {
    List<CategoryDTO> getALLCategories() throws IOException;
}
