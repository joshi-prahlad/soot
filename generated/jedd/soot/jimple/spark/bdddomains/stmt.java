package soot.jimple.spark.bdddomains;

import jedd.*;
import soot.*;
import soot.jimple.spark.pag.*;

public class stmt extends Attribute {
    public Numberer numberer() { return Scene.v().getUnitNumberer(); }
    
    public static Attribute v() { return stmt.instance; }
    
    private static Attribute instance = new stmt();
    
    public stmt() { super(); }
}