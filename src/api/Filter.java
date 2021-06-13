package api;

import dto.CarDto;

public interface Filter {
    boolean test(CarDto carDto);
}
