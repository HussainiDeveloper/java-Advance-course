package chapter_10;

public class Chapter_10 {

    public static void main(String[] args) {
        // this page for chapter 10 
        
        
//        // section 10.1 time class
//public class Time {
//    private int hour;
//    private int minute;
//    private int second;
//    
//
//    public Time() {
//        setTime(System.currentTimeMillis());
//    }
//    
//
//    public Time(long elapsedTime) {
//        setTime(elapsedTime);
//    }
//    
//
//    public Time(int hour, int minute, int second) {
//        this.hour = hour;
//        this.minute = minute;
//        this.second = second;
//    }
//    
//
//    public int getHour() {
//        return hour;
//    }
//    
//    public int getMinute() {
//        return minute;
//    }
//    
//    public int getSecond() {
//        return second;
//    }
//    
//
//    public void setTime(long elapsedTime) {
//        long totalSeconds = elapsedTime / 1000;
//        second = (int)(totalSeconds % 60);
//        long totalMinutes = totalSeconds / 60;
//        minute = (int)(totalMinutes % 60);
//        long totalHours = totalMinutes / 60;
//        hour = (int)(totalHours % 24);
//    }
//}
//
//
//public class TestTime {
//    public static void main(String[] args) {
//        Time time1 = new Time();
//        Time time2 = new Time(555550000);
//        Time time3 = new Time(5, 23, 55);
//        
//        System.out.println("Time 1: " + time1.getHour() + ":" + 
//                          time1.getMinute() + ":" + time1.getSecond());
//        System.out.println("Time 2: " + time2.getHour() + ":" + 
//                          time2.getMinute() + ":" + time2.getSecond());
//        System.out.println("Time 3: " + time3.getHour() + ":" + 
//                          time3.getMinute() + ":" + time3.getSecond());
//    }
//}
        



//        // sectin 10.3 mylnteger class
//public class MyInteger {
//    private int value;
//    
//
//    public MyInteger(int value) {
//        this.value = value;
//    }
//    
//
//    public int getValue() {
//        return value;
//    }
//    
//
//    public boolean isEven() {
//        return value % 2 == 0;
//    }
//    
//    public boolean isOdd() {
//        return value % 2 != 0;
//    }
//    
//    public boolean isPrime() {
//        if (value < 2) return false;
//        for (int i = 2; i <= Math.sqrt(value); i++) {
//            if (value % i == 0) return false;
//        }
//        return true;
//    }
//    
//
//    public static boolean isEven(int num) {
//        return num % 2 == 0;
//    }
//    
//    public static boolean isOdd(int num) {
//        return num % 2 != 0;
//    }
//    
//    public static boolean isPrime(int num) {
//        if (num < 2) return false;
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) return false;
//        }
//        return true;
//    }
//    
//
//    public static boolean isEven(MyInteger num) {
//        return num.isEven();
//    }
//    
//    public static boolean isOdd(MyInteger num) {
//        return num.isOdd();
//    }
//    
//    public static boolean isPrime(MyInteger num) {
//        return num.isPrime();
//    }
//    
//
//    public boolean equals(int num) {
//        return value == num;
//    }
//    
//    public boolean equals(MyInteger num) {
//        return value == num.getValue();
//    }
//    
//
//    public static int parseInt(char[] chars) {
//        int result = 0;
//        for (char c : chars) {
//            result = result * 10 + (c - '0');
//        }
//        return result;
//    }
//    
//    public static int parseInt(String str) {
//        return Integer.parseInt(str);
//    }
//}
//
//
//public class TestMyInteger {
//    public static void main(String[] args) {
//        MyInteger num1 = new MyInteger(7);
//        MyInteger num2 = new MyInteger(10);
//        
//        System.out.println("num1 = " + num1.getValue());
//        System.out.println("num1 is even: " + num1.isEven());
//        System.out.println("num1 is odd: " + num1.isOdd());
//        System.out.println("num1 is prime: " + num1.isPrime());
//        
//        System.out.println("\nnum2 = " + num2.getValue());
//        System.out.println("num2 is even: " + num2.isEven());
//        System.out.println("num2 is odd: " + num2.isOdd());
//        System.out.println("num2 is prime: " + num2.isPrime());
//        
//        System.out.println("\nStatic methods:");
//        System.out.println("5 is even: " + MyInteger.isEven(5));
//        System.out.println("5 is odd: " + MyInteger.isOdd(5));
//        System.out.println("5 is prime: " + MyInteger.isPrime(5));
//        
//        System.out.println("\nParse methods:");
//        char[] chars = {'1', '2', '3'};
//        System.out.println("Parse char array '123': " + MyInteger.parseInt(chars));
//        System.out.println("Parse string '456': " + MyInteger.parseInt("456"));
//    }
//}
        


//        // section 10.5 display prime factors
//        import java.util.Scanner;
//
//class StackOfIntegers {
//    private int[] elements;
//    private int size;
//    private static final int DEFAULT_CAPACITY = 16;
//    
//    public StackOfIntegers() {
//        this(DEFAULT_CAPACITY);
//    }
//    
//    public StackOfIntegers(int capacity) {
//        elements = new int[capacity];
//    }
//    
//    public void push(int value) {
//        if (size >= elements.length) {
//            int[] temp = new int[elements.length * 2];
//            System.arraycopy(elements, 0, temp, 0, elements.length);
//            elements = temp;
//        }
//        elements[size++] = value;
//    }
//    
//    public int pop() {
//        return elements[--size];
//    }
//    
//    public int peek() {
//        return elements[size - 1];
//    }
//    
//    public boolean empty() {
//        return size == 0;
//    }
//    
//    public int getSize() {
//        return size;
//    }
//}
//
//
//public class PrimeFactors {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a positive integer: ");
//        int number = input.nextInt();
//        
//        StackOfIntegers stack = new StackOfIntegers();
//        int temp = number;
//        
//
//        for (int i = 2; i <= temp; i++) {
//            while (temp % i == 0) {
//                stack.push(i);
//                temp /= i;
//            }
//        }
//        
//        System.out.print("Prime factors in decreasing order: ");
//        while (!stack.empty()) {
//            System.out.print(stack.pop() + " ");
//        }
//    }
//}
        


//        // section 10.6 display prime numbers less than 120 
//        public class PrimeNumbersStack {
//    public static void main(String[] args) {
//        StackOfIntegers stack = new StackOfIntegers();
//        
//
//        for (int i = 2; i < 120; i++) {
//            boolean isPrime = true;
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                stack.push(i);
//            }
//        }
//        
//        System.out.println("Prime numbers less than 120 in decreasing order:");
//        while (!stack.empty()) {
//            System.out.print(stack.pop() + " ");
//        }
//    }
//}



        
//        // section 10.7 atm machine
//        import java.util.Scanner;
//
//
//class Account {
//    private int id;
//    private double balance;
//    private double annualInterestRate;
//    private java.util.Date dateCreated;
//    
//    public Account() {
//        this(0, 0);
//    }
//    
//    public Account(int id, double balance) {
//        this.id = id;
//        this.balance = balance;
//        annualInterestRate = 0;
//        dateCreated = new java.util.Date();
//    }
//    
//    public int getId() { return id; }
//    public double getBalance() { return balance; }
//    public double getAnnualInterestRate() { return annualInterestRate; }
//    public java.util.Date getDateCreated() { return dateCreated; }
//    
//    public void setId(int id) { this.id = id; }
//    public void setBalance(double balance) { this.balance = balance; }
//    public void setAnnualInterestRate(double rate) { 
//        this.annualInterestRate = rate; 
//    }
//    
//    public double getMonthlyInterestRate() {
//        return annualInterestRate / 12 / 100;
//    }
//    
//    public double getMonthlyInterest() {
//        return balance * getMonthlyInterestRate();
//    }
//    
//    public void withdraw(double amount) {
//        if (amount <= balance) {
//            balance -= amount;
//        }
//    }
//    
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//        }
//    }
//}
//
//public class ATM {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Account[] accounts = new Account[10];
//        
//        for (int i = 0; i < 10; i++) {
//            accounts[i] = new Account(i, 100);
//        }
//        
//        while (true) {
//            System.out.print("Enter an id: ");
//            int id = input.nextInt();
//            
//
//            while (id < 0 || id > 9) {
//                System.out.print("Invalid id! Enter a correct id: ");
//                id = input.nextInt();
//            }
//            
//            Account currentAccount = accounts[id];
//            
//            while (true) {
//                System.out.println("\nMain menu");
//                System.out.println("1: check balance");
//                System.out.println("2: withdraw");
//                System.out.println("3: deposit");
//                System.out.println("4: exit");
//                System.out.print("Enter a choice: ");
//                int choice = input.nextInt();
//                
//                if (choice == 1) {
//                    System.out.println("The balance is " + currentAccount.getBalance());
//                } else if (choice == 2) {
//                    System.out.print("Enter an amount to withdraw: ");
//                    double amount = input.nextDouble();
//                    currentAccount.withdraw(amount);
//                } else if (choice == 3) {
//                    System.out.print("Enter an amount to deposit: ");
//                    double amount = input.nextDouble();
//                    currentAccount.deposit(amount);
//                } else if (choice == 4) {
//                    break;
//                }
//            }
//        }
//    }
//}
        


//        // section 10.9 course class
//
//public class Course {
//    private String courseName;
//    private String[] students = new String[100];
//    private int numberOfStudents;
//    
//    public Course(String courseName) {
//        this.courseName = courseName;
//    }
//    
//    public void addStudent(String student) {
//        if (numberOfStudents >= students.length) {
//
//            String[] temp = new String[students.length * 2];
//            System.arraycopy(students, 0, temp, 0, students.length);
//            students = temp;
//        }
//        students[numberOfStudents++] = student;
//    }
//    
//    public String[] getStudents() {
//        String[] result = new String[numberOfStudents];
//        System.arraycopy(students, 0, result, 0, numberOfStudents);
//        return result;
//    }
//    
//    public int getNumberOfStudents() {
//        return numberOfStudents;
//    }
//    
//    public String getCourseName() {
//        return courseName;
//    }
//    
//    public void dropStudent(String student) {
//        for (int i = 0; i < numberOfStudents; i++) {
//            if (students[i].equals(student)) {
//
//                for (int j = i; j < numberOfStudents - 1; j++) {
//                    students[j] = students[j + 1];
//                }
//                numberOfStudents--;
//                break;
//            }
//        }
//    }
//    
//    public void clear() {
//        numberOfStudents = 0;
//    }
//}
//
//
//public class TestCourse {
//    public static void main(String[] args) {
//        Course course = new Course("Java Programming");
//        
//        course.addStudent("Alice");
//        course.addStudent("Bob");
//        course.addStudent("Charlie");
//        
//        System.out.println("Students: ");
//        for (String student : course.getStudents()) {
//            System.out.println(student);
//        }
//        
//        System.out.println("Number of students: " + course.getNumberOfStudents());
//        
//        course.dropStudent("Bob");
//        System.out.println("\nAfter dropping Bob:");
//        for (String student : course.getStudents()) {
//            System.out.println(student);
//        }
//        
//        course.clear();
//        System.out.println("\nAfter clear: " + course.getNumberOfStudents());
//    }
//}
        


//        // section 10.10 queue class 
//
//public class Queue {
//    private int[] elements;
//    private int size;
//    private static final int DEFAULT_CAPACITY = 8;
//    
//    public Queue() {
//        elements = new int[DEFAULT_CAPACITY];
//        size = 0;
//    }
//    
//    public void enqueue(int v) {
//        if (size >= elements.length) {
//            int[] temp = new int[elements.length * 2];
//            System.arraycopy(elements, 0, temp, 0, elements.length);
//            elements = temp;
//        }
//        elements[size++] = v;
//    }
//    
//    public int dequeue() {
//        int result = elements[0];
//        // Shift elements left
//        for (int i = 0; i < size - 1; i++) {
//            elements[i] = elements[i + 1];
//        }
//        size--;
//        return result;
//    }
//    
//    public boolean empty() {
//        return size == 0;
//    }
//    
//    public int getSize() {
//        return size;
//    }
//}
//
//
//public class TestQueue {
//    public static void main(String[] args) {
//        Queue queue = new Queue();
//        
//
//        for (int i = 1; i <= 20; i++) {
//            queue.enqueue(i);
//        }
//        
//
//        System.out.print("Queue elements (FIFO): ");
//        while (!queue.empty()) {
//            System.out.print(queue.dequeue() + " ");
//        }
//    }
//}
      

//        // section 10.11 circle class 
//
//public class Circle2D {
//    private double x;
//    private double y;
//    private double radius;
//    
//
//    public Circle2D() {
//        this(0, 0, 1);
//    }
//    
//
//    public Circle2D(double x, double y, double radius) {
//        this.x = x;
//        this.y = y;
//        this.radius = radius;
//    }
//    
//
//    public double getX() { return x; }
//    public double getY() { return y; }
//    public double getRadius() { return radius; }
//    
//
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//    
//    public double getPerimeter() {
//        return 2 * Math.PI * radius;
//    }
//    
//
//    public boolean contains(double x, double y) {
//        double distance = Math.sqrt(Math.pow(this.x - x, 2) + 
//                                   Math.pow(this.y - y, 2));
//        return distance < radius;
//    }
//    
//
//    public boolean contains(Circle2D circle) {
//        double distance = Math.sqrt(Math.pow(this.x - circle.x, 2) + 
//                                   Math.pow(this.y - circle.y, 2));
//        return distance + circle.radius < radius;
//    }
//    
//
//    public boolean overlaps(Circle2D circle) {
//        double distance = Math.sqrt(Math.pow(this.x - circle.x, 2) + 
//                                   Math.pow(this.y - circle.y, 2));
//        return distance < radius + circle.radius && 
//               distance > Math.abs(radius - circle.radius);
//    }
//}
//
//
//public class TestCircle2D {
//    public static void main(String[] args) {
//        Circle2D c1 = new Circle2D(2, 2, 5.5);
//        
//        System.out.println("Area: " + c1.getArea());
//        System.out.println("Perimeter: " + c1.getPerimeter());
//        System.out.println("Contains (3,3): " + c1.contains(3, 3));
//        System.out.println("Contains Circle(4,5,10.5): " + 
//                          c1.contains(new Circle2D(4, 5, 10.5)));
//        System.out.println("Overlaps Circle(3,5,2.3): " + 
//                          c1.overlaps(new Circle2D(3, 5, 2.3)));
//    }
//}
        


//        // section 10.12 
//
//class MyPoint {
//    private double x;
//    private double y;
//    
//    public MyPoint() {
//        this(0, 0);
//    }
//    
//    public MyPoint(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//    
//    public double getX() { return x; }
//    public double getY() { return y; }
//    
//    public double distance(MyPoint p) {
//        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
//    }
//    
//    public double distance(double x, double y) {
//        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
//    }
//    
//    public static double distance(MyPoint p1, MyPoint p2) {
//        return p1.distance(p2);
//    }
//}
//
//
//public class Triangle2D {
//    private MyPoint p1, p2, p3;
//    
//
//    public Triangle2D() {
//        this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
//    }
//    
//
//    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
//        this.p1 = p1;
//        this.p2 = p2;
//        this.p3 = p3;
//    }
//    
//
//    public MyPoint getP1() { return p1; }
//    public MyPoint getP2() { return p2; }
//    public MyPoint getP3() { return p3; }
//    
//    public void setP1(MyPoint p1) { this.p1 = p1; }
//    public void setP2(MyPoint p2) { this.p2 = p2; }
//    public void setP3(MyPoint p3) { this.p3 = p3; }
//    
//
//    public double getArea() {
//        double side1 = p1.distance(p2);
//        double side2 = p2.distance(p3);
//        double side3 = p3.distance(p1);
//        double s = (side1 + side2 + side3) / 2;
//        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
//    }
//    
//
//    public double getPerimeter() {
//        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
//    }
//    
//    public boolean contains(MyPoint p) {
//        double area = getArea();
//        double area1 = new Triangle2D(p, p1, p2).getArea();
//        double area2 = new Triangle2D(p, p2, p3).getArea();
//        double area3 = new Triangle2D(p, p3, p1).getArea();
//        return Math.abs(area - (area1 + area2 + area3)) < 0.0001;
//    }
//    
//
//    public boolean contains(double x, double y) {
//        return contains(new MyPoint(x, y));
//    }
//    
//
//    public boolean contains(Triangle2D t) {
//        return contains(t.p1) && contains(t.p2) && contains(t.p3);
//    }
//
//    public boolean overlaps(Triangle2D t) {
//        return !contains(t) && !t.contains(this) && 
//               (contains(t.p1) || contains(t.p2) || contains(t.p3) ||
//                t.contains(p1) || t.contains(p2) || t.contains(p3));
//    }
//}
//
//
//public class TestTriangle2D {
//    public static void main(String[] args) {
//        Triangle2D t1 = new Triangle2D(
//            new MyPoint(2.5, 2), 
//            new MyPoint(4.2, 3), 
//            new MyPoint(5, 3.5)
//        );
//        
//        System.out.println("Area: " + t1.getArea());
//        System.out.println("Perimeter: " + t1.getPerimeter());
//        System.out.println("Contains (3,3): " + t1.contains(3, 3));
//        
//        Triangle2D t2 = new Triangle2D(
//            new MyPoint(2.9, 2),
//            new MyPoint(4, 1),
//            new MyPoint(1, 3.4)
//        );
//        System.out.println("Contains t2: " + t1.contains(t2));
//        
//        Triangle2D t3 = new Triangle2D(
//            new MyPoint(2, 5.5),
//            new MyPoint(4, -3),
//            new MyPoint(2, 6.5)
//        );
//        System.out.println("Overlaps t3: " + t1.overlaps(t3));
//    }
//}

        
//        // section 10.13 rectangle 
//public class MyRectangle2D {
//    private double x, y;
//    private double width, height;
//
//    public MyRectangle2D() {
//        this(0, 0, 1, 1);
//    }
//    
//
//    public MyRectangle2D(double x, double y, double width, double height) {
//        this.x = x;
//        this.y = y;
//        this.width = width;
//        this.height = height;
//    }
//    
//
//    public double getX() { return x; }
//    public double getY() { return y; }
//    public double getWidth() { return width; }
//    public double getHeight() { return height; }
//    
//    public void setX(double x) { this.x = x; }
//    public void setY(double y) { this.y = y; }
//    public void setWidth(double width) { this.width = width; }
//    public void setHeight(double height) { this.height = height; }
//    
//    public double getArea() {
//        return width * height;
//    }
//    
//    public double getPerimeter() {
//        return 2 * (width + height);
//    }
//    
//
//    public boolean contains(double x, double y) {
//        return Math.abs(this.x - x) <= width / 2 && 
//               Math.abs(this.y - y) <= height / 2;
//    }
//    
//
//    public boolean contains(MyRectangle2D r) {
//        return contains(r.x - r.width/2, r.y - r.height/2) &&
//               contains(r.x + r.width/2, r.y + r.height/2);
//    }
//    
//
//    public boolean overlaps(MyRectangle2D r) {
//        return !(r.x + r.width/2 < x - width/2 ||
//                 r.x - r.width/2 > x + width/2 ||
//                 r.y + r.height/2 < y - height/2 ||
//                 r.y - r.height/2 > y + height/2);
//    }
//}
//
//
//public class TestMyRectangle2D {
//    public static void main(String[] args) {
//        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
//        
//        System.out.println("Area: " + r1.getArea());
//        System.out.println("Perimeter: " + r1.getPerimeter());
//        System.out.println("Contains (3,3): " + r1.contains(3, 3));
//        System.out.println("Contains Rectangle(4,5,10.5,3.2): " + 
//                          r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
//        System.out.println("Overlaps Rectangle(3,5,2.3,5.4): " + 
//                          r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
//    }
//}
      


//        // section 10.14 gregorian calender class
//        
//        import java.util.GregorianCalendar;
//
//
//public class MyDate {
//    private int year;
//    private int month;
//    private int day;
//    
//
//    public MyDate() {
//        GregorianCalendar calendar = new GregorianCalendar();
//        year = calendar.get(GregorianCalendar.YEAR);
//        month = calendar.get(GregorianCalendar.MONTH);
//        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
//    }
//    
//
//    public MyDate(long elapsedTime) {
//        setDate(elapsedTime);
//    }
//    
//
//    public MyDate(int year, int month, int day) {
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }
//    
//
//    public int getYear() { return year; }
//    public int getMonth() { return month; }
//    public int getDay() { return day; }
//    
//
//    public void setDate(long elapsedTime) {
//        GregorianCalendar calendar = new GregorianCalendar();
//        calendar.setTimeInMillis(elapsedTime);
//        year = calendar.get(GregorianCalendar.YEAR);
//        month = calendar.get(GregorianCalendar.MONTH);
//        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
//    }
//}
//
//
//public class TestMyDate {
//    public static void main(String[] args) {
//        MyDate date1 = new MyDate();
//        MyDate date2 = new MyDate(34355555133101L);
//        
//        System.out.println("Current Date:");
//        System.out.println("Year: " + date1.getYear());
//        System.out.println("Month: " + date1.getMonth());
//        System.out.println("Day: " + date1.getDay());
//        
//        System.out.println("\nDate from elapsed time:");
//        System.out.println("Year: " + date2.getYear());
//        System.out.println("Month: " + date2.getMonth());
//        System.out.println("Day: " + date2.getDay());
//    }
//}
     


