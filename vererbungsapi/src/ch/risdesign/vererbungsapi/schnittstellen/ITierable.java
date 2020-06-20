package ch.risdesign.vererbungsapi.schnittstellen;

import ch.risdesign.vererbungsapi.ausnamen.MetzgerException;

public interface ITierable {
    public abstract void lautGeben();
    public abstract void tobeornottobe()
        throws MetzgerException;
}
