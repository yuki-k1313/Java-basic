package execution;

import car.AutomaticCar;
import car.Car;
import car.ManualCar;
import train.FreightTrain;
import train.PassengerTrain;
import train.Train;

public class Execution {
	
	public static void main(String[] args) {
		ManualCar manualCar = new ManualCar();
		AutomaticCar automaticCar = new AutomaticCar();
		Car manuCar = new Car();
		Car autoCar = new Car();
		
		PassengerTrain passengerTrain = new PassengerTrain();
		FreightTrain freightTrain = new FreightTrain();
		Train pasTrain = new Train();
		Train freTrain = new Train();
		
		// 수동차량
		manuCar.setColor("blue");
		manuCar.setVin("10가1234");
		manuCar.setStart(false);
		manualCar.setGear(manualCar.getGear());
		System.out.println("{ 차량번호 = " + manuCar.getVin() + ", 색상 = " + manuCar.getColor() 
		+ ", 시동 상태 = " + manuCar.isStart() + ", 기어상태 = " + manualCar.setGear(manualCar.getGear()) + " }");
		
		// 자동차량
		autoCar.setVin("10가1234");
		autoCar.setColor("blue");
		autoCar.setStart(false);
		System.out.println("{ 차량번호 = " + autoCar.getVin() + ", 색상 = " + autoCar.getColor() 
		+ ", 시동 상태 = " + autoCar.isStart() + " }");
		
		// 여객열차
		pasTrain.setTrainNumber("KTX001");
		pasTrain.setArrivalStation("서울");
		pasTrain.setDepartureStation("부산");
		pasTrain.setStart(false);
		passengerTrain.getPassengerCount();
		System.out.println("{ 열차번호 = " + pasTrain.getTrainNumber() + ", 출발역 = " + pasTrain.getArrivalStation() 
		+ ", 도착역 = " + pasTrain.getDepartureStation() + ", 시동상태 = " + pasTrain.isStart() + ", 탑승객 수 = " + passengerTrain.getPassengerCount() +" }");
		
		// 화물열차
		freTrain.setTrainNumber("Cargo001");
		freTrain.setArrivalStation("부산");
		freTrain.setDepartureStation("구미");
		freTrain.setStart(true);
		freightTrain.getCargoWeight();
		System.out.println("{ 열차번호 = " + freTrain.getTrainNumber() + ", 출발역 = " + freTrain.getArrivalStation() 
		+ ", 도착역 = " + freTrain.getDepartureStation() + ", 시동상태 = " + freTrain.isStart() + ", 화물무게 = " + freightTrain.getCargoWeight() +" }");
		
	}
	
}
