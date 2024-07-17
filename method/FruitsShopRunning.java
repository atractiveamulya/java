class FruitsShopRunning{
public static void main(String [] fruits){

boolean isAdd=FruitsShops.createFruiteName("Apple");
System.out.println("the added fruits are:"+isAdd);
boolean isprice=FruitsShops.addFruitsprice(200.00);
System.out.println("the added fruits are:"+isprice);
isAdd=FruitsShops.createFruiteName("Mango");
System.out.println("the added fruits are:"+isAdd);
isprice=FruitsShops.addFruitsprice(100.00);
System.out.println("the added fruits are:"+isprice);
isAdd=FruitsShops.createFruiteName("orange");
System.out.println("the added fruits are:"+isAdd);
isprice=FruitsShops.addFruitsprice(50.00);
System.out.println("the added fruits are:"+isprice);
isAdd=FruitsShops.createFruiteName("Strawberry");
System.out.println("the added fruits are:"+isAdd);
isprice=FruitsShops.addFruitsprice(300.00);
System.out.println("the added fruits are:"+isprice);
isAdd=FruitsShops.createFruiteName("pomagranet");
System.out.println("the added fruits are:"+isAdd);
isprice=FruitsShops.addFruitsprice(240.00);
System.out.println("the added fruits are:"+isprice);
isAdd=FruitsShops.createFruiteName("all fruits");
System.out.println("the added fruits are:"+isAdd);
isprice=FruitsShops.addFruitsprice(1000.00);
System.out.println("the added fruits are:"+isprice);
FruitsShops.getFruitsName();
boolean isupdates=FruitsShops.updatesFruitsName("Apple","Banana");
System.out.println("the updatesFruitsName are:"+isupdates);
FruitsShops.getFruitsName();
FruitsShops.getFruitsprice();



FruitsShops.deleteFruitName("orange");
FruitsShops.getFruitsName();

}


}