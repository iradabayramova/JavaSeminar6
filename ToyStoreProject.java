public class ToyStoreProject {
    public static void main(String[] args) {
        ToyLottery toyLottery = new ToyLottery();

        
        toyLottery.addToy(new Toy(1, "Teddy Bear", 5));
        toyLottery.addToy(new Toy(2, "LEGO Set", 3));
        toyLottery.addToy(new Toy(3, "Doll", 7));
        toyLottery.addToy(new Toy(4, "Tobot X", 10));
        toyLottery.addToy(new Toy(5, "MonsterTrack", 2));

        // // Вызываем розыгрыш
        // toyLottery.play();

     
        toyLottery.playAndWriteToFile("result.txt");
    }
}
