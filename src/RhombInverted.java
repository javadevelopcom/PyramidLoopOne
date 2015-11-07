public class RhombInverted {

    public void rhombInvert() {
// #1
        int k;
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("*");
            }
            for (int s = 1; s <= i; s++) {
                System.out.print(" ");
            }
            for (int s = 2; s <= i; s++) {
                System.out.print(" ");
            }
            if (i == 0) {
                k = 0;
            } else {
                k = i - 1;
            }
            do {
                System.out.print("*");
                k++;
            }
            while (k < 4);
            System.out.println();
        }
// #2
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int s = i; s < 4; s++) {
                System.out.print(" ");
            }
            for (int s = i; s < 3; s++) {
                System.out.print(" ");
            }
            if (i == 4) {
                k = 1;
            } else {
                k = 0;
            }
            do {
                System.out.print("*");
                k++;
            } while (k <= i);
            System.out.println();
        }
    }
}
