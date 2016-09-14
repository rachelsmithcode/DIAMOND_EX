package assignments.diamond_ex;

/**
 * Created by RachelSmith on 14/09/2016.
 */
public class Diamond {


    public void centredTriangle(int n) {

        int i = 1;
        int allign = calcSpace(i, n);

        while (i <= (n+2)) {
            buildLine(allign, i);
            i += 2;
            allign -= 1;
        }

    }


    public void diamondCenteredOver(int n) {

        int i = 1;
        int allign = calcSpace(i, n);

        while (i < (n+2)) {
            buildLine(allign, i);
            i += 2;
            allign -= 1;
        }

        while (i > 0) {
            buildLine(allign, i);
            i -= 2;
            allign += 1;
        }

    }


    private int calcSpace(int i, int n) {
        return (n + 1) / 2;
    }


    private void buildLine(int allign, int i) {
        if (allign > 0) {
            System.out.println(makeSpace(allign) + horizontalLine(i));
        } else {
            System.out.println(horizontalLine(i));
        }
    }

    private String makeSpace(int n) {
        return new String(new char[n]).replace("\0", " ");
    }

    private String horizontalLine(int n) {
        return new String(new char[n]).replace("\0", "*");
    }


}
