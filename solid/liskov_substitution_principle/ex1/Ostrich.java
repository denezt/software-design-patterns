// This is an example of the 'Is-A' way of thinking

public class Ostrich extends Bird {
	// This is an example of a bad design, because although an Ostrich is a bird it can not fly.
	@Override
	public void fly(){
		// Unimplemented
		throw new RuntimeException();
	}
}
