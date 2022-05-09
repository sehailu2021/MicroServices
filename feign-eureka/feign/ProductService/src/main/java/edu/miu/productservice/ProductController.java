package edu.miu.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class
ProductController {
    @Autowired
    ProductFeignClient productClient;


    @GetMapping("/product/{productNumber}")
    public int getProductNumberInStock(@PathVariable("productNumber") String productNumber) {
        int numProductInStock= productClient.getProductNumberInStock(productNumber);
        return numProductInStock;
    }
    @FeignClient(name = "ProductService", url = "http://localhost:8900")
    interface ProductFeignClient{
        @RequestMapping("/stock/{productNumber}")
         int getProductNumberInStock(@PathVariable("productNumber") String productNumber);
    }
}
