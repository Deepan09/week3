package week3.day2;

public class CalIndivTax implements TaxCalculation,IncomeCalcu{

	public double CalNetIncome(String name, double income1, double income2) {
		// TODO Auto-generated method stub
		System.out.println("implemented method from incomecal interface");
		return 0;
	}

	public void CalcDedu(String name, double HRA, double LTA) {
		// TODO Auto-generated method stub
		System.out.println("implemented CalDed method from Taxcal interface");	
	}

	public void CalGross(String name, double netIncome, double deductions) {
		// TODO Auto-generated method stub
		System.out.println("implemented CalGross method from Taxcal interface");		
	}

	public int taxSlab() {
		// TODO Auto-generated method stub
		System.out.println("implemented taxSlab method from Taxcal interface");	
		return 0;
	}

	public double calTaxAndPublishValue() {
		// TODO Auto-generated method stub
		System.out.println("implemented CalTaxAndPub method from Taxcal interface");	
		return 0;
	}

	public void MiscellaneousTAx() {
		System.out.println("own method of IndivTax class");
	}

	public void commonMethod() {
		// TODO Auto-generated method stub
		
	}
	
	
}
