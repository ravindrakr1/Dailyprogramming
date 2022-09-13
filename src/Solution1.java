import java.util.HashMap;

public class Solution1 {
    public static void main(String[] args) {
        // write program to count char of a string
        String input = "aaaaaaa";
        //using hshmap to store char as key and no. of char as value, will print hashmap
        HashMap<Character,Integer> hashmap = new HashMap<>();
        //iterate over string
        for(Character ch : input.toCharArray()){
            if(hashmap.containsKey(ch))
                hashmap.put(ch,hashmap.get(ch)+1);
            else
                hashmap.put(ch,1);
        }
        System.out.println(hashmap);
    }
}
