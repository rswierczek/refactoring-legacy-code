package breaking_dependency.construction_blob.before;

public class WatercolorPane {
    private Panel anteriorPanel;
    private Panel backgroundPanel;
    private FocusWidget cursor;

    public WatercolorPane(Form border, WashBrush brush, Pattern backdrop){
        anteriorPanel = new Panel(border);
        anteriorPanel.setBorderColor(brush.getForeColor());
        backgroundPanel = new Panel(border, backdrop);
        cursor = new FocusWidget(brush, backgroundPanel);
    }
}
