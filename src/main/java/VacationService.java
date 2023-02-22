public class VacationService {

    public int calcVacation(int income, int expense, int threshold) {
        int vacationMonths = 0; // количество месяцев отдыха
        int money = 0; // остаток денег на счету

//        int month = 0;
//        while (month < 12) {
//            if (money >= threshold) { // можем ли отдыхать?
//                vacationMonths++; // прибавляем месяц отдыха
//                money = (income - expense) / 3;
//            } else {
//                money = money + income - expense; // продолжаем работать и копить деньги
//            }
//            month++;
//        }
//        return vacationMonths;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                vacationMonths++; // прибавляем месяц отдыха
                money = (income - expense) / 3;
            } else {
                money = money + income - expense; // продолжаем работать и копить деньги
            }
        }
        return vacationMonths;
    }
}