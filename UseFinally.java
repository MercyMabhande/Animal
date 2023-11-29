import java.lang.reflect.Array;

public class UseFinally {
    public static void generateException(int what) {
        int t;
        int numbers[] = new int[2];
        System.out.println("Input value" + what);
        try {
            switch (what) {
                case 0:
                    t = 10 / what; //generates a divide by zero exception
                    break;
                case 1:
                    numbers[4] = 4;//generates an array index exception
                    break;
                case 2:
                    return;//return from a try block
            }
        } catch (ArithmaticException e) {
            //catches the exception
            System.out.println("You cannot divide by zero");
            return; //return from catch
        } catch (ArrayIndexOutOfBoundsException e) {
            //catches the exception
            System.out.println("There is no such index in the array");
        } finally {//executed after the try / catch the block has finished
            System.out.println("These code will always be used");

        }

    }
}