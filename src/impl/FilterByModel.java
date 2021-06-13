package impl;

import api.Filter;
import dto.CarDto;

public class FilterByModel implements Filter {
    private String model;

    public FilterByModel(String model) {
        this.model = model;
    }

    @Override
    public boolean test(CarDto carDto) {
        return carDto.getModel().equalsIgnoreCase(model);
    }
}
