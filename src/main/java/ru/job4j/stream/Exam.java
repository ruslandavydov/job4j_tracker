package ru.job4j.stream;

public class Exam {
    private String mat;
    private String rus;
    private String eng;
    private String geo;
    private String bio;

    static class Builder {
        private String mat;
        private String rus;
        private String eng;
        private String geo;
        private String bio;

        Builder buildMat(String mat) {
            this.mat = mat;
            return this;
        }

        Builder buildRus(String rus) {
            this.rus = rus;
            return this;
        }

        Builder buildEng(String eng) {
            this.eng = eng;
            return this;
        }

        Builder buildGeo(String geo) {
            this.geo = geo;
            return this;
        }

        Builder buildBio(String bio) {
            this.bio = bio;
            return this;
        }

        Exam build() {
            Exam exam = new Exam();
            exam.mat = mat;
            exam.rus = rus;
            exam.eng = eng;
            exam.geo = geo;
            exam.bio = bio;
            return exam;
        }

        public static void main(String[] args) {
            Exam exam = new Builder().buildMat("mat")
                    .buildRus("rus")
                    .buildEng("eng")
                    .buildGeo("geo")
                    .buildBio("bio")
                    .build();
            System.out.println(exam);
        }
    }
}
