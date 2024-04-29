package com.amrithaS.reporting.service;

import com.amrithaS.reporting.dao.ReportsDAO;
import com.amrithaS.reporting.dto.ReportsDTO;
import com.amrithaS.reporting.entity.Reports;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class ReportsServiceImpl implements ReportsService {

    @Autowired
    private ReportsDAO reportsDAO;

    @Override
    public List<ReportsDTO> getAllReports() {
        List<ReportsDTO> reports = new ArrayList<>();
        List<Reports> eReports = reportsDAO.findAllReports();
        for(Reports eReport : eReports) {
            ReportsDTO reportsDTO = new ReportsDTO();
            reportsDTO.setReportId(eReport.getReportId());
            reportsDTO.setName(eReport.getName());
            reportsDTO.setDescription(eReport.getDescription());
            reportsDTO.setLocation(eReport.getLocation());
            reports.add(reportsDTO);
        }
        return reports;
    }

    @Override
    public ReportsDTO getReportById(int id) {
        ReportsDTO returnedReport = new ReportsDTO();
        Reports aReport = reportsDAO.getReferenceById(id);
        returnedReport.setReportId(aReport.getReportId());
        returnedReport.setName(aReport.getName());
        returnedReport.setDescription(aReport.getDescription());
        returnedReport.setLocation(aReport.getLocation());

        return returnedReport;
    }

    @Override
    public String updateReport(ReportsDTO reportsDTO) {
        //ReportsDTO returnedReport = new ReportsDTO();
        System.out.println("Entry");
        Reports aReport = reportsDAO.findReportById(reportsDTO.getReportId());
        System.out.println("agjk");
       // returnedReport.setReportId(aReport.getReportId());
        aReport.setName(reportsDTO.getName());
        aReport.setDescription(reportsDTO.getDescription());
        aReport.setLocation(reportsDTO.getLocation());
        System.out.println("Exit1");
        return "Report updated successfully";
    }

    @Override
    public String addReport(ReportsDTO reportsDTO) {
        Reports aReport = new Reports();
        aReport.setName(reportsDTO.getName());
        aReport.setDescription(reportsDTO.getDescription());
        aReport.setLocation(reportsDTO.getLocation());
        reportsDAO.saveAndFlush(aReport);
        return "Report added successfully";
    }

    @Override
    public String deleteReport(int id) {
      reportsDAO.deleteById(id);
       return "Report deleted successfully";
    }


}
