package homework;

public class Calculator {
	

	    public int add(int a, int b) {
	        return a + b;
	    }

	    public double add(double a, double b) {
	        return a + b;
	    }

	    public int subtract(int a, int b) {
	        return a - b;
	    }

	    public double subtract(double a, double b) {
	        return a - b;
	    }

	    public int multiply(int a, int b) {
	        return a * b;
	    }

	    public double multiply(double a, double b) {
	        return a * b;
	    }

	    public int divide(int a, int b) {
	        if (b != 0) {
	            return a / b;
	        } else {
	            throw new ArithmeticException("Division by zero is not allowed.");
	        }
	    }

	    public double divide(double a, double b) {
	        if (b != 0) {
	            return a / b;
	        } else {
	            throw new ArithmeticException("Division by zero is not allowed.");
	        }
	    }

	    public static void main(String[] args) {
	        Calculator calculator = new Calculator();

	      
	        System.out.println("Toplama: " + calculator.add(7, 4));
	        System.out.println("chixma: " + calculator.subtract(7, 2));
	        System.out.println("vurma: " + calculator.multiply(5, 6));
	        try {
	            System.out.println("Bölme: " + calculator.divide(18, 2));
	          ;
	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}


