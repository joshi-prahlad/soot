package soot.jimple.spark.bdddomains;

import jedd.*;
import soot.*;
import soot.jimple.spark.pag.*;

public class src extends Attribute {
    public Numberer numberer() { return ((BDDPAG) Scene.v().getPointsToAnalysis()).getVarNodeNumberer(); }
    
    public static Attribute v() { return src.instance; }
    
    private static Attribute instance = new src();
    
    public src() { super(); }
}