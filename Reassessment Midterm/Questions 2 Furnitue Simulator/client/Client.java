public class Client {
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;

    public Client(FurnitureFactory factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
        coffeeTable = factory.createCoffeeTable();
    }

    public void furnishRoom() {
        chair.sitOn();
        sofa.lieOn();
        coffeeTable.placeItemsOn();
    }

    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Client modernClient = new Client(modernFactory);
        modernClient.furnishRoom();

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Client victorianClient = new Client(victorianFactory);
        victorianClient.furnishRoom();

        FurnitureFactory artDecoFactory = new ArtDecorFurnitureFactory();
        Client artDecoClient = new Client(artDecoFactory);
        artDecoClient.furnishRoom();
    }
}

//Demonstrates how to use the abstract factory to create matching furniture sets
//Chair chair, Sofa sofa, CoffeeTable coffeeTable: Holds references to the created furniture objects.