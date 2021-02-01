package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String specialization;

    public Builder(
            String name, String surname,
            String education, int birthday,
            String speciality, String experience,
            String specialization
    ) {
        super(name, surname, education, birthday, speciality, experience);
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
