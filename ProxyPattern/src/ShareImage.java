
public class ShareImage implements InstagramState {

	public ShareImage(Instagram instagram) {
		// TODO Auto-generated constructor stub
		this.ShareImage();
	}

	@Override
	public void seeImage() {
		System.out.println("followers seen you picture and share it");

	}

	@Override
	public void LikeImage() {
		System.out.println("You're image just seen but no like");
	}

	@Override
	public void ShareImage() {
		System.out.println("you Image shared by followers");

	}

	@Override
	public void Comment(int comment) {
		System.out.println("No comment");


	}

}
