package java8Practice;

import java.util.Arrays;
import java.util.List;

public class forEachDemo {


    public static void main(String[] args) {
        List<Integer>  values = Arrays.asList(2,5,4,8,9);
        for(int i=0;i<values.size();i++){
            System.out.println(values.get(i));
        }
        for(int i : values){
            System.out.println(i);
        }
        values.forEach(integer -> System.out.println(integer));
    }
}
