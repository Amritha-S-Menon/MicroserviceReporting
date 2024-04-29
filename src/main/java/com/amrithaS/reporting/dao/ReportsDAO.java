package com.amrithaS.reporting.dao;

import com.amrithaS.reporting.entity.Reports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReportsDAO extends JpaRepository<Reports, Integer> {

    @Query("select i from Reports i where i.reportId=:id")
    Reports findReportById(Integer id);

    @Query("select i from Reports i order by i.reportId")
    List<Reports> findAllReports();
}
