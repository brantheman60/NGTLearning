package ngt.learning;

public class NOTES {

	/**
	 * Compile/Run-Time Errors and Try/Catch/Finally Block:::
	 * At compile time, if code doesn't comply with Java rules, compile-time errors will occur
	 * -role of compiler is to ensure that code is compliant with these rules, then --> .class file
	 * -any violations will be reported as compilation errors
	 * -Java won't compile the code until these issues are fixed
	 * Runtime errors are logical errors which cannot be caught during compile time
	 * -Java compiler can compile the source code into .class
	 * 
	 * First, execute the code, and it an exception, exception is caught in the catch block
	 * -try block contains code where exceptions can happen
	 * -to catch block if error in try block, and can handle the exception more gracefully
	 *   -can either display programmer's message or ignore the exception
	 *   -can also be used to warn user of computer memory usage
	 *   -can catch specific exception or can catch generic exception
	 * the finally block is executed in all conditions, even if there is an exception
	 * -used to define cleanup code- code that closes and releases resources, eg. file handlers
	 * 0can define multiple catch blocks with one try block, but only 1 finally block
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
