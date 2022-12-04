package dumpFile_Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dumpFile11 {
    public static void main(String[] args) {
        //HackerRank case : https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
        //List<Integer> arr = Arrays.asList(1,4,4,4,5,3);
        List<Integer> arr = Arrays.asList(1,2,3,4,5,4,3,2,1,3,4);
        List<Integer> temp = new ArrayList<Integer>();

        List<List<Integer>> tempCompare = new ArrayList<>();

        for(int i = 0 ; i < arr.size() ; i ++)
        {
            List<Integer> temp2 = new ArrayList<Integer>();
            int count = 0;

            if(!temp.contains(arr.get(i)))
            {
                temp.add(arr.get(i));
                temp2.add(arr.get(i));
                count++;
                for(int j = i+1 ; j<arr.size(); j++)
                {
                    if(arr.get(i).equals( arr.get(j)))
                    {
                        count++;
                    }
                }
                temp2.add(count);
                tempCompare.add(temp2);
                System.out.println(arr.get(i) +" : "+count);
            }

        }
        System.out.println(temp);
        System.out.println(tempCompare);

        //List<List<Integer>> tempCompare = Arrays.asList(Arrays.asList(4,3),Arrays.asList(3,3));

        int maxNum = tempCompare.get(0).get(1);
        int maxNumCompare = tempCompare.get(0).get(0);
        int minIndex = 0;

        for(int i = 0 ; i < tempCompare.size() ; i++)
        {
            if(maxNum == tempCompare.get(i).get(1)) //to handle if the count are same, compare the num which is smaller
            {
                if(maxNumCompare > tempCompare.get(i).get(0))
                {
                    maxNumCompare = tempCompare.get(i).get(0);
                    maxNum = tempCompare.get(i).get(1);
                    minIndex = i;
                }
            }
            if(maxNum < tempCompare.get(i).get(1))
            {
                maxNumCompare = tempCompare.get(i).get(0);
                maxNum = tempCompare.get(i).get(1);
                minIndex = i;
            }
        }
        System.out.println(tempCompare.get(minIndex).get(0));
    }
}
