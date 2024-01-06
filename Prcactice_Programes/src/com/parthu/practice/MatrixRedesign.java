package com.parthu.practice;
public class MatrixRedesign {
    public static void main(String[] args) {
    	 int[][] matrix = {
    			    {1, 2, 3},
    	            {4, 5, 6},
    	            {7, 8, 9}
					/*
					 * {1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}, {3, 4, 2, 6, 1}, {2, 3, 4, 8, 0}, {9, 8, 7,
					 * 6, 5}
					 */
    			    
    	        };
    	 System.out.println("original");
    	 for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix[i].length; j++) {
                 System.out.print(matrix[i][j] + " ");
             }
             System.out.println();
         }
    	 int n=matrix.length;
    	 System.out.println(":::::"+n/2);
    	 int k=0;
    	 if(n==3)
    	 {
    		k=n/2; 
    	 }
    	 else
    	 {
    		 k=n-1-1;
    	 }
    	 
    	 System.out.println("::::::::::"+k);
    	 for (int i = 0; i <=k; i++) {
             for (int j = 0; j <= n/2 ; j++) {
             	if(i==n/2)
             	{
             		int temp =matrix[i][j];
             		matrix[i][j]=matrix[i][n-j-1];
             		matrix[i][n-j-1]=temp;         		
             	}
             	else if(i==n/2+1 && j==n/2)
             		
             	{
             		int temp =matrix[i][j];
             		matrix[i][j]=matrix[i+1][j];
             		matrix[i+1][j]=temp;
             	}
             	
             	else if(i != n/2 && j==n/2)
             	{
             		 int  s= matrix[i][j];
             		 
             		matrix[i][j]=matrix[n/2+1+i][j];
             		matrix[n/2+1+i][j]=s;
             		System.out.println(s);
             	}
             }
    	 }
    	 System.out.println("expected");
    	 for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix[i].length; j++) {
                 System.out.print(matrix[i][j] + " ");
             }
             System.out.println();
         }

}
}
