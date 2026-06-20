
package chapter_eight;        // I have Started in -->1404,11,30 :1
import java.util.Scanner;
public class Chapter_Eight {
    public static void main(String[] args) {   Scanner in=new Scanner(System.in);
//        //8.1  sum column by column 
//        int nums[][]=new int [in.nextByte()][in.nextByte()];int col_sum []=new int[nums[0].length]; int sum;
//        System.out.printf("print An %d by %d array's elements :",nums.length ,nums[0].length);
//        for(int i=0;i<nums.length ;i++) for(int j=0;j<nums[0].length ;j++) nums[i][j]=in.nextInt(); // promphts user 
//        for(int col=0; col<nums[0].length ;col++){ sum=0;
//            for(int i=0; i<nums.length ;i++) sum+=nums[i][col];   col_sum[col]=sum;} // sums columnly
//         System.out.println(" there is the sum of array columnly :");
//         for(int i=0;i<nums[0].length ;i++) System.out.printf(" the column %d  sum is : %d ",i,col_sum[i]);

//8.2  sum by major  diogonal  
// int n =in.nextByte(); int nums[][]=new int [n][n];int col_sum []=new int[nums[0].length]; int sum=0;
//       System.out.printf("print An %d by %d array's elements :",nums.length ,nums[0].length);
//        for(int i=0;i<nums.length ;i++) for(int j=0;j<nums[0].length ;j++){ nums[i][j]=in.nextInt(); // promphts user 
//          if (i==j) sum +=nums[i][j];}  // sum diogonally 
//        System.out.printf("the sum of metris of %d by %d  diogonally is : %d ",nums.length ,nums[0].length,sum);//print now

//8.4 Employee 's  work hours and sort them in decreasing order 
//  System.out.printf("Type number of Employee's :"); double [][]work_hours=new double[in.nextByte()][7]; double total,temp;
//  double sum[]=new double[work_hours.length]; String name[] =new String [sum.length];String s; 
//  for(int i=0;i<work_hours.length ;i++){System.out.printf("enter the %d Employ's nume and work hours :",i);name[i]=in.next();total=0;
//    for(int j=0;j<7 ;j++){total += work_hours[i][j]=in.nextFloat();   } sum[i]=total; }// promps and sum it 
// for(int i=0;i<sum.length;i++){     for(int j=i+1 ;j<sum.length ;j++){ //sort in decreasing order
//     if(sum[j]> sum[i]){temp =sum[j]; sum[j]=sum[i]; sum[i] = temp; s=name[j]; name[j]=name[i]; name[i]=s;} }   }       
//      for(int i=0 ;i<sum.length ;i++)System.out.printf("%s has %.1f hours \n",name[i],sum[i]); // print 

//8.5 sum tow mitrix 
//int n=in.nextByte(); int m1[][]=new int[n][n]; int m2[][]=new int [n][n];
//System.out.printf("mit 1"); for(int i=0;i<n ;i++) for(int j=0; j<n ;j++)m1[i][j]=in.nextInt();
//System.out.printf("mit 2"); for(int i=0;i<n ;i++) for(int j=0; j<n ;j++)m2[i][j]=in.nextInt(); 
// sum_print(m1,m2); adds(m1, m2); 

//8.6 multiply the tow metrixes 
//int a[][] =new int[in.nextByte()][in.nextByte()]; System.out.printf("print %d by %d metrix :",a.length ,a[0].length);
//for(int i=0 ;i<a.length ;i++)for(int j=0; j<a[0].length ;j++)a[i][j] =in.nextByte();System.out.printf("now print second metrix length");
//int b[][] =new int[in.nextByte()][in.nextByte()]; System.out.printf("print %d by %d metrix :",b.length ,b[0].length);
//for(int i=0 ;i<b.length ;i++)for(int j=0; j<b[0].length ;j++)b[i][j] =in.nextByte(); maltiply_print(a,b);// create and call megthod

//8.9  tic tac tio game
// int n=in.nextByte(),row,column;char[][]baord =new char [n][n]; for(int i=0;i<n;i++) for(int j=0;j<n;j++)baord[i][j]=' ';
// System.out.print("tpe your names player 1 and plaer 2"); String p1 =in.next(),p2 =in.next(),play=p1;
// char player1 =Character.toUpperCase(p1.charAt(0)),player2=Character.toLowerCase(p2.charAt(0));char player=player1; // take the names of players 
// while(true){ print(baord); System.out.printf("Please player :%s enter the row and column of this baord 1 to %d ",play,n);
//    row=in.nextByte()-1; column=in.nextByte()-1; // promps the user 
//   if(baord[row][column] !=' '){ System.out.println(" this proint is filled please enter another one "); continue;} // if is filled before
//    baord[row][column]=player; // if is not filled that cell before fill it now 
//   if(iswin(baord ,player)){ print(baord);System.out.printf(" %s wins",play);  break;} //if wins 
//   if(isfull(baord)){ print(baord); System.out.printf(" non of players is wins "); break;} // if is not any other Space
//   if(player==player1){player = player2; play=p2;} else{player=player1; play=p1; }  } // change the player in order
 
// 8.10 find  the lorgest row and column 
//int r=in.nextByte(),col=in.nextByte(); byte [][]num =new byte[r][col];int max=0,sum ,ind_row =0,ind_col =0; // create the array and fill and print
//for ( int i=0; i<r ;i++){  for(int j=0;j<col;j++){num[i][j]=(byte)(Math.random()*2); System.out.printf("%d ",num[i][j]);} System.out.println();} 
//for(int i=0;i<r;i++){sum=0; for(int j=0; j<col;j++)sum +=num[i][j]; if(sum>max){max =sum;ind_row=i+1;}} // find the lorgest row;
//for(int i=0;i<col;i++ ){sum=0; for(int j=0; j<r;j++)sum+=num[j][i]; if(sum >max){max=sum; ind_col=i+1; }}
//System.out.printf(" the lorgest row  is row number : %d \n the lorgest column is column number : %d",ind_row , ind_col);
   
//8.11 nine head and nail Game
//System.out.printf(" Wilcome to head and  tail game \n print you number ");int num=in.nextByte();  head_tail(num); //make and call the method
 // 8.13 find the location of lorgest element 
// int n=in.nextByte(),m=in.nextByte(),max,max_r=0,max_col=0; byte [][] num =new byte[n][m]; // create and full it  
// for(int i=0; i<n ;i++) for(int j=0; j<m ;j++)num[i][j] =in.nextByte();max=num[0][0];
// for(int i=0; i<n ;i++){for(int j=0; j<m;j++){ System.out.printf("%-3d",num[i][j]); 
// if(num[i][j]>max){max = num[i][j]; max_r=i; max_col=j;}  }System.out.println();}
// System.out.printf(" the lorgest number is :%d \n it's row is :%d \n it's column is :%d ",max,max_r ,max_col);

// 8.14 find that is it all epoul in one row ,column , diognal, sub_diuganl 
//byte n=in.nextByte(),is; int [][] bi =new int [n][n]; boolean eqoul ;
//for(int i=0; i<n; i++){for(int j=0; j<n; j++){ bi [i][j]=(int)(Math.random()*2); System.out.printf("%-3d",bi[i][j]);}System.out.println();}// full it fandomly and show it 
//is=0; for(int i=0 ;i<n ; i++){eqoul =true; for(int j=1; j<n ; j++) if(bi[i][j-1] !=bi[i][j]){eqoul=false; break;} 
// if(eqoul==true){ is++; System.out.printf("all %ds on row %d \n",bi[i][0],i); }} if(is==0)System.out.println("no same numbers in a row!"); // check rowly 
// is=0; for(int i=0 ;i<n ; i++){eqoul =true; for(int j=1; j<n ; j++) if(bi[j-1][i] !=bi[j][i]){eqoul=false; break;} 
// if(eqoul==true){ is++; System.out.printf("all %ds on column %d \n",bi[0][i],i); }} if(is==0)System.out.println("no same numbers in a column!");
//  eqoul=true; for(int i=1; i<n ;i++)if(bi[i-1][i-1] !=bi[i][i]){eqoul=false; break;}  
//  if(eqoul)System.out.printf("in main diagonal all is %d \n",bi[0][0]);   else System.out.println("no same numbers in the maindiagonal");  
//   eqoul=true; for(int i=1; i<n ;i++)if(bi[i-1][n-i] !=bi[i][n-1-i]){eqoul=false; break;}  
//  if(eqoul)System.out.printf("in sub diagonal all is %d \n",bi[0][0]);   else System.out.println("no same numbers in the sub diagonal"); 
  
//8.15 is in the same line ---> Is=would make a dianamic code for this by making an array of sheaps 
//int n=in.nextByte(); int [][]point=new int [n][2];boolean is;
//for(int i=0; i<n; i++){System.out.printf("type x,y for piont %d",(i+1));point[i][0]=in.nextInt();point[i][1]=in.nextInt();} //sreate the array and print it
// is=is_sameLine(point);System.out.printf("this %d points are %s in the same line ",point.length,(is==true)? "":"not");  //call the method and print the rezult
        
//8.16 sort a tow dimantional array
//int n=in.nextByte(),m=in.nextByte(); System.out.printf("print a %d by %d metrix :",n,m); int num[][] =new int [n][m]; 
//for(int i=0;i<n; i++)for(int j=0;j<m ;j++)num[i][j]=in.nextByte(); sort_metrix(num);//finished succesfully by my self

//8.18 shaffling the rows of an array
// int [][]num =create_array(1);printt(num); int index,temp;
//for(int i=0; i<num.length; i++){ index=(int)(Math.random()*num.length);
//for(int j=0; j<num[0].length ;j++){temp=num[i][j]; num[i][j]=num[index][j]; num[index][j]=temp;}}System.out.printf("After it is shaffled : ");printt(num);

//8.19is thier four eqoul seqountial numbers 
//int n=in.nextByte(),m=in.nextByte(); System.out.printf("print a %d by %d metrix :",n,m); int num[][] =new int [n][m]; 
//for(int i=0;i<n; i++)for(int j=0;j<m ;j++)num[i][j]=in.nextInt(); boolean is=is_four(num); //create and call the method 
//for(int i=0; i<num.length; i++){for(int j=0; j<num[0].length; j++)System.out.printf("%-3d",num[i][j]);  System.out.println();  }//print it
// System.out.printf("in this metrix it is %s four eqoul seqventail numbers ",(is==true)? "":"not");

//8.20 four connect Game 
//int n=6,m=7;char[][]board=new char[n][m]; for(int i=0 ;i<n; i++) for(int j=0; j<m; j++)board[i][j]=' ';String pl1,pl2,pl; boolean full;
//System.out.print("type thie names of player 1 and 2 :");pl1=in.nextLine();pl2=in.nextLine();pl=pl1; int col;
//if(pl1 ==pl2){System.out.print("players nmae can't be the same");System.exit(0);} char p='A';
//while(true){print(board); System.out.printf("%s print the column :%d to %d",pl,1,7);col=in.nextByte()-1;
//  full=true; for(int i=5 ;i>=0; i--) if(board[i][col]==' '){board[i][col]=p; full=false; break;} 
//   if(full==true){System.out.print("this column is fulled chose onather one! \n"); continue;}//  prumps the players and check that isn't it fulled before
//  if(iswin(board,p)){print(board);System.out.printf("the player %s is win ",pl);  break;}
//  if(is_full(board)){print(board);System.out.print("this board is fulled");  break;}
//   if(p=='A'){ p='B' ; pl=pl2;} else{ p='A'; pl=pl1;}  }  // change the player  

//8.21 shortest distance between cities 
//int n=in.nextByte(),m=2,center=0;double sum,cen_amount=0; double [] total =new double[n];double [][] city=new double [n][m];
//for(int i =0 ;i<n ;i++){System.out.printf("print the coordinates of city %d \n",i+1);for(int j=0; j<m ;j++)city[i][j]=in.nextDouble(); }//promps the use to inter the coo
//for(int i=0; i<n; i++){ sum=0;for(int j=0; j<n;j++)sum+=distance(city[i][0],city[i][1],city[j][0],city[j][1]); total[i]=sum;
//if(i==0)cen_amount=sum; if(sum<cen_amount){cen_amount=sum;  center=i;}} //find the distances
//printt(city); System.out.printf("the central city is city %d the total distance is : %f.1 KM",center+1,cen_amount);

//22 generate the even number of 1s
//System.out.printf(" type the row and collumn length ;"); int row=in.nextByte(),col=in.nextByte();
//if(row%2 !=0||col%2 !=0)System.exit(0); even_zeros(row,col);
//23 find which one is chenged 
//System.out.printf(" type the row and collumn length ;"); int row=in.nextByte(),col=in.nextByte();
//if(row%2 !=0||col%2 !=0)System.exit(0); even_zeros(row,col);

//24 check sudoku solution 
//int[][] soduku={{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}};
//  int i=0,row,col,temp;while(i<5){ printt(soduku); System.out.println(" Full this whit numbers ");
// if(full(soduku)){if(Soduku(soduku)){System.out.printf("congrojilation you wan !");  break;}
// System.out.printf("change the column and row you want to change :");col=in.nextByte();row=in.nextByte(); 
// System.out.printf("type the number ou want to put in row %d and column %d",row,col);temp=in.nextByte();
//if(temp>=1 && temp <=9)soduku[row][col]=temp; else System.out.printf("incomptable number "); i++; }}
 
 //26 sort an array by row in increasing order
//  int [][] num=create_array(1);//create an array 
// int temp;for(int i=0 ;i<num.length; i++)for(int j=0; j<num[0].length; j++)for(int k=j+1; k<num[i].length; k++)
//   if(num[i][j]>num[i][k]){temp=num[i][j]; num[i][j]=num[i][k]; num[i][k]=temp;} //sort it
// printt(num);//print it
 
//27 sort columnly in decreasing order
//int [][]num=create_array(2);//cteate 
//int temp;for(int col=0; col<num[0].length ;col++) for(int row=0; row<num.length;row++) for(int k=0; k<num.length;k++)
//    if(num[row][col]<num[k][col]){temp=num[row][col]; num[row][col]=num[k][col]; num[k][col]=temp;}//sort
//printt(num);//print

//29 the tow array have the same content
//int [][]set1=create_array(1); int[][]set2=create_array(2); boolean is_same=false;  //create tow arrays
//if(set1.length == set2.length && set1[0].length==set2[0].length) is_same=is_same(set1,set2);//call the method and print them with rezult
//printt(set1); printt(set2); if(is_same==true)System.out.printf("these tow arrays have the same contents "); 

//30,31  intersect of tow lines
//double [][]line1=create_array(2,2,0.3);double [][] line2=create_array(2,2,3.3);   //promps the user to print four element for every of tow varibles
//double[] intersect=intersect(line1,line2);System.out.printf("the intersect of these tow lines are in :( %.2f , %.2f)",intersect[0],intersect[1]);// find the mile of bath  and eqoution for bath//find the values of x and y and type

//32 compute the area of a triangle ----> your the best he man 
//double [][] triangle=create_array(3,2,9.9);//create an array and call the method
//double area =tri_area(triangle);
//printt(triangle); System.out.printf("the area of this triangle is :%.2f",area);// find circuty of triangle and the compute the area

////33  find the areas of triangles in a polgone ---> a polygon has four triangles in 
//int [][]polygon=create_array(4,2);int [][] line1=new int [2][2];int [][] line2=new int [2][2];//create array and promps the user and divide into tow array 
//for(int i=0;i<2;i++){line1[i][0]=polygon[i][0]; line1[i][1]=polygon[i][1]; line2[i][0]=polygon[i+2][0]; line2[i][1]=polygon[i+2][1];}
//double[]mid =intersect(line1,line2);//devide it into four triangles 
//double []d=new double[8]; for(int i=0; i<3; i++){d[i]=distance(polygon[i][0],polygon[i][1],polygon[i+1][0],polygon[i+1][1]);}//distance 
//area
//sort he areas 
//-----> this is very hard for me I can't solve this now 

////34 find the rightmost lowest point in this array of points اولویت با کدام است ؟  ---> lowest
//int[][]num=create_array(in.nextByte(),2); int[][] low_right=new int[1][2];int min=num[0][1],index=0;//create an array
//for(int i=1;i<num.length ;i++){if(num[i][1]<min){ min=num[i][1]; index=i;low_right[0][0] =num[i][0];low_right[0][1] =num[i][1];} }// if it was lower   in decreasing order in hieght
//for(int i=0; i<num.length; i++)if (num[i][1]==min)if(num[index][0]<num[i][0]){index=i;low_right[0][0] =num[i][0];low_right[0][1] =num[i][1];}//sort if it was eoul in hieght  
//printt(num);  System.out.printf("the lowest rightmost point is( %d , %d )",low_right[0][0],low_right[0][1]);// print it

//35 lorgest block --> find the lorgest sub_metrix for a big metrix
//int n=in.nextByte(); byte [][] metrix=new byte[n][n]; for(int i=0; i<n; i++) for(int j=0; j<n ;j++)metrix[i][j]=(byte)(Math.random()*2);//create a metrix 
//byte[]a=Lorgest_Block(metrix);//call the method to find and generate the sub_metrix
//printt(metrix,a); System.out.printf(" the logest sub_metrix is in(%d ,%d) it's size is : %d",a[0]+1,a[1]+1,a[2]); //print bath of them 

//36 Latin sqoute  ---> is to check whether a char of copital Alphabet is unique in a row ans column 
//int n=in.nextByte(); char [][] Latin=create_array(n,' '); boolean is=is_sqoure(Latin); printt(Latin);//make , check then ptinr  
//if(is)System.out.println("this Sqoure is A Latin Sqoure "); else System.out.println(" this Sqoure is not A Latin Sqoure");

//37 check the capital of the countries 
//String [][]c=data();int n,num=0,correct=0;String answer;char an;
//while(true){ num++; n=(int)(Math.random()*c.length); System.out.printf("What is the capital of : %s \n ",c[n][0]); answer=in.next();
//if(answer.equals(c[n][1])){correct++; System.out.println("your correct ");} else System.out.printf("the capital of %s is %s\n",c[n][0],c[n][1]);
//System.out.println("do you want to stop !"); an=in.next().charAt(0); if(an=='y' ||an=='Y' ) break; } 
//System.out.printf(" Dear costomer : you played %d times and you won %d times",num,correct);

    
    }
 static void printt(int [][] p){   for(int i=0 ;i<p.length; i++){ for(int j=0; j<p[0].length; j++) System.out.print(p[i][j] +" "); System.out.println();}}
 
