package com.lviv.frost.gof.prototype;

public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project){
        this.project = project;
    }

    Project cloneProject(){
        return project.copy();
    }
}
