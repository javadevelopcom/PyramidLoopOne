public class PyramidTwo {

    public void pyramidTwo() {

        for (int i = 0; i < 5; i++) {      //rows
            for (int j = 0; j <= i; j++) { //*
                System.out.print(" *");
            }
            System.out.println();           //next row
        }
    }
}
