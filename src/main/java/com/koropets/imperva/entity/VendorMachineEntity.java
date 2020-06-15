package com.koropets.imperva.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "Vendor_Machine")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class VendorMachineEntity {

    @Id
    @SequenceGenerator(name = "v_machine__id_seq", sequenceName = "v_machine_id_seq")
    @GeneratedValue(strategy = SEQUENCE, generator = "v_machine__id_seq")
    private long id;
    private String uuid;
    private String location;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vendor_machine_id")
    private ProductBeverageEntity productBeverage;
}
