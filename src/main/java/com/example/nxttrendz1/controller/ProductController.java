/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxttrendz1.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.nxttrendz1.model.*;

import com.example.nxttrendz1.service.ProductJpaService;

@RestController
public class ProductController {

    @Autowired
    public ProductJpaService productService;

    @GetMapping("/products")
    public ArrayList<Product> getProduct() {
        return productService.getProducts();
    }

    @PostMapping("/products")
    public Product addProduct(Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable("productId") int productId) {
        return productService.getProductById(productId);
    }

    @PutMapping("/products/{productId}")
    public Product updateProductById(@PathVariable("productId") int productId, @RequestBody Product product) {
        return productService.updateProductById(productId, product);
    }

    @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable("productId") int productId) {
        productService.deleteProduct(productId);
    }

}