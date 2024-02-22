package com.ruby.java.ch08.innerClass;

public class OuterClassTest {
public static void main(String[] args) {
	OuterClass outer = new OuterClass();
	OuterClass.InstanceClass inner01 = outer.new InstanceClass();
	//outer.InstanceClass inner02 = outer.new Instance;
		inner01.a = 123;
		inner01.method2();
		OuterClass.StaticClass inner02 = new OuterClass.StaticClass();
		inner02.b = 456;
		inner02.m
	}
}
