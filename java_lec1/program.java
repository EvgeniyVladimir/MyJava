package java_lec1;
/**
 * program
 */
// public class program {
//     public static void main(String[] args) {
//         String s = "23";
//         System.out.println(s);
//     }
// }
// public class program {
//     public static void main(String[] args) {
//         float f = 123.45f;
//         System.out.println(f);
//     }
// }
// public class program {
//     public static void main(String[] args) {
//         char c = 123;
//         System.out.println(c);
//     }
// }
// public class program {
//     public static void main(String[] args) {
//         int c = 123;
//         double d = c;
//         System.out.println(d);
//     }
// }
// public class program {
//     public static void main(String[] args) {
//         boolean flag1 =123 <= 234;
//         System.out.println(flag1); // true
//         boolean flag2 = 123 >= 234 || flag1;
//         System.out.println(flag2); // true
//         boolean flag3 = flag1 ^ flag2;
//         System.out.println(flag3); // false

//     }
// }
// public class program {
//     public static void main(String[] args) {
//         var i = 123;
//         System.out.println(i);

//     }
// }
// public class program {
//     public static void main(String[] args) {
//         var i = 123;
//         System.out.println(Integer.MAX_VALUE);

//     }
// }
// public class program {
//     public static void main(String[] args) {
//         String s = "qwer";
//         s.charAt(1);
       

//     }
// }
// public class program {
//     public static void main(String[] args) {
//         int a = 123;
//         a = ++a;
//         System.out.println(a);
//     }
// }
// public class program {
//     public static void main(String[] args) {
//         int a = 8;
//         a = a << 1;
//         System.out.println(a);
//     }
// }
// public class program {
//     public static void main(String[] args) {
//         int a = 8;
//         // a = a << 1;
//         System.out.println(a << 1);
//     }
// }
// public class program {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 2;
//         System.out.println(a | b);
//         // 101  - это 5 в двоичной системе
//         // 010  - это 2 в двоичной системе
//         // 111  - это 7 в двоичной системе  результат операции a или b вычисление в побитовой операции
//     }
// }
// public class program {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 2;
//         System.out.println(a & b);
//         // 101  - это 5 в двоичной системе
//         // 010  - это 2 в двоичной системе
//         // 000  - это 0 в двоичной системе  результат операции a и (&) b вычисление в побитовой операции
//     }
// }
// public class program {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 2;
//         System.out.println(a ^ b);
//         // 101  - это 5 в двоичной системе
//         // 010  - это 2 в двоичной системе
//         // 111  - это 7 в двоичной системе  результат операции a ^ b (разделительная операция(или)) вычисление в побитовой операции
//     }
// }
// public class program {
//     public static void main(String[] args) {
//         boolean a = true;
//         boolean b = true;
//         System.out.println(a & b);
//         // 1  
//         // 0  
//         // 1  true вычисление в побитовой операции
//     }
// }
// public class program {
//     public static void main(String[] args) {
//         boolean a = true;
//         boolean b = true;
//         System.out.println(a && b);
//         // 1  
//         // 0  
//         // 1  true вычисление в побитовой операции
//     }
// }
// public class program {
//     public static void main(String[] args) {
//         String s = "qwer"; // 4, 0..3
//         boolean b = s.length() >=5 && s.charAt(4) == '1';
//         System.out.println(b);
//         //  folse результат вычисления
//     }
// }
// public class program {
//     public static void main(String[] args) {
//         String s = "qwwe1"; // 5, 0..4
//         boolean b = s.length() >=5 && s.charAt(4) == '1';
//         System.out.println(b);
//         //  true результат вычисления потому что в четвертом индексе стоит 1
//     }
// }
// _______________________________________________________________
// Массивы одномерные
// 
// public class program {
//     public static void main(String[] args) {
//         int[] arr = new int[10];
//         System.out.println(arr.length); //10

//         int[] arr1 = new int[10];
//         System.out.println(arr1[3]); //0

//         int[] arr2 = new int[10];
//         arr2[3] = 13;
//         System.out.println(arr2[3]); //13

