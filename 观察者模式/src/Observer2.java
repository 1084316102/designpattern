public class Observer2 implements Observer {
    @Override
    public void update(int i) {
        System.out.println("I am a observer2"+ i);
    }
}
