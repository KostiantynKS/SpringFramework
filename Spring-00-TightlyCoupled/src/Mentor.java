public class Mentor {

        FullTimeMentor fullTimeMentor;
        PartTimeMentor partTimeMentor;

        //MI
        public Mentor(FullTimeMentor fullTimeMentor, PartTimeMentor partTimeMentor) { //MI
            this.fullTimeMentor = fullTimeMentor;
            this.partTimeMentor = partTimeMentor;
        }
        public void manageAccount(){
            fullTimeMentor.createAccount();
            partTimeMentor.createAccount();
            //MI
        }

        // Tighly Coupled means when an object depends on another object
    // This isn't a good coding practice


    }

