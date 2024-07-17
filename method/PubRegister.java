class PubRegister{
static String uN;
static String emailAds;
static long phoNo;
static String ps;
static String conPws;


public static boolean getDetail(String userName,String emailAdress,long phoneNumber,
String pws,String confirmPws){
boolean isPUBRegister=true;
uN=userName;
emailAds=emailAdress;
phoNo=phoneNumber;
ps=pws;
conPws=confirmPws;
return isPUBRegister;
}
public static void readDetail(){
System.out.println("userNname:"+uN);
System.out.println("emailAdress:"+emailAds);
System.out.println("PhoneNumber:"+phoNo);
System.out.println("pws:"+ps);
System.out.println("confirmPws:"+conPws);

}
}