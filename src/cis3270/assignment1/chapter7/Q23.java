package cis3270.assignment1.chapter7;

public class Q23 {
    public static void main(String[] args) {
        boolean lockerOpen[] = new boolean[101];
        for (int i = 0; i < lockerOpen.length; i++) {
            lockerOpen[i] = false;
        }

        for (int s = 1; s <= 100; s++) {
            lockerOpen = student(s, lockerOpen);
        }

        for (int i = 1; i < lockerOpen.length; i++) {
            if (lockerOpen[i] == true) {
                System.out.print("L" + i + " ");
            }
        }
    }

    public static boolean[] student(int studentNum, boolean[] locker) {
        for (int s = studentNum - 1; s < locker.length; s += studentNum) {
            if (locker[s] == false)
                locker[s] = true;
            else if (locker[s] == true)
                locker[s] = false;
        }
        return locker;
    }

}
