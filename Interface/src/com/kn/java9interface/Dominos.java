package com.kn.java9interface;

public interface Dominos {
	
//	Abstract method
	public abstract void colorWalls();
	
//	Static method
	public static void maintainCleanliness() {
		System.out.println("Cleanliness is maintained as per standard");
	}
	
//	default method
	default public void bakePizza() {
		System.out.println("Pizza is baking");
	}
	
//	private method
	private void recipe() {
		System.out.println("Recipe for baking pizza");
	}
}
