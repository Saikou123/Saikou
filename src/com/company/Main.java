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
ççString s = "age:47";(if you wanna turn the string into an integer without the age:0
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
Compiling code = transform source code to machine code
by code cross-plateform JVM
Class collection of related code
if you wanna replace something you go on edit find replace :::_)__
 */
+++








/*
//Note video de 12 h

