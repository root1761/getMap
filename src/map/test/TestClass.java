package map.test;

import org.junit.Test;

import java.util.ArrayList;

public class TestClass {
@Test
    public void test1(){
    ArrayList<Integer> array=new ArrayList<>();
    array.add(1);
    array.add(2);
    array.add(3);
    array.forEach(n-> System.out.println(n));

}
}


