public class Test {
    public static void main(String[] args){
        Subject subject = new TestSub();
        subject.add(new Observer1());
        subject.add(new Observer2());
        subject.act();
    }

}
