package com.ironhack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "billable_tasks")
public class BillableTask extends Task {
    @Column(nullable = false)
    private Double hourlyRate;

    public BillableTask() {}
    public BillableTask(LocalDate dueDate, Boolean status, Double hourlyRate) {
        super(dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