//         arr = new int[] {1, 2, 3, 4, 5};
//         System.out.println(arr.length); //5
//     }
// }
// Массивы многомерные
// 
// public class program {
//     public static void main(String[] args) {
//         int[] arr[] = new int[3] [5];
//         for (int[] line : arr) {
//             for (int item : line){
//                 System.out.printf("%d", item);
//             }
//             System.out.println();
//         }
//     }
// }
// public class program {
//     public static void main(String[] args) {
//         int[] [] arr = new int[3] [5];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("%d", arr[i] [j]);
//             }
//             System.out.println();
//         }
//     }
// }
//____________________________________________________
// Преобразования явные и неявные
// public class Program {
//     public static void main(String[] args) {
//         int i = 123; double d = i;
//         System.out.println(i);  // 123
//         System.out.println(d);  // 123.0
//         d = 3.1415; i = (int)d;
//         System.out.println(d);  // 3.1415
//         System.out.println(i);  // 3
//         d = 3.9415; i = (int)d;
//         System.out.println(d);  // 3.9415
//         System.out.println(i);  // 3
//         byte b = Byte.parseByte("123");
//         System.out.println(b);  // 123
//         b = Byte.parseByte("1234");
//         System.out.println(b);  // NumberFormatException: Value out of range
//     }
// }
// НО
// class Program
// {
//   public static void main(String[] args) {
//    int[] a = new int[10];
//    double[] d = a;   // ИЗУЧАЕМ ковариантность и контравариантность
//   }
// }
//________________________________________________
//Получение данных из терминала
//СТроки
// import java.util.Scanner;
// public class program {
//    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("Enter name: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Hello, %s!", name);
//        iScanner.close();
//    }
// }
//Некоторые примитивы
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
// }}

//Проверка на соответствие получаемого типа
// import java.util.Scanner;
// public class Program {
//    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        boolean flag = iScanner.hasNextInt();
//        System.out.println(flag);       
//        int i = iScanner.nextInt();
//        System.out.println(i);       
//        iScanner.close();
//    } }
//____________________________
//Форматированный вывод

// public class Program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = a + " + " + b + " = " + c;
//         System.out.println(res);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);
//         System.out.println(res);
//     }
// }
// _____________________________________________________
//Виды спецификаторов

// public class program {
//     public static void main(String[] args) {
       
//         float pi = 3.1415f;
//         System.out.printf("%f\n", pi);    // 3,141500
//         System.out.printf("%.2f\n", pi);  // 3,14
//         System.out.printf("%.3f\n", pi);  // 3,141
//         System.out.printf("%e\n", pi);    // 3,141500e+00
//         System.out.printf("%.2e\n", pi);  // 3,14e+00
//         System.out.printf("%.3e\n", pi);  // 3,141e+00
//     }
// }

//______________________________________
//Область видимости переменных

//У переменных существует понятие «область видимости». 
// Если переменную объявили внутри некоторого блока фигурных скобок { }, 
// то снаружи этого блока переменная будет недоступна.

// public class program {
//    public static void main(String[] args) {
//        {
//            int i = 123;
//            System.out.println(i);           
//        }     
//        System.out.println(i);  // error: cannot find symbol
//    }
// }
// public class program {
//    public static void main(String[] args) {
//         int i = 222;
//        {
//            int i = 123;
//            System.out.println(i);           
//        }     
//        System.out.println(i);  // error: cannot find symbol
//    }
// }
// public class program {
//    public static void main(String[] args) {
//         
//        {
//            int i = 123;
//            System.out.println(i); // 123          
//        }  
//        int i = 222;   
//        System.out.println(i);  // 222
//    }
// }
// public class program {
//    public static void main(String[] args) {
//         int b = 125;
//        {
//            int i = 123;
//            System.out.println(i+b); // 248          
//        }  
//        int i = 222;   
//        System.out.println(i);  // 222
//    }
// }
//__________________________________________
// Функции и методы

// public class program {
//     static void sayHi() {
//         System.out.println("hi!");
//     }
//     static int sum(int a, int b) {
//         return a+b;
//     }  
//     static double factor(int n) {
//         if(n==1)return 1;
//         return n * factor(n-1);
//     }
//     public static void main(String[] args) {
//         sayHi(); // hi!
//         System.out.println(sum(1, 3)); // 4
//         System.out.println(factor(5)); // 120.0
//     }}
//_____________________________________________________________

