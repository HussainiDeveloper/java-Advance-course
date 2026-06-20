package chapter.sevan;

import java.util.*;

public class ChapterSevan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*  // Q.1 gradiage  the students according high score
        // create the array and find the max
       int n = in.nextInt();      
        double[] score = new double[n];
        String grade[] = new String[n], grad;
        double max = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = in.nextFloat();
            if (score[i] > max) {
                max = score[i];
            }
        }
        // then graduate according to max
        for (int i = 0; i < score.length; i += 1) {
            if (score[i] >= max - 10) {
                grad = " A ";
            } else if (score[i] >= max - 20) {
                grad = " B ";
            } else if (score[i] > max - 30) {
                grad = " C ";
            } else if (score[i] >= max - 40) {
                grad = " D ";
            } else {
                grad = " F ";
            }
            grade[i] = grad;
        }    
        // print the result
        for (int i = 0; i < score.length; i += 1) {
            System.out .printf (" the student %2d with %.2f is  in %s  grade !!  \n ",(i+1),score [i] ,grade [i]);}        
//.2 revears a string of number 
         String num = in.nextLine();
        int number=0 , reversedNumber=0 ,temp ,realNumber;
        // change to number
        for (int i = 0, j = num.length() - 1; i < num.length(); i++, j--) {
            char ch = num.charAt(i);
            if (!Character.isDigit(ch)) {
                System.out.println(num+ "---> this is not whole number");
                System.exit(0);
            }
            number=(ch-'0')+number*10;
        }
        realNumber=number;
       // reverse the number
       while(number>0){
          temp=number%10;
          reversedNumber=reversedNumber*10 +temp;
          number=number/10;
           
       }
      System.out.println(" the real form is :" + realNumber);
        System.out.println("the reversed form is :"+ reversedNumber );
       
//.3  count the repeatation of numbers betwean  1 --> 100   in there I understod arraylist // ArrayList <Integer> input = new ArrayList <>();
        int n=10;
int count [] = new int [n];
while ( true){
    int num = in.nextInt();
    if ( num ==0) break;
   count [num] ++;}  //count the repeatation of exact number 
for ( int  i=1 ; i<n ; i++ ){  // new I want to show it 
   if ( count[i] >0) System.out .printf(" %d : accurate %d  %s ! \n  " ,i ,count[i] ,( count[i]== 1 )? " time " : " times");}
        
