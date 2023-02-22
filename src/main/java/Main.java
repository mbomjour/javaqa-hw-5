public class Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();

        System.out.println(service.calcVacation(10_000, 3_000, 20_000));

        System.out.println(service.calcVacation(100_000, 60_000, 150_000));
    }
}