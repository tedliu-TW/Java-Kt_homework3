package mailbox;

public class BoxTester {
    float length;
    float width;
    int height;
    public boolean validate(float length, float width, int height) {
        this.length=length;
        this.width=width;
        this.height=height;
        String s = "Box5";
        if(length<=39.5){
            System.out.println("Please enter object's length:"+(int)length);
        }if(width<=27.5){
            System.out.println("Please enter object's width:"+(int)width);
        }if(height<=23){
            System.out.println("Please enter object's height:"+height);
        }else{
            System.out.println("Your mail box size not fit this size");
        }

        return true;

    }
    public boolean validate2(float length, float width, int height) {
        this.length=length;
        this.width=width;
        this.height=height;
        if(length<=23){
            System.out.println("Please enter object's length:"+length);
        }else if(width<=14){
            System.out.println("Please enter object's width:"+width);
        }else if(height<=13){
            System.out.println("Please enter object's height:"+height);
        }else{
            System.out.println("Your mail box size not fit this size");
        }
        return false;

    }





}
