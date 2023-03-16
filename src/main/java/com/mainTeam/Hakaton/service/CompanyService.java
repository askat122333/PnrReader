package com.mainTeam.Hakaton.service;

import com.mainTeam.Hakaton.entity.Company;
import com.mainTeam.Hakaton.entity.FlightNumber;
import com.mainTeam.Hakaton.repository.CompanyRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CompanyService {
    @Autowired
    CompanyRepo companyRepo;
    public Company getCompany (String companyPnr) {
        return companyRepo.getByCompanyPnr(companyPnr);
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
        company1.setCompanyPnr(company.getCompanyPnr());
        return companyRepo.save(company1);
    }

    public String deleteCompany  (Long id) {
        companyRepo.deleteById(id);
        return  "Delete" ;
    }
}
