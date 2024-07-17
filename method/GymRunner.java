class GymRunner{

public static void main(String [] args){
boolean isequipments=Gym.createGymEquipments("Dombbells");
System.out.println("the gym equipments name is:"+isequipments);
isequipments=Gym.createGymEquipments("FlatBench");
System.out.println("the gym equipments name is:"+isequipments);
isequipments=Gym.createGymEquipments("peckDeck");
System.out.println("the gym equipments name is:"+isequipments);
isequipments=Gym.createGymEquipments("Situp Bench");
System.out.println("the gym equipments name is:"+isequipments);
isequipments=Gym.createGymEquipments("barBell");
System.out.println("the gym equipments name is:"+isequipments);
isequipments=Gym.createGymEquipments("Tire");
System.out.println("the gym equipments name is:"+isequipments);
isequipments=Gym.createGymEquipments("Parallel Bar");
System.out.println("the gym equipments name is:"+isequipments);
isequipments=Gym.createGymEquipments("leg press machine");
System.out.println("the gym equipments name is:"+isequipments);

Gym.getGymEquipments();

boolean isupdates=Gym.updatesgymEquipments("Dombbells","Running");
System.out.println("the gym equipments name is:"+isupdates);

Gym.getGymEquipments();

Gym.deleteEquipmentName("peckDeck");
Gym.getGymEquipments();
}
}
