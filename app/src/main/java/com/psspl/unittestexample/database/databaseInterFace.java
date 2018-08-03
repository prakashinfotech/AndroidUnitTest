package com.psspl.unittestexample.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by haresh
 * on 20-07-2018.
 */

@Dao
public interface databaseInterFace {
    @Query("SELECT * FROM Employee")
    List<EmployeeForm> getAll();

    @Insert
    void insertEmployee(EmployeeForm employeeForm);
}
