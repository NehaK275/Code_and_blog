package LSP;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Member> myList = new ArrayList<Member>();

        myList.add(new lifetime("Neha", new Date()));
        myList.add(new Annualmember("Kumari", new Date()));
        myList.add(new Enquiryuser("Singh"));
        for (Member c : myList) {
            c.addToDatabase();
        }
    }
}