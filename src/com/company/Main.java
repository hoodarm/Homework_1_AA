package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] a = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
        int key = 142;
        findingVal(a, key);
    }

    static void findingVal(int[] a, int key)
    {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi)
        {
            int mid = (lo + hi) / 2;
            int val = a[mid];
            System.out.println(val);
            if (val == key)
            {
                System.out.println("Found at index " + mid);
                System.exit(0);
            }
            else if (val > key)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        System.out.println("Not found");
    }
}
