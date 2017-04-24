package ihm_p6.infsi351.ensi.fr.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.test.suitebuilder.TestMethod;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by lila.
 */

public class ProfileActivity extends AppCompatActivity {

    private TextView edit_nom;
    private TextView edit_prenom;
    private TextView edit_email;
    private TextView edit_mdp;
    private TextView edit_pseudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afficher_profile);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Récupérer  les données d'un client dasn la vue profile
         edit_nom=(TextView)findViewById(R.id.edit_nom);
         edit_prenom=(TextView)findViewById(R.id.edit_prenom);
         edit_pseudo=(TextView)findViewById(R.id.edit_pseudo);
         edit_email=(TextView)findViewById(R.id.edit_email);
         edit_mdp=(TextView)findViewById(R.id.edit_mdp);
    }

    public TextView getNom(){
        return edit_nom;
    }

    public TextView getPrenom(){
        return edit_prenom;
    }

    public TextView getMdp(){
        return edit_mdp;
    }

    public TextView getEmail(){
        return edit_email;
    }

    public TextView getPseudo(){
        return edit_pseudo;
    }


    public void setPrenom(EditText et){ edit_prenom.setText(et.getText());}

    public void setPseudo(EditText et){
        edit_pseudo.setText(et.getText());
    }

    public void seEmail(EditText et){
        edit_email.setText(et.getText());
    }

    public void setMdp(EditText et){
        edit_mdp.setText(et.getText());
    }

    public void setNom(EditText et){ edit_nom.setText(et.getText());}

}


