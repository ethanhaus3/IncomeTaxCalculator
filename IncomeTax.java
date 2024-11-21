package edu.sbcc.cs105;

public class IncomeTax {
        private double income; // instance variables
        public double incomeTax;
        double remainingIncome;
        double taxOnFirst50 = 50000 * 0.01; //variables to add for incometax
    	double taxOn75 = 25000 * 0.02;
    	double taxOn100 = 25000 * 0.03;
    	double taxOn250 = 150000 * 0.04;
    	double taxOn500 = 250000 * 0.05;
        // Constructor to set income of object
        public IncomeTax(final double income) {
        	this.income = income;
        	
        }

        // Method to get income tax calculated  of Object
        // @returns income tax as double
        public double getIncomeTax() { // else if chain to calculate income tax
        	if (income < 50000) {
                incomeTax = income * 0.01;
                return incomeTax;
        	}
        	else if (income < 75000) {
        		remainingIncome = income - 50000;
        		incomeTax = (remainingIncome * 0.02) + taxOnFirst50;
        		return incomeTax;
        	}
        	else if (income < 100000) {
        		remainingIncome = income - 75000;
        		incomeTax = (remainingIncome * 0.03) + taxOnFirst50 + taxOn75;
        		return incomeTax;
        	}
        	else if (income < 250000) {
        		remainingIncome = income - 100000;
        		incomeTax = (remainingIncome *0.04) + taxOnFirst50 + taxOn75 + taxOn100;
        		return incomeTax;
        	}
        	else if (income < 500000) {
        		remainingIncome = income - 250000;
        		incomeTax = (remainingIncome * 0.05) + taxOnFirst50 + taxOn75 + taxOn100 + taxOn250;
        		return incomeTax;
        	}
        	else {
        		remainingIncome = income - 500000;
        		incomeTax = (remainingIncome * 0.06) + taxOnFirst50 + taxOn75 + taxOn100 + taxOn250 + taxOn500;
        		return incomeTax;
        	}
        }
}
