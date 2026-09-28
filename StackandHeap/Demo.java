class Calculator{
    int num=10;
    public int add(int n1,int n2){
        return n1+n2;
    }
}

public class Demo {
    public static void main(String []args){
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();
        obj1.num = 5;
        System.out.println(obj.num);
        System.out.println(obj1.num);
        System.out.println(obj.add(3,5));
    }
}
