import java.util.Scanner;

import java.util.Date;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;

// class Main {
//     public static void main(String[] args) {
//         // byte --> 1byte
// short --> 2 byte
// int --> 4 byte
// long --> 8 byte

// float --> 4 byte
// double --> 8 byte

// char
// boolean --> 1 byte

// byte age = 30;
// long viewContact = 33323_456_78l;
// float price = 18.99F;
// boolean darkMode = true;

// byte age = 30;
// Date now = new Date();
// now.getTime();
// System.out.println(now);
// byte x = 1;
// byte y = x;
// x = 2;
// System.out.println(y);
// Point point1 = new Point(1 , 1);
// Point point2 = point1;
// point1.x = 2;
// System.out.println(point2);

// String message = new String("Hello World" + "!");
// String message = new String("Hello \"World\" " + "!");
// String message = "c:\\Windows\\...";
// String message = "c:\nWindows\\...";
// System.out.println(message.endsWith("ld!"));
// System.out.println(message.length());
// System.out.println(message.indexOf("H"));
// System.out.println(message.replace("!" , "?"));
// System.out.println(message.trim());
// System.out.println(message);

//     }
// }

// public class Main2 {
//     public static void main(String[] args) {

// int[] numbers = { 1, 2, 5, 4, 3 };
// // numbers[0] = 1;
// // numbers[1] = 2;
// Arrays.sort(numbers);
// System.out.println(Arrays.toString(numbers));

// int[][][] numbers = new int[1][2][3];
// int[][] numbers = { { 1, 2, 3 }, { 1, 2, 3 } };
// numbers[0][0] = 1;
// System.out.println(Arrays.deepToString(numbers));
// final float PI = 3.14f;

// System.out.println(PI);

// + - * / %
// int result = 10 * 3;
// double result = (double)10 / (double)3;
// int x = 1;
// x =+ 2;
// System.out.println(x);

// String x = "1.1";
// int y = Integer.parseInt(x)+ 2;
// System.out.println(y);
//     }
// }

public class Main3 {
        public static void main(String[] args) throws IllegalAccessException {
                // double result = Math.ciel(1.5f);
                // double result = Math.floor(1.5f);
                // double result = Math.max(4 , 2);
                // double result = Math.min(4 , 2);
                // double result = (int) Math.round(Math.random() * 100);
                // double result = (int) (Math.random() * 100);
                // System.out.println(result);
                //
                // NumberFormat currency = NumberFormat.getCurrencyInstance();
                // String result = currency.format(1221352.657345);
                // System.out.println(result);

                // String result = NumberFormat.getPercentInstance().format(0.5);
                // System.out.println(result);

                // Scanner scanner = new Scanner(System.in);
                // System.out.println("Name :");
                // // Byte age = scanner.nextByte();
                // String name = scanner.nextLine().trim();
                // System.out.println("Your Name"+ name);

                // int tempreture = 22;
                // boolean iswarm = tempreture > 20 && tempreture < 30;
                // System.out.println(iswarm);

                // boolean HasHiGreat = true;
                // boolean HasPaper = true;
                // boolean olderthan40 = false;
                // boolean Iseligble = (HasHiGreat || HasPaper) && !olderthan40;
                // System.out.println(Iseligble);

                // String traficLight = "Green";
                // if (traficLight == "red"){
                // System.out.println("Stop Mother Fucker !");
                // } else if (traficLight == "Green"){
                // System.out.println("Run Away Mother Fucker !");
                // } else {
                // System.out.println("Go Past Mother Fucker !");
                // }

                // int Incore = 120_000;
                // boolean Hasignore;
                // if (Incore > 100_000) {
                // Hasignore = true;
                // } else {
                // Hasignore = false;
                // }
                // System.out.println(Hasignore);

                // int income = 80_000;
                // boolean hasignore = become > 100_000;
                // System.out.println(hasignore);

                // int mark = 50;
                // char grade = mark > 80 ? 'A' : 'B';
                // System.out.println(grade);

                // switch (traficLight) {
                // case "Green":
                // System.out.println("Harekat kon madar jende");
                // break;
                // case "red":
                // System.out.println("Vaisa Kiri");
                // break;
                // default:
                // System.out.println("Sik kon yavash");
                // }

                // for (int i = 1; i <= 5 ; i++)
                // System.out.println(i);

                // int i = 5;
                // while (i > 0){
                // System.out.println("Hello world" + i);
                // i++;
                // }

                // Scanner scanner = new Scanner(System.in);
                // String input = "";
                // while (!input.equals("quit")){
                // System.out.println("Input :");
                // input = scanner.next().toLowerCase();
                // System.out.println(input);
                // }

                // Scanner scanner = new Scanner(System.in);
                // String input = " ";
                // while (input.equals("quit")) {
                // System.out.println("Inout : ");
                // input = scanner.next().toLowerCase();
                // if (input.equals("reset"))
                // continue;
                // if (input.equals("quit"))
                // break;
                // System.out.println(input);
                // }

                // String message = greatUser("kos" , "nnt");
                // System.out.println(message);
                // }
                // public static String greatUser(String first , String last) {
                // return "Hello World" + first + " " + last;
                // }

                // var textBox1 = new TextBox();
                // var textBox2 = new TextBox();

                // textBox1.setText("Box 1");
                // textBox2.setText("Box 2");

                // System.out.println(textBox2.text.toUpperCase());

                // var textbox1 = new TextBox();
                // var textbox2 = textbox1;

                // textbox1.setText("Name");
                // System.out.println(textbox2.text);

                // int baseSalary = 50_000;
                // int exraHours = 10;
                // int HourlyRate = 20;

                // int wage = calculateWage(baseSalary, exraHours, HourlyRate);
                // System.out.println(wage);
                // }

                // public static int calculateWage(
                // int baseSalary,
                // int exraHours,
                // int hourlyRate) {
                // return baseSalary + (exraHours + hourlyRate);

                var employee = new Employee();
                employee.setBaseSalary(50_000);
                employee.hourlyRate = 20;
                int wage = employee.calculateWage(10);
        }
}






















































