package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList {

    @Override
    public boolean add(Object element) {
        if (!this.contains(element)) {
            return super.add(element);
        }

        return false;
    }

    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object element) {
        boolean isRemoved = super.remove(element);
        sort();
        return isRemoved;
    }
}