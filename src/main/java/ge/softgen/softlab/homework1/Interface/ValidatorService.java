package ge.softgen.softlab.homework1.Interface;

import ge.softgen.softlab.homework1.Exceptions.ValidatorException;

import java.util.List;

public class ValidatorService {
    public static String validate(List<Validator> list) throws ValidatorException{
        for(Validator i: list){
            if(!i.isValid()){
                throw new ValidatorException("Invalid data");
            }
            System.out.println(i.getInfo() + " ");
        }
        return "Everything is valid";
    }
}