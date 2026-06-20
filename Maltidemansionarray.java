

package maltidemansionarray;

import java.util.Scanner;

public class Maltidemansionarray {
    public static void main(String[] args) { int [][]b={{1,2,3,4},{5,6,7,8},{9,10,11,12}}; int n=3,m=4;
        Scanner in=new Scanner(System.in);  int [][]a ={{1,2,3,19},{4,5,6,10},{7,8,9,1}};//a=[{1,2,3}
//         for ( int i =0 ; i<a.length ;i++)  {                                     {4,5,6}
//             for( int j =0 ; j<a[i].length;j++)System.out.printf(" %-4d",a[i][j]);{7,8,9}]
//System.out.println();}  
        
        // Q5 
//      for(int i=0 ;i<a.length -1 ;i++ ){
//       for(int j=1+i ; j<a[i].length ;j++) System.out.printf(" %4d",a[i][j]); // at first print all exept the a[0][0] at the end even don't print a[n][n
//    System.out.println();}

 //Q6 
// for ( int i=0 ;i<a.length ;i++){
//     for ( int j =0 ;j<a[i].length ;j++){
//         if (i+j ==a.length-1)System.out.printf("%4d" ,a[i][j]);
//     }System.out.println();

//Q 7
  //int p=in.nextInt();
//for(int i=0 ; i<a.length ; i++){
//for ( int j =0 ; j<a.length ; j++){
//    if ( i==p-1)System.out.printf("%4d ",a[i][j]);  // teacher method ---> System.out.printf("%4d ",a[p][j]);} 
// }

//Q 8
//int p =in.nextInt(); int q =in.nextInt(),k=0;
//for (int i =0 ; i<a.length ;i++){
// k =a[p][i];               
// a[p] [i] =a[q][i] ;                    
// a[q][i] =k; }             
// for ( int i=0 ; i<a.length ; i++){ 
//  for ( int j =0 ; j<a[i].length ; j++){
// System.out.printf("%4d ",a[i][j]);                     
//    }System.out.println();}
    
 //Q9
// int p = in.nextInt(); 
// for( int i=0 ; i<a.length ; i++ ){
// for ( int j =0 ; j< a[i].length ; j++){
//  if ( i !=p ) System.out.printf("%4d ",a[i][j]);     
////     }System.out.println() ;
// }
//
//Q 10
// int p = in.nextInt(),q=in.nextInt();
// for( int i=0 ; i<a.length ; i++ ){
// for ( int j =0 ; j< a[i].length ; j++){
//      if( i != p   && i != q){ //care that put the and operator in if condition 
//      System.out.printf("%4d ",b[i][j]); }    
// }System.out.println();}

//Q11 
//double []c = new double[n]; 
//for ( int i =0 ; i<n; i++){ double sum =0.0;
//for ( int j=0 ; j<m ;j++){
//      sum +=b[i][j];  //I had an error that sum+=a[i][j];
//    }
//  c[i] =sum * 1.0 /m;// here m is the array's column number ;
//} for ( int j =0 ; j<c.length ; j++){
// System.out.printf("%6.2f ",c[j]); }

//Q12
//int [][] my =new int[n][m-1];int x=in.nextInt(); 
//if ( x>=m-1)System.exit(0);
//for ( int i =0 ; i<b.length ;i++){
//for ( int j =0 ,k=0 ; j<b[i].length ; j++){
//  if ( j !=x ){  my[i][k] =b[i][j]; k++;}
//}}
//for ( int i= 0 ; i<my.length ;i++){
// for ( int j =0 ; j<my[i].length ; j++)
// System.out.printf("%4d ",my[i][j]); 
// System.out.printf("%4d ",my[i][j])

//Q13    System.out.println();
//int x=in.nextInt(), y =in.nextInt(); 
//for ( int i=0 ; i< a.length ; i++){
//for ( int j =0 ; j<a[0].length ;j++){
//      if ( i!=x && i!=y)System.out.printf("%6d ",a[i][j]);
//    }System.out.println();}

//Q14
//int x=in.nextInt(); int [][] b_x=new int [b.length-1][b[0].length];int k=0;
//for ( int i =0 ; i<b.length ;i++){if(i == x) continue; //remove this row  // I had an error in there 
//for ( int j=0 ; j<b[i].length ; j++){ 
//b_x[k][j]=b[i][j];
//    }k++;}
//  for( int i=0 ; i<b_x.length ; i++ ){
// for( int j =0 ; j< b_x[i].length ; j++){
//  System.out.printf("%4d ",b_x[i][j]);     
//    }System.out.println() ;}   

//Q 15 

// int x=in.nextInt(); int y = in.nextInt(); if ( x>=b.length || y>=b.length || y==x)System.exit(0);
// int [][] b_x=new int [b.length-2][b[0].length];int k=0;
//for ( int i =0 ; i<b.length ;i++){if(i == x || i==y) continue; //remove this row  // I had an error in there 
//for ( int j=0 ; j<b[i].length ; j++){ 
//b_x[k][j]=b[i][j];
//    }k++;}
//  for( int i=0 ; i<b_x.length ; i++ ){
// for( int j =0 ; j< b_x[i].length ; j++){
//  System.out.printf("%4d ",b_x[i][j]);     
//    }System.out.println() ;}             
 
//Q16  
//int  sum=0,temp =0; boolean f=true  ;
//for ( int i=0 ; i< a.length ;i++){sum=0;// I had a logical error in there
//            
//for ( int j=0 ;j<a[0].length ; j++){
//    sum+=a[i][j] ;  }
//    temp =(i==0)? sum :temp; 
//if(temp != sum){ f=false;break;}
// }   System.out.println(f) ;             
    
//Q17
//int [][] swap =new int[a[0].length][a.length];
//for ( int i=0 ; i<a.length ; i++){
//for ( int j =0 ; j<a[i].length ; j++){
//     swap [j][i] =a[i] [j];}}
//for ( int i= 0 ; i<swap.length ; i++){
//    for( int j =0 ; j<swap[i].length ; j++)System.out.printf(" %5d",swap[i][j]);
//System.out.println();}

////Q18
//double sum =0.0;
//for ( int i=0 ; i<a.length ; i++){
//for ( int j =0 ; j<a[i].length ; j++)
//     sum +=a[i][j];}double med =sum /(a.length *a[0].length);
//     System.out.printf(" %5.2f",med);

//q19  
//int bx[][] =new int[b.length][b[0].length];int x=in.nextInt();
//for ( int i =0 ;i<b.length ;i++){
//    for ( int j =0 ; j<b[1].length ; j++){
//       bx[i][j] =x *b[i][j];   System.out.printf(" %5d",bx[i][j]);
//    }System.out.println();
//}
    
//20 
//int c[][] =new int[b.length][b[0].length];
//for ( int i =0 ;i<b.length ;i++){
//    for ( int j =0 ; j<b[1].length ; j++){
//       c[i][j] = a[i][j] +b[i][j];   System.out.printf(" %5d",c[i][j]);
//    }System.out.println();}

//By the help of Allah I finished this in 1404 / 10/17/ ..22/12;

    }}

