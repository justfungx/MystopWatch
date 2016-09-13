package tw.org.iii.mystopwatch;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private Button btnLeft , btnRight;
    private boolean isRunning;
    private TextView clock;
    private  int counter;
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clock =(TextView)findViewById(R.id.clock);
        btnLeft = (Button)findViewById(R.id.btnLeft);
        btnRight =(Button)findViewById(R.id.btnRight);

    }


    // Reset / Lap
    public void doLeft(View v){
        if (isRunning){
            doLap();
        }else{
            doReset();
        }
    }
    // Start / Stop
    public void btnRight(View v) {
        isRunning = !isRunning;
        btnRight.setText(isRunning?"Stop":"Start");
        btnLeft.setText(isRunning?"Lap":"Reset");
        if (isRunning){
            doStart();
        }else{
            doStop();
        }
    }

    private void doStart(){

    }
    private void doStop(){

    }
    private void doLap(){

    }
    private void doReset(){

    }
    public class UITask extends Handler{
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            clock.setText(""+counter);

        }
    }

    public  class CountTask extends TimerTask{
        @Override
        public void run() {
            counter++;
        }
    }
}