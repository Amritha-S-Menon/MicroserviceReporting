package com.amrithaS.reporting.service;

import com.amrithaS.reporting.dto.ReportsDTO;

import java.util.List;

public interface ReportsService {
    List<ReportsDTO> getAllReports();
    ReportsDTO getReportById(int id);
    String updateReport(ReportsDTO reportsDTO);
    String addReport(ReportsDTO reportsDTO);
    void deleteReport(int id);
}
