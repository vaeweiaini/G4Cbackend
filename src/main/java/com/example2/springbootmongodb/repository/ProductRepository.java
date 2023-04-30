package com.example2.springbootmongodb.repository;

import com.example2.springbootmongodb.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ProductRepository extends MongoRepository<Product, String> {
}
