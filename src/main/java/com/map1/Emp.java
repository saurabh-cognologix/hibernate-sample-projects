package com.map1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Emp {

    @Id
    private Integer employeeId;
    private String employeeName;

    @ManyToMany
    private List<Project> projectList;

    public Emp(Integer employeeId, String employeeName, List<Project> projectList) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.projectList = projectList;
    }

    public Emp() {
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }
}
