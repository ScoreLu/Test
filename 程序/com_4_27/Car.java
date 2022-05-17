package com_4_27;

import java.util.Objects;

public class Car {
		private String carbrand;

		private String carcolor;

		public Car() {
		}

		public Car(String carbrand, String carcolor) {
		this.carbrand = carbrand;
		this.carcolor = carcolor;
		}

		public String getCarbrand() {
		return carbrand;
		}

		public void setCarbrand(String carbrand) {
		this.carbrand = carbrand;
		}

		public String getCarcolor() {
		return carcolor;
		}

		public void setCarcolor(String carcolor) {
		this.carcolor = carcolor;
		}
		  @Override
	        public boolean equals(Object o) {
	            if (this == o) return true;
	            if (!(o instanceof Car)) return false;
	            Car car = (Car) o;
	            return Objects.equals(getCarbrand(), car.getCarbrand()) &&
	                    Objects.equals(getCarcolor(), car.getCarcolor());
	       
    }
}
