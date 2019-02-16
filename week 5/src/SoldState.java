
public class SoldState implements State {
		 
	CashDrawer cashDrawer;
 
    public SoldState(CashDrawer cashDrawer) {
        this.cashDrawer = cashDrawer;
    }
       
	public void insertDollar() {
		System.out.println("Please wait, we're already giving you a Recipt");
	}
 
	public void ejectDollar() {
		System.out.println("Sorry, you already didn't give me enough money");
	}
 
	
 
	public void cashRemain() {
		cashDrawer.ejectCash();
		if (cashDrawer.getCount() > 0) {
			cashDrawer.setState(cashDrawer.getNoDollarState());
		} else {
			System.out.println("Sorry no more money in drawer!");
			cashDrawer.setState(cashDrawer.getSoldState());
		}
	}
	
	public void Refill() { }
 
	public String toString() {
		return "No more money";
		}
	}


