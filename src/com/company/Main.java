//Alex Lee learning
/*
Day 1:
\n =New line
\t = Tab
String input
Scanner sc = new Scanner(System.in);(We gonna get input from user with the scanner)
System.out.println("Enter you're favorite pokemon: "
String pokemon = sc.nextLine
 
Int variable(Cant be a big number)
int i = 5;
String a = "Alex lee";
double j = 10*3;
long b = 1000000000000L;(Long integer)
float c = 2.5 =2.5000F;

Boolean in java
int a = 0;
boolean b = true;(can only b true or false)
boolean b = a==0(also works)
Mostly used on if statements
boolean passdoor = (true)
int doorCount = 0;
boolean passAllDoors = False
if(true){(If this is true run this code
        System.out.println("I am Black");
        }
if(passdoor){
        System.out.println("This code will never run";
        }
if(passdoor){
        System.out.println("You have passed the first door"
       doorCount = doorCount +1
       }
if(doorCount) == 3){
        System.out.println("congratz")
        }

If statement
if(n >=90 && n<=100){
         System.out.println("You got an A";
      }else if(n >=80 && n<90){
      System.out.println("You got an B";
      }else if(n >=70 && n<80){
      System.out.println("You got an C)
      }else(It means everything else){
      System.out.println("The number is not in range");
 Exemple of code:
 public static void main(String[] args) {
		
		// if statement = performs a block of code if it's condition evaluates to be true
                else been if it's false
                If is also prioritize over else if
		
		int age = 75;
		
		if(age==75) {
			System.out.println("Ok Boomer!");
		}
		else if(age>=18) {
			System.out.println("You are an adult!");
		}
		else if(age>=13) {
			System.out.println("You are a teenager!");
		}
		else {
			System.out.println("You are not an adult!");
		}
      
      
 

GIU 
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
	}	
}

 Comparison operator
    int a = 5
    int b = 4

    a == b; (is equal to )
    boolean c = (a == b);(It means that is it true that a = b?) which is false

    boolean c = (a<= b);(less than equal)
    boolean c = (a != b);(Is not equal to)
    if(a == 2.4 || a ==2.5) (Or)
    if (a && b)(and)

Modulus
% the reminder of the division


Exponents
int a = 5;
System.out.print((int)math.pow(5,2));(5 to the power of 2)(if you want a int put(int before))

While Loops
int a = 0
    while(true) {a while loops repeat a code for ever until it ends)

    }
    while(a<10)
    System.out.println("a is less than 10" + a);
    a++;( means incryment a by 1)

        do {(do means it will always do this code first no matter the outcome of while)
            System.out.println(a);
            }while(a == 0);(then we check if a is equal to 0)

Exemple
String sentence = "Pokemon are great"
Scanner sc = new Scanner(sentence);

ArrayList<String> words = new ArrayList<String>();


while(sc.hasNext()) {(The while loop store 1 word at the time in the array List)
words.add(scan.next())
}
System.out.println(words);

For loops

for(int i=0;i <=10,i++) { (the 10 represent how much time you wanna repeat it)

int[] grades = {98,100, 83 93}
for(int i = 0; i<grades.length; i++){(you read this code has starting with 0 to the the end which is the lenght)
System.out.println(grades[i]);
Outprint will be  98,100,83,93

Arrays
(zombie killer project)

String backpack[] = {"Shotgun" ,"Assault Rifle", "Sniper"};
String zombies[] = {"Close-range zombie" , "Mid-range zombie","Long-range zombie"}
System.out.println(backpack[2]);(Outprit will be sniper)

String into Int
String s = "102";
Integer.parseInt(s)(Me(this methode turn the stings number into integer)
 String s = "age:47";(if you wanna turn the string into an integer without the age:0
s = s.replaceALL("\\D+","")

System.out.println(n+2);
Outprit 49

Assignment2 tips
if(id.length()==7) break;//If the ID is equal to 7 break the loop(continue asking until lenght=7(\
if(choice.equalsIgnoreCase("Yes")) break;(if user type yes stop code)

 Important question :System.out.print("\n\nExit the program?(enter Yes to exit): ");//ask if he wanna exit or not
            scanner.nextLine();
            String choice=scanner.nextLine();//read the choice

Question 2:
if (str1.equalsIgnoreCase("Yes")) {
                    System.out.print("\nBeef or Pork? ");
                    str1 = scan.next();
                    if (str1.equalsIgnoreCase("beef")) {//calculate if the input is beef
                        totalCost += 25.5;
                    } else if (str1.equalsIgnoreCase("pork")) {//calculate if the input is prok
                        totalCost += 17.5;


2D arrays
int[] loterryCard = {{20, 15 , 7},
                    {8,  7, , 19},
                    {7,  13,  47}
};
int[][] loteryCard2 = new int [3][3];
lotteryCard2[0][0] = 20;
lotteryCard2[0][1] = 15;
lotteryCard2[0][2] = 7;
lotteryCard2[1][0] = 8;
lotteryCard2[1][1] = 7;
lotteryCard2[1][2] = 19;
lotteryCard2[2][9] = 0;
[row][column]
for(int i = 0; i<3;i++)
    for(int j=0; j<3;i++0
System.out.println(lottery card[i][j]);
To print every array

Main method

Method
Run what is in the Main method
void = no return
exemple:
void sayHi {
System.out.println("Hi") wont show nothing cause its not in the main method
you need to do
static void sayHi
public = can be see
static = you don't have to make a object
void = no return

Naming convention
public static int addTwoNumbers(int a,int b){
int ageOfStudent = 5;
}

Java conditional Operator
int a = (7>3) ? 7 ; 3; (Read like this: is 7 greater than 3 if true store 7 into a  if false store 3 into a)
same this has
if(7>3){
a=7;
}else{
a=3;
}
Initialization Declaration Assignment in Java

String pizza1 = "pinaplle"initialization
String pizza2 declaration
pizza2 = "bbq" assignment

public static void eat pizza(); declaration

Nested for Loops (get elements 2 D array

for(int i=0; i<5; i++){
System.out.println("its)
String[][]fancyColors = {{"red","Blue","Green"},
                         {"Cyan,"magenta",Grey}
                         };
for(int i=0;i<2;i++){
    for(int j=0; i<3,i++){
    System.out.print([i][j])
    output gonna be the 2D array

Break statement
can only exit a loop or switch


Split statement
String X = date.nextLine();(user input)
String[]name = x.split(",");(use to separte arrays )


/*

Note 12 H

Compiling code = transform source code to machine code
by code cross-plateform JVM
Class collection of related code
if you wanna replace something you go on edit find replace :::_)__

Math class:
Math.max(x,y) max of both
Math.min(x,y) min of both
Math.abs(y) absolute
Math.sqrt(x) sqrt of
Math.round(x) round (arondir)
Math.ceil(x) round up alway
Math.floor(x)

//*********************************************
import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  
  double x;
  double y;
  double z;
  
  Scanner scanner = new Scanner(System.in);
    
  System.out.println("Enter side x: ");
  x = scanner.nextDouble();
  System.out.println("Enter side y: ");
  y = scanner.nextDouble();
  
  z = Math.sqrt((x*x)+(y*y));
  
  System.out.println("The hypotenuse is : "+z);
  
  scanner.close();   
 }
}

Java random number generator: 

random.nextInt()
random.nextDouble()
random.nextBoolean()

import java.util.Random;

public class Main {

 public static void main(String[] args) {
  
  Random random = new Random();
  
  int x = random.nextInt(6)+1    (6) is a random beetween 0-5 the +1 equal 0-6
  //double y = random.nextDouble();
  //boolean z = random.nextBoolean();
  
  System.out.println(x);
    
 }
}
Switch statement: it means if it match then you right it 
public class Main {

 public static void main(String[] args) {
  
  // switch = statement that allows a variable to be tested for equality against a list of values
  break stop from writting everything
  default is use so that if you nothing match then it will write the default
  
  String day = "Friday";
  
  switch(day) {
   case "Sunday": System.out.println("It is Sunday!");
   break;
   case "Monday": System.out.println("It is Monday!");
   break;
   case "Tuesday": System.out.println("It is Tuesday!");
   break;
   case "Wednesday": System.out.println("It is Wednesday!");
   break;
   case "Thursday": System.out.println("It is Thursday!");
   break;
   case "Friday": System.out.println("It is Friday!");
   break;
   case "Saturday": System.out.println("It is Saturday!");
   break;
   default: System.out.println("That is not a day!");
  }
    
 }
}

LOGICAL OPERATOR:public class Main {

	public static void main(String[] args) {
		
		// logical operators = used to connect two or more expressions
		//
		//						&& = (AND) both conditions must be true
		// 						|| = (OR) either condition must be true
		//						! = (NOT) reverses boolean value of condition

// -------------------------------- Example 1 --------------------------------
/*
		int temp = 15;
		
		if(temp>30) {
			System.out.println("It is hot outside");
		}
		else if(temp>=20 && temp<=30) {
			System.out.println("It is warm outside");
		}
		else {
			System.out.println("It is cold outside");
		}

*/
// -------------------------------- Example 2 --------------------------------
/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = scanner.next();
		
		if(!response.equals("q") && !response.equals("Q")) { //equals method
			System.out.println("YOu are still playing the game *pew pew*");
		}
		else {
			System.out.println("You quit the game");
		}


	}
            
}
WHILE LOOPS:(DO loops means you do this once then check condition compare to while loops they check condition first

import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  
  // while loop = executes a block of code as long as a it's condition remains true

  Scanner scanner = new Scanner(System.in);
  String name = "";
  
  while(name.isBlank()) {
   System.out.print("Enter your name: ");
   name = scanner.nextLine();
  }
  
  System.out.println("Hello "+name);
   
 }
}
FOR LOOP:
public static void main(String[] args) {
		
		// for loop = executes a block of code a limited amount of times
		
		for(int i=10; i>=0; i--) {
			System.out.println(i);
		}
		System.out.println("Happy new year!");
		
	}
}
NESTED FOR LOOPS:
ublic static void main(String[] args) {
		
		// nested loops = a loop inside of a loop
		
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns: ");
		columns = scanner.nextInt();
		System.out.println("Enter symbol to use: ");
		symbol = scanner.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=columns;j++) {
				System.out.print(symbol);
			}
		}	
	}
}