//.4  find the scores  average upper the average and below the average
          double sum = 0;
        int counter = 0, up = 0;
        int[] count = new int[101];
        while (true) {
            int num = in.nextInt();
            if (num < 0) {
                break;
            }
            sum += num;
            counter++;
            count[num] += 1;
        }
        double ave = sum / counter;
        for (int i = 0; i <= 100; i++) {
            if (count[i] > 0) {  // if exict 
                if (i >= ave) { // if is upper than average
                    up += count[i];
                }               
            }
        }
        System.out.printf(" you printed %d numbers : inwhich   it's average is   %.1f  and  %d of them are"
                + " above the average  %d  and the other are lower then average ", counter, ave, up,(counter-up));
         
        //.5 ptint  the distinck numbers
        int n = in.nextInt(), k = 0;
        int[] a = new int[n];
        int[] set = new int[a.length];
        // call the user 
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        } 
        //
        for (int i = 1; i <= 100; i++) {
            boolean wasnot = true, go_on = true;     // Jast before 100 
            for (int j = 0; j < a.length; j += 1) {
                if (a[j] == i) {
                    wasnot = false;
                    break;
                }
            } // this false signal that it was in array the user typed 
            for (int j = 0; j <= k && !wasnot; j++) {
                if (set[j] == i) {
                    go_on = false;
                    break;
                }
            } // this false signalthat it is reapeted in this set before
            if (!wasnot && go_on) {
                set[k] = i;
                k++;
            }
        } // Just when is was in user input and is not repeated set the number into setArray  
        System.out.println(" the  set of distinct number are : ");
        for (int i = 0; i < set.length; i++) {
            if (set[i] != 0) {
                System.out.printf("  %d  ", set[i]); } } 
        // finally :  I My self maked this so I'm very pravod of me 
                    //onother salution  that I my self created  --> print the ditict and sort it                    
        int n = in.nextInt();
        int a[] = new int[n];
        boolean takeThis;
        int set[] = new int[a.length], setIndex = 0;
        // thie part call the user 
        for (int i = 0; i < a.length; i += 1) {
            a[i] = in.nextInt();  
        }
         // first check the repetation 
        for (int i = 0; i < a.length; i++) {
            takeThis=true;
         for(int before=0;before<i;before++){
             if(a[before]==a[i]){
                takeThis=false;
                 break;
             }
         }
         if(takeThis){
             set[setIndex]=a[i];
             setIndex++;
         }
        }
        // then sort 
        sort(set);
      // print the set 
        for (int i = 0; i < a.length; i += 1) 
        {
            if (set[i] != 0) {
                System.out.printf("  %d ", set[i]);
            }
        }

       // .6  print 50 first prime number 
       System.out.println(" How many number of prime number do you want !");
        final int n = in.nextInt();
        int prime[] = new int[n];
        int primes=0 ,i=1;
      while(primes<n) {
            boolean isprime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                prime[primes] = i;
                primes++;
            }
     i++;  }
      // now print it
        for (int count = 0; count< prime.length; count++) {
            if ((count + 1) % 10 == 0) {
                System.out.println(prime[count]);
            } else {
                System.out.printf("%-5d", prime[count]);
            }
        } 
        //.7 generate n numbers from min to max
        System.out.println("please enter the numbers of randoms , minimame  ,maximame in order : ");
        // the max and min are the barders 
        int n = in.nextInt(), min = in.nextInt(), max = in.nextInt(), maximam = 0, maxindex = 0, counter = 0;
        if (max <= min) {
            System.exit(0);
        }
        int count[] = new int[max - min+1];  //the times of repeatation is not matter
        for (int i = 0; i < n; i++) {//repeated n times 
            int nums = (int)(Math.random() * (max - min + 1));  // generate the random            
            count[nums]++;    // count the repeatations            
        }
        // print 
        System.out.printf("%-10s%-10s ","Number","repetation");
        for (int i = 0; i <=max-min; i++) {          
            // if the repetation of  a number is zero so ignore  the number
            if(count[i]<1){
                continue;
            }
            counter++;
               System.out.printf("%-10d%-10d\n",(i+min),count[i]);
// find the element more repeated;
            if (count[i] > maximam) {
                maximam = count[i];
                maxindex = i;
            }
        }
        System.out.printf(" \n  the maximam repeatation is from %d which repeated   %d  times ", maxindex+min, maximam);
         // .8  tow owerloded array that find the average 
        System.out.printf(" Write the array length and it's elements in int and double  0 for int");
        int number= in.nextInt();
        int ints= in.nextInt();
        double averag = 0;
        if (ints == 0) {
            int[] array = new int[number];
            for (int i = 0; i < number; i++) {
                array[i] = in.nextInt();
            }
            averag = average(array);
        } else {
            double a[] = new double[number];
            for (int i = 0; i < number; i++) {
                a[i] = in.nextDouble();
            }
            averag = average(a);
        }
        System.out.print(averag);
          // .9 find the smallist  element of the arrey     .10 find the first index of minimam  element
       System.out.println("Enter the numbers of the array and then it's elements");
         int n = in.nextInt();
        int a[]= new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int min = min(a);
        int min_index = index(a)+1;
        System.out.printf("the minimam element is %d  it's first index is : %d  ", min, min_index);
          //.11 find the mean and deviation in Statistic
        System.out.println("enter the length of the array");
         int n = in.nextInt();
        double a[] = new double[n];
        System.out.printf(" Write %d numbers ", n);
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextDouble();
        }
        statistic(a);
        //.12 revearse the array to it self 
        int n = in.nextInt();
        System.out.printf("type %d numbers :", n);
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        // revearsation
        a = revearse(a); // first if had return type but I changed it 
        // print it
        for ( int i=0; i<a.length ; i++ )
            System.out .print(a[i]);
        //.13  Generate  n numbers from first to end whit exclude numbers 
        System.out.print(" Write the first , end , excludes nembers ");
        int s = in.nextInt(), end = in.nextInt(), ex_num = in.nextInt();
        int a[] = new int[ex_num];
        System.out.printf("print %d numbers for exclude : ", ex_num);
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        // Generate the numbers
        System.out.print("How many  random numbers do you want ");
        int n = in.nextInt();
        int[] numbers = new int[n];
       int[] selfNumbers=new int[n];
        for (int i = 0; i < numbers.length; i += 1) {
            numbers[i] = getrandom(s, end, a);
            selfNumbers[i]=getrandomThemSelf(s, end,a);
        }  
       
        
        // print them
        System.out.println("the out  Generatores ");
        for (int i = 0; i < numbers.length; i += 1)
            if ((i + 1) % 10 == 0)
                System.out.println(numbers[i]);
            else System.out .printf("%-6d ",numbers[i]);
        System.out.println("\n And The inself Generatores");
        for (int i = 0; i <selfNumbers.length; i += 1)
            if ((i + 1) % 10 == 0)
                System.out.println(selfNumbers[i]);
            else System.out .printf("%-6d ",selfNumbers[i]);
        *///.14  find the Greadist Common Diviser for no limit numbers 
        System.out.print(" type numbers in order :");
        int k = in.nextInt();
        int[] a = new int[k];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out .printf(" the gcd is : %d  " ,gcd(a));
        //.15 print the unrepeated elements and eliminate other
        //System.out.print("type  the numbers of element and  array :");   int n=in.nextInt();  int a [] =new int [n];
        //for(int i =0 ;i<a.length ;i++)a[i] =in.nextInt(); int [] b=eliminate(a); //recieves the elements and pass it to method 
        //for( int i=0;i<b.length ;i++) 
        //    if(b[i] != 0)System.out.printf("%6d ",b[i]);
        /*//.16 compere the lineer and binnar searchig the 100,000 random numers for finding the key
        System.out.printf("write the  length of the array");
        int n = in.nextInt();
        System.out.println(" now write the number your want to search in this arrray");
        int k = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * n);
        }
        lineer(k, a);
        bisearch(k, a);
         // Generate that mach numbers and call the methods 
        // */
        //.17  sort the name of students accourding thier score in decreasing order this is a realistic project 
        //System.out.printf(" type your number of students ");  int n=in.nextInt();double score[] =new double [n]; String[] name =new String [n];
        //System.out.printf(" type (%d) Students name and thier scores : ",n);
        //for(int i=0 ;i <score.length ;i++){ name[i]=in.next();     score[i]=in.nextFloat();}
        //sortStudents(name,score);
        //.19 is ti sorted or no if not sort it 
        //int n=in.nextInt();  int[]nums=new int[n]; System.out.printf("Thank you for using Hussain Sanjar Hazara's softwares\n write %d numbers",n);
        //for(int i=0 ;i<nums.length ;i++)nums[i]=in.nextInt(); boolean issort =isSorted(nums);  //generate the numbers and call isSort method 
        //if(issort)System.out.printf("the numbers are sorted before "); else System.out.printf("It wasn't sorted ");// out of bound error
        //.20 sort the doubles but from aposite hand (Pakistan hand);
        //int n=in.nextInt(); System.out.printf("print %d double number",n);double nums[]=new double[n];
        //  for(int i=0; i<nums.length ;i++) nums[i]=in.nextFloat(); sort(nums);  //generate and calls method !!
        //.21 give unspicified numbers and get it's total 
        //  int num ;  System.out.printf("ptint unspicified numbers and 0 to stop "); int sum=0; String total ="";
        //do{num =in.nextInt(); 
        //        if(num !=0){sum +=num ; total =total +((total=="")? "":"+")+ num ; }
        //        else System.out.printf("the total of  %s  =  %d", total , sum );  }while(num !=0);  
        //.22 find the number of uppercase letters in the String 
        //System.out.printf("type your text ");  String s=in.nextLine();int up=0; 
        //for(int i=0;i<s.length();i++) 
        //    if(s.charAt(i)>='A' && s.charAt(i)<='Z' )up++;
        //System.out.printf("%s  has %d UppercaseLetter%c ",s,up,((up==1)?' ':'s')); // this piont is really fantastic ((up==1)?' ':'s');
        //.23 locker puzzle find open and colse doors
        //int n=in.nextInt();   boolean b[]=new boolean[n+1]; // Generate an array of boolean  then swap some of it then print;
        //System.out.printf(" %20s Welcome to locker puzzale \n ".toUpperCase(),"");for(int i=1;i<=n ;i++){   for(int j=i;j<=n;j+=i){   b[j]=!b[j];   }   }
        //for(int i=1;i<=n;i++)System.out.printf("%3s%-6b%s",((b[i])?(i+"-"):""),b[i],((i%10==0)?"\n":"")); // true ==open / false == close;
        //System.out.printf(" %5s prapared by : Hussian Sanjar Hazara   ","");
        // .24 how many picks do you need to generate four diffrent suit cards 
        //String [] suits ={"spades" , "Heart","Diamonds","clubs"};String ranks[] ={"King" ,"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen"};
        //boolean found[] =new boolean[4]; String rezult [] =new String [4]; int count=0,picks=0 ,k=0 ,suit ;
        //while(count < 4){ k=(int)(Math.random()*52);   suit =k/13;
        //if(!found[suit]){ rezult[suit]=ranks[k %13]+" of " +suits[suit] +"\n"; count++;found[suit]=true; }    picks++;} // دست ناخورده یعنی ‌  false  I had missed this found[suit]=true;   
        //for(String card :rezult) System.out.println(card); System.out.printf(" the number of  picks is : %d ",picks); 
        /* // .28 combination of n numbers in to tow peirs 
        int n = in.nextByte(), k = 0;
        System.out.printf("print numbers to combine :", n);
        int nums[] = new int[n];
        int comb[] = new int[n * n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextByte();
        }
        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j++) {
                comb[k] = nums[i] * 10 + nums[j];
                k++;
            }// generate 
        }
        for (int i = 0; i < comb.length; i++) {
            System.out.printf(" %4d %s", comb[i], (((i + 1) % 10 == 0) ? "\n" : ""));// show 
        }   */
        //.29 picks the four cards and sum it 
        //String[] suits ={"spades" , "Heart","Diamonds","clubs"};int n,rank ,sum=0; String rezult [] =new String [4];
        //String ranks[]={"King" ,"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen"};
        // for(int i=0; i<4 ;i++){n=(int)(Math.random()*52);  rank=n%13; sum+=(rank==0)?13 :rank;
        // rezult[i]=ranks[rank]+" of "+suits[n/13] +"\n";}
        //  for(String card : rezult)System.out.printf(card);System.out.printf("It's sum is : %d ",sum);
        //.30 find if is it consicutive four
        // int k=in.nextInt(); System.out.printf("print %d  numbers and numbers of consicutive first  :" , k);
        // int n=in.nextInt();int num[]=new int[k];  for(int i=0;i<k ;i++)num[i]=in.nextInt();  // generate and call the user 
        // boolean iscon =isconsicutive(n ,num); //calls the method 
        // if(iscon) System.out.printf(" the siries has %d  consicutive numbers ",n); 
        // else System.out.printf(" the siries has not %d  consicutive numbers ",n); // the rezult is this ;
        //31  give tow arrays ,sort them then sum bath and sort them ,and finnally print it
        //int n=in.nextInt();int num=in.nextInt(); 
        //System.out.printf("print %d numbers for list1",n);  int [] list1 =new int[n];for(int i=0; i<n ;i++) list1[i]=in.nextInt();
        //System.out.printf("print %d numbers for list1",num);  int [] list2 =new int[num]; for(int i=0; i<num ;i++) list2[i]=in.nextInt();
        //int [] list =sortandPrint(list1 , list2);
        //for(int i=0; i<list.length ;i+=1)if(list[i] !=0 )System.out.printf("%s %d",((i%10==0)?"final list is :":""),list[i]);    
        //    // .32 take the first element of array as a pivot and generate all smallers before and bigger after them 
        //    int n=in.nextByte(),axis ,k=0,temp,count=0; System.out.printf("print %d numbers ",n);int num [] =new int [n];int nums[] =new int[n];
        //    for(int i=0;i<num.length ;i+=1)num[i]=in.nextByte(); axis=num[0];  // user enter 
        ////for(int i=0 ;i<num.length ;i++)  for(int j=i+1 ;j<num.length ;j++) if(num[i]>num[j]){ temp=num[i]; num[i]=num[j];  num[j]=temp;}// sort
        // for(int i=0 ;i<num.length ;i++)if(num[i]>axis)count++; nums[num.length-count-1]=axis;// if self axis 
        //for(int i=0; i<num.length ;i++){if(num[i]<axis){nums[k]=num[i]; k++;} 
        //else if(num[i]> axis){ nums[num.length - count]=num[i]; count--;}    } // before pivot and after pivot 
        //  for(int i=0;i<nums.length ;i++)System.out.printf("%-4d",nums[i]);
        //chinese zodiec in the array
        //System.out.printf(" type a year please"); int year =in.nextInt(); chineseZodiac(year);
        // .34 sort the array accourding to Alphabitacal order 
        //String s=in.nextLine() , orderedString="";  char temp;char []chaR =new char[s.length()]; int n,m;
        //for(int k=0;k<s.length();k++)chaR[k]=s.charAt(k); // turn String  into char's array;
        //for(int i=0;i<s.length() ;i++){ for(int j=i+1;j<s.length() ;j++){ 
        //if(chaR[i]>chaR[j]){temp=chaR[i];  chaR[i]= chaR[j];  chaR[j]=temp;} } orderedString +=chaR[i];  } // swap if it is biger than infrond of them;
        //  System.out.printf("if we order the %s  it become %s ",s ,orderedString);  
        //.35 hangmon game ---> gusse the words behine the stars 
        // String [] words={"program","java","calculus","Database","English","Hussain","Sanjar","Hazara","AmirAli","Allahyar","Mohammad","mohammad Ali"}; 
        // boolean result;   char ansawer ='y' ; int win=0,round=0;
        // while(ansawer=='y'){round++; String challange =words[(int)(Math.random()*words.length)].trim(); result =hungmanGame(challange);  // generate and call the method 
        //  if(result)win++;System.out.print("Do you want to continuou yes of no"); ansawer=in.next().toLowerCase().charAt(0);  }// stop or continuou !
        //   if(ansawer!='y'){System.out.printf("%s you played :%d and wined :%d",(ansawer=='n')?"the game finished succesfully!":"invalite input !",round,win); 
        //  }  
        //.36 Qeeun game : every queen should not came in the same row ,culamn and in the  diagonal
