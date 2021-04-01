package com.sash.expensetracker.database;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TransactionDTO {
    private String category;
    private String name;
    private String description;
    private Double amount;
    private LocalDate date;
}
