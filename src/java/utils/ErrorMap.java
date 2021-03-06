/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import java.util.HashMap;

public class ErrorMap extends HashMap<String, ArrayList<String>> {
    public void addError(String name, String error) {
        ArrayList<String> errors = get(name);
        if(errors == null) {
            errors = new ArrayList<String>();
            put(name, errors);
        }
        
        errors.add(error);
        
    }
    
    public void removeErrors(String name) {
        this.remove(name);
    }
    
    public boolean hasErrors() {
        return size() > 0;
    }
}
