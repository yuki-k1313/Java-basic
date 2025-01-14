package car;

import vehicle.Vehicle;

public class ManualCar implements Vehicle {
	
	private int gear = 0;
	
	public int setGear (int gear) {
		if(gear == 0) {
			return 0;
		} else if (gear == 1) {
			return 1;
		} else if (gear == 2) {
			return 2;
		} else if (gear == 3) {
			return 3;
		} else if (gear == 4) {
			return 4;
		} else if (gear == 5) {
			return 5;
		} else if (gear == 6) {
			return 6;
		} else {
			return 0;
		}
		
	}
	
	Car car = new Car();
	
	public int getGear() {
		return gear;
	}
	
	@Override
	public void accelerate(String accel) {
		if(accel.equals("가속")) System.out.println("수동 변속기 자동차가 가속합니다!");
	}
	
	@Override
	public void stop(String stop) {
		if(stop.equals("정차")) System.out.println("수동 변속기 자동차가 정차합니다!");	
	}
	
	@Override
	public void setStart(String start) {
		if(start.equals("시동")) {
			car.setStart(true);
			System.out.println(car.isStart());
		}
	}
	
}
