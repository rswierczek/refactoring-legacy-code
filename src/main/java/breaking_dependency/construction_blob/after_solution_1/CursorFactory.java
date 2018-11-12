package breaking_dependency.construction_blob.after_solution_1;

public class CursorFactory {
    private CursorFactory() {
    }

    public static FocusWidget createCursor(Form border, WashBrush brush, Pattern backdrop) {
        Panel anteriorPanel = new Panel(border);
        anteriorPanel.setBorderColor(brush.getForeColor());
        Panel backgroundPanel = new Panel(border, backdrop);
        return new FocusWidget(brush, backgroundPanel);
    }
}