 static void printt(double [][] p){   for(int i=0 ;i<p.length; i++){ for(int j=0; j<p[0].length; j++) System.out.printf("%.2f  ",p[i][j]); System.out.println();}}
 static void printt(char [][] p){   for(int i=0 ;i<p.length; i++){ for(int j=0; j<p[0].length; j++) System.out.print(p[i][j] +" "); System.out.println();}}
 static void printt(String [][] p){   for(int i=0 ;i<p.length; i++){ for(int j=0; j<p[0].length; j++) System.out.print(p[i][j] +" "); System.out.println();}}
 // thier is for making the arrays and fullint with user input which ---> 1 ==int , 2==double , 3=char , 4== String
 static int[][] create_array(int k){Scanner in=new Scanner(System.in);System.out.printf("enter the row and column length of this array : ");int n=in.nextByte(),m=in.nextByte();
 System.out.printf("print an %d by %d array of numbers : ",n,m); 
int [][] num=new int [n][m];for(int i =0 ;i<n ;i++)for(int j=0; j<m ;j++)num[i][j]=in.nextInt(); return num;} 
 static double[][] create_array(double k){Scanner in=new Scanner(System.in);System.out.printf("enter the row and column length of this array : ");
 int n=in.nextByte(),m=in.nextByte();System.out.printf("print an %d by %d array of doulbe : ",n,m); 
double [][] num=new double [n][m];for(int i =0 ;i<n ;i++)for(int j=0; j<m ;j++)num[i][j]=in.nextDouble(); return num;} 
static char [][] create_array(char k){Scanner in=new Scanner(System.in); System.out.printf("enter the row and column length of this array : ");int n=in.nextByte(),m=in.nextByte();
System.out.printf("print an %d by %d array of Character : ",n,m); 
char [][] num=new char [n][m];for(int i =0 ;i<n ;i++)for(int j=0; j<m ;j++)num[i][j]=in.next().charAt(0); return num;} 
static String [][] create_array(String k){Scanner in=new Scanner(System.in);System.out.printf("enter the row and column length of this array : ");int n=in.nextByte(),m=in.nextByte();
System.out.printf("print an %d by %d array of String : ",n,m); 
String [][] num=new String [n][m];for(int i =0 ;i<n ;i++)for(int j=0; j<m ;j++)num[i][j]=in.nextLine(); return num;} 
static int[][] create_array(int row,int col){Scanner in=new Scanner(System.in);int n=row,m=col;
 System.out.printf("print an %d by %d array of numbers : ",n,m); 
int [][] num=new int [n][m];for(int i =0 ;i<n ;i++)for(int j=0; j<m ;j++)num[i][j]=in.nextInt(); return num;} 
 static double[][] create_array(int n,int m,double a){Scanner in=new Scanner(System.in);System.out.printf("print an %d by %d array of doulbe : ",n,m); 
double [][] num=new double [n][m];for(int i =0 ;i<n ;i++)for(int j=0; j<m ;j++)num[i][j]=in.nextDouble(); return num;} 
static char [][] create_array(int n,int m,char k){Scanner in=new Scanner(System.in); System.out.printf("print an %d by %d array of Character : ",n,m); 
char [][] num=new char [n][m];for(int i =0 ;i<n ;i++)for(int j=0; j<m ;j++)num[i][j]=in.next().charAt(0); return num;} 
static String [][] create_array(int n,int m, String k){Scanner in=new Scanner(System.in);  System.out.printf("print an %d by %d array of String : ",n,m); 
String [][] num=new String [n][m];for(int i =0 ;i<n ;i++)for(int j=0; j<m ;j++)num[i][j]=in.nextLine(); return num;} 

