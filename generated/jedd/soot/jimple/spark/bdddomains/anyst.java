package soot.jimple.spark.bdddomains;

import jedd.*;
import soot.*;
import soot.jimple.spark.pag.*;

public class anyst extends Attribute {
    public Numberer numberer() { return Scene.v().getTypeNumberer(); }
    
    public static Attribute v() { return anyst.instance; }
    
    private static Attribute instance = new anyst();
    
    public anyst() { super(); }
}