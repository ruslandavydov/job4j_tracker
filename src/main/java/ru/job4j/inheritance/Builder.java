package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String specialization;

    public Builder() {
        this.getName();
        this.getSurname();
        this.getEducation();
        this.getBirthday();
        this.getSpeciality();
        this.getExperience();
        this.specialization = specialization;
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

    public String getSpecialization() {
        return specialization;
    }

    public String build(String buildHouse) {
        return buildHouse;
    }
}
