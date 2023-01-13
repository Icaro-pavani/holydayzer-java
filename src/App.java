import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[][] yearHolydays = {
            {"01/01/2023", "Confraternização mundial"},
            {"21/02/2023", "Carnaval"},
            {"17/04/2023", "Páscoa"},
            {"21/04/2023", "Tiradentes"},
            {"01/05/2023", "Dia do trabalho"},
            {"08/06/2023", "Corpus Christi"},
            {"07/09/2023", "Independência do Brasil"},
            {"12/10/2023", "Nossa Senhora Aparecida"},
            {"02/11/2023", "Finados"},
            {"15/11/2023", "Proclamação da República"},
            {"25/12/2023", "Natal"},
        };

        Feriados holydays = new Feriados(yearHolydays);

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor da data no formato DD/MM/AAAA para verificar se é feriado ou digite 'Todos' para obter todos os feriados");
        String date = sc.nextLine();

        holydays.checkHolyday(date);
    }
}