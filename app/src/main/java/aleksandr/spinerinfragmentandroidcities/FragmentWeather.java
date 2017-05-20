package aleksandr.spinerinfragmentandroidcities;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Sasha on 20.05.2017.
 */
public class FragmentWeather extends Fragment {
    String strtext;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (getArguments()!= null){
            strtext = getArguments().getString("edttext");
        }

        View v = inflater.inflate(R.layout.weather_fragment, container, false);
        TextView textView = (TextView)v.findViewById(R.id.textView);
        textView.setText(strtext);




        return v;

    }


}