ARRAYS:

// array = used to store multiple values within a single variable
		
		String[] cars = new String[3];
		
		cars[0] = "Camaro";
		cars[1] = "Corvette";
		cars[2] = "Tesla";
			
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
	
	}
}

2D arrays public class Main {

	public static void main(String[] args) {
			
		// 2D array = an array of arrays
		
		String[][] cars = 	{	way 1
								{"Camaro","Corvette","Silverado"},
								{"Mustang","Ranger","F-150"},
								{"Ferrari","Lambo","Tesla"}
							};
		way 2
		
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Silverado";
		cars[1][0] = "Mustang";
		cars[1][1] = "Ranger";
		cars[1][2] = "F-150";
		cars[2][0] = "Ferrari";
		cars[2][1] = "Lambo";
		cars[2][2] = "Tesla";
		
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
		}
	}
}



String Methods: 
  // String = a reference data type that can store one or more characters
  //   reference data types have access to useful methods
  
  String name = "Bro";
  
  //boolean result = name.equalsIgnoreCase("bro");
  //int result = name.length();
  //char result = name.charAt(0);
  //int result = name.indexOf("o");
  //boolean result = name.isEmpty(); is empty?
  //String result = name.toUpperCase();
  //String result = name.toLowerCase();
  //String result = name.trim(); remove empty space
  //String result = name.replace('o', 'a'); replace o with a
   
  //System.out.println(result);
 }
 
}

