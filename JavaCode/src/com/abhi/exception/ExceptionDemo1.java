package com.abhi.exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {
        try {
			// This block contains statements which may throw exceptions during run time.
		} catch (Exception e) {
			// This block handles the exceptions thrown by the try block.
		} finally {
			// This block is always executed whether an exception is thrown or not and
			// thrown exception is caught or not.
		}
    }
}
