class GoldShopRunner{
	
	
public static void main(String [] args){
System.out.println("the main started");


boolean isaddGoldNames=GoldShop.addGoldName("chaine");
System.out.println("the gold names"+isaddGoldNames);
isaddGoldNames=GoldShop.addGoldName("ring");
System.out.println("the gold names"+isaddGoldNames);
isaddGoldNames=GoldShop.addGoldName("braslet");
System.out.println("the gold names"+isaddGoldNames);
isaddGoldNames=GoldShop.addGoldName("erings");
System.out.println("the gold names"+isaddGoldNames);
isaddGoldNames=GoldShop.addGoldName("neckless");
System.out.println("the gold names"+isaddGoldNames);
isaddGoldNames=GoldShop.addGoldName("longchain");
System.out.println("the gold names"+isaddGoldNames);
isaddGoldNames=GoldShop.addGoldName("goldring");
System.out.println("the gold names"+isaddGoldNames);

GoldShop.getgoldshop();
boolean isupdateGoldName=GoldShop.updateGoldName("chaine","goldring");
System.out.println("the gold names"+isupdateGoldName);

GoldShop.getgoldshop();
System.out.println("the main ended");

}
}