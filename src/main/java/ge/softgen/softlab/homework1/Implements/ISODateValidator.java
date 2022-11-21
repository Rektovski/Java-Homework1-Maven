package ge.softgen.softlab.homework1.Implements;

import ge.softgen.softlab.homework1.Interface.Validator;

import java.time.LocalDate;

public class ISODateValidator implements Validator {
    public LocalDate date;

    public ISODateValidator(LocalDate date){
        this.date = date;
    }

    @Override
    public String getInfo() {
        return "Date: " + String.valueOf(date);
    }

    @Override
    public boolean isValid() {
        return LocalDate.now().isAfter(this.date);
    }
}