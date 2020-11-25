package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
//        throw new NotImplementedException();
        double total = arrayList.stream().reduce(0,(sum,item)-> sum+item);
        return total/arrayList.size();
    }

    public int getMaxValue() {
//        throw new NotImplementedException();
        return arrayList.stream().reduce(0,Integer::max);
    }

    public int getLastOdd() {
//        throw new NotImplementedException();
        return arrayList.stream().filter(item -> item%2 != 0)
                .reduce(0,(currentOdd,item) -> item);
    }
}
