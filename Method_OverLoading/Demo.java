class Calculator{
     public void add(int n1,int n2){
        System.out.println(n1+n2);
     }
     public void add(double n4,double n5){
        System.out.println(n4+n5);
     }
     public void add(int n1,int n2,int n3){
        System.out.println(n1+n2+n3);
     }
}

public class Demo { 
    public static void main(String[] args){
        int n1 = 4;
        int n2 = 5;
        int n3 = 6;
        double n4 = 3.4;
        double n5 = 4.5; 
        Calculator c1 = new Calculator();
        c1.add(n1,n2);
        c1.add(n1,n2,n3);
        c1.add(n4,n5);

    }
    
}
