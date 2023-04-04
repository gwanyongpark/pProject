package chapter10;

public class BadIdInputException extends Exception {
	
	void BadInputException(String message) {
		
		super("영문자와 숫자로만 입력해주세요");
	}
}
