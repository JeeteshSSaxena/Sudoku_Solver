import java.awt.color.*;
import java.util.*;


import java.awt.Point;
import java.math.*;
import java.io.*;
@SuppressWarnings("unused")
public class SudokuSolver {int[] b;String g=""; static int c=0;int m=1000000000+7;ArrayList<Integer> list=new ArrayList<Integer>();String s;int[] size;int[] id;
int[]ab;int[] data;int mod=100000;LinkedList<Integer> queue=new LinkedList<Integer>();int dis=0;int max=0;ArrayList<Integer>[] arr;
	public static void main(String[] args) {
              new  SudokuSolver().solve();
                                  }
	
            public void solve() {
            	int[][] sudoku=new int[9][9];
            	for(int i=0;i<9;i++) {
            		for(int j=0;j<9;j++) {
            			sudoku[i][j]=sc.nextInt();
            		}
            	}
            	mod=0;
            	allper(sudoku,0,0);
            	
            	
            	
       }
                
            boolean allper(int[][] chess,int r,int c) {
            	
            	if(r==9) {
            		for(int i=0;i<9;i++) {
            			for(int j=0;j<9;j++) {
            				System.out.print(chess[i][j]+" ");
            			}
            			System.out.println();
            			mod=1;
            		}
            		
            		return true;}
            	else {if(chess[r][c]!=0) {
            		if(c==8) {
            			c=0;r=r+1;}
            		else {
            			c=c+1;
            		}
            		allper(chess,r,c);
            		if(mod==1)
            			return false;
            	}else {
            		for(int i=1;i<=9;i++) {
            			
            			if(isSafe(chess,r,c,i)) {
            				chess[r][c]=i;
            				if(c==8) {
            					c=0;r=r+1;}
            				else {
            				c=c+1;}
            				if(!allper(chess,r,c)) {
            					if(mod==1)
            						break;
            					chess[r][c]=0;
            					if(c==0) {
            						c=8;r=r-1;}
            					else {
            						c=c-1;
            					}
            					if(r==9) {
            						r=8;c=8;
            					}
            					
            					continue;
            				}
            			}
            		}
            	}}
                return false;
            }
                 
           boolean isSafe(int[][] chess,int r,int c,int v) {
        	   if(r==9)
        		   return false;
        	   for(int i=0;i<9;i++) {
        		   if(chess[r][i]==v)
        			   return false;
        	   }
        	   for(int i=0;i<9;i++) {
        		   if(i!=r&&chess[i][c]==v)
        			   return false;
        	   }
        	  int rr=r-r%3;
        	  int cc=c-c%3;
        	  for(int i=rr;i<=rr+2;i++) {
        		  for(int j=cc;j<=cc+2;j++) {
        			  if(!(i==r&&j==c)&&chess[i][j]==v)
        				  return false;
        		  }
        	  }
        	   
        	   return true;
           }
          /*  String swap(String s,int l,int r) {
            	
            	char[] ww=s.toCharArray();
            	char t=ww[l];
            	ww[l]=ww[r];
            	ww[r]=t;
            	return String.valueOf(ww);
            	
            	
            	
            }*/
      public class Node{
	     long x;long color;long y;
	       Node par;ArrayList<Point> pp=new ArrayList<Point>();
	        public Node(long a) {
	          	x=a;
		
	             }
                  }
              class sortbyweight implements Comparator<Point>{

				@Override
				public int compare(Point arg0, Point arg1) {
					// TODO Auto-generated method stub
					
					return (int)(arg0.y-arg1.y);
				}}
				
				 FastReader sc=new FastReader();
				 static class FastReader
				     {
				         BufferedReader br;
				         StringTokenizer st;
				  
				         public FastReader()
				         {
				             br = new BufferedReader(new
				                      InputStreamReader(System.in));
				         }
				  
				         String next()
				         {
				             while (st == null || !st.hasMoreElements())
				             {
				                 try
				                 {
				                     st = new StringTokenizer(br.readLine());
				                 }
				                 catch (IOException  e)
				                 {
				                     e.printStackTrace();
				                 }
				             }
				             return st.nextToken();
				         }
				  
				         int nextInt()
				         {
				             return Integer.parseInt(next());
				         }
				  
				         long nextLong()
				         {
				             return Long.parseLong(next());
				         }
				  
				         double nextDouble()
				         {
				             return Double.parseDouble(next());
				         }
				  
				         String nextLine()
				         {
				             String str = "";
				             try
				             {
				                 str = br.readLine();
				             }
				             catch (IOException e)
				             {
				                 e.printStackTrace();
				             }
				             return str;
				         }
				     }}
            	  
        