//        System.out.print("how many queen do you want :");
//        int n = in.nextByte(), c = 0;
//        int[] queen = new int[n];
//        while (!isvalite(queen)) {
//            for (int i = 0; i < n; i++) {
//                queen[i] = (int) (Math.random() * n);
//            }
//            c++;
//        } // check the valitile 
//        printBoard(queen);
//        System.out.printf("you passed in %d Times", c);
        //      //.37 Goltan Mashine for Statistics
        //      System.out.print("Enter the number of balls"); int ball=in.nextInt(),right=0,max=0; char show;
        //      System.out.print("Enter the number of pigs ");int pig =in.nextInt();int []slot =new int [pig +1];
        // for(int i=0; i<ball ; i++){ right=0;   // balls are caming 
        //     for(int j=0;j<pig ;j++)if(Math.random()<0.5) System.out.print('L'); // check the 50% chance 
        //         else {   System.out.print('R'); right++;}    System.out.println();    slot[right]++; }  // count the numbers of balls in a slot
        //  for(int s:slot)  if(s>max) max=s;  // find the max of them to start printing from their
        //  for(int level =max ;level >0;level--){  // now Start printing 
        //      for(int s:slot)  System.out.printf("%c%c",(s>=level)? 'O':' ',((s<=slot.length-2)? ',':' '));    System.out.println();
    }

    // .8 
    public static double average(int[] array) {
        double aver = 0, sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        aver = (sum + 0.0) / array.length;
        return aver;
    }

    public static double average(double[] array) {
        double aver = 0, sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        aver = sum / array.length;
        return aver;
    }

    // .9 . 10 
    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int index(int[] array) {
        int min = array[0], ind = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                ind = i;
            }
        }
        return ind;
    }

    // .11
    public static void statistic(double[] data) {
        double mean, deviation, sum = 0, d = 0;
        int n = data.length;
        // find the sum of the datas
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        // mean is (x1+x2 ..)/n
        mean = sum / n;
        // deviation is
        for (int i = 0; i < data.length; i++) {
            d += (data[i] - mean) * (data[i] - mean);
        }
        deviation = Math.sqrt(d / (n));
        System.out.printf(" the mean is  : %.1f  \n the deviation is : %.1f", mean, deviation);
    }

