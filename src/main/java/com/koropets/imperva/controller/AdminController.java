package com.koropets.imperva.controller;

import com.koropets.imperva.dto.Beverage;
import com.koropets.imperva.dto.VendorMachine;
import com.koropets.imperva.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping(value = "/vendorMachines/")
    public List<VendorMachine> getAllVendorMachines() {
        return adminService.getAllVendorMachines();
    }

    @GetMapping(value = "/vendorMachines/beverages/{vendor_machine_uuid}")
    public List<Beverage> getAllBeveragesByVendorMachine(@PathVariable(name = "vendor_machine_uuid") String  vendorUuid) {
        return adminService.getAllBeveragesByVendorMachine(vendorUuid);
    }

    @PostMapping(value = "/vendorMachines/beverages/{vendor_machine_uuid}")
    public Beverage addBeverageToVendorMachine(@RequestBody Beverage beverage, @PathVariable(name = "vendor_machine_uuid") String  vendorUuid) {
        return adminService.addBeverageToVendorMachine(beverage, vendorUuid);
    }

    @PatchMapping(value = "/vendorMachines/beverages/{vendor_machine_uuid}")
    public Beverage updatePrice(@RequestBody Beverage beverage, @PathVariable(name = "vendor_machine_uuid") String  vendorUuid) {
        return adminService.updatePrice(beverage, vendorUuid);
    }
}
