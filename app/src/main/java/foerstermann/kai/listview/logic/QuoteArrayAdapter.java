package foerstermann.kai.listview.logic;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import foerstermann.kai.listview.R;
import foerstermann.kai.listview.model.Quote;

public class QuoteArrayAdapter extends ArrayAdapter<Quote> {

    private Context context;
    private List<Quote> quoteList;
    private LayoutInflater layoutInflater;

    private Resources resources;
    private String packageName;

    public QuoteArrayAdapter(Context context, List<Quote> quoteList) {
        super(context, R.layout.listview_row, quoteList);

        this.context = context;
        this.quoteList = quoteList;
        layoutInflater = LayoutInflater.from(context);

        this.resources = context.getResources();
        this.packageName = context.getPackageName();

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Erzeugen der View-Hierarchie auf Grundlage des Zeilenlayouts
        View rowView;
        if (convertView == null) {
            rowView = layoutInflater.inflate(R.layout.listview_row, parent, false);
        } else {
            rowView = convertView;
        }

        //Anfordern des zur Listenposition gehörenden Datenobjektes
        Quote currentQuote = quoteList.get(position);

        //Finden der einzelnen View-Objekte
        TextView txtvQuoteText = (TextView) rowView.findViewById(R.id.txtvQuoteText);
        TextView txtvQuoteAutor = (TextView) rowView.findViewById(R.id.txtvQuoteAutor);

        //Füllen der View-Objekte mit den passenden Inhalten des Datenobjekts
        txtvQuoteText.setText("\"" +currentQuote.getQuoteText() + "\"");
        txtvQuoteAutor.setText(currentQuote.getQuoteAutor());

        //Rückgabe der befüllten View-Hierarchie an die aufrufende AdapterView
        return rowView;
    }


}
