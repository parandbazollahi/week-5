public class Instagram implements GetImage{
	InstagramState haslike;
	InstagramState hasSeeImage;
	InstagramState hasShareImage;
	InstagramState hasNoComment;
	
	InstagramState instagramState;
	int comment = 200;
	
	public Instagram() {
		
		haslike  = new Haslike(this);
		hasSeeImage = new HasSeeImage(this);
		hasShareImage = new ShareImage(this);
		hasNoComment = new NoComment(this);
		
		
		if (comment <0) {
			instagramState.Comment(comment);
		}
	}
	public InstagramState getYesImageLike() { return haslike; }
	public InstagramState getYesSeeImage() { return hasSeeImage; }
	public InstagramState getShareImage() { return hasShareImage ; }
	public InstagramState getNoComment() { return hasNoComment; }
	
	// NEW STUFF
	
	public InstagramState GetImageState() { return instagramState; }
	public int GetComment() { return comment; }
}