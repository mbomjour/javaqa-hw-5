import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {

    @Test
    public void shouldCalcVacation1() {
        VacationService service = new VacationService();

        int expected = 3;
        int actual = service.calcVacation(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcVacation2() {
        VacationService service = new VacationService();

        int expected = 2;
        int actual = service.calcVacation(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
