/*9.Write a java program to display your initials on the screen in block letters as shown.*/
public class Initials {
    public static void main(String[] args) {
        printInitialS();
        printInitialT();
    }

    public static void printInitialS() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if ((i == 1 || i == 4 || i == 7) || (i < 4 && j == 1) || (i > 4 && j == 7)) {
                    System.out.print("S");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printInitialT() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || j == 4) {
                    System.out.print("T");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