Wrapper classes   // wrapper class =  provides a way to use primitive data types as reference data types
  //     reference data types contain useful methods
  //     can be used with collections (ex.ArrayList)
  
  //primitive  //wrapper
  //---------  //-------
  // boolean  Boolean
  // char   Character
  // int   Integer
  // double  Double
  
  // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
  // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
  
  Boolean a = true;
  Character b = '@';
  Integer c = 123;
  Double d = 3.14;
  by referencing you have acces to methods 
  primitive a lot faster than reference
 }
 
}
Arrays list	// ArrayList = 	a resizable array. 
		//Elements can be added and removed after compilation phase
		//store only reference data types
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		//food.set(0, "sushi");  set a value at a certain index
		//food.remove(2);
		//food.clear();
		
		for(int i=0; i<food.size(); i++) { you use size and not .lenght
			System.out.println(food.get(i)); use ge function
		}
	}
}

2D arrays list 
	ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList);
		sout(groceryList.get0) print first array list
		
	}
}
///
FOR EACH LOOP
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
			
		// for-each = 	traversing technique to iterate through the elements in an array/collection
		//				less steps, more readable
		//				less flexible
		
		//String[] animals = {"cat","dog","rat","bird"};
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
		
		for(String i : animals) {
			System.out.println(i);
		}