    // 8.6 
//    static int[][] add(int[][]mit1 ,int[][]mit2){ if(mit1.length !=mit2.length ||mit1[0].length !=mit2.length)System.exit(0);// check point
//        int add[][]=new int[mit2.length][mit1.length];
//    for(int i=0; i<mit1.length ;i++) for(int j=0; j<mit1.length ;j++){  add[i][j]=mit1[i][j]+mit2[i][j]; }  return add;}
//   static void sum_print(int m1[][],int m2[][]) {int add[][]=add(m1 ,m2);int n=m1.length;
//   for(int i=0; i<n ;i++){for(int j=0;j<n ;j++) System.out.printf("%-3d",m1[i][j]); System.out.printf("  %c  ",(i==m1.length/2)?'+':' '); 
//   for(int j=0; j<n ;j++)System.out.printf("%-3d",m2[i][j]); System.out.printf("  %c  ",(i==m1.length/2)?'=':' ');
//   for(int j=0; j<add.length ;j++)System.out.printf("%-3d",add[i][j]); System.out.println(); }}// print the rezult 
//// another form 
//     static void adds(int[][]mit1 ,int[][]mit2){ if(mit1.length !=mit2.length ||mit1[0].length !=mit2.length)System.exit(0);
//        int add[][]=new int[mit2.length][mit1.length];int n=mit1.length;
// for(int i=0; i<mit1.length ;i++){ for(int j=0; j<mit1.length ;j++)add[i][j]=mit1[i][j]+mit2[i][j]; // sum 
// for(int j=0;j<n ;j++) System.out.printf("%-3d",mit1[i][j]);System.out.printf("  %c  ",(i==mit1.length/2)?'+':' '); // print the rezult 
// for(int j=0; j<n ;j++)System.out.printf("%-3d",mit2[i][j]); System.out.printf("  %c  ",(i==mit1.length/2)?'=':' ');
//   for(int j=0; j<add.length ;j++)System.out.printf("%-3d",add[i][j]); System.out.println();} }

