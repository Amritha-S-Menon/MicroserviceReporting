package com.amrithaS.reporting.dao;

import com.amrithaS.reporting.entity.Reports;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportsDAO extends JpaRepository<Reports, Integer> {
}
