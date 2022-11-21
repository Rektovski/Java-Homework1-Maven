package ge.softgen.softlab.homework1.Implements;

import ge.softgen.softlab.homework1.Interface.Validator;

public class IdValidator implements Validator {
    public String id;

    public IdValidator(String id) {
        this.id = id;
    }

    @Override
    public String getInfo() {
        return "ID: " + id;
    }

    public boolean isValid() {
        return this.id.length()==11;
    }
}