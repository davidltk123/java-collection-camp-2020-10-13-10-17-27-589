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
        return array.stream().filter(item -> item%2==0).collect(Collectors.toList());
    }

    public List<Integer> filterMultipleOfThree() {
//        throw new NotImplementedException();
        return array.stream().filter(item -> item%3==0).collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
//        throw new NotImplementedException();
        return firstList.stream().filter(secondList::contains).collect(Collectors.toList());
    }
}
