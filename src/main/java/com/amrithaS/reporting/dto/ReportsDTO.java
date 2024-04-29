package com.amrithaS.reporting.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ReportsDTO {
    private Integer reportId;
    private String name;
    private String description;
    private String location;

}
