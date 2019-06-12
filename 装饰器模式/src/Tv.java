public class Tv extends Furniture {
    public Tv(House house) {
        super(house);
    }

    @Override
    public int price() {
        return 10000+house.price();
    }

    @Override
    public String room() {
        return "Tv Tv Tv.........."+price();
    }
}
