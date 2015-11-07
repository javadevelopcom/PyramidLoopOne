public class PyramidFour {

    public void pyramidFour() {

        for (int i = 0; i < 5; i++) {      //rows
            for (int j = i; j < 5; j++) { //* columns
                System.out.print(" *");
            }
            System.out.println();           //next row
        }
    }
}
