// Aggregation - Assignment 3
// Carson Pemble
// 11/02/2020

class Room {
    //Implement your code here
    private int roomNo;
    private int capacity;
    private static int roomCounter;

    static {
      roomCounter = 0;
    }

    public Room(){
      this.roomNo = 500 + Room.roomCounter;
      this.capacity = 4;
      Room.roomCounter++;
    }

    public int getRoomNo(){
      return this.roomNo;
    }
    public void setRoomNo(int roomNo){
      this.roomNo = roomNo;
    }

    public int getCapacity(){
      return this.capacity;
    }
    public void setCapacity(int capacity){
      this.capacity = capacity;
    }

    public static int getRoomCounter(){
        return Room.roomCounter;
    }
    public static void setRoomCounter(int roomCounter){
      Room.roomCounter = roomCounter;
    }

    //Uncomment the below method after implementation before verifying
    //DO NOT MODIFY THE METHOD

    public String toString(){
        return "Room\nroomNo: "+this.roomNo+"\ncapacity: "+this.capacity;
    }

}

class Member {
	//Implement your code here\

  private int memberId;
  private String name;
  private Room room;

  public Member (int memberId, String name){
    this.memberId = memberId;
    this.name = name;
  }

  public int getMemberId(){
    return this.memberId;
  }
  public void setMemberId(int memberId){
    this.memberId = memberId;
  }

  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }

  public Room getRoom(){
    return this.room;
  }
  public void setRoom(Room room){
    this.room = room;
  }

	//Uncomment the below method after implementation before verifying
    //DO NOT MODIFY THE METHOD
    ///*
    public String toString(){
        return "Member\nmemberId: "+this.memberId+"\nname: "+this.name;
    }
    //*/
}

class Admin {
	//Implement your code here
  public void assignRoom(Room[] rooms, Member member){

    for(Room room : rooms){
      if(room.getCapacity() > 0){
        //System.out.println(member.toString());
        member.setRoom(room);
        room.setCapacity(room.getCapacity() - 1);
        break;
      }
      else{continue;}
    }

  }


}


class Tester999 {
	public static void main(String args[]) {
		Room room1 = new Room();
		Room room2 = new Room();
		Room room3 = new Room();
		Room room4 = new Room();
		Room room5 = new Room();

		Room[] totalRooms = { room1, room2, room3, room4, room5 };

		Admin admin = new Admin();

		Member member1 = new Member(101, "Serena");
		Member member2 = new Member(102, "Martha");
		Member member3 = new Member(103, "Nia");
		Member member4 = new Member(104, "Maria");
		Member member5 = new Member(105, "Eva");

		Member[] members = { member1, member2, member3, member4, member5 };

		for (Member member : members) {
			admin.assignRoom(totalRooms, member);
			if(member.getRoom()!=null) {
				System.out.println("Hi "+member.getName()+"! Your room number is "+member.getRoom().getRoomNo());
			}
			else {
				System.out.println("Hi "+member.getName()+"! No room available");
			}
		}
	}
}
