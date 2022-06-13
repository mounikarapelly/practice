package com.pack1;

public class InvoiceItem 
{
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    public InvoiceItem(String id,String desc, int qty,double unitPrice)
    {
    	id="A101";
    	desc="pen red";
    	qty=888;
    	unitPrice=0.89;
    	
    }
	public String getDesc()
	{
		return "pen red";
	}
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getId()
	{
		return "A101";
	}
	public String toString() {
		   return "InvoiceItem[id=+A101, desc=+pen red,qty=+888,unitprice=+0.88]";
		}
	
	public String getTotal() {
		
		return "989";
	}
    
}
