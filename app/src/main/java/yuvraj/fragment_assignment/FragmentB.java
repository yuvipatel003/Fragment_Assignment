package yuvraj.fragment_assignment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by yuvi0 on 2018-02-13.
 */

public class FragmentB extends Fragment {

    public static final String NAME = FragmentB.class.getSimpleName();

    private static final String TEXT_KEY = "textkey";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_b,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String textValue;

        if(savedInstanceState!=null)
        {
            //from configuration change
            textValue=savedInstanceState.getString(TEXT_KEY,"");

        }
        else
        {
            //fragment was just created
            textValue="Fragment B is created";

        }

        TextView text = view.findViewById(R.id.text);
        text.setText(textValue);

    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

       // outState.putString(TEXT_KEY,getString(R.string.text_changed_from_configuration_change));
    }
}
