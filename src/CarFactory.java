import api.Filter;
import dto.CarDto;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    public List<CarDto> getCarList() {
        List<CarDto> carList = new ArrayList<>();
        carList.add(new CarDto("Toyota", "black", 2014, "V8"));
        carList.add(new CarDto("Honda", "red", 2018, "V12"));
        carList.add(new CarDto("Hyundai", "white", 2010, "V6"));
        carList.add(new CarDto("KIA", "green", 2020, "V4"));
        return carList;
    }

    public List<CarDto> filter(List<CarDto> carList, Filter filter) {
        List<CarDto> newList = new ArrayList<>();
        for (CarDto carDto : carList) {
            if (filter.test(carDto)) {
                newList.add(carDto);
            }
        }
        return newList;
    }
}
