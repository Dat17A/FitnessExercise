public class Administration extends Employee {
    private int vacation;

    public Administration(String name, String cpr) {
        super(name, cpr, 37, 23000);
        this.vacation = 5;
    }

    public int getVacation() {
        return vacation;
    }
}
