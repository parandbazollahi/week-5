
	//import java.util.Random;

	public class HasDollarState implements State {
		CashDrawer cashDrawer;
	 
		public HasDollarState(CashDrawer cashDrawer) {
			this.cashDrawer = cashDrawer;
		}
	  
		public void insertDollar() {
			System.out.println("You can't insert another Dollar");
		}
	 
		public void ejectDollar() {
			System.out.println("No more Dollar");
			cashDrawer.setState(cashDrawer.getNoDollarState());
		}
	 
		
	    public void cashRemain() {
	        System.out.println("No cash Remain in cash Drawer");
	    }
	    
	    public void Refill() { }
	 
		public String toString() {
			return "waiting for cashier";
		}
	}

