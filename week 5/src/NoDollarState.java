
	public class NoDollarState implements State {
		CashDrawer cashDrawer;
	 
	    public NoDollarState(CashDrawer cashDrawer) {
	        this.cashDrawer = cashDrawer;
	    }
	 
		public void insertDollar() {
			System.out.println("You inserted a Dollar");
			cashDrawer.setState(cashDrawer.getHasDollarState());
		}
	 
		public void ejectDollar() {
			System.out.println("You haven't inserted a dollar");
		}
	 
		
		public void cashRemain() {
			System.out.println("You Still have cash in the Dreawer");
		} 
		
		public void Refill() { }
	 
		public String toString() {
			return "waiting for cash";
		}
	}

