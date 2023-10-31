
public class assignment_operators_9 {
    public static void main(String [] args){
        int num = 5;
        // num++: post-increment (先赋值，再增加)
        int result = num++;
        // ++num: pre-increment (先增加，再赋值)
        // int result = ++num;
        //上面会输出6
        System.out.println(result);
    }
}
