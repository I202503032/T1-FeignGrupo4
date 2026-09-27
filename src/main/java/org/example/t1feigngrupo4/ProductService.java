package org.example.t1feigngrupo4;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final org.example.t1feigngrupo4.ProductClient.ProductClient productClient;

    public ProductService(org.example.t1feigngrupo4.ProductClient.ProductClient productClient) {
        this.productClient = productClient;
    }

    public List<ProductStoreDto> getProductsFiltered() {

        return productClient.getProducts()
                .stream()
                .filter(product -> product.getPrice() > 50.0)
                .filter(product -> product.getCategory().equals("electronics"))
                .collect(Collectors.toList());
    }
}