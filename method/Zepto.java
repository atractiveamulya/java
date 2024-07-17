class Zepto{
public static double takeOrder(String foodname){
if(foodname== "apple"){
	return 150.00;
}
if(foodname=="zepto cafe"){
	return 350.00;
}
if(foodname=="toys and games"){
	return 559.00;
}
if(foodname=="Apparel"){
    return 109.00;
}
if(foodname=="packaged food"){
    return  65.00;
}
if(foodname=="meats,fishand egg"){
    return  115.00;
}
if(foodname=="Tea"){
    return  149.00;
}
if(foodname=="babycare"){
    return 109.00;
}
if(foodname=="5star"){
    return 105.00;
}
if(foodname=="Bun Maska"){
    return 159.00;
}
if(foodname=="Mini Ghee"){
	return 125.00;
}
if(foodname=="Pain au chocolat"){
	return 129.00;
}
if(foodname=="milk"){
	return 15.00;
}
if(foodname=="chocolate chip muffin"){
	return 95.00;
}
if(foodname=="Poha"){
	return 244.00;
}
if(foodname=="Steamed Butter Chicken bao"){
    return 129.00;
}
else{
	System.out.println(foodname+"Not found");
}
return 0.0;
}
}
