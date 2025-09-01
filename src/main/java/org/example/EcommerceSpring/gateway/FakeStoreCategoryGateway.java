package org.example.EcommerceSpring.gateway;

import java.io.IOException;
import java.util.List;

import org.example.EcommerceSpring.dto.CategoryDTO;
import org.example.EcommerceSpring.dto.FakeStoreCategoryResponseDTO;
import org.example.EcommerceSpring.gateway.api.IFakeStoreCategoryApi;
import org.springframework.stereotype.Component;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway{
    private final IFakeStoreCategoryApi fakeStoreCategoryApi;
    public FakeStoreCategoryGateway(IFakeStoreCategoryApi fakeStoreCategoryApi) {
        this.fakeStoreCategoryApi=fakeStoreCategoryApi;
    }
    @Override
    public List<CategoryDTO> getALLCategories() throws IOException {
        //make the http request to fakestoreapi to fetch the all categories
       List<FakeStoreCategoryResponseDTO> response= this.fakeStoreCategoryApi.getAllFakeCategories().execute().body();
        System.out.println("API response: " + response);
        //check if the response is null and throw an exception
       if(response==null){
            throw new IOException("Failed to fetch categories from fake store api");
        }
        //convert the response to 
        return response.stream()
            .map(category -> CategoryDTO.builder()
                .name(category.getName())
                .build())
            .collect(java.util.stream.Collectors.toList());
        }
        
    }


