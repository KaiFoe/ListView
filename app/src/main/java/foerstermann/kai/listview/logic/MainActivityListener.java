package foerstermann.kai.listview.logic;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import foerstermann.kai.listview.R;
import foerstermann.kai.listview.gui.MainActivity;
import foerstermann.kai.listview.model.Quote;

public class MainActivityListener {

    MainActivity mainActivity;
    Quote quote;

    private List<Quote> SampleQuoteList = new ArrayList<>();

    public MainActivityListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;

        createQuoteList();
        bindAdapterToListView();
    }



    private void createQuoteList() {
        String[] quotesText = mainActivity.getResources().getStringArray(R.array.sample_quotes);
        String[] quotesAutor = mainActivity.getResources().getStringArray(R.array.quote_authors);

        for (int i = 0; i <= quotesText.length -1; i++) {
            SampleQuoteList.add(new Quote(quotesText[i], quotesAutor[i]));
        }
    }

    private void bindAdapterToListView() {
        QuoteArrayAdapter quoteArrayAdapter = new QuoteArrayAdapter(mainActivity, SampleQuoteList);
        mainActivity.listView.setAdapter(quoteArrayAdapter);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        mainActivity.getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_01:
                Toast.makeText(mainActivity.getApplicationContext(), "Eintrag 1 wurde geklickt", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_02:
                Toast.makeText(mainActivity.getApplicationContext(), "Eintrag 2 wurde geklickt", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