 //8.5 
// static int [][] multiply_mitrix(int [][] a , int [][]b){  
//    if(a[0].length != b.length){System.out.println("impasiabke to maltiply");System.exit(0);}//check the multiply condition 
//         int [][] c =new int [a.length][b[0].length]; 
//    for(int i=0; i<c.length ;i++) for(int j=0; j<c[i].length;j++) for(int k=0;k<a[0].length;k++)  c[i][j] +=a[i][k]*b[k][j];  return c;}
// static void maltiply_print(int m1[][],int m2[][]) {int maltiply[][]=multiply_mitrix(m1 ,m2);
//for(int i=0; i<Math.max(m1.length,m2.length)  ;i++){ 
// if(i<m1.length)for(int j=0;j<m1[i].length ;j++) System.out.printf("%-3d",m1[i][j]); System.out.printf("   %c   ",(i==(m1.length+1)/2)?'X':' '); 
// if(i<m2.length)for(int j=0; j<m2[i].length ;j++)System.out.printf("%-3d",m2[i][j]); System.out.printf("   %c   ",(i==(m1.length+1)/2)?'=':' ');
// if(i<maltiply.length) for(int j=0; j<maltiply[i].length ;j++)System.out.printf("%-3d",maltiply[i][j]); System.out.println(); }}// print the rezult 
  
//8.9 
//  static void print(char [][]b){ 
//   for(int i=0,row=0;i<b.length ;i++){for(int k=0; k<b.length;k++)System.out.printf("--"); System.out.println("-"); // the horizontail lines
//   for(int j=0,col=0 ;j<b.length; j++)System.out.printf("%c%c",'|',b[i][j]);System.out.println("|");
//    if(i==b.length-1){for(int k=0; k<b.length;k++)System.out.printf("--"); System.out.println("-"); }}}// the horizontail lines for last line
//  static boolean iswin(char[][] b ,char p){ int n=b.length;  boolean win;
//   for(int i=0; i<n;i++){ win=true; for(int j=0; j<n ;j++)if(b[i][j] !=p){ win=false; break; }if(win==true)return win;}  // check row 
//    for(int i=0; i<n;i++){ win=true; for(int j=0; j<n ;j++)if(b[j][i] !=p){ win=false; break; }if(win==true)return win;}  //column
//    win = true;for(int i=0; i<n ;i++) if(b[i][i] !=p){win=false; break;} if(win) return win; //main diomater
//    win = true;for(int i=0; i<n ;i++) if(b[i][n-1-i] !=p){win=false; break;} if(win) return true; return win;} // diomater
// static boolean isfull(char[][] b){int n=b.length;
//  for(int i=0; i<n;i++) for(int j=0; j<n ;j++) if(b[i][j] ==' ') return false ;  return true;  } 
  
