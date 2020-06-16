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
public class VendorMachine {
    @JsonIgnore
    private int id;
    private String uuid;
    private String location;
    private List<Beverage> beverages;
}
