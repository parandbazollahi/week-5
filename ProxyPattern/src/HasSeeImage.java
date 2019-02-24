
public class HasSeeImage implements InstagramState {

	public HasSeeImage(Instagram instagram) {
		this.seeImage();
	}
	

	@Override
	public void seeImage() {
		System.out.println("You're image just seen ");

	}

	@Override
	public void LikeImage() {
		System.out.println("You're image just seen but no like");

	}

	@Override
	public void ShareImage() {
		System.out.println("No share");
	}

	@Override
	public void Comment(int comment) {
		System.out.println("No comment");

	}

}
