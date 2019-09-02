package com.train;


public class Ticket {
    int num1;
    int num2;



    public Ticket(int num1, int num2) {
        this.num1=num1;
        this.num2=num2;
    }
    public int cal(){
        int Total;
        Total= (int) (((num1-num2)*1000)+((num2*2000)*0.9));
        return Total;
    }



}
