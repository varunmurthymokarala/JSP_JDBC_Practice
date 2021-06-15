package com.ILPday04;

public class NoIdFoundException {
	private int id;

	public NoIdFoundException(int id) {
		super();
		this.id = id;
	}

	public String getMessage() {
		return id + " not found";
	}
}
