package com.yunsoft.Construct.AbstractFactory;

public interface AbstractFactory<T> {
    T create(String type);
}
