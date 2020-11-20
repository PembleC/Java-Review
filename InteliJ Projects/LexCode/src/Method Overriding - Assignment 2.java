// Method Overriding - Assignment 2
// Carson Pemble
// 11/02/2020

class Event{
    //Implement your code here
    private String eventName;
    private String participantName;
    private double registrationFee;

    public Event(String eventName, String participantName){
        this.eventName = eventName;
        this.participantName = participantName;
    }

    public void registerEvent(){
      switch(eventName){
        case "Singing":
          registrationFee = 8;
          break;
        case "Dancing":
          registrationFee = 10;
          break;
        case "DigitalArt":
          registrationFee = 12;
          break;
        case "Acting":
          registrationFee = 15;
          break;
        default:
          registrationFee = 0;
          break;
      }

    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }
}

class SoloEvent extends Event{
    //Implement your code here
    private int participantNo;

    public SoloEvent(String eventName, String participantName, int participantNo){
      super(eventName, participantName);
      this.participantNo = participantNo;
    }

    public void registerEvent(){
      super.registerEvent();
    }

    public int getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }
}

class TeamEvent extends Event{
    //Implement your code here
    private int noOfParticipants;
    private int teamNo;

    public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo){
      super(eventName, participantName);
      this.noOfParticipants = noOfParticipants;
      this.teamNo = teamNo;
    }

    public void registerEvent(){
      switch(getEventName()){
        case "Singing":
          setRegistrationFee(4 * noOfParticipants);
          break;
        case "Dancing":
          setRegistrationFee(6 * noOfParticipants);
          break;
        case "DigitalArt":
          setRegistrationFee(8 * noOfParticipants);
          break;
        case "Acting":
          setRegistrationFee(10 * noOfParticipants);
          break;
        default:
          setRegistrationFee(0);
          break;
      }
    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }
}

class Tester26 {

    public static void main(String[] args) {

        SoloEvent soloEvent = new SoloEvent("Dancing", "Jacob", 1);
        soloEvent.registerEvent();
        if (soloEvent.getRegistrationFee() != 0) {
            System.out.println("Thank You " + soloEvent.getParticipantName()
                    + " for your participation! Your registration fee is $" + soloEvent.getRegistrationFee());
            System.out.println("Your participant number is " + soloEvent.getParticipantNo());

        } else {
            System.out.println("Please enter a valid event");
        }

        System.out.println();
        TeamEvent teamEvent = new TeamEvent("Acting", "Serena", 5, 1);
        teamEvent.registerEvent();
        if (teamEvent.getRegistrationFee() != 0) {
            System.out.println("Thank You " + teamEvent.getParticipantName()
                    + " for your participation! Your registration fee is $" + teamEvent.getRegistrationFee());
            System.out.println("Your team number is " + teamEvent.getTeamNo());
        } else {
            System.out.println("Please enter a valid event");
        }
    }
}
