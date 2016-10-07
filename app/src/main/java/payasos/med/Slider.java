package payasos.med;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by Admin on 03.10.2016.
 */

public class Slider extends Activity implements SeekBar.OnSeekBarChangeListener
{
        public TextView mTextValue;

        @Override
        public void onCreate(Bundle savedInstanseState){
            super.onCreate(savedInstanseState);
            setContentView(R.layout.activity_main);

            final SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar2);
            mTextValue = (TextView)findViewById(R.id.textView2);
            mTextValue.setText("0");

        }

        @Override
        public void onProgressChanged(SeekBar seekBar,int progress, boolean fromUser){
            mTextValue.setText(String.valueOf(seekBar.getProgress()));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar){ }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar){

            mTextValue.setText(String.valueOf(seekBar.getProgress()));
        }


}
