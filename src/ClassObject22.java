
class Calculator {
    int num = 5;
    public int add(int n1, int n2) {
        System.out.println("in add");
        return n1 + n2;
    }
}

public class ClassObject22 {
    public static void main(String []args) {
        int data = 10;
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();
        int result = obj.add(4, 5);
        System.out.println(result);
        obj.num = 8;
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}
