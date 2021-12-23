/*
 * Stack implementation
 */
package com.code.challenge;

import java.util.Stack;

public class StackImplementation {

	public static void main(String[] args) {

		Stack<Student> stack = new Stack<>();
		stack.add(new Student("Naresh","HYD",1));
		stack.add(new Student("Mahesh","DELHI",2));
		stack.add(new Student("Ramesh","BLR",3));
		stack.push(new Student("Satish","AP",4));
		System.out.println("Stach element:"+stack);
		System.out.println("Peek element:"+stack.peek());
		System.out.println("POP element:"+stack.pop());
		System.out.println("Peek element after POP:"+stack.peek());
		
	}

}

class Student {

	private String name;
	private String Address;

	public Student(String name, String address, int id) {
		super();
		this.name = name;
		Address = address;
		this.id = id;
	}

	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", Address=" + Address + ", id=" + id + "]";
	}
}