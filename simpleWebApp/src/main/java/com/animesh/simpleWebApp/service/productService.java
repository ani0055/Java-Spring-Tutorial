package com.animesh.simpleWebApp.service;

import com.animesh.simpleWebApp.model.product;
import com.animesh.simpleWebApp.respository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class productService {

    @Autowired
    ProductRepo repo ;

//    List<product> products = new ArrayList<>(Arrays.asList(
//            new product(101, "iPhone", 90000),
//            new product(102,"Galaxy Note 25",125000),
//            new product(103, "Lenovo LOQ", 100000)));

    public List<product> getProducts(){
        return repo.findAll();
    }

//    public List<product> getProducts(){
//        return products;
//    }

//    public product getProductById(int proId) {
//        return products.stream()
//                    .filter(p -> p.getProId() == proId)
//                    .findFirst().orElse(new product(100, "No item", 0));
//    }

    public product getProductById(int proId){
        return repo.findById(proId).orElse(new product());
    }

//    public void addProduct(product prod){
//        products.add(prod);
//    }

    public void addProduct(product prod){
        repo.save(prod);
    }

//    public void updateProduct(product prod) {
//        int index = 0;
//        for(int i =0 ; i<products.size(); i++){
//            if(products.get(i).getProId() == prod.getProId())
//                index = i;
//        }
//        products.set(index, prod);
//    }

    public void updateProduct(product prod){
        repo.save(prod);
    }

//    public void deleteProduct(int proId) {
//        int index = 0;
//        for(int i =0 ; i<products.size(); i++){
//            if(products.get(i).getProId() == proId)
//                index = i;
//        }
//        products.remove(index);
//    }

    public void deleteProduct(int proId){
        repo.deleteById(proId);
    }
}
