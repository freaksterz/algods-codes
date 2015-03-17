package freakster.hack;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by AGA2 on 3/11/2015.
 */
public class NumberOfOccurences {



    public static void main(String[] args) {

        int a[] = {2,5,12,22,22,22,22,22,22,22,22,22,3,4,5,5,5,5,5,5,5};

        Hashtable h =  new Hashtable<Integer, Integer>();

        for(int i=0;i<a.length;i++){

            if(h.containsKey(a[i])){
                h.put(a[i], (Integer) h.get(a[i]) + 1);


            }else{
                h.put(a[i], 1);
            }
        }

        Iterator<Map.Entry<Integer,Integer>> it = h.entrySet().iterator();
        Integer max = 0;
        Integer secondMax = 0;
        Map.Entry<Integer,Integer> secondMaxEntry =null, firstMaxEntry =null ;


        boolean flag = true;
        while (it.hasNext()){
            Map.Entry<Integer,Integer> entry = it.next();
            if(flag){
                firstMaxEntry = entry;
                flag = false;
            }
            if(entry.getValue() > secondMax){
                if(entry.getValue()>max){
                    secondMax = max;
                    secondMaxEntry = firstMaxEntry;
                    firstMaxEntry = entry;
                    max = entry.getValue();
                }else{
                    secondMax =entry.getValue();
                    secondMaxEntry = entry;
                }



            }



        }

        System.out.println("secondMax = " + secondMax);
        System.out.println("max = " + max);
        System.out.println("firstMaxEntry.getKey() = " + firstMaxEntry.getKey());
        System.out.println("secondMaxEntry = " + secondMaxEntry.getKey());
    }



}
