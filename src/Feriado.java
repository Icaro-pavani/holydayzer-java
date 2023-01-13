public class Feriado {
    private String date;
    private String name;

    public Feriado(String date, String name) {
        this.date = date;
        this.name = name;
    }

    public void getFeriado() {
        System.out.println(this.date + " => " + this.name);
    }
}
