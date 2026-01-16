package com.example.transactionfilterapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @GetMapping("/transaction")
    public String processTransaction(@RequestParam(defaultValue = "0") String amount) {
        return "Transaction of Rs." + amount + " processed successfully.";
    }
}
