public class ForwardSlash {

    public void forwardSlash() {

        for (int i = 0; i < 5; i++) {            //rows 0, 1, 2, 3, 4
            for (int s = i; s < 4; s++) {        //space " "
                System.out.print(" ");
            }
            for (int j = 0; j <= 1; j++) {         //*
                System.out.print("*");
            }
            System.out.println();                 //next row
        }
    }
}
