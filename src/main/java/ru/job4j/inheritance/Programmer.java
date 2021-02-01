package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String compLang;

    public Programmer(
            String name, String surname,
            String education, int birthday,
            String speciality, String experience,
            String specialization
    ) {
        super(name, surname, education, birthday, speciality, experience);
        this.compLang = compLang;
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

    public String getCompLang() {
        return compLang;
    }

    public String writProg(String progName) {
        return progName;
    }
}
