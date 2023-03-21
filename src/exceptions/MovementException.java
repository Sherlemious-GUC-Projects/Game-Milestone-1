package exceptions;

public abstract class MovementException extends GameActionException {
	public MovementException () {super();}
	public MovementException (String s) {super(s);}
}