 // 8,11 
// static void head_tail(int n){ char [][] bi=new char[3][3];
//   for(int i=2 ;i>=0; i--) for(int j=2 ;j>=0;j--){bi [i][j]=(n%2==1)? 'T':'H'; n/=2;}
//   for(int i=0 ;i<3;i++){ for(int j=0; j<3 ;j++)System.out.printf("%c ",bi[i][j]); System.out.println();    }     }

    //8.15
//    static boolean is_sameLine(int [][]n){ if(n.length <=2)return true;
//    for(int i=2; i<n.length ;i++){
//        if(((n[i][1]-n[0][1])*(n[1][0]-n[0][0]))!=((n[1][1]-n[0][1])*(n[i][0]-n[0][0]))) return false;} return true;}      
//   float [] mile =new float[n.length-1];  for(int i=1; i<n.length; i++){ mile[i-1]=(float)((n[i][1]-n[i-1][1]-0.0)/(n[i][0]-n[i-1][0]-0.0)); // find the mile of tow points
//      if(i !=1 && (int)(mile[i]*10)/10 !=(int)(mile[i-1] *10)/10)return false;   }  return true;}   
    
    //8.16 اولویت با ستون های اول است بعد با دوم و سوم.....
//static void sort_metrix (int num[][]){ int temp; 
// for(int i=0;i<num.length-1; i++){ for(int j=i+1 ;j<num[0].length; j++){ 
//  if(num[i][0] > num[j][0]){for(int k=0; k<num[0].length ;k++){ temp=num[j][k]; num[j][k]=num[i][k]; num[i][k]=temp;}}}} //sort by first column --> increasing erder
//  for(int i=0;i<num.length-1; i++){ for(int j=i+1 ;j<num[0].length; j++){ 
//      if(num[i][0]==num[j][0])for(int col=1;col<num[0].length; col++)  //if eqoul is first columns check other columns 
//  if(num[i][col] > num[j][col]){for(int k=0; k<num[0].length ;k++){ temp=num[j][k]; num[j][k]=num[i][k]; num[i][k]=temp;}break;}}}    //if eqoul
// for(int i=0; i<num.length; i++){for(int j=0; j<num[0].length; j++)System.out.printf("%-3d",num[i][j]);System.out.println();  }} //print    
  
