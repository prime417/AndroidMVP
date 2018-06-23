package primer.com.androidmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainMVP.view{

  private  Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new Presenter(this);
    }

    public void msg(View view) {
        presenter.clickedToastButton();
    }


    @Override
    public void displayToastMessage() {
        Toast.makeText(this,"Good to go", Toast.LENGTH_SHORT).show();
    }
}
