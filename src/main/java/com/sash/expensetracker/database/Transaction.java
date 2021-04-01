package com.sash.expensetracker.database;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Transaction {
    private Integer transactionId;
    private String category;
    private String name;
    private String description;
    private Double amount;
    private LocalDate date;
}
