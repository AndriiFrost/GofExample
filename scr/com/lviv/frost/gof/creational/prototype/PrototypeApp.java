package com.lviv.frost.gof.creational.prototype;

public class PrototypeApp {
    public static void main(String[] args) {
        Project master = new Project(1, "first", "source code");
        System.out.println(master);
        ProjectFactory projectFactory = new ProjectFactory(master);

        Project project = projectFactory.cloneProject();
        System.out.println(project);
        project.setName("second");

        System.out.println(master);
        System.out.println(project);
    }
}
