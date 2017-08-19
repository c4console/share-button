package share.c4console.com.testing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton share_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        share_btn = (ImageButton)findViewById(R.id.share_btn);
        // When pressed on share button
        share_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/palne");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,"C4console App");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "C4console.com Android app.\n\n"+"https://play.google.com/store/apps/details?id=com.ipvworld.c4console&hl=en");
                startActivity(Intent.createChooser(shareIntent,"Share Via:"));
            }
        });
    }
}
