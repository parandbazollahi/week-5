

public class Test {
	
	public static void main(String[] args){
		
		Instagram instagram = new Instagram();
		
		instagram.GetImageState();
		instagram.GetComment();
		instagram.getShareImage();
		instagram.getYesImageLike();
		instagram.getYesSeeImage();
		instagram.getNoComment();
		

		GetImage realInstagram = new Instagram();
		
		GetImage instagramProxy = new InstagramProxy();
		
		System.out.println("\nCurrent Instagram State " + instagramProxy.GetImageState());
		
		System.out.println("\ncomment for picture " + instagramProxy.GetComment());
		
		// The user can't perform this action because ATMProxy doesn't
		// have access to that potentially harmful method
		// atmProxy.setCashInMachine(10000);
		
	}
	
}