import api.Filter;
import dto.CarDto;
import impl.FilterByModel;

import java.util.List;

public class App {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        List<CarDto> carList = carFactory.getCarList();
        Filter filterByModel = new FilterByModel("Honda");
        // Фильтрация без лямбды
        List<CarDto> newList = carFactory.filter(carList, filterByModel);
        // Фильтрация с лямбдой
        newList = carFactory.filter(carList, carDto -> "Honda".equalsIgnoreCase(carDto.getModel()));
        System.out.println(newList);
    }
}
