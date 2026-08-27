import java.util.Scanner;

class Candidate {
    int Candidate_Id;
    String name;
    int aptitude;
    int technical;
    int communication;

    Candidate(int Candidate_Id, String name, int aptitude, int technical, int communication) {
        this.Candidate_Id = Candidate_Id;
        this.name = name;
        this.aptitude = aptitude;
        this.technical = technical;
        this.communication = communication;
    }

    int getTotalScore() {
        return aptitude + technical + communication;
    }
}

public class Question6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        Candidate[] c = new Candidate[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Candidate ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Aptitude: ");
            int aptitude = sc.nextInt();

            System.out.print("Enter Technical: ");
            int technical = sc.nextInt();

            System.out.print("Enter Communication: ");
            int communication = sc.nextInt();

            c[i] = new Candidate(id, name, aptitude, technical, communication);
        }

        // Sorting
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (c[j].getTotalScore() < c[j + 1].getTotalScore()) {

                    Candidate temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
                else if (c[j].getTotalScore() == c[j + 1].getTotalScore()
                        && c[j].Candidate_Id > c[j + 1].Candidate_Id) {

                    Candidate temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }

        System.out.println("\nTop " + k + " Candidates:");

        for (int i = 0; i < k; i++) {
            System.out.println(
                c[i].Candidate_Id + " " +
                c[i].name + " " +
                c[i].getTotalScore()
            );
        }
    }
}