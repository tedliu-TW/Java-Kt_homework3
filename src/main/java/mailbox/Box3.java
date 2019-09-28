package mailbox;

public class Box3 extends BoxTester {
    float length3=23;
    float width3=14;
    int height3=13;

    @Override
    public boolean validate(float length, float width, int height) {
        if(length<=length3 && width<=width3 && height<=height3){
            System.out.println("Box3");
        }else{
            System.out.println("your box not this size");
        }
        System.out.println("OR");

        return super.validate(length, width, height);
    }
}
