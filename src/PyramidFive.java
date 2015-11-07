public class PyramidFive {

    public void pyramidFive() {

        for (int i = 0; i < 5; i++) {            //rows 0, 1, 2, 3, 4
            for (int s = i; s < 4; s++) {        //space " "
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {         //*
                System.out.print("*");
            }
            System.out.println();                 //next row
        }
    }
}
