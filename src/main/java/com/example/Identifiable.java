package com.example;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface Identifiable<T> {

    @JsonIgnore
    T getId();

}
