package by.htp.les05.main;

import by.htp.les05.main.City;
import by.htp.les05.main.Country;
import by.htp.les05.main.District;
import by.htp.les05.main.Region;

public class Main {
	public static void main(String[] args) {

		City city1 = new City("Gomel");
		city1.setRegionCenter(true);
		City city2 = new City("Brest");
		city2.setRegionCenter(true);
		City city3 = new City("Vitebsk");
		city3.setRegionCenter(true);
		City city4 = new City("Mogilev");
		city4.setRegionCenter(true);
		City city5 = new City("Minsk");
		city5.setRegionCenter(true);
		City city6 = new City("Grodno");
		city6.setRegionCenter(true);

District district1 = new District("Gomelsky");
district1.setCities(new City[] {city1});
District district2 = new District("Brestsky");
district2.setCities(new City[] {city2});
District district3 = new District("Vitebsky");
district3.setCities(new City[] {city3});
District district4 = new District("Mogilevsky");
district4.setCities(new City[] {city4});
District district5 = new District("Minsky");
district5.setCities(new City[] {city5});
District district16 = new District("Grodnensky");
district16.setCities(new City[] {city6});

Region region1 = new Region("Gomelskaya");
region1.setRegionArea(40);
region1.setDistricts(district1);

Region region2  = new Region("Brestskaya");
region2.setRegionArea(60);
region2.setDistricts(district2);

Region region3 = new Region("Vitebskaya");
region3.setRegionArea(20);
region3.setDistricts(district3);

Region region4 = new Region("Mogilevskaya");
region4.setRegionArea(50);
region4.setDistricts(district4);

Region region5 = new Region("Minskaya");
region5.setRegionArea(23);
region5.setDistricts(district5);


Region region6 = new Region("Grodnenskaya");
region6.setRegionArea(45);
region6.setDistricts(district6);


Country myCountry = new Country("Belarus", city5);


myCountry.printCapital();


Region regions [] = new Region[] {region1, region2, region3, region4, region5, region6};


myCountry.setRegions(regions);


System.out.println("Regions count is " +  myCountry.getRegions().length);

System.out.println("Total country area is " + myCountry.countArea());

region1.printCenter();
region2.printCenter();
region3.printCenter();
region4.printCenter();
region5.printCenter();
region6.printCenter();



	}

}