// .12 
    public static int[] revearse(int[] array) {
        int temp;  // I changed form int[] , return array; into viod  but not worked 
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }

    // .13 
    public static int getrandom(int start, int end, int... exclude) {
        boolean fit = false;
        int a = 0;
        while (!fit) {
            a = start + (int) (Math.random() * (end - start));
            for (int i = 0; i < exclude.length; i++) {
                fit = true;
                if (a == exclude[i]) {
                    fit = false;
                    break;
                }
            } // if it was in excludes set should try agian for onather random number
            if (!fit) {
                a = start + (int) (Math.random() * (end - start));
            }
        }  // try again for onather random number
        return a;
    }
    // this noe generate them self
    public static int getrandomThemSelf(int start, int end, int... exclude) {
   int index=(int)(Math.random()*exclude.length);
    return exclude[index];
    }

    

    //.14  
    public static int gcd(int... num) {
        int min = num[0];
        int Gcd = 1;
        boolean is;
        // find the smallest number
        for (int i = 1; i < num.length; i++)  
        {
            if (min > num[i]) {
                min = num[i];
            }
        }
        for (int i = 2; i <= min; i++) {
            is = true;  //
            for (int j = 0; j < num.length; j++) {  // I had a problem that instead of j++ I had writen i++;
                if (num[j] % i != 0) {
                    is = false;
                    break;
                }
            }
            if (is) {
                Gcd = i;
            }
        }
        return Gcd;
    }

    //.15
    public static int[] eliminate(int[] nums) {
        int a[] = new int[nums.length];
        boolean ok;
        for (int i = 0, j = 0; i < nums.length; i++) {
            ok = true;
            for (int k = 0; k < i; k++) {   // check what ever is ti before in the arra 
                if (a[k] == nums[i]) {
                    ok = false;
                    break;
                }
            } //if repeated so turn to false means that not get it ;
            if (ok) {
                a[j] = nums[i];
                j++;
            }
        } // if it wasn't so print it ; I had alogical and boolean mistake ;(a[j] = nums[i];instead of this I had writen that a[j] = a[i]; 
        return a;
    } // Finally I made It but I had problem in numing alot !

    //.16
    public static void bisearch(int k, int... nums) {
        int temp, high, low, mean, ansawer = 0;
        long s = System.nanoTime(); // I should sort , search binnay ,lineer ;       
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        high = nums.length;
        low = 0;
        while (high >= low) {
            mean = (low + high) / 2;
            if (k > nums[mean]) {
                low = mean + 1;
            } else if (k < nums[mean]) {
                high = mean - 1;
            } else {
                ansawer = mean;
                break;
            }
        }
        long end = System.nanoTime(), time = (end - s);
        if (ansawer == 0) {
            System.out.printf(" not found %d  in : %d  nanoseconds \n ", k, time);

        } else {
            System.out.printf(" the ansawer of binnary is :%6d and in : %d  nanoseconds  \n ", ansawer, time);
        }

    }

    public static void lineer(int k, int[] nums) {
        int answerL = 0;
        long s = System.nanoTime();
        for (int i = 0; i < nums.length; i++) {
            if (k == nums[i]) {
                answerL = i + 1;
            }
        }
        long end = System.nanoTime(), time = (end - s);
        if (answerL == 0) {
            System.out.printf(" not found in Lineer %d  and in : %d  nanoseconds : \n ", k, time);
        } else {
            System.out.printf(" the ansawer of linner is :%6d and in : %d  nanoseconds  ", answerL, time);
        }
    }

    //.17
    public static void sortStudents(String[] name, double[] score) {
        double temp;
        String s; // first I should sort and then print;
        for (int i = 0; i < score.length; i++) {  // sort 
            for (int j = i + 1; j < score.length; j++) {
                if (score[i] < score[j]) {
                    temp = score[j];
                    score[j] = score[i];
                    score[i] = temp; //swap the the score with greater 
                    s = name[j];
                    name[j] = name[i];
                    name[i] = s;
                }
            }
        } // swap the names of top students 
        for (int i = 0; i < score.length; i++) {
            System.out.printf(" %d- %-8s has : %4.1f numbers  \n", (i + 1), name[i], score[i]);
        }  // print
        System.out.printf("Thank you for using Hussain Sanjar Hazara's softwares");
    }

    // .19
    static boolean isSorted(int[] number) {
        boolean is = true;
        int temp;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; i++) {
                if (number[i] > number[j]) {
                    is = false;
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        for (int i = 0; i < number.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(number[i]);
            } else {
                System.out.printf("%6d", number[i]);
            }
        }
        return is;
    }

    // .20
    static void sort(double[] number) {
        double temp; // first sort then swap ;
        for (int i = number.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (number[j] > number[i]) {
                    temp = number[j];
                    number[j] = number[i];
                    number[i] = temp;
                }
            }
        }
        for (double num : number) {
            System.out.printf(" %-8.2f", num);
        }
    }

