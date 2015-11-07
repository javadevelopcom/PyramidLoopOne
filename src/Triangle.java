public class Triangle {

    public void triangle() {

        for (int i = 0; i < 5; i++) {       //rows
            for (int s = i; s < 4; s++) {   //spaces
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {  //column
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {   //column
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
