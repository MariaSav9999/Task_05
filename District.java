package by.htp.les05.main;

public class District {
	private String districtName;
	private City cities [];
	public District(String districtName) {
		this.districtName = districtName;
	}
	public City[] getCities() {
		return cities;
	}
	public void setCities(City cities[]) {
		this.cities = cities;
	}
}
