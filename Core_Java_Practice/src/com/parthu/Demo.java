package com.parthu;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] a= {1,4,4,5,6,5};
        int[] b= {9,8,7,5,6,4};
        
        Arrays.stream(a).filter(i->Arrays.stream(b).anyMatch(j->j,i)
    }
}
