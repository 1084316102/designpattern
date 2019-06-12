public class Sofa extends Furniture {
    public Sofa(House house) {
        super(house);
    }

    @Override
    public int price() {
        return 90000+house.price();
    }

    @Override
    public String room() {
        return "sofa sofa sofa.........."+price();
    }
}
