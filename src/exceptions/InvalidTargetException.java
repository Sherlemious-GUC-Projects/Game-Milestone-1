package exceptions;

public abstract class InvalidTargetException extends GameActionException {
	public InvalidTargetException () {super();}
	public InvalidTargetException (String s) {super(s);}
}
