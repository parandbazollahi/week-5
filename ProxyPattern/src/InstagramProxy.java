
// In this situation the proxy both creates and destroys
// an ATMMachine Object

public  class InstagramProxy implements GetImage {

	// Allows the user to access getATMState in the 
	// Object ATMMachine
	
	public InstagramState GetImageState() {
		
		Instagram realInstagram = new Instagram();
		
		return realInstagram.GetImageState();
	}

	// Allows the user to access getCashInMachine 
	// in the Object ATMMachine
	
	public int GetComment() {
		
		Instagram realInstagram = new Instagram();
		
		return realInstagram.GetComment();
		
	}

	
}