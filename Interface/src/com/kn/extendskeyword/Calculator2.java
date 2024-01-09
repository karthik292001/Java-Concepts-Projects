package com.kn.extendskeyword;

public interface Calculator2 extends Calculator1{
	void mul();
	void div();
	default void rem() {
	}
}
