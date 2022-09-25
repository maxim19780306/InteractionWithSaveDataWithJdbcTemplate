package com.example.InteractionWithSaveDataWithJdbcTemplate.models;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class Purchase {

    private int id;
    private String product;
    private BigDecimal price;


}
