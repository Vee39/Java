package C16Tests;

public class Fibonacci {
    public static void main(String[] args) {
//        int a = 0;
//        int b = 1;
//        System.out.printf("%d %d ", a, b);
//        for(int i = 0; i <= 10; i++){
//            int c = a + b;
//            a = b;
//            b = c;
//            System.out.print(c+" ");
//        }

//       for(int i = 1; i <= 10; i++){
//           if (i == 5) {
//               continue;
//           }
//           System.out.println(i);
//       }

        int a = 0;
        int b = 1;
        System.out.printf("%d %d ",a,b);
        for (int i = 0; i <= 5; i++){
            int c = a + b;
            System.out.printf("%d ",c);
            a = b;
            b = c;
        }


            }
        }




