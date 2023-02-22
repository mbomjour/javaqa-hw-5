import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/vacation.csv")

    public void shouldCalcVacation(int expected, int income, int expense, int threshold) {
        VacationService service = new VacationService();

//        int expected = 3;
        int actual = service.calcVacation(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void shouldCalcVacation2() {
//        VacationService service = new VacationService();
//
//        int expected = 2;
//        int actual = service.calcVacation(100_000, 60_000, 150_000);
//
//        Assertions.assertEquals(expected, actual);
//    }
}
