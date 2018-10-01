package com.collecions;
import java.util.HashSet;
 
class Dog{
	String color;
 
	public Dog(String s){
		color = s;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}	
}
 
public class SetAndHashCode {
	public static void main(String[] args) {
		HashSet<Dog> dogSet = new HashSet<Dog>();
		dogSet.add(new Dog("white"));
		dogSet.add(new Dog("white"));
 
		System.out.println("We have " + dogSet.size() + " white dogs!");
 
		if(dogSet.contains(new Dog("white"))){
			System.out.println("We have a white dog!");
		}else{
			System.out.println("No white dog!");
		}	
	}
}