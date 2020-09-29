package by.htp.les05.main;

public class Country {
	private String countryName;
	private Region regions [];
	private City capital;
	public Country(String countryName, City capital) {
		this.countryName = countryName;
		this.capital = capital;
	}
	public void printCapital(){
		System.out.println(capital.getCityName() + " is the capital of " + countryName);
	}
	public void setRegions (Region regions []) {
		this.regions = regions;
	}
	public Region [] getRegions () {
		return regions;
	}
	public int countArea() {
		int totalArea = 0;
		for(int i = 0; i < regions.length; i++) {
			totalArea += regions[i].getRegionArea();
		}
		return totalArea;
	}







}
