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


    private int calcSpace(int i, int n) {
        return (n + 1) / 2;
    }


    private void buildLine(int allign, int i) {
        if (allign > 0) {
            System.out.println(makeSpace(allign) + horizontalLine(i));
        }else {
            System.out.println(horizontalLine(i));
        }
    }

    private String makeSpace(int n) {

        String space = new String(new char[n]).replace("\0", " ");
        return space;
    }

    private String horizontalLine(int n) {

        String line = new String(new char[n]).replace("\0", "*");
        return line;
    }


}
