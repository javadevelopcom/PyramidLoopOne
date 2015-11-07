public class Rhomb {

    public void rhomb() {

        // #1 block

        for (int i = 0; i < 5; i++) {
            for (int s = i; s < 4; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            // #2 block

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // #3 block

        for (int i = 0; i < 4; i++) {
            for (int s = 0; s <= i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j < 4; j++) {
                System.out.print("*");
            }

            // #4 block

            for (int j = i; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
