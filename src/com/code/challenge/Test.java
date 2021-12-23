package com.code.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	
	/*
	 * 1)	Suppose Singleton bean A needs to use non-singleton (prototype) bean B, perhaps on each method invocation on A. The spring container creates the singleton bean A only once, and thus only gets one opportunity to set the properties. What can be done to get new instance of Bean B everytime when it is required?


@Scope(Singleton)
@Service
public class A {

    		private B getB() {
        	// return new instance B everytime when it is required.
       	 
    		}
		
		Public void process(){
			B b=getB();
		}

}

@Scope(Prototype)
@Service
public class B {

}
	 */

	
	/*
	 * data structure of N capacity with LRU(Least recently used) mechanism

ex: datastructure of size 2
.put(1, A); // {1=A}
.put(2, B); // {1=A, 2=B}
.get(1);    // return A
.put(3, C); // LRU key was 2, key 2 is replaced,{1=A, 3=C}
.put(4, D)  // LRU key was 1, key 1 is replaced , {4=D, 3=C}
.get(3);    // return C
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// n-capacity
		//int arr[]
		//check the LRU based on indexing.
		int arr[]= {1,2,3,4,5};
		List<Integer> ru= new ArrayList<>();
		List<Integer> nuList = Arrays.asList(6,7,8,9,10);
		for (int i : arr) {
			ru.add(i);//adding in list
			System.out.println(i);
			if(ru.contains(i)) {//verifying the content/element
				if(ru.size()==arr.length-1) { //checking the size if both are same 
					System.out.println(arr[3]);
					
					ru.remove(0);
					ru.add(0, nuList.get(0));
				}
				else {
					
				}
			}
			
		}

	}

}
