package n2s.ehc;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class UserOptions {
    Hashtable<Integer, String> hashtable;
    UserOptions(){
        hashtable = new Hashtable<>();
    }
    public void insert(UserBean userBean) {
        hashtable.put(userBean.getUserId(), userBean.getUserName());
        System.out.println("Your Insert success !!!");
    }

    public void update(UserBean userBean) {
        hashtable.put(userBean.getUserId(), userBean.getUserName());
        System.out.println("Update success !!!");
    }

    public void delete(int userId)  {
        hashtable.remove(userId);
        System.out.println("Delete success !!!");
    }

    public void view() {
        System.out.println("View"+"\n"+"********");
        System.out.println("-------------------------------");
        System.out.printf("%5s %10s %10s", "S.NO", "Id", "Name");
        System.out.println();
        int count = 1;
        for(Map.Entry<Integer,String> entry : hashtable.entrySet()){
            System.out.printf("%5s %10s %10s", count, entry.getKey(), entry.getValue());
            count++;
            System.out.println();
        }
        System.out.println("-------------------------------");
    }

    public void exit(){
        System.out.println("Exit"+"\n"+"********");
        System.out.println("Ending the flow. Thank you!!!");
        System.exit(0);
    }

    public boolean containsUserId(int userId) {
        return hashtable.containsKey(userId);
    }
}
