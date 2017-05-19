package com.example;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class Wrapper<T extends Identifiable> {

    @JsonUnwrapped
    private T inner;
    private String prefix;

    public Wrapper(T inner, String prefix) {
        this.inner = inner;
        this.prefix = prefix;
    }

    public String getExtras() {
        return(prefix + ": " + inner.getId());
    }

}
