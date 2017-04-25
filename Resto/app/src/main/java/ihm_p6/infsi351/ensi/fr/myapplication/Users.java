package ihm_p6.infsi351.ensi.fr.myapplication;

import java.util.HashMap;


public class Users {
    private static HashMap<String,Profile> users = new HashMap<>();
    public static boolean add(String pseudo, Profile p){
        if(users.containsKey(pseudo))
            return false;
        else{
            users.put(pseudo,p);
            return true;
        }
    }
}
