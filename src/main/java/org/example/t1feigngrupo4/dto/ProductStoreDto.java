package org.example.t1feigngrupo4.dto;

public class ProductStoreDto {

    private Integer id;
    private String title;
    private Double price;
    private String category;
    public ProductStoreDto() {
    }
    public ProductStoreDto(Integer id, String title, Double price, String category) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.category = category;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}