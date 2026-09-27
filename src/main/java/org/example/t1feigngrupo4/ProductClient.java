package org.example.t1feigngrupo4.ProductClient;

import org.example.t1feigngrupo4.ProductStoreDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "productClient", url = "https://fakestoreapi.com")
public interface ProductClient {

    @GetMapping("/products")
    List<ProductStoreDto> getProducts();
}
