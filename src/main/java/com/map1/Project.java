package com.map1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Project {
    @Id
    private Integer projectId;
    @Column(name="project_name")
    private String projectName;
    @ManyToMany(mappedBy="projectList")
    private List<Emp> empList;

    public Project() {
    }

    public Project(Integer projectId, String projectName, List<Emp> empList) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.empList = empList;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }
}
