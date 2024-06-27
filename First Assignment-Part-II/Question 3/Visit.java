public class Visit {
    private Customer customer;
    private double serviceExpense; // Total cost of services
    private double productExpense; // Total cost of products

    public Visit(Customer customer) {
        this.customer = customer;
        this.serviceExpense = 0.0;
        this.productExpense = 0.0;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        double serviceDiscount = serviceExpense * Discount.getServiceDiscountRate(customer.getMembershipType());
        double productDiscount = productExpense * Discount.getProductDiscountRate();
        return (serviceExpense - serviceDiscount) + (productExpense - productDiscount);
    }

    @Override
    public String toString() {
        return "Visit [customer=" + customer + ", serviceExpense=$" + serviceExpense + ", productExpense=$" + productExpense + "]";
    }
}
