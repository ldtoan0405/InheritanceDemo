// InheritanceDemo.java
import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        // Create 3 workers and 3 salary workers
        workers.add(new Worker("John", "Doe", "1234", "Mr.", 1985, 15.0));
        workers.add(new Worker("Jane", "Smith", "5678", "Ms.", 1990, 20.0));
        workers.add(new Worker("Bob", "Johnson", "91011", "Dr.", 1982, 18.0));

        workers.add(new SalaryWorker("Alice", "Johnson", "1213", "Prof.", 1978, 60000.0));
        workers.add(new SalaryWorker("Eve", "Brown", "1415", "Dr.", 1986, 80000.0));
        workers.add(new SalaryWorker("Charlie", "Smith", "1617", "Ms.", 1995, 70000.0));

        // Simulate 3 weekly pay periods
        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Payroll:");

            for (Worker worker : workers) {
                System.out.println(worker.formalName());
                System.out.println(worker.displayWeeklyPay(week == 2 ? 50 : 40)); // Week 2: 50 hours, Other weeks: 40 hours
                System.out.println();
            }
        }
    }
}
