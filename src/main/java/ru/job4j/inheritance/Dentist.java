package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int extraction;

    public Dentist(int extraction) {
        this.getName();
        this.getSurname();
        this.getEducation();
        this.getBirthday();
        this.getSpeciality();
        this.getExperience();
        this.extraction = extraction;
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

    public int getExtraction() {
        return extraction;
    }
}
