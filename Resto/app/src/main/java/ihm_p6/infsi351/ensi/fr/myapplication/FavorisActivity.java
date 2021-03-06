package ihm_p6.infsi351.ensi.fr.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by idrilila on 23/04/2017.
 */

public class FavorisActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afficher_favoris);

        //la toolbar
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);

        //UP button
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /**
     * retour à la page d'accueil
     * @param v
     */
    public void homePage(View v){
        Intent intent=new Intent(FavorisActivity.this,MainActivity.class);
        startActivity(intent);
    }


    /**
     * Affiche une boite dialogue pour confirmer l'appel au serveur
     * @param v
     */
    public void callWaiter(View v){

        new AlertDialog.Builder(this).setMessage("Appeler un serveur ?").setPositiveButton("Oui", null).setNegativeButton("Non",null).show();
    }
}
