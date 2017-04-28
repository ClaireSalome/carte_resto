package ihm_p6.infsi351.ensi.fr.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CompteActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compte);

        TextView connexion=(TextView)findViewById(R.id.connexion);
        setFont(connexion,"DancingScript-Regular.ttf");

        //la toolbar
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);

        //UP button
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(CompteActivity.this,LoginActivity.class);
                startActivity(in);
            }
        });
        final  Button compte = (Button)findViewById(R.id.compte);
        compte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inscription(v);

            }
        });
    }

    /**
     * retour à la page d'accueil
     * @param v
     */
    public void homePage(View v){
        Intent intent=new Intent(CompteActivity.this,MainActivity.class);
        startActivity(intent);
    }


    /**
     * Affiche une boite dialogue pour confirmer l'appel au serveur
     * @param v
     */
    public void callWaiter(View v){

        new AlertDialog.Builder(this).setMessage("Appeler un serveur ?").setPositiveButton("Oui", null).setNegativeButton("Non",null).show();
    }

    public void inscription(View v){
        startActivity(new Intent(CompteActivity.this,InscriptionActivity.class));
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
