package math;

public class CMath {
	public native double plus(double par1, double par2);
	public native double minus(double par1, double par2);
	public native double mult(double par1, double par2);
	public native double div(double par1, double par2);
		
	static{
		//include dynamic library where native methods are implemented
		System.load("/home/ashamin/java/workspace/expCalcJNI/lib/math_CMath.so");
	}
}
