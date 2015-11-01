package techcreator.com.alternativelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String[] mob = new String[] { "Item 0", "Item 1", "Item 2", "Item 3",
            "Item 4", "Item 5", "Item 6", "Item 7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
