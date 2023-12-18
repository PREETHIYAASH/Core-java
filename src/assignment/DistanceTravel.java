package assignment;
class Distance{
	int u,a,t,k,h;
	public Distance(int t) {
		u=36;
		a=5;
		k=1000;
		h=3600;
		this.t=t;
	}
	public int  calculation() {
		int  total=(u*k/h)*t+((a*t*t)/2);
		return total;
	}
}

public class DistanceTravel {

	public static void main(String[] args) {
		Distance d= new Distance(10);
		System.out.println("distance "+d.calculation());
		Distance d1=new Distance(8);
		int D=d1.calculation();
		System.out.println("distance2 "+D);
	}

}
