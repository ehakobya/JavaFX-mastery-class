package com.jmc.javafxmasteryclass;

import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;

public class Constant {

    private final ReadOnlyIntegerWrapper numWrapper;

    public Constant(int num) {
        numWrapper = new ReadOnlyIntegerWrapper(num);
    }

    public ReadOnlyIntegerProperty getReadOnlyNumber() {
        return numWrapper.getReadOnlyProperty();
    }

    public void changeConstant() {
        this.numWrapper.set(200);
    }
}