    //8.19
//static boolean is_four(int [][]num){  int n=num.length,m=num[0].length;if(n<4 && m<4)return false; // a check point
//for(int i=0; i<n ;i++) for(int j=0 ;j<m ;j++){
// if(j<=(m-4))if(num[i][j]==num[i][j+1]&&num[i][j]==num[i][j+2]&&num[i][j]==num[i][j+3]) return true;        //check rowly
// if(i<=(n-4))if(num[i][j]==num[i+1][j]&&num[i][j]==num[i+2][j]&&num[i][j]==num[i+3][j]) return true;               //check columnly
// if(j<=(m-4)&&i<=n-4)if(num[i][j]==num[i+1][j+1]&&num[i][j]==num[i+2][j+2]&&num[i][j]==num[i+3][j+3]) return true;               //check by main diognal
//// if(i<=(n-4) && j>=3)if(num[i][j]==num[i+1][j-1]&&num[i][j]==num[i+2][j-2]&&num[i][j]==num[i+3][j-3]) return true;      }          //check by sub diognal 
//  return false;}

//8.20 
//static void print(char [][] p){   for(int i=0 ;i<p.length; i++){ for(int j=0; j<p[0].length; j++) System.out.printf("|%c",p[i][j] ); System.out.println("|");}}
//static boolean iswin(char [][]num,char pl){int n=6,m=7;
//for(int i=0; i<n ;i++) for(int j=0 ;j<m ;j++){
// if(j<=(m-4))if(num[i][j]==num[i][j+1]&&num[i][j]==pl&&num[i][j]==num[i][j+2]&&num[i][j]==num[i][j+3]) return true;        //check rowly
// if(i<=(n-4))if(num[i][j]==num[i+1][j]&&num[i][j]==pl&&num[i][j]==num[i+2][j]&&num[i][j]==num[i+3][j] ) return true;               //check columnly
// if(j<=(m-4)&&i<=n-4)if(num[i][j]==num[i+1][j+1]&&num[i][j]==pl&&num[i][j]==num[i+2][j+2]&&num[i][j]==num[i+3][j+3]) return true;               //check by main diognal
// if(i<=(n-4) && j>=3)if(num[i][j]==num[i+1][j-1]&&num[i][j]==pl&&num[i][j]==num[i+2][j-2]&&num[i][j]==num[i+3][j-3]) return true;      }  return false;}        //check by sub diognal  
//static boolean is_full(char [][] bo){
// for(int i=0; i<7; i++) for(int j=0;j<6;j++) if(bo[i][j]==' ')return false; return true;}

//21
static double distance(double x1,double y1,double x2,double y2){return Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));}
//22 && 23
//static void even_zeros(int n,int m){Scanner in=new Scanner(System.in);int sum,r,c; 
//int [][] num=new int [n][m];for(int i =0 ;i<n-1 ;i++)for(int j=0; j<m-1 ;j++)num[i][j]=(int)(Math.random()*2);  
//for(int i=0; i<n-1 ;i++){sum=0;for(int j=0; j<m-1 ;j++)sum+=num[i][j]; num[i][m-1]=(sum%2==0)?0:1;   }     //checkk the row first
// for(int i=0; i<m;i++){sum=0; for(int j=0; j<n;j++)sum+=num[j][i]; num[n-1][i]=(sum%2==0)?0:1;  }printt(num);//now check the collumn// print it;}
// System.out.print("which element do you want to change");r=in.nextByte()-1;c=in.nextByte()-1; // know the changing 
// num[r][c]=(num[r][c]==0)?1:0;printt(num); find_changed(num);printt(num);  } // call the find method then change and print   
//static void find_changed(int [][] n){ int r=0,c=0,sum;
// for(int i=0; i<n.length; i++){ sum=0; for(int j=0; j<n[0].length ;j++)sum+=n[i][j]; if(sum%2==1)r=i;}
// for(int i=0; i<n[0].length; i++){ sum=0; for(int j=0; j<n.length ;j++)sum+=n[j][i]; if(sum%2==1)c=i;}
// System.out.printf("the changed element is in ---> row=%d ,column=%d \n After fixing it become ",r+1,c+1);n[r][c]=(n[r][c]==0)?1:0;} 
  
