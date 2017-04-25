package ihm_p6.infsi351.ensi.fr.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InscriptionActivity extends AppCompatActivity{

    private String titulaire ="toto";
    private String num = "123456789";
    private String crypto = "123";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription);

        //la toolbar
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);

        //UP button
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView titre=(TextView)findViewById(R.id.titre);
        setFont(titre,"DancingScript-Regular.ttf");

        TextView coord=(TextView)findViewById(R.id.coord);
        setFont(coord,"DancingScript-Regular.ttf");

        final Button login = (Button) findViewById(R.id.valideNewCompte);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nom = (EditText) findViewById(R.id.newName);
                EditText prenom = (EditText) findViewById(R.id.newPrenom);
                EditText pseudo = (EditText) findViewById(R.id.newPseudo);
                EditText num = (EditText) findViewById(R.id.newNum);
                EditText tit = (EditText) findViewById(R.id.titulaire);
                EditText crypto = (EditText) findViewById(R.id.crypto);
                Intent in ;
                //verifie que tous les champs sont rempli
                if(! (isValide(nom.getText().toString(),prenom.getText().toString(),
                        pseudo.getText().toString(),tit.getText().toString(),
                        num.getText().toString(),crypto.getText().toString()))) {
                    Toast.makeText(InscriptionActivity.this,"Erreur, veuilez remplir tous les champs",Toast.LENGTH_LONG).show();

                }
                else{
                    //verifie que pseudo n'est pas deja existant
                    if(Users.add(pseudo.getText().toString(),new Profile(nom.getText().toString(),
                            prenom.getText().toString(),pseudo.getText().toString(),
                            tit.getText().toString(),num.getText().toString(),crypto.getText().toString()))) {
                        in = new Intent(InscriptionActivity.this, CompteClientActivity.class);
                        startActivity(in);
                    }
                    else{

                        Toast.makeText(InscriptionActivity.this,"Votre mot de passe ou votre identifiant n'est pas reconnu",Toast.LENGTH_LONG).show();
                    }
                }


            }
        });
    }
    // not use
    public boolean cBValide(String titulaire, String num, String crypto){
        if(this.titulaire.equals(titulaire) && this.num.equals(num) && this.crypto.equals(crypto))
            return true;
        return false;
    }
    //use
    public boolean isValide(String nom, String prenom, String pseudo,String titulaire, String num, String crypto){
        if(nom.equals("")||prenom.equals("") || pseudo.equals("") ||titulaire.equals("") ||num.equals("")||crypto.equals("") )
            return false;
        return true;

    }

    /**
     * retour à la page d'accueil
     * @param v
     */
    public void homePage(View v){
        Intent intent=new Intent(InscriptionActivity.this,MainActivity.class);
        startActivity(intent);
    }

    /**
     * Affiche une boite dialogue pour confirmer l'appel au serveur
     * @param v
     */
    public void callWaiter(View v){

        new AlertDialog.Builder(this).setMessage("Appeler un serveur ?").setPositiveButton("Oui", null).setNegativeButton("Non",null).show();
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
