package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
//        throw new NotImplementedException();
        List<Integer> even = array.stream().filter(item -> item%2==0).collect(Collectors.toList());
        return even;
    }

    public List<Integer> filterMultipleOfThree() {
//        throw new NotImplementedException();
        List<Integer> multipleOfThree = array.stream().filter(item -> item%3==0).collect(Collectors.toList());
        return multipleOfThree;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
//        throw new NotImplementedException();
        List<Integer> CommonElements = firstList.stream().filter(firsListItem -> secondList.contains(firsListItem)).collect(Collectors.toList());
        return CommonElements;
    }
}