//Управляющие конструкции: условный оператор

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a;
//         } else {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c = 0;
//         if (a > b) c = a;
//         if (b > a) c = b;

//         System.out.println(c);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b;
//         System.out.println(min);
//     }
// }
//_________________________________________________
//Оператор выбора

// import java.util.Scanner;
// public class Program {
//     public static void main(String[] args) {
//         int mounth = value;
//         String text = "";
//         switch (mounth) {
//             case 1:
//                 text = "Autumn";
//                 break;
//             case 2:
//                 text = "Autumn";
//                 break;
//             case 3:
//                 text = "Autumn";
//                 break;
//             case 4:
//                 text = "Autumn";
//                 break;
//             case 5:
//                 text = "Autumn";
//                 break;
//             case 6:
//                 text = "Autumn";
//                 break;
//              // Двеннадцать месяцев
//             default:
//                 text = "mistake";
//                 break;
//         }
//         System.out.println(text);
//         iScanner.close();
//     }
// }

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         int a = 123;
//         int b = 5;
//         switch (a) {
//             case 1:
//             case 2:
//             case 3:
//             case 4:
//             case 5:
//                 System.out.println("a");
//                 break;
//             case 10:
//                 System.out.println("b");
//                 break;

//             default:
//                 text = "mistake";
//                 break;
//         }
//         System.out.println(text);
//         // iScanner.close();
//     }
// }
//______________________________
//Циклы while
// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         while (value != 0) {
//             value /= 10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }

//Циклы do while
// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         do {
//             value /= 10;
//             count++;
//         } while (value != 0);
//         System.out.println(count);
//     }
// }
//_________________________________________________
//Оператры цикла for
// public class program {
//     public static void main(String[] args) {

//         int s = 0;
//         for (int i = 1; i <= 10; i++) {
//             s += i;
//         }
//         System.out.println(s);
//     }
// }
//Оператры цикла continue , break
// public class program {
//     public static void main(String[] args) {

        
//         for (int i = 0; i <= 10; i++) {
//             if (i % 2 == 0) {
//                 continue;
//             }

//             System.out.println(i);// выводит не четные числа
//         }
        
//     }
// }
// public class program {
//     public static void main(String[] args) {

        
//         for (int i = 0; i <= 10; i++) {
//             if (i % 2 != 0) {
//                 continue;
//             }

//             System.out.println(i);// выводит четные числа
//         }
        
//     }
// }
// public class program {
//     public static void main(String[] args) {

        
//         for (int i = 0; i <= 10; i++) {
//             if (i % 2 == 0) {
//                 break;
//             }

//             System.out.println(i);// выводит четные числа
//         }
        
//     }
// }
//___________________________________________________
//Вложенные циклы
// public class program {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         // * * * * *
//         // * * * * *
//         // * * * * *
//         // * * * * *
//         // * * * * *
//     }
// }
//____________________________________________
// for:
// работает только для коллекций
// public class program {
//     public static void main(String[] args) {

//         int arr[] = new int[10];
//         for (int item : arr) {
//             System.out.printf("%d ", item);
//         }
//         System.out.println();
//     }
// }
// public class program {
//     public static void main(String[] args) {

//         int arr[] = new int[] {1, 2, 3, 4, 5, 77};
//         for (int item : arr) {
//             System.out.printf("%d ", item);
//         }
//         System.out.println();
//     }
// }
// _______________________________________
// Работа с файлами. Запись дозапись
// import java.io.FileWriter;
// import java.io.IOException;
// public class program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     } }

// Работа с файлами. Чтение, Вариант посимвольно
import java.io.*;
public class Program {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
    } }

// Работа с файлами. Чтение, Вариант построчно
//     import java.io.*;

// public class Program {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//         String str;
//         while ((str = br.readLine()) != null) {
//             System.out.printf("== %s ==\n", str);
//         }
//         br.close();
//     }
// }







 
