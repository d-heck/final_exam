package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {

	//	TODO - RocketBLL RateException - RateDomainModel should be an attribute of RateException
	//	* Add RateRomainModel as an attribute
	//	* Create a constructor, passing in RateDomainModel
	//	* Create a getter (no setter, set value only in Constructor)
	
	private RateDomainModel x;
	
	public RateException(RateDomainModel x) {
		super();
		this.x = x;
		System.out.println("RateException");	
	}
	
	//Getter (No setter)
	public RateDomainModel getX() {
		return x;
	}
}