package ihm_p6.infsi351.ensi.fr.myapplication;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View ;

/**
 * Created by lila on 07/04/17.
 */

public class CarteActivity extends AppCompatActivity{

    private int idViewVisible=R.id.menu_pdj;
    private int idBoutonMenu = R.id.platJour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carte);

        findViewById(idViewVisible).setVisibility(View.VISIBLE);
        findViewById(idBoutonMenu).setBackgroundColor(Color.GRAY);

    }

    public void afficherMenu(View v){

        // ne plus afficher la vue actuelle
        findViewById(idViewVisible).setVisibility(View.GONE);
        // ne plus opacifié le menu sur lequel on était
        findViewById(idBoutonMenu).setBackgroundColor(Color.WHITE);
        findViewById(idBoutonMenu).setBackground(getResources().getDrawable(R.drawable.border_rectangle));
        idBoutonMenu = v.getId();
        //regarder quel est le menu à afficher
        if(idBoutonMenu == R.id.platJour)
            idViewVisible = R.id.menu_pdj ;
        if(idBoutonMenu == R.id.entree)
            idViewVisible = R.id.menu_entree;
        /*if(idBoutonMenu == R.id.plat)
            idViewVisible = R.id.menu_plat;
        if(idBoutonMenu == R.id.dessert)
            idViewVisible == R.id.menu_dessert;
        if(idBoutonMenu == R.id.boisson)
            idViewVisible = R.id.menu_boisson ;*/

        //afficher le menu
        findViewById(idViewVisible).setVisibility(View.VISIBLE);
        // grisé le bouton du menu sur lequel on est
        findViewById(idBoutonMenu).setBackgroundColor(Color.GRAY);
    }
}
