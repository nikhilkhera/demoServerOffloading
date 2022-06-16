package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class EmployeeController   
{  
    @Autowired
    private ProductServiceImpl productService;
    //mapping the getProduct() method to /product
    @GetMapping(value = "/calculate")
    //public List<Product> getProduct()
    public String getProduct()
    {
        /*
        //finds all the products
        List<Product> products = productService.findAll();
        //returns the product list
        */
        return "";

    }
} 
