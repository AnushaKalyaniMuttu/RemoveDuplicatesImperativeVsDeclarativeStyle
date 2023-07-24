package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeApproachRemoveDuplicates {

	public static void main (String [] args) {
	//imperative style remove duplicates from the list
		List<Integer> list=Arrays.asList(1,23,4,5,6,78,9,1,2,3,4);
		List<Integer> unique=new ArrayList<>();
		for(Integer number: list) {
			if(!unique.contains(number)) {
				unique.add(number);
			}
		}
		System.out.println("Unique List using Imperative"+unique);
	//declarative style remove duplicates from the list
	List<Integer> uniqueNumbers=	list.stream().distinct().collect(Collectors.toList());
	System.out.println("Unique List using declarative"+uniqueNumbers);
	}
}
