package com.example.demo;

public class CalculateSumImp {
	private DataService dataService;

public int calculate(int[] number) {
	int sum = 0;
	for(int value:number) {
		sum+=value;
	}
	return sum;
}
public int sumUsingService() {
	int sum = 0;
	int[] data = dataService.getAllData();
	for(int value:data) {
		sum += value; 
	}
	return sum;
}

public void setDataService(DataService dataService) {
	this.dataService = dataService;
}
}
