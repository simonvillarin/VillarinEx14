package org.ssglobal.training.codes.itemB;

public class TestChemicalElements {

	public static void main(String[] args) {
		System.out.println("Is %s(%s) with a atomic number of %d, an Alkali metal? -> %b.".formatted(
				ChemicalElements.H.getSymbolName(), ChemicalElements.H.getName(), ChemicalElements.H.getAtomicNumber(),
				ChemicalElements.isAlkaliMetal(ChemicalElements.H)));
		System.out.println("Is %s(%s) with a atomic number of %d, a Transition metal? -> %b.".formatted(
				ChemicalElements.H.getSymbolName(), ChemicalElements.H.getName(), ChemicalElements.H.getAtomicNumber(),
				ChemicalElements.isTransitionMetal(ChemicalElements.H)));
		System.out.println("Is %s(%s) with a atomic number of %d, a Metal? -> %b.".formatted(
				ChemicalElements.H.getSymbolName(), ChemicalElements.H.getName(), ChemicalElements.H.getAtomicNumber(),
				ChemicalElements.isMetal(ChemicalElements.H)));

		System.out.println("-------------------------------------------------------------------------");

		System.out.println("Is %s(%s) with a atomic number of %d, an Alkali metal? -> %b.".formatted(
				ChemicalElements.O.getSymbolName(), ChemicalElements.O.getName(), ChemicalElements.O.getAtomicNumber(),
				ChemicalElements.isAlkaliMetal(ChemicalElements.O)));
		System.out.println("Is %s(%s) with a atomic number of %d, a Transition metal? -> %b.".formatted(
				ChemicalElements.O.getSymbolName(), ChemicalElements.O.getName(), ChemicalElements.O.getAtomicNumber(),
				ChemicalElements.isTransitionMetal(ChemicalElements.O)));
		System.out.println("Is %s(%s) with a atomic number of %d, a Metal? -> %b.".formatted(
				ChemicalElements.O.getSymbolName(), ChemicalElements.O.getName(), ChemicalElements.O.getAtomicNumber(),
				ChemicalElements.isMetal(ChemicalElements.O)));
		
		System.out.println("-------------------------------------------------------------------------");

		System.out.println("Is %s(%s) with a atomic number of %d, an Alkali metal? -> %b.".formatted(
				ChemicalElements.K.getSymbolName(), ChemicalElements.K.getName(), ChemicalElements.K.getAtomicNumber(),
				ChemicalElements.isAlkaliMetal(ChemicalElements.K)));
		System.out.println("Is %s(%s) with a atomic number of %d, a Transition metal? -> %b.".formatted(
				ChemicalElements.K.getSymbolName(), ChemicalElements.K.getName(), ChemicalElements.K.getAtomicNumber(),
				ChemicalElements.isTransitionMetal(ChemicalElements.K)));
		System.out.println("Is %s(%s) with a atomic number of %d, a Metal? -> %b.".formatted(
				ChemicalElements.K.getSymbolName(), ChemicalElements.K.getName(), ChemicalElements.K.getAtomicNumber(),
				ChemicalElements.isMetal(ChemicalElements.H)));
		
		System.out.println("-------------------------------------------------------------------------");

		System.out.println("Is %s(%s) with a atomic number of %d, an Alkali metal? -> %b.".formatted(
				ChemicalElements.Zn.getSymbolName(), ChemicalElements.Zn.getName(), ChemicalElements.Zn.getAtomicNumber(),
				ChemicalElements.isAlkaliMetal(ChemicalElements.Zn)));
		System.out.println("Is %s(%s) with a atomic number of %d, a Transition metal? -> %b.".formatted(
				ChemicalElements.Zn.getSymbolName(), ChemicalElements.Zn.getName(), ChemicalElements.Zn.getAtomicNumber(),
				ChemicalElements.isTransitionMetal(ChemicalElements.Zn)));
		System.out.println("Is %s(%s) with a atomic number of %d, a Metal? -> %b.".formatted(
				ChemicalElements.Zn.getSymbolName(), ChemicalElements.Zn.getName(), ChemicalElements.Zn.getAtomicNumber(),
				ChemicalElements.isMetal(ChemicalElements.Zn)));
		
		System.out.println("-------------------------------------------------------------------------");

		System.out.println("Is %s(%s) with a atomic number of %d, an Alkali metal? -> %b.".formatted(
				ChemicalElements.Ga.getSymbolName(), ChemicalElements.Ga.getName(), ChemicalElements.Ga.getAtomicNumber(),
				ChemicalElements.isAlkaliMetal(ChemicalElements.Ga)));
		System.out.println("Is %s(%s) with a atomic number of %d, a Transition metal? -> %b.".formatted(
				ChemicalElements.Ga.getSymbolName(), ChemicalElements.Ga.getName(), ChemicalElements.Ga.getAtomicNumber(),
				ChemicalElements.isTransitionMetal(ChemicalElements.Ga)));
		System.out.println("Is %s(%s) with a atomic number of %d, a Metal? -> %b.".formatted(
				ChemicalElements.Ga.getSymbolName(), ChemicalElements.Ga.getName(), ChemicalElements.Ga.getAtomicNumber(),
				ChemicalElements.isMetal(ChemicalElements.Ga)));
	}

}
