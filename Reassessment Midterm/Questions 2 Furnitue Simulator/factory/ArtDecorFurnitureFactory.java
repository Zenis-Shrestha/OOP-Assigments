public class ArtDecorFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecorChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecorSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecorCoffeeTable();
    }
}
// Implements the FurnitureFactory interface for ArtDeco furniture.
// Returns instances of ArtDecroChair, ArtDecorSofa, and ArtDecorCoffeeTable.