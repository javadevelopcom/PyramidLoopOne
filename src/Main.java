public class Main {

    public static void main(String[] args) {

        PyramidOne p1 = new PyramidOne();
        PyramidTwo p2 = new PyramidTwo();
        PyramidThree p3 = new PyramidThree();
        PyramidFour p4 = new PyramidFour();
        PyramidFive p5 = new PyramidFive();
        PyramidSix p6 = new PyramidSix();
        Rectangle r = new Rectangle();
        ForwardSlash fs = new ForwardSlash();
        Triangle tr = new Triangle();
        Rhomb rh = new Rhomb();
        RhombInverted ri = new RhombInverted();


        p1.pyramidOne();
        System.out.println();

        r.rectangle();
        System.out.println();

        p2.pyramidTwo();

        p3.pyramidThree();
        System.out.println();

        p4.pyramidFour();
        System.out.println();

        p5.pyramidFive();

        p6.pyramidSix();
        System.out.println();

        fs.forwardSlash();
        System.out.println();

        tr.triangle();
        System.out.println();

        rh.rhomb();
        System.out.println();

        ri.rhombInvert();
        System.out.println();


//         BONUS:    Christmas tree / fir-tree

        System.out.println(" HAPPY Xmas");
        tr.triangle();
        System.out.println("   | |");
    }
}


