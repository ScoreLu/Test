package com_4_26;
public class Car {		
	private static int carnumber;
	private static String carbrand;
	private static int cardate;
	private static int carprices;
	private static int hostnumber;

	public static void main(String[] args){

		    //无参构造方法
	}
		    public  Car(String string, int i) {
		 
		    }
		 
		    //有参构造方法
		    public  Car( int carnumber, String carbrand, int cardate, int carprices, int hostnumber) {
		        Car.carnumber = carnumber;
		        Car.carbrand = carbrand;
		        Car.cardate = cardate;
		        Car.carprices = carprices;
		        Car.hostnumber = hostnumber;
		    } 
		    
		    public int getCarnumber() {
		        return carnumber;
		    }
		 
		    public void setCarnumber( int carnumber) {
		    	Car.carnumber = carnumber;
		    }
		 
		    public String getCarbrand() {
		        return carbrand;
		    }
		 
		    public void setCarbrand(String carbrand) {
		    	Car.carbrand = carbrand;
		    }
            public int getCardate() {
              return cardate;
             }

            public void setCardate( int cardate) {
            	Car.cardate = cardate;
            }
		    public int getCarprices() {
		        return carprices;
		    }
		 
		    public void setCarprices( int carprices) {
		    	Car.carprices = carprices;
		  

	        }public int getHostnumber() {
           return hostnumber;
            }
 
            public void setHostnumber( int hostnumber) {
            	Car.hostnumber = hostnumber;
                      
            }
			public void printer() {
		        		System.out.println("汽车编号=" + carnumber + ", 汽车品牌=" +carbrand + ", 汽车出厂日期=" + cardate +",汽车价格= "+carprices+"万, 车主编号="+ hostnumber );
				
			}
         
			}
            
        	
  

	
	


