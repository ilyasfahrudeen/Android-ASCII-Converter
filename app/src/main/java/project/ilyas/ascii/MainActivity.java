package project.ilyas.ascii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.editText);
        button=(Button)findViewById(R.id.button);
        textView=(TextView)findViewById(R.id.textt);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final StringBuilder sb = new StringBuilder();
                final String str= String.valueOf(editText.getText());
                char[] letters = str.toCharArray();
                for (char ch : letters) {
                    sb.append((byte) ch);
                }
                textView.setText(sb.toString());

            }
        });
    }


}
