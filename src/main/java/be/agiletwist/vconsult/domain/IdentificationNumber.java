package be.agiletwist.vconsult.domain;

public abstract class IdentificationNumber {
    private String value;
    public IdentificationNumber(String value){
        this.value = value;
    }
    public final String getValue() {
        return value;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdentificationNumber that = (IdentificationNumber) o;

        return value != null ? value.equals(that.value) : that.value == null;
    }

    @Override
    public final int hashCode() {
        return value != null ? value.hashCode() : 0;
    }


}
