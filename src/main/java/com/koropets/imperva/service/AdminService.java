package com.koropets.imperva.service;

import com.koropets.imperva.dto.Beverage;
import com.koropets.imperva.dto.VendorMachine;

import java.util.List;

public interface AdminService {
    VendorMachine getAllVendorMachineByUuid(String vendorMachineUuid);
    VendorMachine addVendorMachine(VendorMachine vendorMachine);
    void deleteVendorMachineByUuid(String vendorMachineUuid);
    List<VendorMachine> getAllVendorMachines();
    List<Beverage> getAllBeveragesByVendorMachine(String vendorMachineUuid);
    Beverage addBeverageToVendorMachine(Beverage beverage, String vendorMachineUuid);
    Beverage updatePrice(Beverage beverage, String vendorMachineUuid);
}
