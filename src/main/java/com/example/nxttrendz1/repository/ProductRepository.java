/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxttrendz1.repository;

import java.util.*;
import com.example.nxttrendz1.model.*;

public interface ProductRepository {

    ArrayList<Product> getProducts();

    Product addProduct(Product product);

    Product getProductById(int productId);

    Product updateProductById(int productId, Product product);

    void deleteProduct(int productId);

}
