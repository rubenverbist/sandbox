package be.agiletwist.vconsult.domain;

public class Prescriber {
    private DoctorNumber doctorNumber;
    private String name;

    public Prescriber() {
    }

    public static Builder newPrescriber() {
        return new Builder();
    }

    public DoctorNumber getDoctorNumber() {
        return doctorNumber;
    }

    public String getName() {
        return name;
    }


    public static class Builder {
        private Prescriber prescriber = new Prescriber();

        public Prescriber build() {
            return this.prescriber;
        }

        public Builder withDoctorNumber(DoctorNumber doctorNumber) {
            prescriber.doctorNumber = doctorNumber;
            return this;
        }

        public Builder withName(String name) {
            prescriber.name = name;
            return this;
        }
    }
}
