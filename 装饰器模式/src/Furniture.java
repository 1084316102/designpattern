public abstract class Furniture implements House {
    House house;

    public Furniture(House house) {
        this.house = house;
    }
}
