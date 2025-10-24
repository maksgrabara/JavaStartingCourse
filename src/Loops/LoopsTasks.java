package Loops;

public class LoopsTasks {
    public static void main(String[] args) {

//        int i;
//
//        for(i = 0; i <= 30; i++){
//
//            System.out.println(i);
//
//        }
//
//        for(i = 30; i >= 0; i--){
//
//            System.out.println(i);
//
//        }
//
//        for(i = 0; i <= 30; i++){
//
//            if(i % 2 == 0) System.out.println(i);
//
//        }
//
//        int a = 10, b = 20;
//
//        for(int i2 = a; i2 <= b; i2++){
//
//            System.out.println(i2);
//
//        }
//
//        int[] tab = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int i3 = 0;
//
//        for(i3 = 0; i3 < tab.length; i3++){
//
//            System.out.println(tab[i3]);
//
//        }
//
//        for(i3 = tab.length - 1; i3 > 0; i3--){
//
//            System.out.println(tab[i3]);
//
//        }
//
//        int sum = 0;
//
//        for(i3 = 0; i3 < tab.length; i3++){
//
//            sum += tab[i3];
//
//        }
//
//        System.out.println(sum);
//
//        int factorial = 6, output = 1;
//
//        while(factorial > 0){
//
//            output *= factorial;
//            factorial--;
//
//        }
//
//        System.out.println(output);

        int n = 5;

//        for(int i4 = 0; i4 < n ; i4++){
//
//            for(int i5 = 0; i5 <= i4; i5++){
//
//                System.out.print("*");
//
//            }
//
//            System.out.println();
//
//        }
//
//        for(int i6 = 0; i6 < n; i6++){
//
//            for(int i7 = 0; i7 < n; i7++){
//
//                if(n - i6 - 1 <= i7) System.out.print("*");
//                else System.out.print(" ");
//
//            }
//
//            System.out.println();
//
//        }

        for(int i7 = 0; i7 < n; i7++){

            for(int i8 = 0; i8 < n - 1; i8++){

                if(n - i7 - 1 <= i8) System.out.print("*");
                else System.out.print(" ");

            }

            System.out.print("*");

            for(int i8 = n; i8 < (2 * n) - 1; i8++){

                if(n + i7 - 1 >= i8) System.out.print("*");
                else System.out.print(" ");

            }

            System.out.println();

        }

    }
}
