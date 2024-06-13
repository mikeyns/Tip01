public class Tip01 {
public static void main(String[] args) {
//Find everyone's indivudlal total after tax (5%) and tip (15%)
double tax = 0.05;
double tip = 0.15;
double personl = 10;
double totall = personl* (1 +tax +tip); 
System.out.println("person1: " + totall);
double person2 = 12;
double total2 = person2* (1 +tax +tip); 
System.out.println("person2: " + total2);
double person3 = 9; 
double total3 = person3* (1 +tax +tip); 
System.out.println("person3: " + total3);
double person4 = 8;
double total4 = person4* (1 +tax +tip); 
System.out.println("person4: " + total4);
double person5 = 7;
double total5 = person5* (1 +tax +tip);
System.out.println("person5: " + total5);
double person6 = 15;
double total6 = person6* (1 +tax +tip); 
System.out.println("person6: " + total6);
double person7 = 11;
double total7 = person7*(1+tax +tip);
System.out.println("person7: " + total7);
double person8 = 30;
double total8 = person8*(1+tax +tip);
System.out.println("person8: " + total8);
}
}