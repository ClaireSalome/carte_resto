package ihm_p6.infsi351.ensi.fr.myapplication;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ModificationCoordActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modifier_fragment);

        //la toolbar
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);

        //UP button
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Ajouter le listener au bouton Modifier
        findViewById((R.id.modif_frag)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                modifierDonnees(v);
            }
        });

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapterFragment adapter = new PagerAdapterFragment
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    public void modifierDonnees(View v){

        ProfileActivity pa=new ProfileActivity();

        EditText e1=(EditText)findViewById(R.id.edit_nom);
        EditText e2=(EditText)findViewById(R.id.edit_prenom);
        EditText e3=(EditText)findViewById(R.id.edit_pseudo);
        EditText e4=(EditText)findViewById(R.id.edit_email);
        EditText e5=(EditText)findViewById(R.id.edit_mdp);

        pa.getNom().setText(e1.getText());
        pa.getPrenom().setText(e2.getText());
        pa.getPseudo().setText(e3.getText());
        pa.getEmail().setText(e4.getText());
        pa.getMdp().setText(e5.getText());
    }

}
