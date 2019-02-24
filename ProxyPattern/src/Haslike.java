
public class Haslike implements InstagramState {

	public Haslike(Instagram instagram) {
		this.LikeImage();
	}

	@Override
	public void seeImage() {
		System.out.println("Image seen by followers");

	}

	@Override
	public void LikeImage() {
		System.out.println("Image like by followers");

	}

	@Override
	public void ShareImage() {
		System.out.println("No sharing");
	}

	@Override
	public void Comment(int comment) {
		this.Comment(0);

	}

}
