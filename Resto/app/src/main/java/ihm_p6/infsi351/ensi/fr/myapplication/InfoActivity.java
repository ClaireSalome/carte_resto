package ihm_p6.infsi351.ensi.fr.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by Davy on 22/04/2017.
 */

public class InfoActivity extends CarteActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_produit);

        /*
        findViewById(R.id.entree).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficherMenu(v);
            }
        });
        */

    }

    public void less(View sender){
        EditText nb_produit = (EditText) findViewById(R.id.editQuantite);
        int res = Integer.parseInt(nb_produit.getText().toString());
        if (res > 1) {
            nb_produit.setText(Integer.toString(res - 1));
        }
    }

    public void more(View sender){
        EditText nb_produit = (EditText) findViewById(R.id.editQuantite);
        int res = Integer.parseInt(nb_produit.getText().toString());
        nb_produit.setText(Integer.toString(res + 1));

    }

    @Override
    public void afficherMenu(View v){
        Intent intent = new Intent(InfoActivity.this, CarteActivity.class);
        //recuperer le bouton sur lequel on a appuyé
        //findViewById(idBoutonMenu).setBackground(getResources().getDrawable(R.drawable.border_rectangle));
        //idBoutonMenu = v.getId();
        startActivity(intent);
        //super.afficherMenu(v);
    }

    public void modifCommande(View v){

    }
}
