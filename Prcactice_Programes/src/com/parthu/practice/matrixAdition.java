package com.parthu.practice;

import java.util.Arrays;

public class matrixAdition {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},
				{1,2,3},
				{1,2,3}
		};
		int[][] b= {{1,2,3},
				{1,2,3},
				{1,2,3}
				
		};
		int[][] c=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(Arrays.toString(c[i]));
		}
	}

}
