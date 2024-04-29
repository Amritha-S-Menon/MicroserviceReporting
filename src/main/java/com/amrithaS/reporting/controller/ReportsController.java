package com.amrithaS.reporting.controller;


import com.amrithaS.reporting.dto.ReportsDTO;
import com.amrithaS.reporting.service.ReportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/v1/services")
public class ReportsController {

    @Autowired
    private ReportsService reportsService;

    @GetMapping("/getAllReports")
    public ResponseEntity<List<ReportsDTO>> getAllReports() {
        try {
            return new ResponseEntity<>(reportsService.getAllReports(), HttpStatus.OK);
        }
        catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }

    @GetMapping("/getReportByReportId/{id}")
    public ResponseEntity<ReportsDTO> getReportByReportId(@RequestParam(name="id") Integer reportId) {
        try {
            return new ResponseEntity<>(reportsService.getReportById(reportId), HttpStatus.OK);
        }
        catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }

    @PostMapping("/addReport")
    public ResponseEntity<String> addReport(@RequestBody ReportsDTO reportsDTO) {
        try {
            return new ResponseEntity<>(reportsService.addReport(reportsDTO), HttpStatus.OK);
        }
        catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }

    @PutMapping("/updateReport")
    public ResponseEntity<String> updateReport(@RequestBody ReportsDTO reportsDTO) {
        try {
            return new ResponseEntity<>(reportsService.updateReport(reportsDTO), HttpStatus.OK);
        }
        catch (Exception e){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }
}
