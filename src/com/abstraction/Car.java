package com.abstraction;

abstract class Car {
	//Every car will have a registrated number
	
	int regno;
    Car(int r){
    	regno=r;
    	
    }
	//all cars will have a fuel tank
    //and same mechanism to open a tank
    
    void opentank(){
    	System.out.println("fill the tank");
    }
    //all cars will have a steering but different cars will have
    //different mechanism
    abstract void steering(int direction, int angle);
    
    abstract void braking(int force);
    

    
	

}
