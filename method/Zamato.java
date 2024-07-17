class Zamato{
public static double takeOrder(String foodName){
	double price=0.0;
if(foodName=="Biryani"){
   price =200.00;
   return price;
}
if(foodName=="dal fry"){
   return 90.00;
}
if(foodName=="veg combo"){
   return 290.00;
}
if(foodName=="Aloo chole"){
   return 130.00;
}
if(foodName=="matar masala"){
    return 160.00;
}
if(foodName=="sev Tamatar"){
   return 200.00;
}
if(foodName=="Matter paneer"){
   return 169.00;
}
if(foodName=="paneer korma"){
  return 170.00;
}
if(foodName=="egg bhurji"){
  return 115.00;
}
if(foodName=="chicken curry"){
  return 180.00;
}
if(foodName=="Mutton Korma"){
return 220.00;
}
if(foodName=="fish Curry"){
return 180.00;
}
if(foodName=="tawa Roti"){
return 20.00;
}
if(foodName==" Plain Rice"){
return 65.00;
}
if(foodName=="veg pulao"){
return 115.00;
}
if(foodName=="veg biryani"){
return 120.00;
}
if(foodName=="veg manchow soup"){
return 99.00;
}
if(foodName=="ChillinPaneer"){
return 169.00;
}
else{
System.out.println(foodName+"Not found");
}
return 0.00;
}
public static double takeOrder(String foodItems, int quantity){
		double price = takeOrder(foodItems);
        if (price > 0) {
			price *= quantity;
            System.out.println("Order placed for: "+foodItems+"of "+ quantity);
            return price;
		}
		else{
			 System.out.println("please select the item correctly!!");
		}
	return 0;
}	
