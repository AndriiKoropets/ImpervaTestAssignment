package com.koropets.imperva.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Beverage {
    @JsonIgnore
    private int id;
    private String name;
    private String address;
    private String consist;
    private String codeBarres;
    private double price;
    private VendorMachine vendorMachine;
}
