import org.junit.Assert;
import org.junit.Test;
import com.company.Parking;
import com.company.Place;
import com.company.Size;
import com.company.Car;
import com.company.Truck;
import com.company.Color;


public class MyFirstTest {
    @Test
    public void ParkingTest() {
        Parking parking = Parking.getInstance();
        Size size = new Size(1,2);
        Place place = new Place(size);
        Assert.assertEquals("should be 0",0, parking.getPlaces().size());
        parking.addPlace(place);
        Assert.assertEquals("should be 1",1, parking.getPlaces().size());
        Assert.assertEquals("should be 1",1, parking.getEmptyPlace().size());
        Assert.assertEquals("should be 1",0, parking.getBusyPlaces().size());
        Car car = new Car("ABC123");
        place.setBusy(car);
        Assert.assertEquals("should be 1",0, parking.getEmptyPlace().size());
        Assert.assertEquals("should be 1",1, parking.getBusyPlaces().size());
    }
    @Test
    public void SizeTest(){
        Size size = new Size(1,2);
        Assert.assertEquals("should be 0",2, size.getLength());
        Assert.assertEquals("should be 0",1, size.getWidth());
    }
    @Test
    public void PlaceTest(){
        Size size = new Size(1,2);
        Place place = new Place(size);
        Car car = new Car("ABC123");
        Assert.assertEquals("should be true", true,place.isFree());
        place.setBusy(car);
        Assert.assertEquals("should be false", false,place.isFree());
        Assert.assertEquals("should work", car, place.getVehicle());
        Assert.assertEquals( 0, place.getPrice(),0.001);
        Assert.assertEquals("should be false", false, place.isFree());
        place.setFree();
        Assert.assertEquals("should be true", true ,place.isFree());
        Assert.assertEquals("Should be true",size,place.getSize_place());
    }
    @Test
    public void CarTest(){
        Car car = new Car("ABC123");
        Assert.assertEquals("Should be ABC123","ABC123",car.getLicense_plate());
        Size size = new Size(190,450);
        Assert.assertEquals("Should be ABC123","ABC123",car.licensePlate());
        Assert.assertEquals("Should be Car","Car",car.type());
        Assert.assertEquals("Should be 0",0,car.vehicleCharacteristic().size());
        Assert.assertEquals("Should be Car","Car",car.getType());

    }
    @Test
    public void TruckTest(){
        Truck truck = new Truck("ABC123");
        Assert.assertEquals("Should be ABC123","ABC123",truck.getLicense_plate());
        Size size = new Size(190,450);
        Assert.assertEquals("Should be ABC123","ABC123",truck.licensePlate());
        Assert.assertEquals("Should be Truck","Truck",truck.type());
        Assert.assertEquals("Should be 0",0,truck.vehicleCharacteristic().size());
        Assert.assertEquals("Should be Truck","Truck",truck.getType());

    }
    @Test
    public void ColorTest(){
        Color color = new Color("green");
        Assert.assertEquals("Should be green", "green",color.getColor());
    }

}