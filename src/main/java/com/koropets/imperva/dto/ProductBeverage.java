package com.koropets.imperva.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductBeverage {
    @JsonIgnore
    private int id;
    private List<Beverage> beverages;
    private List<VendorMachine> vendorMachines;
    private String codeBarres;
    private double price;
}
