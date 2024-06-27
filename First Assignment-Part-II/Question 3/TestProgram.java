public class TestProgram {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("John Doe");
        customer1.setMembershipType("Premium");

        Customer customer2 = new Customer("Jane Smith");
        customer2.setMembershipType("Gold");

        Customer customer3 = new Customer("Sam Brown");
        customer3.setMembershipType("Silver");

        Customer customer4 = new Customer("Chris Johnson"); // No membership

        // Create visits
        Visit visit1 = new Visit(customer1);
        visit1.setServiceExpense(100.0);
        visit1.setProductExpense(50.0);

        Visit visit2 = new Visit(customer2);
        visit2.setServiceExpense(100.0);
        visit2.setProductExpense(50.0);

        Visit visit3 = new Visit(customer3);
        visit3.setServiceExpense(100.0);
        visit3.setProductExpense(50.0);

        Visit visit4 = new Visit(customer4);
        visit4.setServiceExpense(100.0);
        visit4.setProductExpense(50.0);

        // Print visit details and total expenses
        System.out.println(visit1);
        System.out.println("Total Expense: $" + visit1.getTotalExpense());

        System.out.println(visit2);
        System.out.println("Total Expense: $" + visit2.getTotalExpense());

        System.out.println(visit3);
        System.out.println("Total Expense: $" + visit3.getTotalExpense());

        System.out.println(visit4);
        System.out.println("Total Expense: $" + visit4.getTotalExpense());
    }
}
