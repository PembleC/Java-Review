import java.util.ArrayList;
import java.util.List;

class Participant2 {
    private String participantName;
    private String participantTalent;
    private double participantScore;

    public Participant2(String participantName, String participantTalent, double participantScore) {
        this.participantName = participantName;
        this.participantTalent = participantTalent;
        this.participantScore = participantScore;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getParticipantTalent() {
        return participantTalent;
    }

    public void setParticipantTalent(String participantTalent) {
        this.participantTalent = participantTalent;
    }

    public double getParticipantScore() {
        return participantScore;
    }

    public void setParticipantScore(double participantScore) {
        this.participantScore = participantScore;
    }

    @Override
    public String toString() {
        return "Participant Name: "+getParticipantName()+", Participant Talent: "+getParticipantTalent()+", Participant Score: "+getParticipantScore();
    }

}


class Tester8 {

    public static List<Participant2> generateListOfFinalists(Participant2[] finalists) {
        // Implement your logic here and change the return statement accordingly
        List<Participant2> finalistsList = new ArrayList<>();
        for (Participant2 fin : finalists){
            finalistsList.add(fin);
        }
        return finalistsList;
    }

    public static List<Participant2> getFinalistsByTalent(List<Participant2> finalists, String talent) {
        // Implement your logic here and change the return statement accordingly
        List<Participant2> finalistsList = new ArrayList<>();

        for (Participant2 fin : finalists){
            if(fin.getParticipantTalent() == talent){
                finalistsList.add(fin);
            } else { continue; }
        }

        return finalistsList;
    }

    public static void main(String[] args) {
        Participant2 finalist1 = new Participant2("Hazel", "Singing", 91.2);
        Participant2 finalist2 = new Participant2("Ben", "Instrumental", 95.7);
        Participant2 finalist3 = new Participant2("John", "Singing", 94.5);
        Participant2 finalist4 = new Participant2("Bravo", "Singing", 97.6);

        Participant2[] finalists = { finalist1, finalist2, finalist3, finalist4 };

        List<Participant2> finalistsList = generateListOfFinalists(finalists);

        System.out.println("Finalists");
        for (Participant2 finalist : finalistsList)
            System.out.println(finalist);

        String talent = "Singing";
        System.out.println("Finalists in " + talent + " category");

        List<Participant2> finalistsCategoryList = getFinalistsByTalent(finalistsList, talent);
        for (Participant2 finalist : finalistsCategoryList)
            System.out.println(finalist);
    }

}