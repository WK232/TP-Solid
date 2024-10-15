package solution;

public class CarManager
{
    private CarRepository carRepository = new CarRepository();
    private CarFormatter carFormatter = new CarFormatter();
    private CarEvaluator carEvaluator = new CarEvaluator();

    public Car getFromDb(String carId) {
        return carRepository.getFromDb(carId);
    }

    public String getCarsNames() {
        return carFormatter.getCarsNames(carRepository.getAllCars());
    }

    public Car getBestCar() {
        return carEvaluator.getBestCar(carRepository.getAllCars());
    }
}


