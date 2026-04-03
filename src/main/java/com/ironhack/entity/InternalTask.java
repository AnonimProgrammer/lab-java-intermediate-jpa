package com.ironhack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "internal_tasks")
public class InternalTask extends Task {
    public InternalTask() {}
    public InternalTask(String title, LocalDate dueDate, Boolean status) {
        super(title, dueDate, status);
    }
}
