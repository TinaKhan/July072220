package exam;

public class LandPhone extends SatelitePhone implements Phone{

	@Override
	public void interfaceInfo() {
		System.out.println(" interfaceInfo is the method of Phone Interface ");
		
	}

	@Override
	public void call() {
		System.out.println(" Call is the method of Phone Interface ");
		
	}

	@Override
	public void message() {
		System.out.println(" Message is the method of Phone Interface ");
		
	}

	@Override
	public void camera() {
		System.out.println(" Camera is the method of Phone Interface ");
		
	}

}