//24 
//static boolean Soduku(int [][] s){int n=9,m=9; int r,c,k,d;
//for(c=0; c<n; c++){ for( r=0; r<m ;r++)for( k=0;k<m; k++) 
//    if(k !=r &&s[r][c]==s[r][c]){System.out.printf("the column %d has problem",c); return false;} } //check columly
//for(r=0; r<n; r++){ for(c=0; c<m ;c++)for( k=0;k<m; k++) 
//    if(k !=c &&s[r][c]==s[r][c]){System.out.printf("the row %d has problem",r); return false;}}//check rowly
//for(int i=0; i<9; i+=3){ for(int j=0; j<9; j+=3){   for(r=0;r<3;r++)for(c=0;c<3;c++)   for(k=0;k<3;k++)for( d=0;d<3;d++)
//    if(d!=c && k !=r && s[r+i][c+j]==s[i+k][j+d]){System.out.printf("the %d,%d has problem",i,j); return false;}}} return true;} //check every small box
//static boolean full(int [][]s){ for(int i=0;i<s.length; i++)for(int j=0;j<s[i].length;j++)if(s[i][j]<1 || s[i][j]>9)return false; return true;}

//29
//static boolean is_same(int[][]a,int[][]b){ boolean is;
//    for(int row=0; row<a.length; row++)for(int col=0; col<a[0].length;col++ ){ is=false;
//     for(int i=0; i<b.length; i++)for(int j=0; j<b[0].length;j++)if(a[row][col]==b[i][j])is=true;    if(is==false)return false; } return true;}
  
