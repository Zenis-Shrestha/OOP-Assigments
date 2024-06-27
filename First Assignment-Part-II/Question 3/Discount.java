public class Discount {
    public static double getServiceDiscountRate(String membershipType) {
        switch (membershipType) {
            case "Premium":
                return 0.2; // 20% discount for Premium members
            case "Gold":
                return 0.15; // 15% discount for Gold members
            case "Silver":
                return 0.1; // 10% discount for Silver members
            default:
                return 0.0; // No discount for non-members
        }
    }

    public static double getProductDiscountRate() {
        return 0.1; // Flat 10% discount on products for all members
    }
}
