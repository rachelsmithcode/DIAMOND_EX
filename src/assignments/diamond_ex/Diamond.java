package assignments.diamond_ex;

/**
 * Created by RachelSmith on 14/09/2016.
 */
public class Diamond {

    boolean nameGiven = true;
    String name;

    public Diamond() {
        nameGiven = false;
    }

    public Diamond(String n) {
        setName(n);
    }

    private void setName(String n) {
        name = n;
    }


    public void diamondCenteredOver(int n) {

        centredTriangle(n);
        makeBottomTriangle(n);

    }

    public void centredTriangle(int n) {

        int i = 1;
        int allign = calcSpace(i, n);

        makeTopTriangle(i, n, allign);
        makeCenterLine(n);


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
        if (nameGiven) {
            System.out.println(name);
        } else {
            n += 2;
            System.out.println(horizontalLine(n));
        }
    }

    private String makeSpace(int n) {
        return new String(new char[n]).replace("\0", " ");
    }

    private String horizontalLine(int n) {
        return new String(new char[n]).replace("\0", "*");
    }


}
