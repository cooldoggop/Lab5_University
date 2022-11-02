import java.util.*;
import static java.lang.Math.*;

public class lab_5 {
    //methods
    public static int num1() {
        Scanner in = new Scanner(System.in);
        double first, second, third, fourth;
        int  output;
        System.out.println("Input 4 numbers");
        first = in.nextDouble();
        second = in.nextDouble();
        third = in.nextDouble();
        fourth = in.nextDouble();
        if (first == second & first == third) {
            output = 4;
        }
        else if (first==second & first==fourth) {
            output = 3;
        }
        else if (first == third & first == fourth){
            output = 2;
        }
        else {
            output = 1;
        }
        return output;
    }
    public static double num2(){
        Scanner in = new Scanner(System.in);
        double s;
        double[] x = new double[4];
        double[] y = new double[4];
        System.out.println("Input cord 1st dot and second of 1st and second figure");
        x[0] = in.nextDouble();
        y[0] = in.nextDouble();
        x[1] = in.nextDouble();
        y[1] = in.nextDouble();
        x[2] = in.nextDouble();
        y[2] = in.nextDouble();
        x[3] = in.nextDouble();
        y[3] = in.nextDouble();
        s=0;
        if (abs(x[0]) >= abs(x[3]) || abs(x[2]) >= abs(x[1]) || abs(y[0]) >= abs(y[3]) || abs(y[1]) <= abs(y[2])){
            System.out.println("Disjoint");
        }
        else {
            Arrays.sort(x,0,4);
            s = abs((x[2]-x[1])*(y[2]-y[1]));
        }
    return s;
    }
    public static void num3(){
        for (double x = -3; x <= 3; x = x + 0.5){
            if (x<0){
                System.out.println("x = " + x + " f = " + cos(PI*x));
            }
            else {
                System.out.println("x = " + x + " f = " + x*x);
            }
        }
    }
    public static double num4(){
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double outnum;
            if (x<-4){
               outnum = log10(abs(10*x));
            }
            else if(x>-4 & x<2){
               outnum = log(abs(x-2*x*x));
            }
            else if (x>2){
              outnum = (pow(cos(x),sin(x)))/(pow(x,(2/5)));
        }
            else if(x == -4 || x == 2){
                outnum = sqrt(2);
            }
            else {
                outnum = 0;
            }
       return outnum;
    }
    public static boolean num5_1figure(double x,double y){
        boolean out;
        if ((y > 3*x +24 && x > -8 && x < -6) || (y>-6*x-30 && x> -6 && x< -5)
                || (y > x+5 && x>-5 && x < -2) || (y > 8*x +26 && x<-2 && x> -4)
                || (y< -6) || (y < 2*x +10 && x>-8 && x<-6) || (y <-x-8 && x<-6 && x>-8)
                || (x<= -8) || (y>=6) || (x>=-2)){
            if ((x == -6 && y == 6) || (x == -2 && y==2) || (y == -6 && x <=-4 && x>=-8) || (x ==-8 && y==0)){
                out = true;
            }
            else {out = false;}
        }
        else{
            out = true;
        }
        return out;
    }
    public static boolean num5_2figure(double x,double y){
        boolean out;
        out = false;
        if ((y>10*x+14 && x >-2 && x<-1) || (y > -2*x+2 && x>=-1 && x<=2)
                || (y>8*x-18 && x>=2 && x<=3) || (y > -((5/3)*x)+11 && x>1 && x<6)
                || (y<(5/6)*x-4 && x<6 && x>0) || (y > -3*x-4 && x>0 && x<1)
                || (y < -(1/3)*x-(20/3) && x<1 && x>-2)
                || (x<=-2) || (x>=6) || (y>=6) || (y<=-7)){
            if ((x == -2 && y == -6) || (x == -1 && y == 4) || (x == 2 && y == -2)
                    || (x == 3 && y == 6) || (x == 6 && y == 1) || (x == 0 && y == -4)
                    || (x == 1 && y == -7)){
                out = true;
            }
            else {out = false;}
        }
        else{
            out = true;
        }
        return out;
    }
    public static void num5(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input cords of dot");
        double x = in.nextDouble();
        double y = in.nextDouble();
        if (num5_1figure(x,y)){
            System.out.println("Dot in 1-st figure");
        }
        else if (num5_2figure(x,y)){
            System.out.println("Dot in 2-nd figure");
        }
        else {
            System.out.println("Dot out of figures");
        }

    }
    public static void num6(){
        double x,y;
        double figure;
        double r = 6;
        Scanner in = new Scanner(System.in);
        System.out.println("Input cords of dot");
        x = in.nextDouble();
        y = in.nextDouble();
        //if (x*x + y*y <= 36 && ((x <= 0 && y >= 0) && ((4 <= x*x + pow(y-4,2) && (y >= -x -1 && x >= -4 && y >= 0.75*x+0.75)) || 1 <= x*x+pow(y-4,2))
       // || ((x>=0 && y >= 0) && ((4 >= x*x + pow(y-4,2) && (y >= 0.75*x+0.75 || y>= -3*x + 12)) || 1 <= x*x+pow(y-4,2))))){
        if (x*x + y*y > 36  || (y < -x -1 && x < -1 && x > -4) || (y < 0.75*x + 0.75 && x > -1 && x < 3) ||(y < -3*x+12 && x>3 && x<4) || (4 > x*x + pow(y-4,2) && 1 < x*x + pow(y-4,2))){
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
    }
    public static void num6_reservCopy(){
        double x,y;
        double figure;
        double r = 6;
        Scanner in = new Scanner(System.in);
        System.out.println("Input cords of dot");
        x = in.nextDouble();
        y = in.nextDouble();
        if (x*x + y*y <= 36 || x*x + pow((y-4),2) <= 1 || x*x + pow((y-4),2) <= 4){
            if((y >= -x-1 && x <= -4) || (y <= -x-1 && x <= -4) || (y >= -3*x+12 && y>= 0.75*x + 0.75)
                    || (y >= -3*x+12 && y<= 0.75*x + 0.75) || x*x + pow((y-4),2) <= 1) {
                System.out.println("Dot inside the figure");
            }
            else {
                System.out.println("Dot outside the figure");
            }
        }
        else {
            System.out.println("Dot outside the figure");
        }
    }
    public static double num7_g(double x){
        double g;
        if (x<=0){
            g = (abs(3*x*x-6*x))/(1+2*x+x*x);
        }
        else {
            g = exp(cos(x*sin(x)))*((abs(x*x-2))/cos(x-2));
        }
        return g;
    }
    public static double num7_z(double x){
        double z;
        if (x < 0){
            z = 3*pow((x*x-1),3)+(2+sqrt(1+exp(1)*pow(x,2*PI)))/(cos(x+2*pow(x,4)));
        }
        else if (x>=0 & x<=1){
            z = 2*cos(x)*exp(-2*x)-sin(2*x-exp(1));
        }
        else {
            z = (2*sin(3*x)*sin(3*x)-tan(x))/(cos(sin(x*x*x))+3*x);
        }
        return z;
    }
    public static void num8(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of month");
        int month = in.nextInt();
        switch (month){
            case 1:
                System.out.println("Oleg 12.01.1998");
                System.out.println("+79423865477");
                break;
            case 2:
                System.out.println("Maxim 03.02.2004");
                System.out.println("+79087776438");
                break;
            case 3:
                System.out.println("Lina 18.03.2006");
                System.out.println("+79897546734");
                break;
            case 4:
                System.out.println("No birthdays");
                break;
            case 5:
                System.out.println("Dina 13.05.2002");
                System.out.println("+79423876590");
                break;
            case 6:
                System.out.println("Dima 07.06.2004");
                System.out.println("+79088995643");
                break;
            case 7:
                System.out.println("Sonya 14.07.2008");
                System.out.println("+79873330180");
                break;
            case 8:
                System.out.println("Alex 03.08.1999");
                System.out.println("+79479088567");
                break;
            case 9:
                System.out.println("Johny Silverhand 16.09.1988");
                System.out.println("Telephone number not found");
                break;
            case 10:
                System.out.println("No birthday");
                break;
            case 11:
                System.out.println("Hemen 05.11.1998");
                System.out.println("+45886905667");
                break;
            case 12:
                System.out.println("Andrew 28.12.1996");
                System.out.println("+79897576650");
                break;
            default:
                System.out.println("Error");
                break;
        }

    }
    public static void num9(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input your name?");
        String name = in.nextLine();
        System.out.println("How old are you?");
        double age = in.nextDouble();
        String school_university, working_place,pet,pet_name,hobby;
        school_university = "No";
        working_place = "No";
        pet = "No";
        pet_name = "No";
        hobby = "No";
        if (age < 25) {
            System.out.println("Do u go to school or University, yes - 1 or no - 0");
            int yes_no_1 = in.nextInt();
            switch (yes_no_1) {
                case 1:
                    System.out.println("Where do u study?");
                    school_university = in.nextLine();
                    school_university = in.nextLine();
                    break;
                case 0:
                    System.out.println("Where do u work?");
                    working_place = in.nextLine();
                    working_place = in.nextLine();
                    break;
                default:
                    System.out.println("Not correct input");
                    break;
            }
        }
        else {
            System.out.println("Where do u work?");
            working_place = in.nextLine();
            working_place = in.nextLine();
            System.out.println("What is u'r hobby?");
            hobby = in.nextLine();
            }
        System.out.println("Do u have pet?");
        String yes_no_2 = in.nextLine();
        switch (yes_no_2) {
            case "yes":
                System.out.println("What pet do u have and what is pet's name");
                pet = in.nextLine();
                pet_name = in.nextLine();
                break;
            case "no":
                break;
            default:
                System.out.println("Not correct input");
                break;
        }
        System.out.println("Name: " + name + " Age: " + age);
        System.out.println("School or university: " + school_university + " Work: " + working_place);
        System.out.println("Hobby: " + hobby);
        System.out.println("Animal pet:" + pet + " Pet's name:" + pet_name);
    }
    //ending of methods
    //main body of program
    public static void main(String[] args) {
        System.out.println("Введите номер задачи от 1 до 9");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num){
            case 1:
                System.out.println(num1());
                break;
            case 2:
                System.out.println("S = " + num2());
                break;
            case 3:
                num3();
                break;
            case 4:
                System.out.println(num4());
                break;
            case 5:
                num5();
                break;
            case 6:
                num6();
                break;
            case 7:
                System.out.println("Input x in range [-4;4]");
                double x = in.nextDouble();
                if (x>=-4 & x<=4) {
                    System.out.println(num7_g(x));
                    System.out.println(num7_z(x));
                }
                else {
                    System.out.println("Error: number out of range");
                }
                break;
            case 8:
                num8();
                break;
            case 9:
                num9();
                break;
            default:
                System.out.println("Error: number not found");
                break;
        }

    }
}