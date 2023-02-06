package org.ssglobal.training.codes.itemB;

public enum ChemicalElements {
	H("Hydrogen", "H", 1), 
	O("Oxygen", "O", 8),
	K("Potassium", "K", 19), 
	Zn("Zinc", "Zn", 30), 
	Ga("Gallium", "Ga", 31);

	private String name;
	private String symbolName;
	private int atomicNumber;

	private ChemicalElements(String name, String symbolName, int atomicNumber) {
		this.name = name;
		this.symbolName = symbolName;
		this.atomicNumber = atomicNumber;
	}

	public static boolean isAlkaliMetal(ChemicalElements element) {
		int[] alkaliMetals = { 3, 11, 19, 37, 55, 87 };
		
		for (int lookup : alkaliMetals) {
			if (element.getAtomicNumber() == lookup) {
				return true;
			}
		}
		return false;
	}

	public static boolean isTransitionMetal(ChemicalElements element) {
		int[] transitionMetals = { 21, 31, 23, 24, 25, 26, 27, 28, 29, 30, 31, 39, 40, 41, 42, 43, 44, 45, 46, 47,
				48, 72, 73, 74, 75, 76, 77, 78, 79, 80, 104, 105, 106, 107, 108, 109, 110, 111, 112 };
		
		for (int lookup: transitionMetals) {
			if (element.getAtomicNumber() == lookup) {
				return true;
			}
		}
		return false;
	}

	public static boolean isMetal(ChemicalElements element) {
		int[] metals = { 13, 49, 50, 81, 82, 83, 113, 114, 115, 116 };
		
		for (int lookup : metals) {
			if (element.getAtomicNumber() == lookup) {
				return true;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbolName() {
		return symbolName;
	}

	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}

	public int getAtomicNumber() {
		return atomicNumber;
	}

	public void setAtomicNumber(int atomicNumber) {
		this.atomicNumber = atomicNumber;
	}
}
