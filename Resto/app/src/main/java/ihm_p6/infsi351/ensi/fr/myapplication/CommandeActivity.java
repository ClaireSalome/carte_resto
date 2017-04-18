package ihm_p6.infsi351.ensi.fr.myapplication;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CommandeActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commande);


    }
    /**
     * retour à la page d'accueil
     * @param v
     */
    public void homePage(View v){
        Intent intent=new Intent(CommandeActivity.this,MainActivity.class);
        startActivity(intent);
    }


    /**
     * Affiche une boite dialogue pour confirmer l'appel au serveur
     * @param v
     */
    public void callWaiter(View v){

        new AlertDialog.Builder(this).setMessage("Appeler un serveur ?").setPositiveButton("Oui", null).setNegativeButton("Non",null).show();
    }

    /**
     * Modifier la langue
     * @param v
     */
    public void changeLanguage(View v){
        //TODO
    }

    /**
     * Affiche l'ensemble des commandes de la table
     * @param v
     */
    public void entireOrder(View v){
        //TODO
    }

    public void validateOrder(View v){
        new AlertDialog.Builder(this).setMessage("Toute la table est-elle prête à commander?").setPositiveButton("Oui", null).setNegativeButton("Non",null).show();
    }
}
