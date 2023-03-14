package com.mainTeam.Hakaton.service;

import com.mainTeam.Hakaton.entity.Month;
import com.mainTeam.Hakaton.repository.MonthRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class MonthService {
    @Autowired
    MonthRepo monthRepo;
    public Month getByMonthPnr (String monthPnr) {
        return monthRepo.getByMonthPnr(monthPnr);
    }
}
