package example.hw2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HumanServiceTest {
    HumanService humanService = new HumanService();

    List<Human> humanList;

    @BeforeEach
    void setUp() {
        humanList = humanService.generateHumanList();
    }

    @Test
    void sortByBirthDate() {
        String s = "[\n" +
        "Human{age=75, firstName='Arsen', lastName='Vasilkin', birthDate=1949-07-20, weight=40}, \n" +
        "Human{age=74, firstName='Alyeana', lastName='Katelnikova', birthDate=1950-08-09, weight=50}, \n" +
        "Human{age=37, firstName='Kirill', lastName='Petrov', birthDate=1987-10-11, weight=55}, \n" +
        "Human{age=20, firstName='Danil', lastName='Pupkin', birthDate=2004-05-02, weight=70}, \n" +
        "Human{age=19, firstName='Egor', lastName='Ivanov', birthDate=2005-02-06, weight=80}]";
        List<Human> humanListAfter = humanService.sortByBirthDate(humanList);
        assertEquals(s, humanListAfter.toString());

    }

    @Test
    void filterByAgeLessThan50() {
        String s = "[\n" +
                "Human{age=20, firstName='Danil', lastName='Pupkin', birthDate=2004-05-02, weight=70}, \n" +
                "Human{age=19, firstName='Egor', lastName='Ivanov', birthDate=2005-02-06, weight=80}, \n" +
                "Human{age=37, firstName='Kirill', lastName='Petrov', birthDate=1987-10-11, weight=55}]";

        List<Human> humanListAfterSorting = humanService.filterByAgeLessThan50(humanList);

        assertEquals(s, humanListAfterSorting.toString());
    }


    @Test
    void sortByWeight() {
        String s = "[\n" +
                "Human{age=75, firstName='Arsen', lastName='Vasilkin', birthDate=1949-07-20, weight=40}, \n" +
                "Human{age=74, firstName='Alyeana', lastName='Katelnikova', birthDate=1950-08-09, weight=50}, \n" +
                "Human{age=37, firstName='Kirill', lastName='Petrov', birthDate=1987-10-11, weight=55}, \n" +
                "Human{age=20, firstName='Danil', lastName='Pupkin', birthDate=2004-05-02, weight=70}, \n" +
                "Human{age=19, firstName='Egor', lastName='Ivanov', birthDate=2005-02-06, weight=80}]";
        List<Human> humanListAfterSorting = humanService.sortByWeight(humanList);

        assertEquals(s, humanListAfterSorting.toString());
    }

    @Test
    void allNamesOnOneLine() {
        String allNames = "Danil Egor Alyeana Kirill Arsen";
        String allNamesOnOneLine = humanService.allNamesOnOneLine(humanList);

        assertEquals(allNames, allNamesOnOneLine);
    }
}