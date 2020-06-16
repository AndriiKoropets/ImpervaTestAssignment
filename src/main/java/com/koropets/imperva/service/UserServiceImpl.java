package com.koropets.imperva.service;

import com.koropets.imperva.dto.Beverage;
import com.koropets.imperva.repository.BeverageRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.transaction.Transactional;

@Slf4j
@AllArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {

    private final BeverageRepository beverageRepository;

    @Override
    public Beverage buyBeverage(String codeBarres, String vendorMachineUuid) {
        return null;
    }
}
