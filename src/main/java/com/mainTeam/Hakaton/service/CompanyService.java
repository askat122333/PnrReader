package com.mainTeam.Hakaton.service;

import com.mainTeam.Hakaton.entity.Company;
import com.mainTeam.Hakaton.repository.CompanyRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CompanyService {
    CompanyRepo companyRepo;
    public String getByCompanyCode (String companyCode) {
        return companyRepo.getByCompanyCode(companyCode);
    }
    public Company getCompanyById (Long id) {
        return   companyRepo.findById(id).get();
    }
    public List<Company> getAllCompany () {
        return companyRepo.findAll();
    }
    public Company saveCompany(Company company  ) {
        return     companyRepo.save(company);
    }

    public Company updateCompany (Company company) {
        Company company1 = companyRepo.findById(company.getId()).get();
        company1.setCompanyName(company.getCompanyName());
        company1.setCompanyCode(company.getCompanyCode());
        return companyRepo.save(company1);
    }

    public String deleteCompany  (Long id) {
        companyRepo.deleteById(id);
        return  "Delete" ;
    }
}
