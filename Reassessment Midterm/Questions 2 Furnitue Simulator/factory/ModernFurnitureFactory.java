public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }
    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
//Implements the FurnitureFactory interface for Modern furniture.
//Returns instances of ModernChair, ModernSofa, and ModernCoffeeTable.