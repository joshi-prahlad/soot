package ca.mcgill.sable.soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import java.util.*;
import ca.mcgill.sable.soot.jimple.parser.analysis.*;

public final class ANameBaseType extends PBaseType
{
    private PName _name_;

    public ANameBaseType()
    {
    }

    public ANameBaseType(
        PName _name_)
    {
        setName(_name_);

    }
    public Object clone()
    {
        return new ANameBaseType(
            (PName) cloneNode(_name_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANameBaseType(this);
    }

    public PName getName()
    {
        return _name_;
    }

    public void setName(PName node)
    {
        if(_name_ != null)
        {
            _name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _name_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_name_);
    }

    void removeChild(Node child)
    {
        if(_name_ == child)
        {
            _name_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_name_ == oldChild)
        {
            setName((PName) newChild);
            return;
        }

    }
}
