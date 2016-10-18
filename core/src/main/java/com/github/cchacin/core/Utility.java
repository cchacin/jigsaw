package com.github.cchacin.core;

public class Utility {

    private final Hidden hidden;

    public Utility() {
        this(new Hidden());
    }

    public Utility(final Hidden hidden) {
        this.hidden = hidden;
    }

    public String dummy() {
        return this.hidden.hi();
    }
}
