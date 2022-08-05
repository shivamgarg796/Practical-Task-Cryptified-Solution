package com.shivam.RestfulUsingPost.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.shivam.RestfulUsingPost.exception.InvalidArrayLengthrException;
import com.shivam.RestfulUsingPost.exception.InvalidSortingOrderException;

@Service
public class UserService {

	public List<Integer> giveArray(int arrayLength, String order) {
		if(arrayLength>0) {
			if (order.equals("ASC")) {
				return ascendingOrder(arrayLength);
			} else if (order.equals("DESC")) {
				return decendingOrder(arrayLength);
			} else {
				throw new InvalidSortingOrderException("invalid order order must be 'ASC' OR 'DESC'");
			}
		}
		else{
			throw new InvalidArrayLengthrException("Array length must be greater than 0");
		}

	}

	public List<Integer> ascendingOrder(int arrayLength) {

		int temp = 0;
		List<Integer> arrayList = initializeArray(arrayLength);
		// Sort the array in ascending order
		Collections.sort(arrayList);

		return arrayList;
	}

	public List<Integer> decendingOrder(int arrayLength) {
		int temp = 0;
		List<Integer> arrayList = initializeArray(arrayLength);
		Collections.sort(arrayList, Collections.reverseOrder());

		return arrayList;
	}

	public List<Integer> initializeArray(int arrayLength) {

		List<Integer> arrayList = new ArrayList<Integer>(arrayLength);
		Random randNum = new Random();

		for (int i = 0; i < arrayLength; i++) {
//			arr[i] = randNum.nextInt(20);
			arrayList.add(randNum.nextInt(10));
		}
		return arrayList;
	}

}
