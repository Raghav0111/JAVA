import java.util.ArrayList; // or we can using java.util.*
import java.util.Collections;

import java.util.*;

public class ArrayLists {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
    // ArrayList<String> list2 = new ArrayList<String>();
    // ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        // add elements
        list.add(0);
        list.add(2);
        list.add(3);
        
        System.out.println(list);
        
        // get elements
        int element = list.get(0);
        System.out.println(element);

        // Add element in between
        list.add(1,1);
        System.out.println(list);

        // Set Element

        list.set(0,5);
        System.out.println(list);

        // Delete Element
        list.remove(0);
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        // sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
