public class Rectangle {

    public void rectangle() {

        for (int i = 0; i < 4; i++) {         //rows
            for (int s = 0; s < 10; s++) {   //spaces
                System.out.print(" ");
            }
            for (int j = 0; j < 4; j++) {    //column
                System.out.print(" *");
            }
            System.out.println();            //next row
        }
    }
}

