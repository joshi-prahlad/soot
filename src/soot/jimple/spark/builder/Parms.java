/* Soot - a J*va Optimization Framework
 * Copyright (C) 2002 Ondrej Lhotak
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

package soot.jimple.spark.builder;
import soot.jimple.spark.*;
import soot.jimple.spark.pag.*;
import soot.*;
import soot.jimple.*;
import java.util.*;
import soot.jimple.toolkits.callgraph.*;

/** Generic interface to a class implementing builder parameters (this decides
 * what kinds of nodes should be built for each kind of Soot value).
 * @author Ondrej Lhotak
 */
public interface Parms {
    /** Build the edges for the statement s. */
    public void handleStmt( Stmt s );
    /** Add an edge from node from to node to. */
    public void addEdge( Node from, Node to );
    /** Node for the argv array parameter to main. */
    public Node caseArgv();
    /** Node for the main thread of the program, created by the VM. */
    public Node caseMainThread();
    /** Node for the main ThreadGroup of the program, created by the VM. */
    public Node caseMainThreadGroup();
    /** Node for the default ClassLoader, created by the VM. */
    public Node caseDefaultClassLoader();
    /** Node for the String holding the name of the main class, created by
     * the VM and passed to the class loader. */
    public Node caseMainClassNameString();
    /** This node for method m. */
    public Node caseThis( SootMethod m );
    /** Node for index'th parameter of method m. */
    public Node caseParm( SootMethod m, int index );
    /** Return node for method m. */
    public Node caseRet( SootMethod m );
    /** Node for elements of array base of type arrayType. */
    public Node caseArray( Object base, ArrayType arrayType );
    /** Adds a possible target of a call site. */
    public void addCallTarget( Edge e );
    /** Adds a possible target of a call site. */
    public void addCallTarget( Stmt s, SootMethod target, Object varNodeParameter );
}
