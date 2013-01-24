package math;

public class CMath {
	public native double plus(double par1, double par2);
	public native double minus(double par1, double par2);
	public native double mult(double par1, double par2);
	public native double div(double par1, double par2);
		
	static{
		//TODO include dynamic library were native methods are implemented
	}
}
