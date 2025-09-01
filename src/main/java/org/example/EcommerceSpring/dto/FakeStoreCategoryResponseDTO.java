package org.example.EcommerceSpring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
public class FakeStoreCategoryResponseDTO {
 private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
