public class FitnessMain {
    public static void main(String[] args) {
        //Employee e1 =
        //    new Employee(37, 12000);

        Member m1 = new Member("Michael", "010279-XYZW", true);
        int price = m1.getMonthlyFee();

        Instructor i1 = new Instructor("Michael",
                "1234567", 33, 210);

        Instructor i2 = new Instructor("Martin",
                "1234567", 34, 220);

        Instructor i3 = new Instructor("Veronique",
                "1234567", 31, 250);

        Instructor i4 = new Instructor("Ane",
                "1234567", 32, 250);



        System.out.println(i1.getSalary());

        System.out.println(i1);



        // Opret en linked-list af instructors
        // som der findes i dette fitness center.



    }
}
