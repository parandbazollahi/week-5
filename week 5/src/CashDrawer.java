
public class CashDrawer {
		
		State noDollarState;
		State hasDollarState;
		State soldState;
	 
		State state;
		int count = 0;
	 
		public CashDrawer(int numberCash) {
			
			noDollarState = new NoDollarState(this);
			hasDollarState = new HasDollarState(this);
			soldState = new SoldState(this);

			this.count = numberCash;
	 		if (numberCash > 0) {
				state = noDollarState;
			} else {
				state = soldState;
			}
		}
	 
		public void insertCash() {
			state.insertDollar();
		}
	 
		public void ejectCash() {
			state.ejectDollar();
		}
	 
		void openDrawer() {
			System.out.println("A Drawer is open");
			if (count != 0) {
				count = count - 1;
			}
		}
	 
		int getCount() {
			return count;
		}
	 
		void refill(int count) {
			this.count += count;
			System.out.println("The Drawer  was just refilled; it's new count is: " + this.count);
			state.Refill();
		}

		void setState(State state) {
			this.state = state;
		}
	    public State getState() {
	        return state;
	    }


	    public State getNoDollarState() {
	        return noDollarState;
	    }

	    public State getHasDollarState() {
	        return hasDollarState;
	    }

	    public State getSoldState() {
	        return soldState;
	    }
	 
		public String toString() {
			StringBuffer result = new StringBuffer();
			result.append("\nInventory: " + count + " &");
			if (count != 0) {
				result.append("Cash" );
				count ++;
			}
			result.append("\n");
			result.append("Drawer is " + state + "\n");
			return result.toString();
		}
	}

