package com.example.dosth.util;

import java.util.List;

public interface Mapping<T> {
    T mapping(List<String> s);
}
