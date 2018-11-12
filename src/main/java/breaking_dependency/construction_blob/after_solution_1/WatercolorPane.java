package breaking_dependency.construction_blob.after_solution_1;


/**
 *  Extract and Override Factory Method
 */
public class WatercolorPane {
    private FocusWidget cursor;

    /**
     * We can use CursorFactory.createCursor to create cursor
     * @param cursor
     */
    public WatercolorPane(FocusWidget cursor){
        this.cursor = cursor;
    }

}
