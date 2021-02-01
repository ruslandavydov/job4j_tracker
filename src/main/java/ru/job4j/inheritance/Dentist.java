package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int extraction;

    public Dentist(
            String name, String surname,
            String education, int birthday,
            String speciality, String experience
    ) {
        super(name, surname, education, birthday, speciality, experience);
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
