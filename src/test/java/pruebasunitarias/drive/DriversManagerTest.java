package pruebasunitarias.drive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DriversManagerTest {

	private DriversManager driversManager = new DriversManager();
	
	@DisplayName("Pruebas en el metodo addPassenger")
	
	@Test
	void isAddPassenger() {
		Passenger passenger1 = new Passenger("Reyna", "RASD");
		driversManager.addPassenger(passenger1);
		assertEquals(passenger1,driversManager.getPassenger("RASD"));
	}
	
	
	
	
	
	@Test
	void isAddDriver() {
		Driver driver1 = new Driver("Reyna", "RASD", 52.5);
		driversManager.addDriver(driver1);
		assertEquals(driver1,driversManager.getDriver("RASD"));
	}

}
