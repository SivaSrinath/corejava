package com.java8.MethRef;

import java.util.function.BiFunction;

import com.java8.MethRef.interf.Arthmetic;

public class MethodReference3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction<Integer, Integer, Integer> adder = Arthmetic::add;

		System.out.println(adder.apply(10, 20));

		BiFunction<Integer, Float, Float> adder1 = Arthmetic::add;

		System.out.println(adder1.apply(10, 20f));

		BiFunction<Float, Float, Float> adde2 = Arthmetic::add;

		System.out.println(adde2.apply(10f, 30f));
	}

}
