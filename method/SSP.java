class SSP{
static String nM;
static String lN;
static long phoNo;
static double adharNo;
static boolean iscardNum;
static String el;
static String ps;
static String conPws;
static String Ads;

public static boolean scholorship(String name,String lastName,long phoneNumber,
long adharCardNumber,boolean isadharcardNumber,String email,String pws,String confirmPws,String Address){
boolean isSSPscholorship=true;
nM=name;
lN=lastName;
phoNo=phoneNumber;
adharNo=adharCardNumber;
iscardNum=isadharcardNumber;
el=email;
ps=pws;
conPws=confirmPws;
Ads=Address;
return isSSPscholorship;
}
public static void getScholorship(){
System.out.println("name:"+nM);
System.out.println("lastName:"+lN);
System.out.println("PhoneNumber:"+phoNo);
System.out.println("adharCardNumber:"+adharNo);
System.out.println("isadharcardNumber:"+iscardNum);
System.out.println("email:"+el);
System.out.println("pws:"+ps);
System.out.println("confirmPws:"+conPws);
System.out.println("address:"+Ads);

}
}