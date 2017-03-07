package hr.fer.zemris.java.hw01;

import java.util.Scanner;

import java.text.DecimalFormat; 

/**
 * Program koji ispisuje povrsinu i opseg pravokutnika. 
 * Sirina i visina se unose preko naredbenog retka. 
 * Ukoliko se argumenti ne unesu  korisnik ih unosi preko tipkovnice.
 * Ukoliko se unese broj argumenata razlicit od 0 i 2 ispisuje se poruka 
 * i program prekida sa radom. 
 * 
 *
 * @author Tina Maric
 * @version 1.0
 */


public class Rectangle {

	  /**
	   * Metoda od koje kreće izvođenje programa.
	   *
	   * @param args argumenti zadani preko naredbenog retka. 
	   * Prvi argument predstavlja sirinu, drugi argument predstavlja visinu pravokutnika
	   */
//	
//	public static void main(String[] args) {
//		if(args.length == 2) {
//			double width = 0, height = 0;
//			try {
//				width = Double.parseDouble(args[0]);
//				height = Double.parseDouble(args[1]);
//			} catch(NumberFormatException ex) {
//				System.out.println("Oba ragumenta moraju biti brojevi!");
//				System.exit(1);
//			}
//			if(width < 0 || height < 0) {
//				System.out.println("Visina i sirina ne mogu biti negativni brojevi!");
//				System.exit(1);
//			} else {
//				printAreaAndPerimeter(width, height);
//			}
//		} else if(args.length == 0) {
//			Scanner sc = new Scanner(System.in);
//			double width, height;
//			while(true) {
//				System.out.printf("Unesite sirinu > ");
//				if(sc.hasNextDouble()) {
//					width = sc.nextDouble();
//					if(width < 0) {
//						System.out.println("Unijeli ste negativnu vrijednost");
//						continue;
//					} else {
//						break;
//					}
//				} else {
//					String elem = sc.next();
//					System.out.printf("'%s' se ne moze protumaciti kao broj.%n", elem);
//				}
//			}	
//			while(true) {
//				System.out.printf("Unesite visinu > ");
//				if(sc.hasNextDouble()) {
//					height = sc.nextDouble();
//					if(height < 0) {
//						System.out.println("Unijeli ste negativnu vrijednost");
//						continue;
//					} else {
//						break;
//					}
//				} else {
//					String elem = sc.next();
//					System.out.printf("'%s' se ne moze protumaciti kao broj.%n", elem);
//				}
//			}
//			printAreaAndPerimeter(width, height);
//			sc.close();
//		} else {
//			System.out.println("Krivi broj unesenih argumenata!");
//			System.exit(1);
//		}
//
//
	
	
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.0");
		if(args.length == 2) {
			double width = 0, height = 0;
			String args0 = args[0];
			String args1 = args[1];
			args0 = args0.replaceAll(",",".");		
			args1 = args1.replaceAll(",",".");
			
			try {
				width = Double.parseDouble(args0);
				height = Double.parseDouble(args1);
			} catch(NumberFormatException ex) {
				System.out.println("Oba ragumenta moraju biti brojevi!");
				System.exit(1);
			}
			
			if(width < 0 || height < 0) {
				System.out.println("Visina i sirina ne mogu biti negativni brojevi!");
				System.exit(1);
			} else {
				double area = calculateArea(width, height);
				double perimeter = calculatePerimeter(width, height);
				System.out.println("Pravokutnik sirine " + df.format(width) + " i visine "
						+ df.format(height) + " ima povrsinu " + df.format(area) 
						+ " te opseg " + df.format(perimeter));
			}
		} else if(args.length == 0) {
			Scanner sc = new Scanner(System.in);
			double width = getDecimalValue("sirinu", sc);
			double height = getDecimalValue("visinu", sc);
			double area = calculateArea(width, height);
			double perimeter = calculatePerimeter(width, height);
			System.out.println("Pravokutnik sirine " + df.format(width) + " i visine "
					+ df.format(height) + " ima povrsinu " + df.format(area) 
					+ " te opseg " + df.format(perimeter));
			sc.close();
		} else {
			System.out.println("Krivi broj unesenih argumenata!");
			System.exit(1);
		}

	}
	
	/**
	   * Metoda koja racuna povrsinu pravokutnika.
	   *
	   * @param width sirina pravokutnika
	   * @param height visina pravokutnika
	   * @return izracunata povrsina pravokutnika
	   */
	
	public static double calculateArea(double width, double height) {
		double area = width * height;
		return area;
	}
	
	
	/**
	   * Metoda koja racuna opseg pravokutnika.
	   *
	   * @param width sirina pravokutnika
	   * @param height visina pravokutnika
	   * @return izracunati opseg pravokutnika
	   */
	
	public static double calculatePerimeter(double width, double height) {
		double perimeter = 2 * (width +  height);
		return perimeter;
	}
	
	
	/**
	   * Metoda koja racuna povrsinu i opseg pravokutnika te ih ispisuje.
	   *
	   * @param width sirina pravokutnika
	   * @param height visina pravokutnika
	   * 
	   */
	
	public static void printAreaAndPerimeter(double width, double height) {
		double surface = width * height;
		double extent = 2 * (width + height);
		System.out.printf("Pravokutnik sirine %f i visine %f ima povrsinu %f te opseg %f.%n", width, height, surface, extent);
	}
	
	/**
	   * Metoda koja od korisnika trazi da unese decimalan broj.
	   *
	   * @param type sto zelimo da korisnik unese (visinu ili sirinu)
	   * @param sc tekst scanner koji parsira  prmitivne tipove i stringove
	   * @return value ispravno unesen decimalni broj
	   * 
	   */
	
//	public static double getDecimalValue(String type, Scanner sc) {
//		while(true) {
//			double value;
//			System.out.printf("Unesite " + type + " > ");
//			if(sc.hasNextDouble()) {
//				value = sc.nextDouble();
//				if(value < 0) {
//					System.out.println("Unijeli ste negativnu vrijednost");
//					continue;
//				} else {
//					return value;
//				}
//			} else {
//				String elem = sc.next();
//				System.out.printf("'%s' se ne moze protumaciti kao broj.%n", elem);
//			}
//		}
//	}
	
	public static double getDecimalValue(String type, Scanner sc) {
		while(true) {
			double value;
			System.out.printf("Unesite " + type + " > ");
			if(sc.hasNext()) {
				String elem = sc.next();
				elem = elem.replaceAll(",",".");		
				try {
					value = Double.parseDouble(elem);
				} catch(NumberFormatException ex) {
					System.out.printf("'%s' se ne moze protumaciti kao broj.%n", elem);
					continue;
				}
				if(value < 0) {
					System.out.println("Unijeli ste negativnu vrijednost");
					continue;
				} else {
					return value;
				}
			} 
		}
	}

}
