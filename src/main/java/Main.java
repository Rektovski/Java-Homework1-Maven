import ge.softgen.softlab.homework1.Exceptions.ValidatorException;
import ge.softgen.softlab.homework1.Implements.GenderValidator;
import ge.softgen.softlab.homework1.Implements.ISODateValidator;
import ge.softgen.softlab.homework1.Implements.IdValidator;
import ge.softgen.softlab.homework1.Interface.Validator;
import ge.softgen.softlab.homework1.Interface.ValidatorService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ValidatorException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Examples:");
        System.out.println("ID, 13 Symbol, 0-9");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.println("MALE or FEMALE");
        System.out.print("Gender: ");
        String gender = scanner.nextLine();
        System.out.println("Date Format: YEAR-MM-DD, 2000-01-01");
        System.out.print("Birthdate: ");
        LocalDate date = LocalDate.parse(scanner.nextLine());
        System.out.println("***************************");

        GenderValidator list1 = new GenderValidator(gender);
        IdValidator list2 = new IdValidator(id);
        ISODateValidator list3 = new ISODateValidator(date);

        List<Validator> list = List.of(
                list1,
                list2,
                list3
        );

        ValidatorService.validate(list);
    }
}