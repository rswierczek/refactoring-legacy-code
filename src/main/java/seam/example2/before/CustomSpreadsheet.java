package seam.example2.before;


import seam.Cell;
import seam.Spreadsheet;

/**
 * Is the call to recalculate in buildMartSheet a seam? Yes. We can subclass and override it during test
 */
public class CustomSpreadsheet extends Spreadsheet {

    public Spreadsheet buildMartSheet(Cell cell) {
        // ....
        recalculate(cell);
        // ....
        return null;
    }

    private static void recalculate(Cell cell){

    }
}
