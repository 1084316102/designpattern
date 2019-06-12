public class Main_1 {
    public static void main(String[] args){
        House house = new Department();
        house = new Sofa(house);
        System.out.println(house.room());
        house = new Tv(house);
        System.out.println(house.room());
    }
}
