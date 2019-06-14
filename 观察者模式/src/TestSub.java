public class TestSub extends Sub {
    @Override
    public void act(){
        System.out.println("notify self");
        notifyAllObserver();
    }
}
