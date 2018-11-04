package seam.example2.after;

import org.junit.jupiter.api.Test;
import seam.Cell;

import static org.junit.jupiter.api.Assertions.*;

class CustomSpreadsheetTest {
    @Test
    public void testBuildMartSheet(){
        TestingCustomSpreadsheet testingCustomSpreadsheet = new TestingCustomSpreadsheet();
        testingCustomSpreadsheet.buildMartSheet(new Cell());
    }

}