package assignments.diamond_ex;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by RachelSmith on 14/09/2016.
 */
public class DiamondTests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }


    @Test
    public void printCentredTriangleOfGivenHeightOf3() throws Exception {
        String testAnswer =
                        "  *\n"
                        + " ***\n"
                        + "*****\n";
        new Diamond().centredTriangle(3);
        assertEquals(testAnswer, outContent.toString());
    }


    @Test
    public void printCentredTriangleOfGivenHeightOf5() throws Exception {
        String testAnswer =
                "   *\n"
                        + "  ***\n"
                        + " *****\n"
                        + "*******\n";
        new Diamond().centredTriangle(5);
        assertEquals(testAnswer, outContent.toString());
    }

    @Test
    public void printCentredTriangleOfGivenHeightOf7() throws Exception {
        String testAnswer =
                "    *\n"
                        + "   ***\n"
                        + "  *****\n"
                        + " *******\n"
                        + "*********\n";
        new Diamond().centredTriangle(7);
        assertEquals(testAnswer, outContent.toString());
    }

    @Test
    public void printDiamondWithGivenNumber3() throws Exception {
        String testAnswer =
                "  *\n"
                        + " ***\n"
                        + "*****\n"
                        + " ***\n"
                        + "  *\n";
        new Diamond().diamondCenteredOver(3);
        assertEquals(testAnswer, outContent.toString());
    }

}
