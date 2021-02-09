package classproject;

// While loop
public class P19_LoopPractice {
    public static void main(String[] args) {

//      # GENERAL LOOP
//    int i = 0;
//    while (i < 5) {
//      System.out.println(i);
//      i++;
//    }  
        
        
//        #  Program to print half pyramid using *
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        #  Program to print Inverted half pyramid using *
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println(); // Line Devider to two program 

//      # Program to print Inverted half pyramid a using numbers
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
          
        }

        //      # Program to print half pyramid a using numbers
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

//       # Program to print full Inverted pyramid using *
        int rows = 5, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }

        //       # Program to print full down pyramid using *
        for (int i = 4; i >= 1; --i) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            for (int j = i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for (int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }

   //  # Program to print half pyramid using alphabets
        char last = 'E', alphabet = 'A';

        for (int i = 1; i <= (last - 'A' + 1); ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(alphabet + " ");
            }
            ++alphabet;

            System.out.println();
        }

        System.out.println(); // For space to Programm 
        

        //     # Program to print pyramid using numbers
        // int rows = 5, k = 0,
        int count = 0, count1 = 0;

        for (int i = 1; i <= rows; ++i) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
                ++count;
            }

            while (k != 2 * i - 1) {
                if (count <= rows - 1) {
                    System.out.print((i + k) + " ");
                    ++count;
                } else {
                    ++count1;
                    System.out.print((i + k - 2 * count1) + " ");
                }

                ++k;
            }
            count1 = count = k = 0;

            System.out.println();
        }

        System.out.println(); //For Space
        
        

        //   # Print Floyd's Triangle.
        int r = 4,
                number = 1;

        for (int i = 1; i <= r; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                ++number;
            }

            System.out.println();
        }

       System.out.println(); // For space 
        
}
}
