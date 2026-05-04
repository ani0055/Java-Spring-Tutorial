package com.animesh.simpleWebApp.controller;

import com.animesh.simpleWebApp.model.product;
import com.animesh.simpleWebApp.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productController {

    // jackson library is responsible to convert object from json to object
    // by default the RequestMapping is GET but we can change that

    @Autowired
    productService service ;

    @GetMapping("/products")
    public List<product> getProducts(){
        return service.getProducts();
    }

    @RequestMapping("/products/{proId}")
    public product getProductById(@PathVariable int proId){
        return service.getProductById(proId);
    }

    @PostMapping("/products")
    public void addProduct( @RequestBody product prod){ // RequestBody handles the json data
        System.out.println(prod);
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{proId}")
    public void deleteProduct(@PathVariable int proId){
        service.deleteProduct(proId);
    }

}
