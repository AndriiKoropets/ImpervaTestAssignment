package com.koropets.imperva.service;

import com.koropets.imperva.dto.Beverage;

public interface UserService {
    Beverage buyBeverage(String codeBarres, String vendorMachineUuid);
}
