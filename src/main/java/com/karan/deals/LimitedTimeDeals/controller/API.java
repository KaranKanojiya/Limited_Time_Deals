package com.karan.deals.LimitedTimeDeals.controller;

import com.karan.deals.LimitedTimeDeals.model.Product;
import com.karan.deals.LimitedTimeDeals.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class API {


    @Autowired Service service;

    // Create a deal with price and number of items to be sold as part of the deal
    @PostMapping("/product/createDeal")
    public Product createDeal(@RequestBody Product product) {
     Product p=new Product(1L,"CellPhone",true,10000,10,"1/30/2022");

     System.out.println(p.toString());
     return p;
    }


//  End a deal :
    @PostMapping("/product/endDeal")
    public Product endDeal(@RequestBody Product product) {
        product.setDealActivate(false);
        return product;
    }

//  Update a deal to increase the number of items or end time
    @PutMapping("/product/updateProduct")
    public Product updateProduct(@RequestBody Product product) {
         // fetch the record by Pid
         // logic to increase quantity and offer period
         //db update .save
        return product;

    }
//   Claim a deal:
    @PostMapping("user/product/claimDeal")
    public String claimDeal(@RequestBody Product product) {
         // mapped the user with that product
            if(product.getLimitQuantity()>0){
                product.setLimitQuantity(product.getLimitQuantity()-1); // minus 1 since at a time user can claim max 1
                return "claim successfull";
            }
            else
                return "claim failed";
    }


}
