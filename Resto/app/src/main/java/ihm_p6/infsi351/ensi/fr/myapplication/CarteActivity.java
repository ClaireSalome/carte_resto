package ihm_p6.infsi351.ensi.fr.myapplication;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View ;
import android.widget.Toast;

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
        if(idBoutonMenu == R.id.plat)
            idViewVisible = R.id.menu_plat;
        if(idBoutonMenu == R.id.dessert)
            idViewVisible = R.id.menu_dessert;
        if(idBoutonMenu == R.id.boisson)
            idViewVisible = R.id.menu_boisson ;

        //afficher le menu
        findViewById(idViewVisible).setVisibility(View.VISIBLE);
        // grisé le bouton du menu sur lequel on est
        findViewById(idBoutonMenu).setBackgroundColor(Color.GRAY);
    }


    public void afficherSousMenuEntree(View v){
        if (v.getId() == R.id.entree_f) {
            if (findViewById(R.id.ssmenu_entreef).getVisibility() == View.GONE) {
                findViewById(R.id.ssmenu_entreef).setVisibility(View.VISIBLE);
                v.setBackground(getResources().getDrawable(R.drawable.up_arrow));
            } else {
                findViewById(R.id.ssmenu_entreef).setVisibility(View.GONE);
                v.setBackground(getResources().getDrawable(R.drawable.down_arrow));
            }
        }
        if (v.getId() == R.id.entree_c) {
            if (findViewById(R.id.ssmenu_entreec).getVisibility() == View.GONE) {
                findViewById(R.id.ssmenu_entreec).setVisibility(View.VISIBLE);
                v.setBackground(getResources().getDrawable(R.drawable.up_arrow));
            } else {
                findViewById(R.id.ssmenu_entreec).setVisibility(View.GONE);
                v.setBackground(getResources().getDrawable(R.drawable.down_arrow));
            }
        }
    }


    public void afficherSousMenuBoisson(View v){

        if(v.getId() == R.id.eau) {
            if (findViewById(R.id.ssmenu_eau).getVisibility() == View.GONE) {
                findViewById(R.id.ssmenu_eau).setVisibility(View.VISIBLE);
                v.setBackground(getResources().getDrawable(R.drawable.up_arrow));
            } else {
                findViewById(R.id.ssmenu_eau).setVisibility(View.GONE);
                v.setBackground(getResources().getDrawable(R.drawable.down_arrow));
            }
        }
        if(v.getId() == R.id.boisson_f){
            if (findViewById(R.id.ssmenu_boisson_f).getVisibility() == View.GONE) {
                findViewById(R.id.ssmenu_boisson_f).setVisibility(View.VISIBLE);
                v.setBackground(getResources().getDrawable(R.drawable.up_arrow));
            } else {
                findViewById(R.id.ssmenu_boisson_f).setVisibility(View.GONE);
                v.setBackground(getResources().getDrawable(R.drawable.down_arrow));
            }
        }
        if(v.getId() == R.id.boisson_c){
            if (findViewById(R.id.ssmenu_boisson_c).getVisibility() == View.GONE) {
                findViewById(R.id.ssmenu_boisson_c).setVisibility(View.VISIBLE);
                v.setBackground(getResources().getDrawable(R.drawable.up_arrow));
            } else {
                findViewById(R.id.ssmenu_boisson_c).setVisibility(View.GONE);
                v.setBackground(getResources().getDrawable(R.drawable.down_arrow));
            }
        }
        if(v.getId() == R.id.vin){
            if (findViewById(R.id.ssmenu_vin).getVisibility() == View.GONE) {
                findViewById(R.id.ssmenu_vin).setVisibility(View.VISIBLE);
                v.setBackground(getResources().getDrawable(R.drawable.up_arrow));
            } else {
                findViewById(R.id.ssmenu_vin).setVisibility(View.GONE);
                v.setBackground(getResources().getDrawable(R.drawable.down_arrow));
            }
        }
    }
}
