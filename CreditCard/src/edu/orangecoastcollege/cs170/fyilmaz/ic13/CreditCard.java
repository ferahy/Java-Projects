package edu.orangecoastcollege.cs170.fyilmaz.ic13;

public class CreditCard 
{
	private String mcardHolder;
	private String mexpirationDate;
	private CardNetwork mnetwork;
	private String mnumber;
	private String msecurityCode;

	public CreditCard(CardNetwork network, String number, 
			String cardHolder, String expirationDate,  String securityCode) 
	{
		mcardHolder= cardHolder;
		mexpirationDate= expirationDate;
	    mnetwork = network;
	    mnumber = number;
	    msecurityCode = securityCode;
	}
	    public CardNetwork getnetwork()
	    {
	        return mnetwork;
	    }
	    public String getnumber()
	    {
	        return mnumber;
	    }
	    public String getcardHolder()
	    {
	        return mcardHolder;
	    }
	    public String expirationDate()
	    {
	        return mexpirationDate;
	        
	    }
	    public String securityCode()
	    {
	        return msecurityCode;
	    }
	
	    public void setcardholder(String cardHolder)
	    {
	    	mcardHolder = cardHolder;
	    }
	    public String toString()
	    {
	        int position = mnumber.length()-4;
	        String output = "Credit Card [" + mnetwork + "," + "************" + mnumber.substring(position) 
	        			+ "," + mcardHolder+ ","+ mexpirationDate+ "]";
	        
	        return output;
	    }
	       
	public boolean equals(CreditCard other)
	{
	    if(mnetwork != other.mnetwork )
	        return false;
	    if(!mcardHolder.equalsIgnoreCase(other.mcardHolder))
	        return false;
	    if(!mnumber.equalsIgnoreCase(other.mnumber))
	        return false;
	    if(!mexpirationDate.equalsIgnoreCase(other.mexpirationDate))
	        return false;
	    if(!msecurityCode.equalsIgnoreCase(other.msecurityCode))
	        return false;

	return true;
	}

}