// .30 
    static boolean isconsicutive(int n, int[] nums) {
        int check = nums[0], count = 1;
        boolean iscons = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == check) {
                count++;
                if (count == n) {
                    iscons = true;
                    break;
                }
            } else {
                check = nums[i];
                count = 1;
            }
        }
        return iscons;
    }

    static int[] sortandPrint(int[] list1, int[] list2) {
        int[] list = new int[list1.length + list2.length - 1];
        int k = 0;
        list1 = sort(list1);
        list2 = sort(list2);
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != 0) {
                list[k] = list1[i];
                k++;
            }//generate list and call if fpr sort 
        }
        for (int j = 0; j < list2.length; j++) {
            if (list2[j] != 0) {
                list[k] = list2[j];
                k++;
            }
        }
        list = sort(list);
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != 0) {
                System.out.printf("%s%d %s  ", ((i == 0) ? "list1 is :" : ""), list1[i], ((i == list1.length - 1) ? "\n" : ""));
            }
        }
        for (int i = 0; i < list2.length; i++) {
            if (list2[i] != 0) {
                System.out.printf("%s%d %s  ", ((i == 0) ? "list2 is :" : ""), list2[i], ((i == list2.length - 1) ? "\n" : ""));
            }
        }
        return list;
    }

    static int[] sort(int[] nums) {
        int temp, l = 1;
        int number[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }  //should delate the repeatation 
            }
        }
        number[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                number[l] = nums[i];
                l++;
            }
        }
        return number;
    }  // I done a very different check piont !!

