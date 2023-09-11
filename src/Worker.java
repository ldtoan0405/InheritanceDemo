// Worker.java
public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        } else {
            return (40 * hourlyPayRate) + ((hoursWorked - 40) * 1.5 * hourlyPayRate);
        }
    }

    public String displayWeeklyPay(double hoursWorked) {
        double totalPay = calculateWeeklyPay(hoursWorked);
        double overtimePay = 0;

        if (hoursWorked > 40) {
            overtimePay = (hoursWorked - 40) * 0.5 * hourlyPayRate;
        }

        return String.format("Regular Pay (40 hours): %.2f\nOvertime Pay: %.2f\nTotal Pay: %.2f", 40 * hourlyPayRate, overtimePay, totalPay);
    }
}
