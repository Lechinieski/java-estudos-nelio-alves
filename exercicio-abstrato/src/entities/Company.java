package entities;

public class Company extends TaxPayer{

	private Integer numberOfEmployees;

	public Company(String name, double anualIncome, Integer numberOfEmployess) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployess;
	}

	@Override
	public double tax() {
	    if (numberOfEmployees > 10) {
	        return getAnualIncome() * 0.14;
	    } else {
	        return getAnualIncome() * 0.16;
	    }
	}
		

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	
	
}
