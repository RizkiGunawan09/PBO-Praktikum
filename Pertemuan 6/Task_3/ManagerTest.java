package Task_3;

public class ManagerTest {
    public static void main(String[] args) {
        Sortable[] staff = new Sortable[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        Sortable.shell_sort(staff);

        System.out.println("Setelah pengurutan:");
        for (Sortable s : staff) {
            if (s instanceof Employee) {
                Employee e = (Employee) s;
                e.print();
            } else if (s instanceof Manager) {
                Manager m = (Manager) s;
                m.print();
            }
        }
    }
}
