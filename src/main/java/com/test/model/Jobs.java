/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.model;

/**
 *
 * @author ankur
 */
public class Jobs {
    
    private Integer jobId;
    private String reportTemplate;
    private String scheduleFreq;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getReportTemplate() {
        return reportTemplate;
    }

    public void setReportTemplate(String reportTemplate) {
        this.reportTemplate = reportTemplate;
    }

    public String getScheduleFreq() {
        return scheduleFreq;
    }

    public void setScheduleFreq(String scheduleFreq) {
        this.scheduleFreq = scheduleFreq;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private String status;

    public Jobs(Integer jobId, String reportTemplate, String scheduleFreq, String status) {
        this.jobId = jobId;
        this.reportTemplate = reportTemplate;
        this.scheduleFreq = scheduleFreq;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Jobs{" + "jobId=" + jobId + ", reportTemplate=" + reportTemplate + ", scheduleFreq=" + scheduleFreq + ", status=" + status + '}';
    }
    
    
}