//.33 
    static void chineseZodiac(int year) {
        String[] chinese = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake ", "horse", "sheep"};
        System.out.printf(" the %d year's chinese zodiac year is %s", year, chinese[year % 12]);
    }

    //35 hungman method  !protect the repeatation -->if(ch==gusse && show.toString().indexOf(ch)<0);--> if(ch==gusse &&!Arrays.toString(show).contains(gusse+""))
    static String wrongGusse(int wrong) {
        String s = "";
        switch (wrong) {
            case 0:
                s = " \n \n \n";
                break;
            case 1:
                s = "\t O \n \n \n";
                break;
            case 2:
                s = "\t O \n\t |  \n \n";
                break;
            case 3:
                s = "\t O \n\t/| \n  \n";
                break;
            case 4:
                s = "\t O \n\t/|\\ \n \n";
                break;
            case 5:
                s = "\t O \n\t/|\\ \n\t/ \n";
                break;
            case 6:
                s = "\t O \n\t/|\\ \n\t/ \\ \n";
                break;
        }
        return s;
    }

    static boolean hungmanGame(String challange) {
        Scanner in = new Scanner(System.in);
        boolean isexist, result = true;
        int miss = 0;
        char gusse = '-', ch;
        char[] show = new char[challange.length()];
        System.out.print("(Gusse)");
        for (int i = 0; i < challange.length(); i++) {
            show[i] = '*';
        }
        System.out.print(show);   // full show whit stars and print it
        while (true) {
            isexist = false;
            gusse = in.next().charAt(0); // take /promps from user
            for (int i = 0; i < challange.length(); i++) {
                ch = Character.toLowerCase(challange.charAt(i));  // check the gusse
                if (ch == gusse) {
                    show[i] = challange.charAt(i);
                    isexist = true;
                }
            }  // aviod repeatation    
            if (!isexist) {
                if (miss <= 5) {
                    System.out.print(wrongGusse(miss));
                    miss++;
                } // check the misseds and   
                else {
                    System.out.print(wrongGusse(6) + " \n you lost the game! it was :" + challange);
                    result = false;
                    break;
                }
            }
            if (Arrays.toString(show).indexOf('*') < 0) {
                System.out.printf("yes you complated it :%s you  missed :%d", challange, miss);
                result = true;
                break;
            } // check end 
            System.out.printf("(gusse) %s :", ((!isexist) ? "not muched !" : "")); // this should show the one which is gussed before; 
            System.out.print(show);
        }
        return result;
    }

    //.36
    static boolean isvalite(int[] q) {
        for (int i = 0; i < q.length; i++) {
            for (int j = i + 1; j < q.length; j++) {
                if (q[i] == q[j] || Math.abs(q[i] - q[j]) == j - i) {
                    return false;
                }
            }
        }
        return true;
    }

    static void printBoard(int[] q) {
        for (int r = 0; r < q.length; r++) {
            for (int c = 0; c < q.length; c++) {
                System.out.print((q[c] == r) ? "Q " : ". ");
            }
            System.out.println();
        }
    }
}
// Finnaly I finnished this in :1404, 11,29 at --> 01 :27 PM       

