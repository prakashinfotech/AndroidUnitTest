package com.psspl.unittestexample.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by haresh
 * on 20-07-2018.
 */
@Entity
public class EmployeeForm {
    @PrimaryKey(autoGenerate = true)
    private int employeeId;
    private String employeeName;
    private String employeeDesignation;


    public EmployeeForm(int employeeId, String employeeName, String employeeDesignation) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeForm that = (EmployeeForm) o;

        if (employeeId != that.employeeId) return false;
        if (employeeName != null ? !employeeName.equals(that.employeeName) : that.employeeName != null)
            return false;
        return employeeDesignation != null ? employeeDesignation.equals(that.employeeDesignation) : that.employeeDesignation == null;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + (employeeName != null ? employeeName.hashCode() : 0);
        result = 31 * result + (employeeDesignation != null ? employeeDesignation.hashCode() : 0);
        return result;
    }
}
