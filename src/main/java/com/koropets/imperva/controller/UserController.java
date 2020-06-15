package com.koropets.imperva.controller;

import com.koropets.imperva.dto.Beverage;
import com.koropets.imperva.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @DeleteMapping(value = "/beverages/{vendor_machine_uuid}/{code_barres}")
    public Beverage buyBeverage(@PathVariable(name = "vendor_machine_uuid") String  vendorUuid,
                                @PathVariable(name = "code_barres") String  codeBarres) {
        return userService.buyBeverage(codeBarres, vendorUuid);
    }
}
