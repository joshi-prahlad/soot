package soot.JastAddJ;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.io.File;
import java.util.*;
import beaver.*;
import java.util.ArrayList;
import java.util.zip.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Collection;
import soot.*;
import soot.util.*;
import soot.jimple.*;
import soot.coffi.ClassFile;
import soot.coffi.method_info;
import soot.coffi.CONSTANT_Utf8_info;
import soot.tagkit.SourceFileTag;
import soot.coffi.CoffiMethodSource;


/**
 * @ast node
 * @declaredat Generics.ast:6
 */
public class ParClassDecl extends ClassDecl implements Cloneable, ParTypeDecl, MemberSubstitutor {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    involvesTypeParameters_visited = -1;
    involvesTypeParameters_computed = false;
    involvesTypeParameters_initialized = false;
    erasure_computed = false;
    erasure_value = null;
    getSuperClassAccessOpt_computed = false;
    getSuperClassAccessOpt_value = null;
    getImplementsList_computed = false;
    getImplementsList_value = null;
    getBodyDeclList_computed = false;
    getBodyDeclList_value = null;
    subtype_TypeDecl_values = null;
    sameStructure_TypeDecl_values = null;
    instanceOf_TypeDecl_values = null;
    sameSignature_ArrayList_values = null;
    usesTypeVariable_visited = -1;
    usesTypeVariable_computed = false;
    usesTypeVariable_initialized = false;
    sourceTypeDecl_computed = false;
    sourceTypeDecl_value = null;
    fullName_computed = false;
    fullName_value = null;
    typeName_computed = false;
    typeName_value = null;
    unimplementedMethods_computed = false;
    unimplementedMethods_value = null;
    localMethodsSignatureMap_computed = false;
    localMethodsSignatureMap_value = null;
    localFields_String_values = null;
    localTypeDecls_String_values = null;
    constructors_computed = false;
    constructors_value = null;
    genericDecl_computed = false;
    genericDecl_value = null;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ParClassDecl clone() throws CloneNotSupportedException {
    ParClassDecl node = (ParClassDecl)super.clone();
    node.involvesTypeParameters_visited = -1;
    node.involvesTypeParameters_computed = false;
    node.involvesTypeParameters_initialized = false;
    node.erasure_computed = false;
    node.erasure_value = null;
    node.getSuperClassAccessOpt_computed = false;
    node.getSuperClassAccessOpt_value = null;
    node.getImplementsList_computed = false;
    node.getImplementsList_value = null;
    node.getBodyDeclList_computed = false;
    node.getBodyDeclList_value = null;
    node.subtype_TypeDecl_values = null;
    node.sameStructure_TypeDecl_values = null;
    node.instanceOf_TypeDecl_values = null;
    node.sameSignature_ArrayList_values = null;
    node.usesTypeVariable_visited = -1;
    node.usesTypeVariable_computed = false;
    node.usesTypeVariable_initialized = false;
    node.sourceTypeDecl_computed = false;
    node.sourceTypeDecl_value = null;
    node.fullName_computed = false;
    node.fullName_value = null;
    node.typeName_computed = false;
    node.typeName_value = null;
    node.unimplementedMethods_computed = false;
    node.unimplementedMethods_value = null;
    node.localMethodsSignatureMap_computed = false;
    node.localMethodsSignatureMap_value = null;
    node.localFields_String_values = null;
    node.localTypeDecls_String_values = null;
    node.constructors_computed = false;
    node.constructors_value = null;
    node.genericDecl_computed = false;
    node.genericDecl_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ParClassDecl copy() {
      try {
        ParClassDecl node = (ParClassDecl)clone();
        if(children != null) node.children = (ASTNode[])children.clone();
        return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
  }
  /**
   * @apilevel low-level
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ParClassDecl fullCopy() {
    ParClassDecl res = (ParClassDecl)copy();
    for(int i = 0; i < getNumChildNoTransform(); i++) {
      ASTNode node = getChildNoTransform(i);
      if(node != null) node = node.fullCopy();
      res.setChild(node, i);
    }
    return res;
    }
  /**
   * @ast method 
   * @aspect GenericsNameBinding
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:527
   */
  public void collectErrors() {
    // Disable error check for ParClassDecl which is an instanciated GenericClassDecl
  }
  /**
   * @ast method 
   * @aspect GenericsPrettyPrint
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/GenericsPrettyPrint.jrag:34
   */
  public void toString(StringBuffer s) {
      getModifiers().toString(s);
      s.append("class " + getID());
      s.append('<');
      if (getNumArgument() > 0) {
	  getArgument(0).toString(s);
	  for (int i = 1; i < getNumArgument(); i++) {
	      s.append(", ");
	      getArgument(i).toString(s);
	  }
      }
      s.append('>');
      if(hasSuperClassAccess()) {
	  s.append(" extends ");
	  getSuperClassAccess().toString(s);
      }
      if(getNumImplements() > 0) {
	  s.append(" implements ");
	  getImplements(0).toString(s);
	  for(int i = 1; i < getNumImplements(); i++) {
	      s.append(", ");
	      getImplements(i).toString(s);
	  }
      }
      ppBodyDecls(s);
  }
  /**
   * @ast method 
   * @declaredat Generics.ast:1
   */
  public ParClassDecl() {
    super();

    setChild(new List(), 1);
    setChild(new Opt(), 2);
    setChild(new List(), 3);
    setChild(new List(), 4);

  }
  /**
   * @ast method 
   * @declaredat Generics.ast:11
   */
  public ParClassDecl(Modifiers p0, String p1, List<Access> p2) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(new Opt(), 2);
    setChild(new List(), 3);
    setChild(new List(), 4);
  }
  /**
   * @ast method 
   * @declaredat Generics.ast:19
   */
  public ParClassDecl(Modifiers p0, beaver.Symbol p1, List<Access> p2) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(new Opt(), 2);
    setChild(new List(), 3);
    setChild(new List(), 4);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat Generics.ast:30
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   * @ast method 
   * @declaredat Generics.ast:36
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /**
   * Setter for Modifiers
   * @apilevel high-level
   * @ast method 
   * @declaredat java.ast:5
   */
  public void setModifiers(Modifiers node) {
    setChild(node, 0);
  }
  /**
   * Getter for Modifiers
   * @apilevel high-level
   * @ast method 
   * @declaredat java.ast:12
   */
  public Modifiers getModifiers() {
    return (Modifiers)getChild(0);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat java.ast:18
   */
  public Modifiers getModifiersNoTransform() {
    return (Modifiers)getChildNoTransform(0);
  }
  /**
   * Setter for lexeme ID
   * @apilevel high-level
   * @ast method 
   * @declaredat java.ast:5
   */
  public void setID(String value) {
    tokenString_ID = value;
  }
  /**
   * @ast method 
   * @declaredat java.ast:8
   */
  public void setID(beaver.Symbol symbol) {
    if(symbol.value != null && !(symbol.value instanceof String))
      throw new UnsupportedOperationException("setID is only valid for String lexemes");
    tokenString_ID = (String)symbol.value;
    IDstart = symbol.getStart();
    IDend = symbol.getEnd();
  }
  /**
   * Getter for lexeme ID
   * @apilevel high-level
   * @ast method 
   * @declaredat java.ast:19
   */
  public String getID() {
    return tokenString_ID != null ? tokenString_ID : "";
  }
  /**
   * Setter for ArgumentList
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:5
   */
  public void setArgumentList(List<Access> list) {
    setChild(list, 1);
  }
  /**
   * @return number of children in ArgumentList
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:12
   */
  public int getNumArgument() {
    return getArgumentList().getNumChild();
  }
  /**
   * Getter for child in list ArgumentList
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:19
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Access getArgument(int i) {
    return (Access)getArgumentList().getChild(i);
  }
  /**
   * Add element to list ArgumentList
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:27
   */
  public void addArgument(Access node) {
    List<Access> list = (parent == null || state == null) ? getArgumentListNoTransform() : getArgumentList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat Generics.ast:34
   */
  public void addArgumentNoTransform(Access node) {
    List<Access> list = getArgumentListNoTransform();
    list.addChild(node);
  }
  /**
   * Setter for child in list ArgumentList
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:42
   */
  public void setArgument(Access node, int i) {
    List<Access> list = getArgumentList();
    list.setChild(node, i);
  }
  /**
   * Getter for Argument list.
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:50
   */
  public List<Access> getArguments() {
    return getArgumentList();
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat Generics.ast:56
   */
  public List<Access> getArgumentsNoTransform() {
    return getArgumentListNoTransform();
  }
  /**
   * Getter for list ArgumentList
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:63
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Access> getArgumentList() {
    List<Access> list = (List<Access>)getChild(1);
    list.getNumChild();
    return list;
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat Generics.ast:72
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Access> getArgumentListNoTransform() {
    return (List<Access>)getChildNoTransform(1);
  }
  /**
   * Setter for SuperClassAccessOpt
   * @apilevel low-level
   * @ast method 
   * @declaredat Generics.ast:5
   */
  public void setSuperClassAccessOpt(Opt<Access> opt) {
    setChild(opt, 2);
  }
  /**
   * Does this node have a SuperClassAccess child?
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:12
   */
  public boolean hasSuperClassAccess() {
    return getSuperClassAccessOpt().getNumChild() != 0;
  }
  /**
   * Getter for optional child SuperClassAccess
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:19
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Access getSuperClassAccess() {
    return (Access)getSuperClassAccessOpt().getChild(0);
  }
  /**
   * Setter for optional child SuperClassAccess
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:27
   */
  public void setSuperClassAccess(Access node) {
    getSuperClassAccessOpt().setChild(node, 0);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat Generics.ast:33
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Access> getSuperClassAccessOptNoTransform() {
    return (Opt<Access>)getChildNoTransform(2);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat Generics.ast:40
   */
  protected int getSuperClassAccessOptChildPosition() {
    return 2;
  }
  /**
   * Setter for ImplementsList
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:5
   */
  public void setImplementsList(List<Access> list) {
    setChild(list, 3);
  }
  /**
   * @return number of children in ImplementsList
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:12
   */
  public int getNumImplements() {
    return getImplementsList().getNumChild();
  }
  /**
   * Getter for child in list ImplementsList
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:19
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Access getImplements(int i) {
    return (Access)getImplementsList().getChild(i);
  }
  /**
   * Add element to list ImplementsList
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:27
   */
  public void addImplements(Access node) {
    List<Access> list = (parent == null || state == null) ? getImplementsListNoTransform() : getImplementsList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat Generics.ast:34
   */
  public void addImplementsNoTransform(Access node) {
    List<Access> list = getImplementsListNoTransform();
    list.addChild(node);
  }
  /**
   * Setter for child in list ImplementsList
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:42
   */
  public void setImplements(Access node, int i) {
    List<Access> list = getImplementsList();
    list.setChild(node, i);
  }
  /**
   * Getter for Implements list.
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:50
   */
  public List<Access> getImplementss() {
    return getImplementsList();
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat Generics.ast:56
   */
  public List<Access> getImplementssNoTransform() {
    return getImplementsListNoTransform();
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat Generics.ast:62
   */
  public List<Access> getImplementsListNoTransform() {
    return (List<Access>)getChildNoTransform(3);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat Generics.ast:68
   */
  protected int getImplementsListChildPosition() {
    return 3;
  }
  /**
   * Setter for BodyDeclList
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:5
   */
  public void setBodyDeclList(List<BodyDecl> list) {
    setChild(list, 4);
  }
  /**
   * @return number of children in BodyDeclList
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:12
   */
  public int getNumBodyDecl() {
    return getBodyDeclList().getNumChild();
  }
  /**
   * Getter for child in list BodyDeclList
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:19
   */
  @SuppressWarnings({"unchecked", "cast"})
  public BodyDecl getBodyDecl(int i) {
    return (BodyDecl)getBodyDeclList().getChild(i);
  }
  /**
   * Add element to list BodyDeclList
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:27
   */
  public void addBodyDecl(BodyDecl node) {
    List<BodyDecl> list = (parent == null || state == null) ? getBodyDeclListNoTransform() : getBodyDeclList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat Generics.ast:34
   */
  public void addBodyDeclNoTransform(BodyDecl node) {
    List<BodyDecl> list = getBodyDeclListNoTransform();
    list.addChild(node);
  }
  /**
   * Setter for child in list BodyDeclList
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:42
   */
  public void setBodyDecl(BodyDecl node, int i) {
    List<BodyDecl> list = getBodyDeclList();
    list.setChild(node, i);
  }
  /**
   * Getter for BodyDecl list.
   * @apilevel high-level
   * @ast method 
   * @declaredat Generics.ast:50
   */
  public List<BodyDecl> getBodyDecls() {
    return getBodyDeclList();
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat Generics.ast:56
   */
  public List<BodyDecl> getBodyDeclsNoTransform() {
    return getBodyDeclListNoTransform();
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat Generics.ast:62
   */
  public List<BodyDecl> getBodyDeclListNoTransform() {
    return (List<BodyDecl>)getChildNoTransform(4);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat Generics.ast:68
   */
  protected int getBodyDeclListChildPosition() {
    return 4;
  }
  /**
   * @ast method 
   * @aspect LookupParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:813
   */
  public TypeDecl substitute(TypeVariable typeVariable) {
    for(int i = 0; i < numTypeParameter(); i++)
      if(typeParameter(i) == typeVariable)
        return getArgument(i).type();
    return super.substitute(typeVariable);
  }
  /**
   * @ast method 
   * @aspect LookupParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:826
   */
  public int numTypeParameter() {
    return ((GenericTypeDecl)original()).getNumTypeParameter(); 
  }
  /**
   * @ast method 
   * @aspect LookupParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:829
   */
  public TypeVariable typeParameter(int index) {
    return ((GenericTypeDecl)original()).getTypeParameter(index);
  }
  /**
   * @ast method 
   * @aspect LookupParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:861
   */
  public Access substitute(Parameterization parTypeDecl) {
    // TODO: include nesting as well....
    if(parTypeDecl.isRawType())
      return ((GenericTypeDecl)genericDecl()).rawType().createBoundAccess();
    if(!usesTypeVariable())
      return super.substitute(parTypeDecl);
    List list = new List();
    for(int i = 0; i < getNumArgument(); i++)
      list.add(getArgument(i).type().substitute(parTypeDecl));
    return new ParTypeAccess(genericDecl().createQualifiedAccess(), list);
  }
  /**
   * @ast method 
   * @aspect GenericsParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/GenericsParTypeDecl.jrag:76
   */
  public Access createQualifiedAccess() {
    List typeArgumentList = new List();
    for(int i = 0; i < getNumArgument(); i++) {
      Access a = (Access)getArgument(i);
      if(a instanceof TypeAccess)
        typeArgumentList.add(a.type().createQualifiedAccess());
      else
        typeArgumentList.add(a.fullCopy());
    }
    if(!isTopLevelType()) {
      if(isRawType())
        return enclosingType().createQualifiedAccess().qualifiesAccess(
          new TypeAccess("", getID())
        );
      else
        return enclosingType().createQualifiedAccess().qualifiesAccess(
          new ParTypeAccess(new TypeAccess("", getID()), typeArgumentList)
        );
    }
    else {
      if(isRawType())
        return new TypeAccess(packageName(), getID());
      else
        return new ParTypeAccess(new TypeAccess(packageName(), getID()), typeArgumentList);
    }
  }
  /**
   * @ast method 
   * @aspect GenericsCodegen
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddExtensions/Jimple1.5Backend/GenericsCodegen.jrag:406
   */
  public void transformation() {
  }
  /**
   * @apilevel internal
   */
  protected int involvesTypeParameters_visited = -1;
  /**
   * @apilevel internal
   */
  protected boolean involvesTypeParameters_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean involvesTypeParameters_initialized = false;
  /**
   * @apilevel internal
   */
  protected boolean involvesTypeParameters_value;
  /**
   * @attribute syn
   * @aspect GenericMethodsInference
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/GenericMethodsInference.jrag:18
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean involvesTypeParameters() {
    if(involvesTypeParameters_computed) {
      return involvesTypeParameters_value;
    }
    ASTNode$State state = state();
    if (!involvesTypeParameters_initialized) {
      involvesTypeParameters_initialized = true;
      involvesTypeParameters_value = false;
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
    int num = state.boundariesCrossed;
    boolean isFinal = this.is$Final();
      do {
        involvesTypeParameters_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        boolean new_involvesTypeParameters_value = involvesTypeParameters_compute();
        if (new_involvesTypeParameters_value!=involvesTypeParameters_value)
          state.CHANGE = true;
        involvesTypeParameters_value = new_involvesTypeParameters_value; 
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if(isFinal && num == state().boundariesCrossed) {
      involvesTypeParameters_computed = true;
      }
      else {
      state.RESET_CYCLE = true;
      involvesTypeParameters_compute();
      state.RESET_CYCLE = false;
        involvesTypeParameters_computed = false;
        involvesTypeParameters_initialized = false;
      }
      state.IN_CIRCLE = false; 
      return involvesTypeParameters_value;
    }
    if(involvesTypeParameters_visited != state.CIRCLE_INDEX) {
      involvesTypeParameters_visited = state.CIRCLE_INDEX;
      if (state.RESET_CYCLE) {
        involvesTypeParameters_computed = false;
        involvesTypeParameters_initialized = false;
        involvesTypeParameters_visited = -1;
        return involvesTypeParameters_value;
      }
      boolean new_involvesTypeParameters_value = involvesTypeParameters_compute();
      if (new_involvesTypeParameters_value!=involvesTypeParameters_value)
        state.CHANGE = true;
      involvesTypeParameters_value = new_involvesTypeParameters_value; 
      return involvesTypeParameters_value;
    }
    return involvesTypeParameters_value;
  }
  /**
   * @apilevel internal
   */
  private boolean involvesTypeParameters_compute() {
    for(int i = 0; i < getNumArgument(); i++)
      if(getArgument(i).type().involvesTypeParameters())
        return true;
    return false;
  }
  /**
   * @attribute syn
   * @aspect Generics
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:134
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl topLevelType() {
      ASTNode$State state = state();
    TypeDecl topLevelType_value = topLevelType_compute();
    return topLevelType_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl topLevelType_compute() {  return erasure().topLevelType();  }
  /**
   * @attribute syn
   * @aspect Generics
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:237
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isRawType() {
      ASTNode$State state = state();
    boolean isRawType_value = isRawType_compute();
    return isRawType_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isRawType_compute() {  return isNestedType() && enclosingType().isRawType();  }
  /**
   * @apilevel internal
   */
  protected boolean erasure_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl erasure_value;
  /**
   * @attribute syn
   * @aspect GenericsErasure
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:323
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl erasure() {
    if(erasure_computed) {
      return erasure_value;
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    erasure_value = erasure_compute();
if(isFinal && num == state().boundariesCrossed) erasure_computed = true;
    return erasure_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl erasure_compute() {  return genericDecl();  }
  /**
   * @apilevel internal
   */
  protected boolean getSuperClassAccessOpt_computed = false;
  /**
   * @apilevel internal
   */
  protected Opt getSuperClassAccessOpt_value;
  /**
   * @attribute syn nta
   * @aspect LookupParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:988
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt getSuperClassAccessOpt() {
    if(getSuperClassAccessOpt_computed) {
      return (Opt)ASTNode.getChild(this, getSuperClassAccessOptChildPosition());
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    getSuperClassAccessOpt_value = getSuperClassAccessOpt_compute();
    setSuperClassAccessOpt(getSuperClassAccessOpt_value);
if(isFinal && num == state().boundariesCrossed) getSuperClassAccessOpt_computed = true;
    return (Opt)ASTNode.getChild(this, getSuperClassAccessOptChildPosition());
  }
  /**
   * @apilevel internal
   */
  private Opt getSuperClassAccessOpt_compute() {
    GenericClassDecl decl = (GenericClassDecl)genericDecl();
    Opt opt;
    //System.err.println("Begin substituting extends clause");
    if(decl.hasSuperClassAccess())
      opt = new Opt((decl.getSuperClassAccess().type().substitute(this)));
    else
      opt = new Opt();
    //System.err.println("End substituting extends clause");
    return opt;
  }
  /**
   * @apilevel internal
   */
  protected boolean getImplementsList_computed = false;
  /**
   * @apilevel internal
   */
  protected List getImplementsList_value;
  /**
   * @attribute syn nta
   * @aspect LookupParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:999
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List getImplementsList() {
    if(getImplementsList_computed) {
      return (List)ASTNode.getChild(this, getImplementsListChildPosition());
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    getImplementsList_value = getImplementsList_compute();
    setImplementsList(getImplementsList_value);
if(isFinal && num == state().boundariesCrossed) getImplementsList_computed = true;
    return (List)ASTNode.getChild(this, getImplementsListChildPosition());
  }
  /**
   * @apilevel internal
   */
  private List getImplementsList_compute() {
    GenericClassDecl decl = (GenericClassDecl)genericDecl();
    //System.err.println("Begin substituting implements list");
    List list = decl.getImplementsList().substitute(this);
    //System.err.println("End substituting implements list");
    return list;
  }
  /**
   * @apilevel internal
   */
  protected boolean getBodyDeclList_computed = false;
  /**
   * @apilevel internal
   */
  protected List getBodyDeclList_value;
  /**
   * @attribute syn nta
   * @aspect LookupParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:1006
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List getBodyDeclList() {
    if(getBodyDeclList_computed) {
      return (List)ASTNode.getChild(this, getBodyDeclListChildPosition());
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    getBodyDeclList_value = getBodyDeclList_compute();
    setBodyDeclList(getBodyDeclList_value);
if(isFinal && num == state().boundariesCrossed) getBodyDeclList_computed = true;
    return (List)ASTNode.getChild(this, getBodyDeclListChildPosition());
  }
  /**
   * @apilevel internal
   */
  private List getBodyDeclList_compute() {  return new List();  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/GenericsSubtype.jrag:34
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean supertypeGenericClassDecl(GenericClassDecl type) {
      ASTNode$State state = state();
    boolean supertypeGenericClassDecl_GenericClassDecl_value = supertypeGenericClassDecl_compute(type);
    return supertypeGenericClassDecl_GenericClassDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean supertypeGenericClassDecl_compute(GenericClassDecl type) {  return type.subtype(genericDecl().original());  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/GenericsSubtype.jrag:105
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean supertypeClassDecl(ClassDecl type) {
      ASTNode$State state = state();
    boolean supertypeClassDecl_ClassDecl_value = supertypeClassDecl_compute(type);
    return supertypeClassDecl_ClassDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean supertypeClassDecl_compute(ClassDecl type) {  return super.supertypeClassDecl(type);  }
  protected java.util.Map subtype_TypeDecl_values;
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/GenericsSubtype.jrag:124
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean subtype(TypeDecl type) {
    Object _parameters = type;
    if(subtype_TypeDecl_values == null) subtype_TypeDecl_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(subtype_TypeDecl_values.containsKey(_parameters)) {
      Object _o = subtype_TypeDecl_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      subtype_TypeDecl_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(true);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_subtype_TypeDecl_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_subtype_TypeDecl_value = subtype_compute(type);
        if (new_subtype_TypeDecl_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_subtype_TypeDecl_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if(isFinal && num == state().boundariesCrossed) {
        subtype_TypeDecl_values.put(_parameters, new_subtype_TypeDecl_value);
      }
      else {
        subtype_TypeDecl_values.remove(_parameters);
      state.RESET_CYCLE = true;
      subtype_compute(type);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_subtype_TypeDecl_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_subtype_TypeDecl_value = subtype_compute(type);
      if (state.RESET_CYCLE) {
        subtype_TypeDecl_values.remove(_parameters);
      }
      else if (new_subtype_TypeDecl_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_subtype_TypeDecl_value;
      }
      return new_subtype_TypeDecl_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean subtype_compute(TypeDecl type) {  return type.supertypeParClassDecl(this);  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/GenericsSubtype.jrag:132
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean supertypeRawClassDecl(RawClassDecl type) {
      ASTNode$State state = state();
    boolean supertypeRawClassDecl_RawClassDecl_value = supertypeRawClassDecl_compute(type);
    return supertypeRawClassDecl_RawClassDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean supertypeRawClassDecl_compute(RawClassDecl type) {  return type.genericDecl().original().subtype(genericDecl().original());  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/GenericsSubtype.jrag:134
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean supertypeRawInterfaceDecl(RawInterfaceDecl type) {
      ASTNode$State state = state();
    boolean supertypeRawInterfaceDecl_RawInterfaceDecl_value = supertypeRawInterfaceDecl_compute(type);
    return supertypeRawInterfaceDecl_RawInterfaceDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean supertypeRawInterfaceDecl_compute(RawInterfaceDecl type) {  return type.genericDecl().original().subtype(genericDecl().original());  }
  protected java.util.Map sameStructure_TypeDecl_values;
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/GenericsSubtype.jrag:179
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean sameStructure(TypeDecl t) {
    Object _parameters = t;
    if(sameStructure_TypeDecl_values == null) sameStructure_TypeDecl_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(sameStructure_TypeDecl_values.containsKey(_parameters)) {
      Object _o = sameStructure_TypeDecl_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      sameStructure_TypeDecl_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(true);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_sameStructure_TypeDecl_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_sameStructure_TypeDecl_value = sameStructure_compute(t);
        if (new_sameStructure_TypeDecl_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_sameStructure_TypeDecl_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if(isFinal && num == state().boundariesCrossed) {
        sameStructure_TypeDecl_values.put(_parameters, new_sameStructure_TypeDecl_value);
      }
      else {
        sameStructure_TypeDecl_values.remove(_parameters);
      state.RESET_CYCLE = true;
      sameStructure_compute(t);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_sameStructure_TypeDecl_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_sameStructure_TypeDecl_value = sameStructure_compute(t);
      if (state.RESET_CYCLE) {
        sameStructure_TypeDecl_values.remove(_parameters);
      }
      else if (new_sameStructure_TypeDecl_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_sameStructure_TypeDecl_value;
      }
      return new_sameStructure_TypeDecl_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean sameStructure_compute(TypeDecl t) {
    if(!(t instanceof ParClassDecl))
      return false;
    ParClassDecl type = (ParClassDecl)t;
    if(type.genericDecl().original() == genericDecl().original() &&
       type.getNumArgument() == getNumArgument()) {
      for(int i = 0; i < getNumArgument(); i++)
        if(!type.getArgument(i).type().sameStructure(getArgument(i).type()))
          return false;
      if(isNestedType() && type.isNestedType())
        return type.enclosingType().sameStructure(enclosingType());
      return true;
    }
    return false;
  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/GenericsSubtype.jrag:234
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean supertypeParClassDecl(ParClassDecl type) {
      ASTNode$State state = state();
    boolean supertypeParClassDecl_ParClassDecl_value = supertypeParClassDecl_compute(type);
    return supertypeParClassDecl_ParClassDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean supertypeParClassDecl_compute(ParClassDecl type) {
    if(type.genericDecl().original() == genericDecl().original() &&
       type.getNumArgument() == getNumArgument()) {
      for(int i = 0; i < getNumArgument(); i++)
        if(!type.getArgument(i).type().containedIn(getArgument(i).type()))
          return false;
      if(isNestedType() && type.isNestedType())
        return type.enclosingType().subtype(enclosingType());
      return true;
    }
    return supertypeClassDecl(type);
  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/GenericsSubtype.jrag:246
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean supertypeParInterfaceDecl(ParInterfaceDecl type) {
      ASTNode$State state = state();
    boolean supertypeParInterfaceDecl_ParInterfaceDecl_value = supertypeParInterfaceDecl_compute(type);
    return supertypeParInterfaceDecl_ParInterfaceDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean supertypeParInterfaceDecl_compute(ParInterfaceDecl type) {  return false;  }
  protected java.util.Map instanceOf_TypeDecl_values;
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/GenericsSubtype.jrag:396
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean instanceOf(TypeDecl type) {
    Object _parameters = type;
    if(instanceOf_TypeDecl_values == null) instanceOf_TypeDecl_values = new java.util.HashMap(4);
    if(instanceOf_TypeDecl_values.containsKey(_parameters)) {
      return ((Boolean)instanceOf_TypeDecl_values.get(_parameters)).booleanValue();
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean instanceOf_TypeDecl_value = instanceOf_compute(type);
if(isFinal && num == state().boundariesCrossed) instanceOf_TypeDecl_values.put(_parameters, Boolean.valueOf(instanceOf_TypeDecl_value));
    return instanceOf_TypeDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean instanceOf_compute(TypeDecl type) {  return subtype(type);  }
  /**
   * @attribute syn
   * @aspect Generics
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:234
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isParameterizedType() {
      ASTNode$State state = state();
    boolean isParameterizedType_value = isParameterizedType_compute();
    return isParameterizedType_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isParameterizedType_compute() {  return true;  }
  /**
   * @attribute syn
   * @aspect GenericsTypeCheck
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:353
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean sameArgument(ParTypeDecl decl) {
      ASTNode$State state = state();
    boolean sameArgument_ParTypeDecl_value = sameArgument_compute(decl);
    return sameArgument_ParTypeDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean sameArgument_compute(ParTypeDecl decl) {
    if(this == decl) return true;
    if(genericDecl() != decl.genericDecl())
      return false;
    for(int i = 0; i < getNumArgument(); i++) {
      TypeDecl t1 = getArgument(i).type();
      TypeDecl t2 = decl.getArgument(i).type();
      if(t1 instanceof ParTypeDecl && t2 instanceof ParTypeDecl) {
        if(!((ParTypeDecl)t1).sameArgument((ParTypeDecl)t2))
          return false;
      }
      else {
        if(t1 != t2)
          return false;
      }
    }
    return true;
  }
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:550
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean sameSignature(Access a) {
      ASTNode$State state = state();
    boolean sameSignature_Access_value = sameSignature_compute(a);
    return sameSignature_Access_value;
  }
  /**
   * @apilevel internal
   */
  private boolean sameSignature_compute(Access a) {
    if(a instanceof ParTypeAccess) {
      ParTypeAccess ta = (ParTypeAccess)a;
      if(genericDecl() != ta.genericDecl())
        return false;
      if(getNumArgument() != ta.getNumTypeArgument())
        return false;
      for(int i = 0; i < getNumArgument(); i++)
        if(!getArgument(i).type().sameSignature(ta.getTypeArgument(i)))
          return false;
      return true;
    }
    else if(a instanceof TypeAccess && ((TypeAccess)a).isRaw())
      return false;
    return super.sameSignature(a);
  }
  protected java.util.Map sameSignature_ArrayList_values;
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:585
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean sameSignature(ArrayList list) {
    Object _parameters = list;
    if(sameSignature_ArrayList_values == null) sameSignature_ArrayList_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(sameSignature_ArrayList_values.containsKey(_parameters)) {
      Object _o = sameSignature_ArrayList_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      sameSignature_ArrayList_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(true);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_sameSignature_ArrayList_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_sameSignature_ArrayList_value = sameSignature_compute(list);
        if (new_sameSignature_ArrayList_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_sameSignature_ArrayList_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if(isFinal && num == state().boundariesCrossed) {
        sameSignature_ArrayList_values.put(_parameters, new_sameSignature_ArrayList_value);
      }
      else {
        sameSignature_ArrayList_values.remove(_parameters);
      state.RESET_CYCLE = true;
      sameSignature_compute(list);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_sameSignature_ArrayList_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_sameSignature_ArrayList_value = sameSignature_compute(list);
      if (state.RESET_CYCLE) {
        sameSignature_ArrayList_values.remove(_parameters);
      }
      else if (new_sameSignature_ArrayList_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_sameSignature_ArrayList_value;
      }
      return new_sameSignature_ArrayList_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean sameSignature_compute(ArrayList list) {
    if(getNumArgument() != list.size())
      return false;
    for(int i = 0; i < list.size(); i++)
      if(getArgument(i).type() != list.get(i))
        return false;
    return true;
  }
  /**
   * @apilevel internal
   */
  protected int usesTypeVariable_visited = -1;
  /**
   * @apilevel internal
   */
  protected boolean usesTypeVariable_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean usesTypeVariable_initialized = false;
  /**
   * @apilevel internal
   */
  protected boolean usesTypeVariable_value;
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:1030
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean usesTypeVariable() {
    if(usesTypeVariable_computed) {
      return usesTypeVariable_value;
    }
    ASTNode$State state = state();
    if (!usesTypeVariable_initialized) {
      usesTypeVariable_initialized = true;
      usesTypeVariable_value = false;
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
    int num = state.boundariesCrossed;
    boolean isFinal = this.is$Final();
      do {
        usesTypeVariable_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        boolean new_usesTypeVariable_value = usesTypeVariable_compute();
        if (new_usesTypeVariable_value!=usesTypeVariable_value)
          state.CHANGE = true;
        usesTypeVariable_value = new_usesTypeVariable_value; 
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if(isFinal && num == state().boundariesCrossed) {
      usesTypeVariable_computed = true;
      }
      else {
      state.RESET_CYCLE = true;
      usesTypeVariable_compute();
      state.RESET_CYCLE = false;
        usesTypeVariable_computed = false;
        usesTypeVariable_initialized = false;
      }
      state.IN_CIRCLE = false; 
      return usesTypeVariable_value;
    }
    if(usesTypeVariable_visited != state.CIRCLE_INDEX) {
      usesTypeVariable_visited = state.CIRCLE_INDEX;
      if (state.RESET_CYCLE) {
        usesTypeVariable_computed = false;
        usesTypeVariable_initialized = false;
        usesTypeVariable_visited = -1;
        return usesTypeVariable_value;
      }
      boolean new_usesTypeVariable_value = usesTypeVariable_compute();
      if (new_usesTypeVariable_value!=usesTypeVariable_value)
        state.CHANGE = true;
      usesTypeVariable_value = new_usesTypeVariable_value; 
      return usesTypeVariable_value;
    }
    return usesTypeVariable_value;
  }
  /**
   * @apilevel internal
   */
  private boolean usesTypeVariable_compute() {
    if(super.usesTypeVariable())
      return true;
    for(int i = 0; i < getNumArgument(); i++)
      if(getArgument(i).type().usesTypeVariable())
        return true;
    return false;
  }
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:1205
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl original() {
      ASTNode$State state = state();
    TypeDecl original_value = original_compute();
    return original_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl original_compute() {  return genericDecl().original();  }
  /**
   * @apilevel internal
   */
  protected boolean sourceTypeDecl_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl sourceTypeDecl_value;
  /**
   * @attribute syn
   * @aspect SourceDeclarations
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:1399
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl sourceTypeDecl() {
    if(sourceTypeDecl_computed) {
      return sourceTypeDecl_value;
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    sourceTypeDecl_value = sourceTypeDecl_compute();
if(isFinal && num == state().boundariesCrossed) sourceTypeDecl_computed = true;
    return sourceTypeDecl_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl sourceTypeDecl_compute() {  return genericDecl().original().sourceTypeDecl();  }
  /**
   * @apilevel internal
   */
  protected boolean fullName_computed = false;
  /**
   * @apilevel internal
   */
  protected String fullName_value;
  /**
   * @attribute syn
   * @aspect GenericsParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/GenericsParTypeDecl.jrag:12
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String fullName() {
    if(fullName_computed) {
      return fullName_value;
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    fullName_value = fullName_compute();
if(isFinal && num == state().boundariesCrossed) fullName_computed = true;
    return fullName_value;
  }
  /**
   * @apilevel internal
   */
  private String fullName_compute() {
    if(isNestedType())
      return enclosingType().fullName() + "." + nameWithArgs();
    String packageName = packageName();
    if(packageName.equals(""))
      return nameWithArgs();
    return packageName + "." + nameWithArgs();
  }
  /**
   * @apilevel internal
   */
  protected boolean typeName_computed = false;
  /**
   * @apilevel internal
   */
  protected String typeName_value;
  /**
   * @attribute syn
   * @aspect GenericsParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/GenericsParTypeDecl.jrag:21
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String typeName() {
    if(typeName_computed) {
      return typeName_value;
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeName_value = typeName_compute();
if(isFinal && num == state().boundariesCrossed) typeName_computed = true;
    return typeName_value;
  }
  /**
   * @apilevel internal
   */
  private String typeName_compute() {
    if(isNestedType())
      return enclosingType().typeName() + "." + nameWithArgs();
    String packageName = packageName();
    if(packageName.equals("") || packageName.equals(PRIMITIVE_PACKAGE_NAME))
      return nameWithArgs();
    return packageName + "." + nameWithArgs();
  }
  /**
   * @attribute syn
   * @aspect GenericsParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/GenericsParTypeDecl.jrag:30
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String nameWithArgs() {
      ASTNode$State state = state();
    String nameWithArgs_value = nameWithArgs_compute();
    return nameWithArgs_value;
  }
  /**
   * @apilevel internal
   */
  private String nameWithArgs_compute() {
    StringBuffer s = new StringBuffer();
    s.append(name());
    s.append("<");
    for(int i = 0; i < getNumArgument(); i++) {
      if(i != 0)
        s.append(", ");
      s.append(getArgument(i).type().fullName());
    }
    s.append(">");
    return s.toString();
  }
  /**
   * @apilevel internal
   */
  protected boolean unimplementedMethods_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection unimplementedMethods_value;
  /**
   * @attribute syn
   * @aspect MethodSignature15
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/MethodSignature.jrag:406
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection unimplementedMethods() {
    if(unimplementedMethods_computed) {
      return unimplementedMethods_value;
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    unimplementedMethods_value = unimplementedMethods_compute();
if(isFinal && num == state().boundariesCrossed) unimplementedMethods_computed = true;
    return unimplementedMethods_value;
  }
  /**
   * @apilevel internal
   */
  private Collection unimplementedMethods_compute() {
    HashSet set = new HashSet();
    HashSet result = new HashSet();
    for(Iterator iter = genericDecl().unimplementedMethods().iterator(); iter.hasNext(); ) {
      MethodDecl m = (MethodDecl)iter.next();
      set.add(m.sourceMethodDecl());
    }
    for(Iterator iter = super.unimplementedMethods().iterator(); iter.hasNext(); ) {
      MethodDecl m = (MethodDecl)iter.next();
      if(set.contains(m.sourceMethodDecl()))
        result.add(m);
    }
    return result;
  }
  /**
   * @apilevel internal
   */
  protected boolean localMethodsSignatureMap_computed = false;
  /**
   * @apilevel internal
   */
  protected HashMap localMethodsSignatureMap_value;
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:1045
   */
  @SuppressWarnings({"unchecked", "cast"})
  public HashMap localMethodsSignatureMap() {
    if(localMethodsSignatureMap_computed) {
      return localMethodsSignatureMap_value;
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    localMethodsSignatureMap_value = localMethodsSignatureMap_compute();
if(true) localMethodsSignatureMap_computed = true;
    return localMethodsSignatureMap_value;
  }
  /**
   * @apilevel internal
   */
  private HashMap localMethodsSignatureMap_compute() {
    HashMap map = new HashMap();
    for(Iterator iter = original().localMethodsIterator(); iter.hasNext(); ) {
      MethodDecl decl = (MethodDecl)iter.next();
      if(!decl.isStatic() && (decl.usesTypeVariable() || isRawType())) {
        BodyDecl b = decl.substitutedBodyDecl(this);
        addBodyDecl(b);
      	// Here we should access b through an ordinary
      	// child accessor instead of setting is$Final directly,
      	// however doing so appears to cause unexpected behaviour!
        b.is$Final = true;
        decl = (MethodDecl) b;
      }
      map.put(decl.signature(), decl);
    }
    return map;
  }
  protected java.util.Map localFields_String_values;
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:1063
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet localFields(String name) {
    Object _parameters = name;
    if(localFields_String_values == null) localFields_String_values = new java.util.HashMap(4);
    if(localFields_String_values.containsKey(_parameters)) {
      return (SimpleSet)localFields_String_values.get(_parameters);
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SimpleSet localFields_String_value = localFields_compute(name);
if(true) localFields_String_values.put(_parameters, localFields_String_value);
    return localFields_String_value;
  }
  /**
   * @apilevel internal
   */
  private SimpleSet localFields_compute(String name) {
    SimpleSet set = SimpleSet.emptySet;
    for(Iterator iter = original().localFields(name).iterator(); iter.hasNext(); ) {
      FieldDeclaration f = (FieldDeclaration)iter.next();
      if(!f.isStatic() && (f.usesTypeVariable() || isRawType())) {
        BodyDecl b = f.substitutedBodyDecl(this);
        addBodyDecl(b);
      	// Here we should access b through an ordinary
      	// child accessor instead of setting is$Final directly,
      	// however doing so appears to cause unexpected behaviour!
        b.is$Final = true;
        f = (FieldDeclaration) b;
      }
      set = set.add(f);
    }
    return set;
  }
  protected java.util.Map localTypeDecls_String_values;
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:1081
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet localTypeDecls(String name) {
    Object _parameters = name;
    if(localTypeDecls_String_values == null) localTypeDecls_String_values = new java.util.HashMap(4);
    if(localTypeDecls_String_values.containsKey(_parameters)) {
      return (SimpleSet)localTypeDecls_String_values.get(_parameters);
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SimpleSet localTypeDecls_String_value = localTypeDecls_compute(name);
if(true) localTypeDecls_String_values.put(_parameters, localTypeDecls_String_value);
    return localTypeDecls_String_value;
  }
  /**
   * @apilevel internal
   */
  private SimpleSet localTypeDecls_compute(String name) {
    SimpleSet set = SimpleSet.emptySet;
    for(Iterator iter = original().localTypeDecls(name).iterator(); iter.hasNext(); ) {
      TypeDecl t = (TypeDecl)iter.next();
      if(t.isStatic())
        set = set.add(t);
      else {
        BodyDecl b;
        TypeDecl typeDecl;
        if(t instanceof ClassDecl) {
          ClassDecl classDecl = (ClassDecl)t;
          typeDecl = classDecl.substitutedClassDecl(this);
          b = new MemberClassDecl((ClassDecl)typeDecl);
          addBodyDecl(b);
      	  // Here we should access b through an ordinary
      	  // child accessor instead of setting is$Final directly,
      	  // however doing so appears to cause unexpected behaviour!
	  b.is$Final = true;
          set = set.add(typeDecl);
        }
        else if(t instanceof InterfaceDecl) {
          InterfaceDecl interfaceDecl = (InterfaceDecl)t;
          typeDecl = interfaceDecl.substitutedInterfaceDecl(this);
          b = new MemberInterfaceDecl((InterfaceDecl)typeDecl);
          addBodyDecl(b);
      	  // Here we should access b through an ordinary
      	  // child accessor instead of setting is$Final directly,
      	  // however doing so appears to cause unexpected behaviour!
	  b.is$Final = true;
          set = set.add(typeDecl);
        }
      }
    }
    return set;
  }
  /**
   * @apilevel internal
   */
  protected boolean constructors_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection constructors_value;
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:1117
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection constructors() {
    if(constructors_computed) {
      return constructors_value;
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    constructors_value = constructors_compute();
if(isFinal && num == state().boundariesCrossed) constructors_computed = true;
    return constructors_value;
  }
  /**
   * @apilevel internal
   */
  private Collection constructors_compute() {
    Collection set = new ArrayList();
    for(Iterator iter = original().constructors().iterator(); iter.hasNext(); ) {
      ConstructorDecl c = (ConstructorDecl)iter.next();
      BodyDecl b = c.substitutedBodyDecl(this);
      addBodyDecl(b);
      // Here we should access b through an ordinary
      // child accessor instead of setting is$Final directly,
      // however doing so appears to cause unexpected behaviour!
      b.is$Final = true;
      set.add(b);
    }
    return set;
  }
  /**
   * @apilevel internal
   */
  protected boolean genericDecl_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl genericDecl_value;
  /**
   * @attribute inh
   * @aspect GenericsParTypeDecl
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/GenericsParTypeDecl.jrag:45
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl genericDecl() {
    if(genericDecl_computed) {
      return genericDecl_value;
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    genericDecl_value = getParent().Define_TypeDecl_genericDecl(this, null);
if(isFinal && num == state().boundariesCrossed) genericDecl_computed = true;
    return genericDecl_value;
  }
  /**
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/Generics.jrag:449
   * @apilevel internal
   */
  public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
    if(caller == getArgumentListNoTransform()) {
      int childIndex = caller.getIndexOfChild(child);
      return NameType.TYPE_NAME;
    }
    return super.Define_NameType_nameType(caller, child);
  }
  /**
   * @declaredat /Users/eric/Documents/workspaces/clara-soot/JastAddJ/Java1.5Frontend/GenericsParTypeDecl.jrag:52
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_genericDecl(ASTNode caller, ASTNode child) {
    if(caller == getBodyDeclListNoTransform()) { 
   int index = caller.getIndexOfChild(child);
{
    if(getBodyDecl(index) instanceof MemberTypeDecl) {
      MemberTypeDecl m = (MemberTypeDecl)getBodyDecl(index);
      return extractSingleType(genericDecl().memberTypes(m.typeDecl().name()));
    }
    return genericDecl();
  }
}
    return getParent().Define_TypeDecl_genericDecl(this, caller);
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
