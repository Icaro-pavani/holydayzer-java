import java.util.ArrayList;
import java.util.List;

public class Feriados {
    private List<Feriado> holydays = new ArrayList<>();
    private List<String> dates = new ArrayList<>();

    public Feriados(String[][] holydays) {
        for (int i = 0; i < holydays.length; i++){
            Feriado newHoliday = new Feriado(holydays[i][0], holydays[i][1]);
            this.dates.add(holydays[i][0]);
            this.holydays.add(newHoliday);
        }
    }

    private void isHolyday(String date) {
        int index = this.dates.indexOf(date);
        if (index != -1) {
            this.holydays.get(index).getFeriado();
        } else {
            System.out.println("Esse dia não é feriado");
        }
    }

    private void getYearHolydays() {
        System.out.println("Esses são os feriados desse ano:");
        for (int i = 0; i < this.holydays.size(); i++){
            this.holydays.get(i).getFeriado();
        }
    }

    public void checkHolyday(String date) {
        System.out.println(date == "Todos");
        if (date.equals("Todos")) {
            this.getYearHolydays();
        } else {
            this.isHolyday(date);
        }
    }
}
