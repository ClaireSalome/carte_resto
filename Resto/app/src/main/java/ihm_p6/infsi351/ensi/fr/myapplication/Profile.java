package ihm_p6.infsi351.ensi.fr.myapplication;

/**
 * Created by sarra on 17/04/17.
 */

public class Profile {
    // classe qui stock les donné du profil d'un client
    private String nom;
    private String prenom;
    private String pseudo;
    private String tit;
    private String num;
    private String crypto;
    public Profile(String nom,String prenom, String pseudo,String tit,String num,String crypto){
        this.nom=nom;
        this.prenom=prenom;
        this.prenom=pseudo;
        this.tit=tit;
        this.num = num;
        this.crypto= crypto;

    }
}
