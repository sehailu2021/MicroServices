package edu.miu.productserver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private String productNumber;
    private String productName;
    private int numberInStock;
}