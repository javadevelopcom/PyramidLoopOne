public class PyramidSix {

    public void pyramidSix() {

        for (int i = 0; i < 5; i++) {            //rows 0, 1, 2, 3, 4
            for (int s = 0; s < i; s++) {        //space " "
                System.out.print(" ");
            }
            for (int j = i; j < 5; j++) {         //*
                System.out.print("*");
            }
            System.out.println();                 //next row
        }
    }
}
