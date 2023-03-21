package exceptions;

public abstract class NotEnoughActionsException extends GameActionException {
	public NotEnoughActionsException () {super();}
	public NotEnoughActionsException (String s) {super(s);}
}
