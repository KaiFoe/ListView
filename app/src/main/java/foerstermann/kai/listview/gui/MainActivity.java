package foerstermann.kai.listview.gui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import foerstermann.kai.listview.R;
import foerstermann.kai.listview.logic.MainActivityListener;

public class MainActivity extends AppCompatActivity {

    MainActivityListener mainActivityListener;
    Button button;
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.mainactivity_layout);


        listView = findViewById(R.id.listview);

        mainActivityListener = new MainActivityListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return mainActivityListener.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return mainActivityListener.onOptionsItemSelected(item);
    }
}
