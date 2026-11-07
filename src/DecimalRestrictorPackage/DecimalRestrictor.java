/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DecimalRestrictorPackage;

/**
 *
 * @author medrano.
 */
public class JDecimalField extends JRegExField {
    public JDecimalField() {
        super();
        setExp("-?[0-9]*(\\.[0-9]*)?");
    }

    public JDecimalField(int columns) {
        this();
        setColumns(columns);
    }

    public double getValue() throws NumberFormatException {
        return Double.parseDouble(getText());
    }
}
