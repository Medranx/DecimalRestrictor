/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecimalRestrictorPackage;

import javax.swing.*;
import javax.swing.text.*;

/**
 *
 * @author tduffy
 */
public class JRegExField extends JTextField {
    private String exp;

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
        setDocument(new RegExDocument(exp));
    }
    
    public JRegExField(){
        super();
    }
    
    public JRegExField(String exp){
        this.exp = exp;
    }
    
    protected Document createDefaultModel(){
        return new RegExDocument(exp);
    }
}
