public class PyramidOne {

    public void pyramidOne() {

        for (int i = 0; i < 5; i++) {      //rows
            for (int s = i; s < 4; s++) {  //spaces
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { //*
                System.out.print("* ");
            }
            System.out.println();           //next row
        }
    }
}
