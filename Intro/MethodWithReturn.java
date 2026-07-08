package Intro;

public class MethodWithReturn {

    public static int numSquared(int numToBeSquared) {
        return numToBeSquared * numToBeSquared;
    }

    public static void main(String[] args) {
        int num = 4;

        int squaredNumber = numSquared(num);
        System.out.println(num + " squared is " + squaredNumber);
    }
}