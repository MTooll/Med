package payasos.med;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import payasos.med.Slider;

public class MainActivity extends Activity implements OnClickListener{
    Slider sl = new Slider();
    sl.onCreate();

    Button btnEntr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnEntr:
                break;
            default:
                break;
        }
    }
}
