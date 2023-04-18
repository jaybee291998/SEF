package sef.module3.activity;

public class TestingArrayStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack stack = new ArrayStack(-10);
		
		int max = stack.getMaximum();
		System.out.println(String.format("max: %d", max));

	}

}
