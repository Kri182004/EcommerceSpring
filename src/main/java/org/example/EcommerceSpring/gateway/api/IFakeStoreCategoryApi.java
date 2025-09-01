package org.example.EcommerceSpring.gateway.api;

import java.io.IOException;
import java.util.List;

import org.example.EcommerceSpring.dto.FakeStoreCategoryResponseDTO;
import org.springframework.stereotype.Component;

import retrofit2.Call;
import retrofit2.http.GET;

@Component
public interface IFakeStoreCategoryApi {
    @GET("products/categories")
   Call<List<FakeStoreCategoryResponseDTO>> getAllFakeCategories() throws IOException;
}
