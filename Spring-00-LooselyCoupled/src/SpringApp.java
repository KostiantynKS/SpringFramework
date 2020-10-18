import services.FullTimeMentor;
import services.MentorAccount;
import services.PartTimeMentor;

public class SpringApp {
    public static void main(String[] args) {


        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        PartTimeMentor partTimeMentor = new PartTimeMentor();

        MentorAccount mentorAccount = new MentorAccount(fullTimeMentor);
        mentorAccount.manageAccount();

        MentorAccount mentorAccount2 = new MentorAccount(partTimeMentor);
        mentorAccount2.manageAccount();




    }



}
