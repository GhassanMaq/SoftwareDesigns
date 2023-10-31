import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConnectionManager cm = new ConnectionManager();

        Staff staff1 = new Staff(1, "Ahmad", 30, 10, 100);
        Staff staff2 = new Staff(2, "Yasser", 28, 12, 110);

        Manager manager = new Manager(3, "Sarah", 45, 25, 120, List.of(staff1, staff2));

        Director director = new Director(4, "Tamam", 55, 40, 140, List.of(staff1), List.of(manager));

        ReportGenerator staffReport = new StaffReportGenerator(director);
        ReportGenerator budgetReport = new BudgetReportGenerator(director);
        ReportGenerator staffReport1 = new StaffReportGenerator(manager);
        ReportGenerator budgetReport1 = new BudgetReportGenerator(manager);

        System.out.println(staffReport.generateReport());
        System.out.println(budgetReport.generateReport());
        System.out.println(budgetReport1.generateReport());
    }
}
