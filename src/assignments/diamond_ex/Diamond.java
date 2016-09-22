package assignments.diamond_ex;

/**
 * Created by RachelSmith on 14/09/2016.
 */
public class Diamond {

    public static void main (String[] args) {
        new Diamond().runExamples();
    }

    public void runExamples() {
        System.out.println("Given a number n, print a centered triangle. Example for n=3\n");
        new Diamond().centredTriangle(3);
        System.out.println("\nGiven a number n, print a centered diamond. Example for n=3\n");
        new Diamond().diamondCenteredOverStars(3);
        System.out.println("\nGiven a number n, print a centered diamond with your name in place of the middle line. Example for n=3\n");
        new Diamond().diamondCenteredOverName(3);
    }


    public void diamondCenteredOverStars(int n) {

        centredTriangle(n);
        makeBottomTriangle(n);

    }

    public void diamondCenteredOverName(int n) {

        centredTriangleWithName(n);
        makeBottomTriangle(n);

    }

    public void centredTriangle(int n) {

        int i = 1;
        int allign = calcSpace(i, n);

        makeTopTriangle(i, n, allign);
        makeCenterLine(n);


    }

    private void centredTriangleWithName(int n) {

        int i = 1;
        int allign = calcSpace(i, n);

        makeTopTriangle(i, n, allign);
        System.out.println("Rachel");


    }


    private int calcSpace(int i, int n) {
        return (n + 1) / 2;
    }


    private void buildLine(int allign, int i) {
            System.out.println(makeSpace(allign) + horizontalLine(i));
    }

    private void makeTopTriangle(int i, int n, int allign) {
        while (i < (n+2)) {
            buildLine(allign, i);
            i += 2;
            allign -= 1;
        }

    }

    private void makeBottomTriangle(int n) {
        int allign = 1;

        while (n > 0) {
            buildLine(allign, n);
            n -= 2;
            allign += 1;
        }
    }

    private void makeCenterLine(int n) {

            n += 2;
            System.out.println(horizontalLine(n));
    }


    private String makeSpace(int n) {
        return new String(new char[n]).replace("\0", " ");
    }

    private String horizontalLine(int n) {
        return new String(new char[n]).replace("\0", "*");
    }


}
