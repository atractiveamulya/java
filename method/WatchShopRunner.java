class WatchShopRunner{
public static void main(String [] args){

boolean isAdd=WatchShop.addWatchShop("Fastrack");
System.out.println("the Watch Name is:"+isAdd);
isAdd=WatchShop.addWatchShop("jaeger");
System.out.println("the Watch Name is:"+isAdd);
isAdd=WatchShop.addWatchShop("Omega");
System.out.println("the Watch Name is:"+isAdd);
isAdd=WatchShop.addWatchShop("Longines");
System.out.println("the Watch Name is:"+isAdd);
isAdd=WatchShop.addWatchShop("Girard perregaux");
System.out.println("the Watch Name is:"+isAdd);
isAdd=WatchShop.addWatchShop("Vacheron");
System.out.println("the Watch Name is:"+isAdd);
isAdd=WatchShop.addWatchShop("Alexander");
System.out.println("the Watch Name is:"+isAdd);
isAdd=WatchShop.addWatchShop("casio");
System.out.println("the Watch Name is:"+isAdd);
isAdd=WatchShop.addWatchShop("Hublot");
System.out.println("the Watch Name is:"+isAdd);
isAdd=WatchShop.addWatchShop("Glashutte");
System.out.println("the Watch Name is:"+isAdd);

WatchShop.getWatch();

boolean isUpdatedName=WatchShop.updatedWatchNames("Fastrack","smartwatch");
System.out.println("the Watch Name is:"+isUpdatedName);
WatchShop.getWatch();
}
}