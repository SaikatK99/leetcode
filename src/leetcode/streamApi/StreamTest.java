package leetcode.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("40","50","abc");

        /*List<Integer> intList=list.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(intList);*/

        /*list.forEach(s->{
            try {
                System.out.println(Integer.parseInt(s));
            }catch (Exception e){
                System.out.println("Exception: "+e.getMessage());
            }
        });*/

        list.forEach(s->{
            try {
                System.out.println(Integer.parseInt(s));
            }catch (Exception e){
                if (e.getMessage()=="For input string"){
                    System.out.println(s);
                }
            }
        });
    }
}
