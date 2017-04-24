package ihm_p6.infsi351.ensi.fr.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lila on 20/04/17.
 */

public class InformationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.information_fragment, container, false);

        //Ajouter le listener à la vue afficher_profile
        view.findViewById(R.id.profil_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficherProfile(v);
            }
        });
        view.findViewById(R.id.profil).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficherProfile(v);
            }
        });


        //Ajouter le listener à la vue points de fidélité
        view.findViewById(R.id.ponts_fidelité_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficherPoints2Fedilite(v);
            }
        });
        view.findViewById(R.id.points_fidilité).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficherPoints2Fedilite(v);
            }
        });

        //Ajouter le listener à la vue menus afficher_allergies
        view.findViewById(R.id.allergie_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficherAllergies(v);
            }
        });
        view.findViewById(R.id.allergies).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficherAllergies(v);
            }
        });

        //Ajouter le listener à la vue menus afficher_favoris
        view.findViewById(R.id.menus_favoris_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficherFavoris(v);
            }
        });
        view.findViewById(R.id.menus_favoris).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficherFavoris(v);
            }
        });


        //Ajouter le listener à la vue menus afficher_favoris
        view.findViewById(R.id.deconnexion_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seDeconnecter(v);
            }
        });

        //Ajouter le listener à la vue passer commande
        view.findViewById(R.id.passer_commande_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficherCarte(v);
            }
        });

        return view;
    }

    public void afficherProfile(View v){
        //Changer de fragment...Ne marche pas completement
       /** FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.pager, new ProfileActivity());
        transaction.addToBackStack(null);
        transaction.commit();*/

       startActivity(new Intent(getActivity(),ProfileActivity.class));
    }

    public void afficherPoints2Fedilite(View v){
        startActivity(new Intent(getActivity(),PointFideliteActivity.class));
    }

    public void afficherFavoris(View v){
        startActivity(new Intent(getActivity(),FavorisActivity.class));
    }

    public void seDeconnecter(View v){
        Intent intent=new Intent(getActivity(),MainActivity.class);
        startActivity(intent);
    }

    public void afficherCarte(View v){
        Intent intent=new Intent(getActivity(),CarteActivity.class);
        startActivity(intent);
    }

    public void afficherAllergies(View v){
        startActivity(new Intent(getActivity(),AllergiesActivity.class));
    }

    //Pour détruire une vue
   /** @Override
    public void onDestroyView()
    {
        FragmentManager mFragmentMgr= getFragmentManager();
        FragmentTransaction mTransaction = mFragmentMgr.beginTransaction();
        mTransaction.remove(this);
        mTransaction.commit();
        super.onDestroyView();
    }*/

}
