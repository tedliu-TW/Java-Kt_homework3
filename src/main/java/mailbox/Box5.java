package mailbox;

public class Box5 extends BoxTester{
    float length5= (float) 39.5;
    float width5= (float) 27.5;
    int height5=23;

    @Override
    public boolean validate(float length, float width, int height) {
        if(length<=length5 && width<=width5 && height<=height5){
            System.out.println("Box3");
        }else{
            System.out.println("your box not this size");
        }

        return super.validate(length, width, height);
    }
}
