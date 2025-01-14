package train;

import vehicle.Vehicle;

public class FreightTrain implements Vehicle {
	
	Train train = new Train();
	
	private double cargoWeight = 100.0;
	
	public double getCargoWeight() {
		return cargoWeight;
	}

	@Override
	public void accelerate(String accel) {
		if(accel.equals("가속")) System.out.println("화물 열차가 느리게 가속합니다!");
	}
	
	@Override
	public void stop(String stop) {
		if(stop.equals("정차")) System.out.println("화물 열차가 느리게 정차합니다!");
	}
	
	@Override
	public void setStart(String start) {
		if(start.equals("시동")) {
			train.setStart(true);
			System.out.println(train.isStart());
		}
	}

}
