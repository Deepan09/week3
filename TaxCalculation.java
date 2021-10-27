package week3.day2;

public interface TaxCalculation {
/**
 * author suganya
 * @param name (employee name)
 * @param HRA=house rent
 * @param LTA=travel
 */
	void CalcDedu(String name, double HRA, double LTA );//interface is always public..given or not given
	/**
	 * 
	 * @param name
	 * @param netIncome
	 * @param deductions
	 */
	void CalGross(String name ,double netIncome,double deductions );
	/**
	 * 
	 * @return
	 */
	public int taxSlab();
	/**
	 * 
	 * @return
	 */
	public double calTaxAndPublishValue();
	/**
	 * 
	 */
	void commonMethod();
	
}
