package com.mainTeam.Hakaton.repository;

import com.mainTeam.Hakaton.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepo extends JpaRepository<Company, Long> {

    @Query(value = "select company_name from company_name where company_code = :companyCode", nativeQuery = true)
    String getByCompanyCode(String companyCode);
}
