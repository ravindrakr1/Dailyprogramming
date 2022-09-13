import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class Solution2 {
    public static void main(String[] args) {
        int i=6789;
        printMe(new Integer(6789));
        System.out.println( 8 >> 2);
        StringBuilder sb = new StringBuilder("H");
        StringBuilder a = sb.append("i");
        System.out.println(sb == a);
    }
    HashMap hashMap = new HashMap<>();
    static void printMe(Integer i){
        System.out.println("INtegre");
    }
    static void printMe(double i){
        System.out.println("doubrl");
    }

}
