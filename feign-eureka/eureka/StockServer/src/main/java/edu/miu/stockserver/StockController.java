package edu.miu.stockserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StockController {

    @GetMapping("/stock/{productNumber}")
    public int getProductNumberInStock(@PathVariable("productNumber") String productNumber){
        return 15;
    }

    }


