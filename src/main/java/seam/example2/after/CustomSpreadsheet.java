package seam.example2.after;


import seam.Cell;
import seam.Spreadsheet;

/**
 * The Recalculate method is a static method. Is the call to recalculate in
 * buildMartSheet a seam? Yes. We don’t have to edit buildMartSheet to change
 * behavior at that call. If we delete the keyword static on Recalculate and make
 * it a protected method instead of a private method, we can subclass and override it during test
 *
 * Isn’t this all rather indirect? If we don’t like a dependency, why don’t we just
 * go into the code and change it? Sometimes that works, but in particularly nasty
 * legacy code, often the best approach is to do what you can to modify the code
 * as little as possible when you are getting tests in place.
 */
public class CustomSpreadsheet extends Spreadsheet {

    public Spreadsheet buildMartSheet(Cell cell) {
        // ....
        recalculate(cell);
        // ....
        return null;
    }

    protected void recalculate(Cell cell){

    }
}
