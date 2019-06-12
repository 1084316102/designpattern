public class School {
    private Policy policy;

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }
    public void act(){
        this.policy.role();
    }
}
