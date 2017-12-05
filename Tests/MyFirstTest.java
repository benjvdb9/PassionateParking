import org.junit.Assert;
import org.junit.Test;
import com.company.Parking;
import com.company.Place;
import com.company.Size;
import com.company.Car;


public class MyFirstTest {
    @Test
    public void ParkingTest() {
        Parking parking = Parking.getInstance();
        Size size = new Size(1,2);
        Place place = new Place(size);
        Assert.assertEquals("should be true", true,place.isFree());
        Car car = new Car("ABC123");
        place.setBusy(car);
        Assert.assertEquals("should be false", false,place.isFree());
        Assert.assertEquals("should work", car, place.getVehicle());
        Assert.assertEquals( 0, place.getPrice(),0.001);
        Assert.assertEquals("should be false", false, place.isFree());
        place.setFree(car);
        Assert.assertEquals("should be true", true ,place.isFree());
        Assert.assertEquals("Should be true",size,place.getSize_place());

    }
}