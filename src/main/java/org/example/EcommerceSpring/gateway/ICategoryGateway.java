package org.example.EcommerceSpring.gateway;

import java.io.IOException;
import java.util.List;

import org.example.EcommerceSpring.dto.CategoryDTO;

public interface ICategoryGateway {
    List<CategoryDTO> getALLCategories() throws IOException;

}
