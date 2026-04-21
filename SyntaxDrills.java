public class SyntaxDrills {
    public static void main(String[] args) {
    int amount = 1; String word = "word"; Boolean bool = false;
    // int 21stInt = 21; //names can't start with a digit
    // String citation-1 = "I'm busy, do not disturb me"; //hyphens are prohibited
    // char (r) = 'r'; //name contains special characters, which are not allowed

    int score = 1; int Score = 2; int SCORE = 3;
    System.out.println("score: " + score);
    System.out.println("Score: " + Score);
    System.out.println("SCORE: " + SCORE);

    final int MAX = 100;
    //MAX = 200; //can't assign a value to final variable

    float f = 10.5f; //Java treats decimals as double unless "f" is added

    char c = 'A'; String s = "A";
    //s = 'A'; c = "A"; //char cannot be assigned to String and vice versa

    int a = 10; int b = 3;
    double divide = a/b;
    System.out.println("Truncated result: " + divide); // a/b is integer division → 3, then converted to 3.0

    byte small = 5; long big = small;
    System.out.println("Widened value: " + big);
    //small = big; //byte to long allowed, vice versa - no

    double d = 9.99; int narrowed = (int) d;
    System.out.println("Narrowed value: " + narrowed); //no rounding, decimal is truncated

    int num = 157;
    int remainder = num % 2;
        System.out.println("Remainder: " + remainder);
        if (remainder == 0)
        {
        System.out.println("Even");
    }
        else
    {
        System.out.println("Odd");
    } // % shows what's lest after dividing

        System.out.println("1\t2\t3\n4\t5\t6\n7\t8\t9"); // \t = big space, \n = new line

    int[] arr = new int[3];
    arr[0] = 1; arr[1] = 2; arr[2] = 3; //since numeration starts with 0, index 3 simply doesn't exist in the array of size 3

    int[] favNumbers = {7, 12, 37, 42, 50};
    System.out.println("First: " + favNumbers[0]);
    System.out.println("Last: " + favNumbers[favNumbers.length - 1]);
}
}
