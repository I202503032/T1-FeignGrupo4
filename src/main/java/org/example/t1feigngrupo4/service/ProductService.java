package org.example.t1feigngrupo4.service;

import org.example.t1feigngrupo4.client.ProductClient;
import org.example.t1feigngrupo4.dto.ProductStoreDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductClient productClient;
    public ProductService(ProductClient productClient) {
        this.productClient = productClient;
    }
    public List<ProductStoreDto> getProducts() {
        return productClient.getProducts()
                .stream()
                .filter(product -> product.getPrice() != null
                        && product.getPrice() > 50.0)
                .filter(product -> product.getCategory() != null
                        && product.getCategory().equalsIgnoreCase("electronics"))
                .toList();
    }
}