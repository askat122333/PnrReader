package com.mainTeam.Hakaton.repository;

import com.mainTeam.Hakaton.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepo extends JpaRepository<Company,Long> {
    Company getByCompanyCode(String companyCode);
}
