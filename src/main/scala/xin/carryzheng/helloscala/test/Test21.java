package xin.carryzheng.helloscala.test;
import java.util.*;
public class Test21 {
    public static void main(String[] args) throws Exception {

        Map<String, Integer> wcMap1 = new HashMap<String, Integer>();
        wcMap1.put("a", 1);
        wcMap1.put("b", 2);
        wcMap1.put("c", 3);

        Map<String, Integer> wcMap2 = new HashMap<String, Integer>();
        wcMap2.put("a", 4);
        wcMap2.put("d", 5);
        wcMap2.put("c", 6);

        // (a, 5), (b, 2), (d, 5), (c, 9)
        Iterator<String> keyIter = wcMap2.keySet().iterator();
        while ( keyIter.hasNext() ) {
            String key = keyIter.next();
            Integer cnt = wcMap1.get(key);
            Integer newCnt = 0;
            if ( cnt == null ) {
                newCnt = wcMap2.get(key);
            } else {
                newCnt = cnt + wcMap2.get(key);
            }
            wcMap1.put(key, newCnt);
        }

        System.out.println(wcMap1);

    }

}

