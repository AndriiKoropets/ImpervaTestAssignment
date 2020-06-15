package com.koropets.imperva.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "Product_Beverage")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductBeverageEntity {

    @Id
    @SequenceGenerator(name = "product_beverage__id_seq", sequenceName = "product_beverage_id_seq")
    @GeneratedValue(strategy = SEQUENCE, generator = "product_beverage__id_seq")
    private int id;
    @OneToMany(mappedBy = "productBeverage", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<BeverageEntity> beverages;
    @OneToMany(mappedBy = "productBeverage", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<VendorMachineEntity> vendorMachines;
    private String codeBarres;
    private double price;
}
