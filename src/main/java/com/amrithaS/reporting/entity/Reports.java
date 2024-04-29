package com.amrithaS.reporting.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="reports")
public class Reports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    private Integer reportId;

    @Column(name ="report_name")
    private String name;

    @Column(name ="report_description")
    private String description;

    @Column(name ="report_location")
    private String location;
}
