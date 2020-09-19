package software_hom;






public class checkout {
private int runningTotal=0;

	public void add(Integer itemCount, int price) {
	
		runningTotal+= (itemCount.intValue() * price) ;
	}
	public int total() {
		
		return runningTotal;
	}
	


	
	

}
