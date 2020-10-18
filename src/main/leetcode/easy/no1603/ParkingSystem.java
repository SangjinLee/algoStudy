package leetcode.easy.no1603;

import java.util.HashMap;

public class ParkingSystem {
	HashMap<Integer, ParkingStatus> psMap = new HashMap<Integer, ParkingStatus>();

    public ParkingSystem(int big, int medium, int small) {
    	psMap.put(1, new ParkingStatus(big));
    	psMap.put(2, new ParkingStatus(medium));
    	psMap.put(3, new ParkingStatus(small));
    }
    
    public boolean addCar(int carType) {
    	ParkingStatus psData = psMap.get(carType);
    	if(psData.getCurrent_parking() < psData.getMax_parking()) {
    		psData.setCurrent_parking(psData.getCurrent_parking()+1);
    		psMap.replace(carType, psData);
    		return true;
    	}
    	return false;
    }

	public class ParkingStatus {
		int max_parking = 0;
		int current_parking = 0;
		ParkingStatus(int max) {
			this.max_parking = max;
		}
		public int getMax_parking() {
			return max_parking;
		}
		public int getCurrent_parking() {
			return current_parking;
		}
		public void setCurrent_parking(int current_parking) {
			this.current_parking = current_parking;
		}
	}
}
