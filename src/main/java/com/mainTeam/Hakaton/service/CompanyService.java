package com.mainTeam.Hakaton.service;

import com.mainTeam.Hakaton.entity.Company;
import com.mainTeam.Hakaton.repository.CompanyRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CompanyService {
    @Autowired
    CompanyRepo companyRepo;
    public Company getCompany (String companyPnr) {
        return companyRepo.getByCompanyPnr(companyPnr);
    }
}
