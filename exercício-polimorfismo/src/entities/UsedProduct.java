package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	
	public UsedProduct() {
	}

	public UsedProduct(String name, double price, String priceTag, Date manufactureDate) {
		super(name, price, priceTag);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
	public String priceTag() {
		return getName()
			+"(used)"
			+ " $ "
			+String.format("%.2f", getPrice())
			+"(Manufacture date: "
			+sdf.format(manufactureDate)
			+")";
	}
}
