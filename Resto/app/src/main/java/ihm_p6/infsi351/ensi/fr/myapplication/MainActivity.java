package ihm_p6.infsi351.ensi.fr.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.graphics.Typeface;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String[] l=new String[2];
    private int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);

        TextView nomResto=(TextView)findViewById(R.id.nomResto);
        setFont(nomResto,"AlexBrush-Regular.ttf");

        //la vue langue
        l[0]="Français";
        l[1]="English";
        TextView langue=(TextView)findViewById(R.id.langue);
        langue.setText(l[0]);
        setFont(langue,"AlexBrush-Regular.ttf");

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

    //Acceder au compte d'un client
    public void afficherCompte(View v){
        Intent intent= new Intent(MainActivity.this,CompteClientActivity.class);
        startActivity(intent);
    }

    public void defilerAgauche(View v){
        TextView langue=(TextView)findViewById(R.id.langue);
        if(i==1){
            i=0;
            langue.setText(l[0]);
            setFont(langue,"AlexBrush-Regular.ttf");
        }
    }

    public void defilerAdroite(View v){
        TextView langue=(TextView)findViewById(R.id.langue);
        if(i==0){
            i=1;
            langue.setText(l[1]);
            setFont(langue,"AlexBrush-Regular.ttf");
        }
    }

    public void setFont(TextView textView, String fontName) {
        if(fontName != null){
            try {
                Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/" + fontName);
                textView.setTypeface(typeface);
            } catch (Exception e) {
                Log.e("FONT", fontName + " not found", e);
            }
        }
    }

}