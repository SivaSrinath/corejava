package com.string.operations;

public class ExampleEquals {
	int x;
	ExampleEquals(int x){
		this.x=x;
	}
	public boolean equals(Object obj) {
		if(obj instanceof ExampleEquals) {
			ExampleEquals e = (ExampleEquals)obj;
			return (this.x == e.x);
		}
		return false;
	}

}
