package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String speciality;
    private String experience;

    public Doctor() {
        this.getName();
        this.getSurname();
        this.getEducation();
        this.getBirthday();
        this.speciality = speciality;
        this.experience = experience;
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

    public String getSpeciality() {
        return speciality;
    }

    public String getExperience() {
        return experience;
    }
}
