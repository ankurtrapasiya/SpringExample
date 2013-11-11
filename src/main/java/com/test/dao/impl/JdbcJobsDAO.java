package com.test.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.test.dao.JobsDAO;
import com.test.model.Jobs;
import java.util.ArrayList;
import java.util.List;

public class JdbcJobsDAO implements JobsDAO {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /*public void insert(Customer customer){
		
     String sql = "INSERT INTO jobs " +
     "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
     Connection conn = null;
		
     try {
     conn = dataSource.getConnection();
     PreparedStatement ps = conn.prepareStatement(sql);
     ps.setInt(1, customer.getCustId());
     ps.setString(2, customer.getName());
     ps.setInt(3, customer.getAge());
     ps.executeUpdate();
     ps.close();
			
     } catch (SQLException e) {
     throw new RuntimeException(e);
			
     } finally {
     if (conn != null) {
     try {
     conn.close();
     } catch (SQLException e) {}
     }
     }
     }*/
   /* public Customer findByCustomerId(int custId) {

        String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";

        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, custId);
            Customer customer = null;
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                customer = new Customer(
                        rs.getInt("CUST_ID"),
                        rs.getString("NAME"),
                        rs.getInt("Age"));
            }
            rs.close();
            ps.close();
            return customer;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
    }*/

    public List<Jobs> getAllJobs() {
        String sql = "SELECT * FROM jobs";

        Connection conn = null;
        List<Jobs> jobs = new ArrayList<Jobs>();

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            Jobs job = null;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                job = new Jobs(
                        rs.getInt("jobid"),
                        rs.getString("report_template"),
                        rs.getString("schedule_freq"),
                        rs.getString("status"));
                jobs.add(job);
            }
            rs.close();
            ps.close();
            return jobs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
    }
}
