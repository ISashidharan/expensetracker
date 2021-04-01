package com.sash.expensetracker.controllers;

import com.sash.expensetracker.database.Transaction;
import com.sash.expensetracker.database.TransactionDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/transaction")
@RestController
public class TransactionController {


    @GetMapping(value = {"/", ""})
    public String index () {
        return "index";
    }

    @PostMapping("/addTransaction")
    public Transaction addTransaction (TransactionDTO transDTO) {
        

        return null;
    }
}
