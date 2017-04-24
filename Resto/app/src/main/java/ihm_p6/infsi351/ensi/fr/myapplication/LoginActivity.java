package ihm_p6.infsi351.ensi.fr.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by sarra on 15/04/17.
 */

public class LoginActivity  extends Activity{
    private String ident = "toto";
    private String mdp = "toto";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        final Button login = (Button) findViewById(R.id.valideLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText id = (EditText) findViewById(R.id.identifiant);
                EditText pass = (EditText) findViewById(R.id.password);
                Intent in;
                if(valide(id.getText().toString(),pass.getText().toString())) {

                     in = new Intent(LoginActivity.this, ProfileActivity.class);
                    startActivity(in);

                }
                else{
                    TextView err = (TextView) findViewById(R.id.errorLogin);
                    err.setText("Votre mot de passe ou votre identifiant n'est pas reconnu");
                   // in = new Intent(LoginActivity.this, ErrorLoginActivity.class);

                }

            }
        });
    }

    public boolean valide (String id, String pass){
        if(id.equals(ident) && pass.equals(mdp))
            return true;
        return false;
    }
}
