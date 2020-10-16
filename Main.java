public class Main {
    
    public static void main(String[] arqs){

        Employee emp1 = new Employee("Roman Guerra", "Engineering", "Software Developer");
        Employee emp2 = new Employee("Michael Massey", "ADAS Team", "Auto Technician");
        Employee emp3 = new Employee("Dimitre Krovsinski", "Watch Department", "Watch Dog");
        emp3.admin = true;

        System.out.println("\n" + emp1);
        System.out.println("\n" + emp2);
        System.out.println("\n" + emp3);

        Window myWindow = new Window();
    }
}
