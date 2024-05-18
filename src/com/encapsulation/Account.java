package com.encapsulation;


class Acc{
    private int accno;
    private int passcode;
    
    public void setAccno(int a){
        accno = a;
    }
    
     public int getAccno(){
        return accno;
    }
    
    public void setPasscode(int b){
        passcode = b;
    }
    
     public int getPasscode(){
        return passcode;
    }
     
     public void print() {
    	 System.out.println(String.format("Acc_no : %d \nPassCode : %d ", accno, passcode));
     }
} 


 public class Account {
    public static void main(String [] args){
        
        Acc ac = new Acc();
        
        ac.setAccno(1003);
        System.out.println(ac.getAccno());
        
        ac.setPasscode(12345678);
        System.out.println(ac.getPasscode());
        
        ac.print();
    }
}