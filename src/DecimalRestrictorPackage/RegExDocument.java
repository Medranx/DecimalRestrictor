/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecimalRestrictorPackage;

import javax.swing.text.*;
import java.util.regex.*;
import java.swing.text.*

public class RegExDocument extends PlainDocument {
    private String exp;
    private Pattern pattern;
    private Matcher matcher;
    
    public RegExDocument(String exp){
        if(exp == null){
            exp = "\\.*";
        }
        this.exp = exp;
        pattern = Pattern.compile(exp);
    }
    
    public boolean validate(String str){
        matcher = pattern.matcher(str);
        return matcher.matches();
    }
    
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
        StringBuilder sb = new StringBuilder(getText(0,getLength()));
        sb.insert(offs, str);
        if(validate(sb.toString()))
            super.insertString(offs, str, a);
    }
}
