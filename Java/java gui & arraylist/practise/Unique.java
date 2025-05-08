package practise;

import java.util.ArrayList;
import java.util.HashSet;

public class Unique {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(1);
        num.add(5);
        num.add(4);
        num.add(4);

        HashSet<Integer> conNum = new HashSet<>(num);

        ArrayList<Integer> uniqueNum = new ArrayList<>(conNum);

        for(int show: uniqueNum)
        {
            System.out.println(show);
        }

    }
}
