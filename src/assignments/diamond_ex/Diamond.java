package assignments.diamond_ex;

/**
 * Created by RachelSmith on 14/09/2016.
 */
public class Diamond {

    public void horizontalLine(int n) {

        String line = new String(new char[n]).replace("\0", "*");
        System.out.println(line);
    }
}
