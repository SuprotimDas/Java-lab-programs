interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String name, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    public void processSale(double amount) {
        System.out.println("Sale processed: " + amount);
    }

    public void generateInvoice(String name, double amount) {
        System.out.println("Invoice for " + name + ": " + amount);
    }

    void showSummary() {
        System.out.println("All operations completed");
    }
}

public class Work {
    public static void main(String[] args) {
        CommercialExecutive c = new CommercialExecutive();
        c.processSale(2000);
        c.generateInvoice("ABC Ltd", 2000);
        c.showSummary();
    }
}