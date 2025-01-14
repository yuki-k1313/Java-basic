package car;

import vehicle.Vehicle;

public class AutomaticCar implements Vehicle {
	
	Car car = new Car();
	
	@Override
	public void accelerate(String accel) {
		if(accel.equals("가속")) System.out.println("자동 변속기 자동차가 가속합니다!");
	}
	
	@Override
	public void stop(String stop) {
		if(stop.equals("정차")) System.out.println("자동 변속기 자동차가 정차합니다!");
	}
	
	@Override
	public void setStart(String start) {
		if(start.equals("시동")) {
			car.setStart(true);
			System.out.println(car.isStart());
		}
	}

}
