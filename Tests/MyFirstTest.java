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
        Assert.assertEquals("should be true",place.isFree(), true);
        Car car = new Car("AVW696");
        place.setBusy(car);
        Assert.assertEquals("should be false",place.isFree(), false);

    }
}