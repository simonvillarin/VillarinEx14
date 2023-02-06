package org.ssglobal.training.codes.itemB;

public class LeCreamDeApp {
	private int scoops;
	private String flavor;
	private boolean isWithWafer;
	private double price;
	
	public LeCreamDeApp(int scoops, String flavor, boolean isWithWafer) {
		super();
		this.scoops = scoops;
		this.flavor = flavor;
		this.isWithWafer = isWithWafer;
	}
	
	public double getNumOfScoops() throws PayFirstAdditionalException, Exception {
		if (scoops < 4) {	
			if (scoops == 1) {
				price += 50;
			} else if (scoops == 2) {
				 price += 100;
			} else {
				price += 150;
			}
			return price;
		} else {
			throw new PayFirstAdditionalException();
		}
	}
	
	public double purchasesVanilaWafer() {
		if (isWithWafer) {
			return price += 10;
		}
		return price;
	}
	
	public double choosesChocolateFlavor() {
		if (flavor.equalsIgnoreCase("A")) {
			return price += scoops * 10;
		}
		return price;
	}

	public int getScoops() {
		return scoops;
	}

	public void setScoops(int scoops) {
		this.scoops = scoops;
	}
	
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public boolean isWithWafer() {
		return isWithWafer;
	}

	public void setWithWafer(boolean withWafer) {
		this.isWithWafer = withWafer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
