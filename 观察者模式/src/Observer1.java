public class Observer1 implements Observer {
    @Override
    public void update(int i) {
        System.out.println("I am a observer1"+ i);
    }
}
