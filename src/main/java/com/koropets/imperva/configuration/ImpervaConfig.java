package com.koropets.imperva.configuration;

import com.koropets.imperva.mapper.BeverageMapper;
import com.koropets.imperva.mapper.VendorMachineMapper;
import com.koropets.imperva.repository.BeverageRepository;
import com.koropets.imperva.repository.VendorMachineRepository;
import com.koropets.imperva.service.AdminService;
import com.koropets.imperva.service.AdminServiceImpl;
import com.koropets.imperva.service.UserService;
import com.koropets.imperva.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImpervaConfig {

    @Bean
    public BeverageMapper beverageMapper() {
        return new BeverageMapper();
    }

    @Bean
    public VendorMachineMapper vendorMachineMapper() {
        return new VendorMachineMapper();
    }

    @Bean
    public AdminService adminService(VendorMachineRepository vendorMachineRepository,
                                     BeverageRepository beverageRepository,
                                     VendorMachineMapper vendorMachineMapper,
                                     BeverageMapper beverageMapper) {
        return new AdminServiceImpl(vendorMachineRepository, beverageRepository, vendorMachineMapper, beverageMapper);
    }

    @Bean
    public UserService userService(BeverageRepository beverageRepository) {
        return new UserServiceImpl(beverageRepository);
    }
}
