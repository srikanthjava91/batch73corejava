package com.oops.inheritance;

public class TestInhDemo2 {

	void main() {
		System.out.println("main method from TestInhDemo2 ");
	}

}

class TestInhDemo3 extends TestInhDemo2 {
	@Override
	void main() {
		super.main();
	}
}