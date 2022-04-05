package Assignment3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Assignment3 {
    public static void main(String[] args) {
        HashMap<String, String> B = new HashMap<String, String>();
        B.put("a", "1");
        B.put("b", "2");
        B.put("c", "10");
        List<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(10);
        getList(B, A);
        System.out.println(A);
    }

    public static void getList(HashMap<String, String> map, List<Integer> list){
        for(String key : map.keySet()){
            int temp = Integer.parseInt(map.get(key));
            if(list.contains(temp))
            list.remove((Integer) temp);
        }
    }
}