//        // section 10. 15 bounding ractangle
//        import java.util.Scanner;
//
//public class BoundingRectangle {
//    public static MyRectangle2D getRectangle(double[][] points) {
//        double minX = points[0][0];
//        double maxX = points[0][0];
//        double minY = points[0][1];
//        double maxY = points[0][1];
//        
//        for (double[] point : points) {
//            if (point[0] < minX) minX = point[0];
//            if (point[0] > maxX) maxX = point[0];
//            if (point[1] < minY) minY = point[1];
//            if (point[1] > maxY) maxY = point[1];
//        }
//        
//        double centerX = (minX + maxX) / 2;
//        double centerY = (minY + maxY) / 2;
//        double width = maxX - minX;
//        double height = maxY - minY;
//        
//        return new MyRectangle2D(centerX, centerY, width, height);
//    }
//    
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        double[][] points = new double[5][2];
//        
//        System.out.print("Enter five points: ");
//        for (int i = 0; i < 5; i++) {
//            points[i][0] = input.nextDouble();
//            points[i][1] = input.nextDouble();
//        }
//        
//        MyRectangle2D rect = getRectangle(points);
//        System.out.println("The bounding rectangle's center (" + rect.getX() + 
//                          ", " + rect.getY() + "), width " + rect.getWidth() + 
//                          ", height " + rect.getHeight());
//    }
//}



