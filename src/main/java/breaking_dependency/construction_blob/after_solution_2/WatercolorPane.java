package breaking_dependency.construction_blob.after_solution_2;


/**
 * Supersede Instance Variable
 */
public class WatercolorPane {
    private FocusWidget cursor;


    public WatercolorPane(Form border, WashBrush brush, Pattern backdrop){
        Panel anteriorPanel = new Panel(border);
        anteriorPanel.setBorderColor(brush.getForeColor());
        Panel backgroundPanel = new Panel(border, backdrop);
        /*
            If we want to sense through the cursor, we are in trouble. The cursor object
            is embedded in a blob of object creation.
         */
        cursor = new FocusWidget(brush, backgroundPanel);
    }

    /**
     * Supersede Instance Variable for test
     * @param cursor
     */
    void setCursor(FocusWidget cursor) {
        this.cursor = cursor;
    }
}
