package seam.example1;


import seam.Cell;
import seam.Spreadsheet;

/**
 * Is the call to cell.recalculate in buildMartSheet a seam ? Yes.
 * We can create a CustomSpreadsheet in a test and call buildMartSheet with whatever kind of Cell we want to use.
 * We’ll have ended up varying what the call to cell.recalculate does without changing the method that calls it.
 */
public class CustomSpreadsheet extends Spreadsheet {

    public Spreadsheet buildMartSheet(Cell cell) {
        // ....
        cell.recalculate();
        // ....
        return null;
    }
}
