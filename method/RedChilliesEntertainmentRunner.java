class RedChilliesEntertainmentRunner{

public static void main(String [] args){
boolean ismovieActors=RedChilliesEntertainment.addMovieActors("Mohanlal");
System.out.println("the actors name is:"+ismovieActors);
ismovieActors=RedChilliesEntertainment.addMovieActors("Thilakan");
System.out.println("the actcors name is:"+ismovieActors);
ismovieActors=RedChilliesEntertainment.addMovieActors("Ranjini Jose");
System.out.println("the actor name is:"+ismovieActors);
ismovieActors=RedChilliesEntertainment.addMovieActors("Mrudula murali");
System.out.println("the actcors name is:"+ismovieActors);
ismovieActors=RedChilliesEntertainment.addMovieActors("Leena Maria");
System.out.println("the actcors name is:"+ismovieActors);
ismovieActors=RedChilliesEntertainment.addMovieActors("Biju Menon");
System.out.println("theactcors name is:"+ismovieActors);
ismovieActors=RedChilliesEntertainment.addMovieActors("Vijaraghavan");
System.out.println("the actcors name is:"+ismovieActors);
ismovieActors=RedChilliesEntertainment.addMovieActors("Ruksha");
System.out.println("the actcorsname is:"+ismovieActors);
ismovieActors=RedChilliesEntertainment.addMovieActors("DhanyaMary");
System.out.println("the actcors name is:"+ismovieActors);
RedChilliesEntertainment.getmovieActors();

boolean isupdatemovieActors=RedChilliesEntertainment.updatesmovieActorsNames("Mohanlal","arjun");
System.out.println("the actors name is:"+isupdatemovieActors);
isupdatemovieActors=RedChilliesEntertainment.updatesmovieActorsNames("Ruksha","Mahesh");
System.out.println("the actors name is:"+isupdatemovieActors);

RedChilliesEntertainment.getmovieActors();


RedChilliesEntertainment.deletemovieActors("Thilakan");
RedChilliesEntertainment.getmovieActors();
}
}
//gold shop ,