package com.ironhack.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@MappedSuperclass
public abstract class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private LocalDate dueDate = LocalDate.now();

    @Column(nullable = false)
    private Boolean status = Boolean.FALSE;

    public Task() {}
    public Task(LocalDate dueDate, Boolean status) {
        this.dueDate = dueDate;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
