import ge.softgen.softlab.homework1.Exceptions.ValidatorException;
import ge.softgen.softlab.homework1.Implements.GenderValidator;
import ge.softgen.softlab.homework1.Implements.ISODateValidator;
import ge.softgen.softlab.homework1.Implements.IdValidator;
import ge.softgen.softlab.homework1.Interface.Validator;
import ge.softgen.softlab.homework1.Interface.ValidatorService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    public void testMaleGender() throws ValidatorException {
        GenderValidator list1 = new GenderValidator("MALE");
        IdValidator list2 = new IdValidator("00110011001");
        ISODateValidator list3 = new ISODateValidator(LocalDate.of(1999, 8, 10));

        GenderValidator list4 = new GenderValidator("Male");
        IdValidator list5 = new IdValidator("00110011001");
        ISODateValidator list6 = new ISODateValidator(LocalDate.of(1999, 8, 10));

        List<Validator> test1 = List.of(
                list1,
                list2,
                list3
        );

        List<Validator> test2 = List.of(
                list4,
                list5,
                list6
        );
        assertEquals("Everything is valid", ValidatorService.validate(test1));
        try {
            assertEquals("Invalid data", ValidatorService.validate(test2));
        } catch (Exception e) {
            assertEquals("Invalid data", "Invalid data");
        }
    }

    @Test
    public void testFemaleGender() throws ValidatorException {
        GenderValidator list1 = new GenderValidator("FEMALE");
        IdValidator list2 = new IdValidator("00110011001");
        ISODateValidator list3 = new ISODateValidator(LocalDate.of(1999, 8, 10));

        GenderValidator list4 = new GenderValidator("Female");
        IdValidator list5 = new IdValidator("00110011001");
        ISODateValidator list6 = new ISODateValidator(LocalDate.of(1999, 8, 10));

        List<Validator> test1 = List.of(
                list1,
                list2,
                list3
        );

        List<Validator> test2 = List.of(
                list4,
                list5,
                list6
        );

        assertEquals("Everything is valid", ValidatorService.validate(test1));
        try {
            assertEquals("Invalid data", ValidatorService.validate(test2));
        } catch (Exception e) {
            assertEquals("Invalid data", "Invalid data");
        }
    }

    @Test
    public void testId() throws ValidatorException {
        GenderValidator list1 = new GenderValidator("FEMALE");
        IdValidator list2 = new IdValidator("00110011001");
        IdValidator list20 = new IdValidator("0011001100");
        ISODateValidator list3 = new ISODateValidator(LocalDate.of(1999, 8, 10));

        List<Validator> test1 = List.of(
                list1, list2, list3
        );

        List<Validator> test2 = List.of(
                list1, list20, list3
        );

        assertEquals("Everything is valid", ValidatorService.validate(test1));
        try {
            assertEquals("Invalid data", ValidatorService.validate(test2));
        } catch (ValidatorException e) {
            assertEquals("Invalid data", "Invalid data");
        }
    }

    @Test
    public void testDate() throws ValidatorException {
        GenderValidator list1 = new GenderValidator("FEMALE");
        IdValidator list2 = new IdValidator("00110011001");
        ISODateValidator list3 = new ISODateValidator(LocalDate.of(1999, 8, 10));
        ISODateValidator list30 = new ISODateValidator(LocalDate.of(2300, 8, 10));

        List<Validator> test1 = List.of(
                list1, list2, list3
        );

        List<Validator> test2 = List.of(
                list1, list2, list30
        );

        assertEquals("Everything is valid", ValidatorService.validate(test1));
        try {
            assertEquals("Invalid data", ValidatorService.validate(test2));
        } catch (ValidatorException e) {
            assertEquals("Invalid data", "Invalid data");
        }
    }
}