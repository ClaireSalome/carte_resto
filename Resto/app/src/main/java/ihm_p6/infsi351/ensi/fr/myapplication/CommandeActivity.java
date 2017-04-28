package ihm_p6.infsi351.ensi.fr.myapplication;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


public class CommandeActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commande);

        //la toolbar
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);

        //UP button
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //displayOrder() ;

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
        if(findViewById(R.id.all_orders).getVisibility()== View.GONE){
            findViewById(R.id.all_orders).setVisibility(View.VISIBLE);
            ((Button)findViewById(R.id.commande_complete)).setText(R.string.commande_cachee);

        } else {
            findViewById(R.id.all_orders).setVisibility(View.GONE);
            ((Button)findViewById(R.id.commande_complete)).setText(R.string.commande_complete);
        }
    }

    public void validateOrder(View v){
        new AlertDialog.Builder(this).setMessage("Toute la table est-elle prête à commander?").setPositiveButton("Oui", null).setNegativeButton("Non",null).show();
    }

    public void displayOrder() {

        ArrayList<String> commande = MainActivity.getOrder();
        LinearLayout layout = (LinearLayout) findViewById(R.id.your_order);
        for(int i=0; i<commande.size(); i++){
            //layout
            LinearLayout ll = new LinearLayout(this);
            ll.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            ll.setId(Integer.parseInt("+@id/order_"+i));
            //Intitulé
            String[] intitules = commande.get(i).split("_");
            TextView quantite = new TextView(this);
            quantite.setText(intitules[0]);
            TextView intitule = new TextView(this);
            intitule.setText(intitules[1]);
            TextView prix = new TextView(this);
            prix.setText(intitules[2]);

            ll.addView(quantite);ll.addView(intitule);ll.addView(prix);
            layout.addView(ll);
        }
    }
}
