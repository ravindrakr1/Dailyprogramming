package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        //stream
        //convert list to map
        List<String> listnames = Arrays.asList("Shilpi","Shilpi","Tanu");
//        List<String> listnames1 = new ArrayList<>();
//        listnames1.add("Shilpi");
//        listnames.add("Shilpi");
//        System.out.println(listnames);
//        listnames.stream().filter(p->p.contains("S")).map(str -> str.length()).collect(Collectors.toList());
//        listnames1.stream().map(Str -> Str+"new").collect(Collectors.toList());
        System.out.println(listnames.stream().map(Str -> Str+"new").collect(Collectors.toMap(p -> p.length(),p -> p,(s,a)-> a)));
        System.out.println(listnames.stream().map(Str -> Str+"new").collect(Collectors.toList()));

        //



    }
}
