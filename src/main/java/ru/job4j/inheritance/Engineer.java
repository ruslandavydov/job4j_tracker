package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String speciality;
    private String experience;

    public Engineer(
            String name, String surname,
            String education, int birthday,
            String speciality, String experience
    ) {
        super(name, surname, education, birthday);
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
