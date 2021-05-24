package intellect;

import org.testng.annotations.BeforeTest;


import org.testng.annotations.Test;

import driverScript.Driver;
import pages.ResultPage;
import pages.SearchPage;  

public class TestCase extends Driver{
	
	@BeforeTest 
	public void setData() { 
		testCaseName = "Best Itinerary which is lowest in price and has a short travel duration";
	 testDescription ="Best Flight";
	 category = "Smoke";
	 authors= "Anita";
	 testNodes = "Flights";
	 dataSheetName="SelectFlight";  
	} 
	
	@Test(dataProvider="fetchData") 
	public void selectFlight(String from,String to) throws InterruptedException {
		new SearchPage()
		.clickFlights()
		.clickRoundTrip()
		.from()
		.input(from)
		.source()
		.input2(to)
		.dest()
		.month()
		.onDate()
		.backDate()
		.clickSearch()
		.nonStopChennai()
		.nonStopDelhi()
		.totalFlightsFromChe()
		.onMinPrice()
		.selectFlightFromChennai()
		.totalFlightsFromDelhi()
		.returnMinPrice()
		.selectFlightFromDelhi();
		
	}

}
