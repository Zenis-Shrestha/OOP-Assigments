public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
// Implements the FurnitureFactory interface for Victorian furniture.
// Returns instances of VictorianChair, VictorianSofa, and VictorianCoffeeTable.
//