Java methods:

Create own method 
Void is a return type 

hello(name,age)

static void hello(String name,int age){
	System.out.println("Hello"+name + age  )

public class Main {

	public static void main(String[] args) {
		
		// method = a block of code that is executed whenever it is called upon
		
		int x = 3;
		int y = 4;
		
		int z = add(x,y);

		System.out.println(z);
	}
	
	static int add(int x, int y) {
		
		int z = x + y;
		return z;
		
	}
	
}
// overloaded methods = methods that share the same name but have different parameters
		//						method name + parameters = method signature
		
		double x = add(1.0,2.0,3.0,4.0);
		
		System.out.println(x);
		
	}
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b + c + d;
	}
	static double add(double a, double b) {
		System.out.println("This is overloaded method #4");
		return a + b;
	}
	static double add(double a, double b, double c) {
		System.out.println("This is overloaded method #5");
		return a + b + c;
	}
	static double add(double a, double b, double c, double d) {
		System.out.println("This is overloaded method #6");
		return a + b + c + d;
	}	
}
Print f methode:
		// printf() = 	an optional method to control, format, and display text to the console window
		//				two arguments = format string + (object/variable/value)
		//				% [flags] [precision] [width] [conversion-character]
				
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 1000;
			
		// [conversion-character]
		//System.out.printf("%b",myBoolean);
		//System.out.printf("%c",myChar);
		//System.out.printf("%s",myString);
		//System.out.printf("%d",myInt);
		//System.out.printf("%f",myDouble);
		
		//[width]
		// minimum number of characters to be written as output
		//System.out.printf("Hello %10s",myString);
		
		//[precision]
		// sets number of digits of precision when outputting floating-point values
		//System.out.printf("You have this much money %.1f",myDouble);
		
		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		
		//System.out.printf("You have this much money %,f",myDouble);


Java OOP objects:

//*******************************************
public class Main {

	public static void main(String[] args) {
		
		Car myCar1 = new Car();      new is used to give all the other class atribute
		Car myCar2 = new Car();

		System.out.println(myCar1.make);
		System.out.println(myCar1.model);

		myCar1.drive();
		myCar1.brake();
	}
}
//*******************************************
public class Car {

	String make = "Chevrolet";  
	String model = "Corvette";
	int year = 2020;
	String color = "blue";
	double price = 50000.00;
	
	void drive() {
		System.out.println("You drive the car");
	}
	void brake() {
		System.out.println("You step on the brakes");
	}	
}
Constroctors:

//******************************************************
public class Main {

	public static void main(String[] args) {
		
		Human human1 = new Human("Rick",65,70);
		Human human2 = new Human("Morty",16,50);
			
		human1.drink();
		human2.eat();
		
	}
}
//******************************************************
public class Human {

	String name;
	int age;
	double weight;
	
	Human(String name,int age,double weight){
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(this.name+" is eating");
	}
	void drink() {
		System.out.println(this.name+" is drinking *burp*");
	}
		
}
//******************************************************
//*******************************************
Variable scope:

//********************************************
public class Main {

 public static void main(String[] args) {
  
  //local =  declared inside a method
  //   visible only to that method
  
  //global  = declared outside a method, but within a class
  //   visible to all parts of a class
  
  DiceRoller diceRoller = new DiceRoller();
  
 }
}
//********************************************
import java.util.Random;

public class DiceRoller {
 
 Random random;
 int number;
 
 DiceRoller(){
  random = new Random();
  roll();
 }
 
 void roll() {
  number = random.nextInt(6)+1;
  System.out.println(number);
 }
}
//********************************************
		
		
		


*/
+++









/*
//Note video de 12 h
