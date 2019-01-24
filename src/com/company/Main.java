package com.company;

public class Main {

    public static void main(String[] args) {
	HW41 hw41 = new HW41();
	hw41.connect();
	System.out.println(hw41.getAllTrainersAndTheirSalary());
	System.out.println(hw41.getAllTrainersSalary("salary"));
    }
}
