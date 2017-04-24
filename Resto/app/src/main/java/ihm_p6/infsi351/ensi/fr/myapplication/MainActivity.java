package ihm_p6.infsi351.ensi.fr.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private int[] langue=new int[2];
    private String[] l=new String[2];
    private int i=0;
    /**
     * pour stocker ce que le client va commander
     */
    private List<String> commande = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.langue).setBackgroundResource(R.drawable.francais);



        langue[0]=R.drawable.francais;
        langue[1]=R.drawable.anglais;

        //Ajouter le listener au bouton left_btn
        findViewById((R.id.left_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defilerAgauche(v);
            }
        });

        //Ajouter le listener au bouton right_btn
        findViewById(R.id.right_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defilerAdroite(v);
            }
        });


        //Ajouter le listener au bouton "Carte"
        findViewById(R.id.carte_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficherCarte(v);
            }
        });

        //Ajouter le listener au bouton "Compte"
        findViewById(R.id.compte_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficherCompte(v);
            }
        });
    }


    //Cette fonction permet d'afficher la carte du restaurant
    public void afficherCarte(View v){
        Intent intent=new Intent(MainActivity.this,CarteActivity.class);
        startActivity(intent);
    }

    public void afficherCompte(View v){
        Intent intent= new Intent(MainActivity.this,CompteActivity.class);
        startActivity(intent);
    }

    public void defilerAgauche(View v){
        if(i==0){
            findViewById(R.id.langue).setBackgroundResource(R.drawable.francais);
        }
        else{
            i=1;
            findViewById(R.id.langue).setBackgroundResource(R.drawable.anglais);
            Toast.makeText(this,"COUCOU_Gauche",Toast.LENGTH_LONG).show();
        }
    }

    public void defilerAdroite(View v){
        if(i==1){
            findViewById(R.id.langue).setBackgroundResource(R.drawable.francais);
        }
        else{
            i=0;
            findViewById(R.id.langue).setBackgroundResource(R.drawable.anglais);
            Toast.makeText(this,"COUCOU_Droite",Toast.LENGTH_LONG).show();
        }
    }


    public List<String> getCommande(){
        return commande;
    }

    public void setCommande(List<String> l){

    }
}
