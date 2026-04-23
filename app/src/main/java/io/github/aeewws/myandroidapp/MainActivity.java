package io.github.aeewws.myandroidapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public final class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView label = new TextView(this);
        label.setText("MyAndroidApp starter");
        label.setTextSize(22f);
        label.setPadding(48, 96, 48, 96);

        setContentView(label);
    }
}
