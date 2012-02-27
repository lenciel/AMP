package org.lenciel.android;

import org.apache.commons.lang.StringUtils;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AMPSampleActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        String toast = StringUtils.repeat("Hello ProGuard! ", 3);
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();

        // Rename Bomb.javaold to Bomb.java and uncomment
        // the line below to see the crash
        // new Bomb().explode();
    }

    public void myClickHandler(View customView) {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
    }

    public void unusedMethod() {
        System.out.println("I'm not used anywhere!");
    }
}