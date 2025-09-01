package org.example.EcommerceSpring.services;

import java.io.IOException;
import java.util.List;
import org.example.EcommerceSpring.dto.CategoryDTO;
import org.example.EcommerceSpring.gateway.ICategoryGateway;
import org.springframework.stereotype.Service;

@Service
public class FakeStoreCategoryService implements ICategoryService {
    private final ICategoryGateway categoryGateway;

    public FakeStoreCategoryService(ICategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    @Override
    public List<CategoryDTO> getALLCategories() throws IOException {
        return this.categoryGateway.getALLCategories();
    }

}
