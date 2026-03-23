import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int phishingLikelyhood = 0;
        final int phishingPoints[] = {2, 2, 1, 1, 1, 1, 1, 2,
                3, 3, 3, 1, 1, 1, 1, 1, 2, 2, 3, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1};

        final String[] phishingWords = {
                "amazon", "official", "bank", "security", "urgent", "alert",
                "important", "information", "ebay", "password", "credit", "verify",
                "confirm", "account", "bill", "immediately", "address", "telephone",
                "pps", "charity", "check", "secure", "personal", "confidential",
                "atm", "warning", "fraud", "citibank", "irs", "paypal"};


        try {
            File file = new File("C:\\Users\\K00318346\\IdeaProjects\\AdvOOProgP08\\phishing.txt");

            FileReader fr = new FileReader(file);

            BufferedReader br = new BufferedReader(fr);

            System.out.println(br);

            String line;

            while ((line = br.readLine()) != null)
            {

                line = line.toLowerCase();

                StringTokenizer st = new StringTokenizer(line);
                while (st.hasMoreTokens())
                {
                    String word = st.nextToken();
                    for (int i = 0; i < phishingWords.length-1; i++)
                    {

                        if (word.equals(phishingWords[i]))
                        {
                            System.out.println("Suspicious word: " + phishingWords[i] + " + " + phishingPoints[i] + " points");
                            phishingLikelyhood += phishingPoints[i];
                        }

                }

            }



                }
            System.out.println("The likelyhood that this email is a phishing scam is: " + phishingLikelyhood);

        } catch (IOException ex) {
            System.out.println("IO Error");
        }




    }
}
