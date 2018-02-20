package extopoint.suganya.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button1 Toast Action", Toast.LENGTH_SHORT).show();
                FragmentTransaction gg = getSupportFragmentManager().beginTransaction();
                Fragment fragment = new FirstFragment();
                gg.add(R.id.container, fragment);
                gg.commitAllowingStateLoss();

            }


        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button 2 Toast Action", Toast.LENGTH_SHORT).show();
                FragmentTransaction gg = getSupportFragmentManager().beginTransaction();
                Fragment fragment = new SecondFragment();
                gg.add(R.id.container, fragment);
                gg.addToBackStack("fragmentTwo");
                gg.commitAllowingStateLoss();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button 3 Toast Action", Toast.LENGTH_SHORT).show();
                FragmentTransaction gg = getSupportFragmentManager().beginTransaction();
                Fragment fragment = new ThirdFragment();
                gg.replace(R.id.container, fragment);
                gg.addToBackStack("fragmentThree");
                gg.commitAllowingStateLoss();

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager=getSupportFragmentManager();

                Log.e("ACTIVITY","-----> "+fragmentManager.getBackStackEntryCount());

            }
        });



    }


}
