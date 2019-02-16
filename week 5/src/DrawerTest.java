

public class DrawerTest {

	public static void main(String[] args) {
		CashDrawer cashDrawer = new CashDrawer(2);

		System.out.println(cashDrawer);
		
		cashDrawer.insertCash();
	
		System.out.println(cashDrawer);

		cashDrawer.insertCash();
		cashDrawer.ejectCash();
	
		/**cashDrawer.Refill();**/
		cashDrawer.ejectCash();

	}
}

