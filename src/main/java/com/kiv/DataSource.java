package com.kiv;

public interface DataSource {

    Transaction next();

    boolean hasNext();

    void reset();

}
