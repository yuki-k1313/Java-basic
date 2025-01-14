package train;

import vehicle.Vehicle;

public class PassengerTrain implements Vehicle {
	
	Train train = new Train();
	
	private int passengerCount = 200;
	
	public int getPassengerCount() {
		return passengerCount;
	}
	
	@Override
	public void accelerate(String accel) {
		if(accel.equals("가속")) System.out.println("여객 열차가 천천히 가속합니다!");
	}
	
	@Override
	public void stop(String stop) {
		if(stop.equals("정차")) System.out.println("여객 열차가 천천히 정차합니다!");
	}
	
	@Override
	public void setStart(String start) {
		if(start.equals("시동")) {
			train.setStart(true);
			System.out.println(train.isStart());
		}
	}

}
