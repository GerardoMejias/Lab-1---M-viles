package cr.ac.itcr.labfragments;

/**
 * Created by Gerardo on 9/3/2016.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

public class CountryList extends ListFragment {

    // Array of strings storing country names
    String[] countries = new String[] {
            "India",
            "Pakistan",
            "Sri Lanka",
            "China",
            "Bangladesh",
            "Nepal",
            "Afghanistan",
            "North Korea",
            "South Korea",
            "Japan",
            "Costa Rica",
            "México",
            "Estados Unidos",
            "España",
            "Rusia",
            "Argentina",
            "Australia",
            "Ghana",
            "Malaysia",
            "Perú"
    };

    // Array of integers points to images stored in /res/drawable/
    int[] flags = new int[]{
            R.drawable.india,
            R.drawable.pakistan,
            R.drawable.srilanka,
            R.drawable.china,
            R.drawable.bangladesh,
            R.drawable.nepal,
            R.drawable.afghanistan,
            R.drawable.nkorea,
            R.drawable.skorea,
            R.drawable.japan,
            R.drawable.cr,
            R.drawable.mx,
            R.drawable.us,
            R.drawable.es,
            R.drawable.ru,
            R.drawable.ar,
            R.drawable.au,
            R.drawable.ga,
            R.drawable.my,
            R.drawable.pe
    };

    // Array of strings to store currencies
    String[] currency = new String[]{
            "1.252.139.596",
            "188.144.040",
            "20.483.000",
            "1.401.586.609",
            "158.512.570",
            "28.120.140",
            "30.551.674",
            "25.155.326",
            "49.750.234",
            "126.818.019",
            "5.001.657",
            "122.332.399",
            "325.127.634",
            "47.199.069",
            "142.098.141",
            "42.154.914",
            "23.923.101",
            "26.984.328",
            "30.651.176",
            "31.161.167"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        // Each row in the list stores country name, currency and flag
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        int n = countries.length;

        for(int i=0;i<n;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("txt", "País : " + countries[i]);
            hm.put("cur","Población : " + currency[i]);
            hm.put("flag", Integer.toString(flags[i]) );
            aList.add(hm);
        }

        // Keys used in Hashmap
        String[] from = { "flag","txt","cur" };

        // Ids of views in listview_layout
        int[] to = { R.id.flag,R.id.txt,R.id.cur};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.listview_layout, from, to);

        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
