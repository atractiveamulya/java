class GiriasRunner{

public static void main(String [] args){
boolean ishomeAppliance=Girias.createhomeAppliances("Laptop");
System.out.println("the homeAppliance name is:"+ishomeAppliance);
ishomeAppliance=Girias.createhomeAppliances("Phone");
System.out.println("the homeAppliance name is:"+ishomeAppliance);
ishomeAppliance=Girias.createhomeAppliances("TV");
System.out.println("the homeAppliance name is:"+ishomeAppliance);
ishomeAppliance=Girias.createhomeAppliances("Mixer");
System.out.println("the homeAppliance name is:"+ishomeAppliance);
ishomeAppliance=Girias.createhomeAppliances("fan");
System.out.println("the homeAppliance name is:"+ishomeAppliance);
ishomeAppliance=Girias.createhomeAppliances("washing machine");
System.out.println("the homeAppliance name is:"+ishomeAppliance);
ishomeAppliance=Girias.createhomeAppliances("Ac");
System.out.println("the homeAppliance name is:"+ishomeAppliance);
ishomeAppliance=Girias.createhomeAppliances("Smart TV");
System.out.println("the homeAppliance name is:"+ishomeAppliance);
ishomeAppliance=Girias.createhomeAppliances("Smart Phone");
System.out.println("the homeAppliance name is:"+ishomeAppliance);
ishomeAppliance=Girias.createhomeAppliances("coller");
System.out.println("the homeAppliance name is:"+ishomeAppliance);
ishomeAppliance=Girias.createhomeAppliances("airdriar");
System.out.println("the homeAppliance name is:"+ishomeAppliance);
ishomeAppliance=Girias.createhomeAppliances("Heater");
System.out.println("the homeAppliance name is:"+ishomeAppliance);


Girias.gethomeAppliances();

boolean isupdatehomeAppliance=Girias.updateHomeAppliances("Laptop","mobile");
System.out.println("the homeAppliance name is:"+isupdatehomeAppliance);
 
Girias.gethomeAppliances();
}
}