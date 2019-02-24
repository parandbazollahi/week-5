
public class NoComment implements InstagramState {

	public NoComment(Instagram instagram) {
		this.Comment(0);
	}

	@Override
	public void seeImage() {
		System.out.println("You're image seen by followers");

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