//        // section 10.16 dvisible 
//        import java.math.BigInteger;
//
//public class DivisibleBy2or3 {
//    public static void main(String[] args) {
//
//        BigInteger start = new BigInteger("10").pow(49);
//        int count = 0;
//        
//        while (count < 10) {
//            if (start.mod(new BigInteger("2")).equals(BigInteger.ZERO) ||
//                start.mod(new BigInteger("3")).equals(BigInteger.ZERO)) {
//                System.out.println(start);
//                count++;
//            }
//            start = start.add(BigInteger.ONE);
//        }
//    }
//}
      

//        // section 10.17 square number
//        import java.math.BigInteger;
//
//public class SquareNumbers {
//    public static void main(String[] args) {
//        BigInteger maxLong = new BigInteger(String.valueOf(Long.MAX_VALUE));
//        BigInteger sqrt = sqrt(maxLong);
//        
//        int count = 0;
//        while (count < 10) {
//            BigInteger square = sqrt.multiply(sqrt);
//            System.out.println(square);
//            sqrt = sqrt.add(BigInteger.ONE);
//            count++;
//        }
//    }
//    
//    public static BigInteger sqrt(BigInteger n) {
//        BigInteger a = BigInteger.ONE;
//        BigInteger b = n.shiftRight(1);
//        while (b.compareTo(a) >= 0) {
//            BigInteger mid = a.add(b).shiftRight(1);
//            if (mid.multiply(mid).compareTo(n) > 0) {
//                b = mid.subtract(BigInteger.ONE);
//            } else {
//                a = mid.add(BigInteger.ONE);
//            }
//        }
//        return a.subtract(BigInteger.ONE);
//    }
//}


//        // section 10.18 large prime number 
//        import java.math.BigInteger;
//
//public class LargePrimeNumbers {
//    public static void main(String[] args) {
//        BigInteger number = new BigInteger(String.valueOf(Long.MAX_VALUE));
//        int count = 0;
//        
//        while (count < 5) {
//            if (isPrime(number)) {
//                System.out.println(number);
//                count++;
//            }
//            number = number.add(BigInteger.ONE);
//        }
//    }
//    
//    public static boolean isPrime(BigInteger n) {
//        if (n.compareTo(BigInteger.valueOf(2)) < 0) return false;
//        if (n.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) 
//            return n.equals(BigInteger.valueOf(2));
//        
//        // Check divisibility from 3 to sqrt(n)
//        BigInteger i = BigInteger.valueOf(3);
//        while (i.multiply(i).compareTo(n) <= 0) {
//            if (n.mod(i).equals(BigInteger.ZERO)) return false;
//            i = i.add(BigInteger.valueOf(2));
//        }
//        return true;
//    }
//}
    }
    
}
