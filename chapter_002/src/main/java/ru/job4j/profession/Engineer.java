package ru.job4j.profession;

public class Engineer extends Profession {
    private String currentProject;

    public Engineer(String name, String surname, String education, String birthday, String currentProject) {
        super(name, surname, education, birthday);
        this.currentProject = currentProject;
    }

    public String getCurrentProject() {
        return currentProject;
    }
}
