package superky.keytwo.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private Integer arg1;
   private Integer arg2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_new_main);
        setContentView(R.layout.some_activity);
        final EditText editText1 = findViewById(R.id.editText1);
        final EditText editText2 = findViewById(R.id.editText2);
        final Button button = findViewById(R.id.button);
        final TextView textView = findViewById(R.id.textViev);
        final CheckBox checkBox = findViewById(R.id.checkBox);
        final CalendarView calendarView = findViewById(R.id.calendarViev);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    arg1 = Integer.valueOf(editText1.getText().toString());
                    arg2 = Integer.valueOf(editText2.getText().toString());
                    if (arg1.equals(arg2)) {
                        textView.setText("Значения равны");
                    }else {
                        textView.setText("Значения НЕ равны");
                    }
                } catch (NumberFormatException e) {
                    textView.setText("Пожалуйста укажите не пустое значение");
                }

            }

        });
    }
}