package tw.org.iii.mystopwatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnLeft , btnRight;
    private boolean isRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLeft = (Button)findViewById(R.id.btnLeft);
        btnRight =(Button)findViewById(R.id.btnRight);
    }

    public void btnLeft(View v) {


    }
    public void btnRight(View v) {
        isRunning = !isRunning;
        btnRight.setText(isRunning?"Stop":"Start");
        btnLeft.setText(isRunning?"Lap":"Reset");
    }

}

