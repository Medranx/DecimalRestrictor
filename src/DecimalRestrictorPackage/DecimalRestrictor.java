/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DecimalRestrictorPackage;

/**
 *
 * @author medrano.
 */
public class DecimalRestrictor extends JRegExField {

    public DecimalRestrictor() {
        super();
        setExp("-?[0-9]*\\.?[0-9]*");   
    }

    public double getValue() {
        return Double.parseDouble(getText());
    }
}