package com.parthu.practice;

import java.util.Arrays;

public class MatrixMultiplication {
	
	public static void main(String[] args) {
		int[][] a= {{1,2,3,4},
				{1,2,3,4}
		};
		int[][] b= {{1,2,4,5},
				{1,2,4,5},
				{1,2,4,5},
				{1,2,4,5}
		};
		
		int[][] c=new int[a.length][b[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
			for(int k=0;k<b.length;k++)
			{
			c[i][j]=c[i][j]+a[i][k]*b[k][j];	
			}
			}
		}
		for(int k=0;k<c.length;k++)
		{
			System.out.println(Arrays.toString(c[k]));
		}
		
	}

}
