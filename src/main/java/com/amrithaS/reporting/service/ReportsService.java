package com.amrithaS.reporting.service;

import com.amrithaS.reporting.dto.ReportsDTO;
import com.amrithaS.reporting.exception.ReportingServiceException;

import java.util.List;

public interface ReportsService {
    List<ReportsDTO> getAllReports() throws ReportingServiceException;
    ReportsDTO getReportById(int id) throws ReportingServiceException;
    String updateReport(ReportsDTO reportsDTO) throws ReportingServiceException;
    String addReport(ReportsDTO reportsDTO) throws ReportingServiceException;
    String deleteReport(int id) throws ReportingServiceException;
}
