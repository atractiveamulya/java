class FoodPanda{
public static double takeOrder(String foodname){
if(foodname== "Burger"){
	return 100.00;
}
if(foodname=="pancakes"){
	return 500.00;
}
if(foodname=="bagel"){
	return 459.00;
}
if(foodname=="Quesadila"){
    return 150.00;
}
if(foodname=="burrito"){
    return  269.00;
}
if(foodname=="cheeseburger"){
    return  160.00;
}
if(foodname=="Hot Dog"){
    return  159.00;
}
if(foodname=="popcorn"){
    return 189.00;
}
if(foodname=="Muffin"){
    return 189.00;
}
if(foodname=="Tacos"){
    return 69.00;
}
if(foodname=="Sandwich"){
	return 149.00;
}
if(foodname=="sushi"){
	return 338.00;
}
if(foodname=="egg"){
	return 30.00;
}
if(foodname=="Donut"){
	return 129.00;
}
if(foodname=="croissant"){
	return 648.00;
}
if(foodname=="ice cream"){
    return 198.00;
}
else{
	System.out.println(foodname+"Not found");
}
return 0.0;
}
}
