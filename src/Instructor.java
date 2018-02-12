public class Instructor extends Employee {

    public Instructor(String name, String cpr,
                      int hours, int salary) {
        super(name, cpr, hours, salary);
    }

    public int getSalary() {
        return getHours() * super.getSalary();
    }


    public String toString() {
        return name + ", cpr:" + cpr + " ";
    }
}
