package yuvraj.fragment_assignment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appactivity);



        findViewById(R.id.button_add_fragment_A).setOnClickListener(button-> {
          //  removeFragmentsFromBackStack();

            // Add Fragment A
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentContainer, new FragmentA(), FragmentA.NAME)
                    .addToBackStack(null)
                    .commit();
        });

        findViewById(R.id.button_remove_fragment_A).setOnClickListener(button-> {
            Fragment fragmentA = getSupportFragmentManager().findFragmentByTag(FragmentA.NAME);

            if (fragmentA != null) {
                // there is an instance, remove it
                getSupportFragmentManager().beginTransaction()
                        .remove(fragmentA)
                        .commit();
            }


        });

/////////////////Fragment B starts //////////////////


        findViewById(R.id.button_add_fragment_B).setOnClickListener(button-> {
         //   removeFragmentsFromBackStack();

            // Add Fragment B
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentContainer, new FragmentB(), FragmentB.NAME)
                    .addToBackStack(null)
                    .commit();
        });

        findViewById(R.id.button_remove_fragment_B).setOnClickListener(button-> {

            Fragment fragmentB = getSupportFragmentManager().findFragmentByTag(FragmentB.NAME);

            if (fragmentB != null) {
                // there is an instance, remove it
                getSupportFragmentManager().beginTransaction()
                        .remove(fragmentB)
                        .commit();
            }

            });





    }
        private  void removeFragmentsFromBackStack()
        {
            //calling popBackStack() 2 times we know that we may have max 2 fragments in back stack

            getSupportFragmentManager().popBackStack();
            getSupportFragmentManager().popBackStack();
        }
}
