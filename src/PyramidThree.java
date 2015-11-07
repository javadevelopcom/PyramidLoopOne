public class PyramidThree {

    public void pyramidThree() {

        for (int i = 0; i < 4; i++) {      //rows
            for (int s = 0; s < 1; s++) {  //spaces
                System.out.print(" ");
            }
            for (int j = i; j < 4; j++) { //* columns
                System.out.print("* ");
            }
            System.out.println();           //next row
        }
    }
}
