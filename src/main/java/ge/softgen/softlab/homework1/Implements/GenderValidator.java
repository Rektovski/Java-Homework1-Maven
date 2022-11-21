package ge.softgen.softlab.homework1.Implements;

import ge.softgen.softlab.homework1.Interface.Validator;

import java.util.Objects;

public class GenderValidator implements Validator {
    public String gender;

    public GenderValidator(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInfo() {
        return "Gender: " + gender;
    }

    @Override
    public boolean isValid() {
        return Objects.equals(gender, "MALE") || Objects.equals(gender, "FEMALE");
    }
}

