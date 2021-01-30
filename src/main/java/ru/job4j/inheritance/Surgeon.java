package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private int operations;

    public Surgeon() {
        this.getName();
        this.getSurname();
        this.getEducation();
        this.getBirthday();
        this.getSpeciality();
        this.getExperience();
        this.operations = operations;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public String getEducation() {
        return super.getEducation();
    }

    @Override
    public int getBirthday() {
        return super.getBirthday();
    }

    @Override
    public String getSpeciality() {
        return super.getSpeciality();
    }

    @Override
    public String getExperience() {
        return super.getExperience();
    }

    public int getOperations() {
        return operations;
    }
}
