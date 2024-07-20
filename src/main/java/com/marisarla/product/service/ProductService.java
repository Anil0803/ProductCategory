package com.marisarla.product.service;

import com.marisarla.product.model.Product;
import com.marisarla.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> findAllProductsByCategory(String category){
        return productRepository.findByCategory(category);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
