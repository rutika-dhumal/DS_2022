import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetTest3 {

	public static void main(String[] args) {
		
		System.out.println("Creating the content....");
		
		ChemicalElements cm1 = new ChemicalElements(1, "Hydrogen", 1.00797f,"H");
		ChemicalElements cm2 = new ChemicalElements(4, "Berylliumn", 9.01218f, "Be");
		ChemicalElements cm3 = new ChemicalElements(2, "Helium", 4.00260f, "He");
		ChemicalElements cm4 = new ChemicalElements(3, "Lithium",6.941f,"Li");
		
		System.out.println("Chemical elements are ready....");
		
		System.out.println("Creating container....");
		
		TreeSet <ChemicalElements> treeset = new TreeSet<ChemicalElements>();
		
		System.out.println("Container is ready....");
		
		System.out.println("Adding the 1 element....");
		treeset.add(cm1);
		
		
		System.out.println("Adding the 2 element....");
		treeset.add(cm2);
		
		System.out.println("Adding the 3 element....");
		treeset.add(cm3);
		
		System.out.println("Adding the 4 element....");
		treeset.add(cm4);
	
		
		System.out.println("---> Now iterating over the container <---");
		
		// to print
//		Iterator<ChemicalElements> iterator = treeset.iterator();
//		
//		while(iterator.hasNext()) {
//			ChemicalElements theElements = iterator.next();
//			System.out.println("The elements : "+theElements);
//		}
		
		// 2nd method to print 
		for (ChemicalElements chemicalElements : treeset) {
			System.out.println("The elements : "+chemicalElements);
		}
	}
}



class ChemicalElements implements Comparable<ChemicalElements>{
	int atomicNumber;
	String atomicName;
	float atomicWeight;
	String atomicFormula;
	
	public ChemicalElements(int atomicNumber, String atomicName, float atomicWeight, String atomicFormula) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicWeight = atomicWeight;
		this.atomicFormula = atomicFormula;
	}
	
	@Override
	public String toString() {
		return "ChemicalElements [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicWeight="
				+ atomicWeight + ", atomicFormula=" + atomicFormula + "]";
	}

	
	public int compareTo(ChemicalElements o) {
		System.out.println("comparing "+ atomicNumber+" with "+ o.atomicNumber);
		return Integer.compare(atomicNumber, o.atomicNumber);
	}
	
	
}