//30.31
//static double[] intersect(double [][]a,double[][]b){ boolean is; double []point=new double [2];
//double x, y ,A=(a[0][1] - a[1][1]),B =(a[0][0] - a[1][0]),C= (b[0][1] - b[1][1]),D=(b[0][0] - b[1][0]),E=A * a[0][0] - B * a[0][1];
//double F=C * b[0][0] - D * b[0][1],mile=(int)((A*D-B*C)*100)/100;  
//if(mile==0){System.out.printf("these tow lines are parallal"); return point;}
//else{point[1]=(E*D-B*F)/mile; point[0]=(A*F-E*C)/mile;return point;}}
//static double[] intersect(int [][]a,int [][]b){ boolean is; double []point=new double [2];
//double x, y ,A=(a[0][1] - a[1][1]),B =(a[0][0] - a[1][0]),C= (b[0][1] - b[1][1]),D=(b[0][0] - b[1][0]),E=A * a[0][0] - B * a[0][1];
//double F=C * b[0][0] - D * b[0][1],mile=(int)((A*D-B*C)*100)/100;  
//if(mile==0){System.out.printf("these tow lines are parallal"); return point;}
//else{point[1]=(E*D-B*F)/mile; point[0]=(A*F-E*C)/mile;return point;}}

//8.33 && 32
//static double tri_area(double [][]triangle){double a,b,c,s,area;
//a=distance(triangle[0][0],triangle[0][1],triangle[1][0],triangle[1][1]);
//b=distance(triangle[2][0],triangle[2][1],triangle[0][0],triangle[0][1]);c=distance(triangle[1][0],triangle[1][1],triangle[2][0],triangle[2][1]);//find the side of it
//s=(a+b+c)/2; area=Math.sqrt(s*(s-a)*(s-b)*(s-c)); return area;}

//8.35 
//static byte[] Lorgest_Block(byte[][] num){ byte n=(byte)(num.length),row=0,col=0,max_size=0,size; byte[] a=new byte[3];boolean found;
// for(byte i=0; i<n ;i++){ for(byte j=0; j<n;j++){ if(num[i][j]==1){size=1; found=true;while(i+size<n &&j+size<n &&found){
//   for(int k=0;k<=size;k++) if(num[i+size][j+k]==0 || num[i+k][j+size]==0){ found=false; break;} if(found) size++;}//شرط  بودن یک if it is correct so add to size  
//  if(size>=max_size){ row=i; col=j; max_size=size;}  } }} // if it was lorger then max size  
//a[0]=row; a[1]=col; a[2]=max_size;  return a;}
//   static void printt(byte [][] p,byte[]a){   for(int i=0 ;i<p.length; i++){ for(int j=0; j<p[0].length; j++)
// System.out.printf("%s%d%s",(( j==a[1]&& i>=a[0] && i<a[0]+a[2])?"(":" "),p[i][j] ,(j==a[1]+a[2]-1 && i>=a[0] &&i<a[0]+a[2])?")":" "); System.out.println();}}

// 36  check Latin sqoure 
//static boolean is_sqoure(char [][] a){
// for(int i=0; i<a.length; i++)   for(int j=0; j<a.length;j++) for(int k=1;k<a.length; k++) if( k!=j && a[i][j]==a[i][k]) return false; //check columnly 
// for (int i=0; i<a.length; i++)for(int j=0 ;j<a.length; j++)for(int k=1;k<a.length; k++) if(k!=j && a[j][i]==a[k][i]) return false; //check rowly
//return true; }
//static char [][] create_array(int n, char k){Scanner in=new Scanner(System.in); int m=n;char ch; boolean go;
//System.out.printf("print an %d by %d array of Character : ",n,m); char [][] num=new char [n][m];
//for(int i =0 ;i<n ;i++)for(int j=0; j<m ;j++){ch=in.next().charAt(0); go=true;  
//if(ch<'A' || ch>='A'+n){System.out.printf("sronge input! reqiured A to %c",(char)('A'+n-1));go=false; j--;}if(go)num[i][j]=ch;} return num;}// if invalite input is written by user 
 
//37 the capital of countries 
//static String[][] data(){String[][]s=new String[26][2]; 
//for(int i=0; i<s.length; i++){s[i][0]=(char)('A'+i)+""; s[i][1]=(char)('a'+i)+"";} return s;}
    
// Finally !
// I my self finished this chapter in 1404,12,27 :11:02 in the class succesfully 
// it was a good and benifishal and also importent for me   ---> Hussain Sanjar Hazara 

}   



       
      
      
  
        
    


    
    

