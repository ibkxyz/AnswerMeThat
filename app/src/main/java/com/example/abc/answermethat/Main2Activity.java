package com.example.abc.answermethat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private RadioGroup radioGroup_question_one;
    private RadioGroup radioGroup_question_two;
    private RadioButton radioButton_question_one;
    private RadioButton radioButton_question_two;
    private EditText editText_three;
    private Button button_submit;

    String correct_answer_one = "18";
    String correct_answer_two = "True";
    String correct_answer_three = "Structured Query Language";
    String final_answer;

    int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        radioGroup_question_one = (RadioGroup) findViewById(R.id.radio_group_question_one);
        radioGroup_question_two = (RadioGroup) findViewById(R.id.radio_group_question_two);
        editText_three = (EditText) findViewById(R.id.editText_Question_Three);
        button_submit = (Button) findViewById(R.id.button_submit_quiz);


        /**
         * Called when the Submit button
         * is clicked
         *
         */

        button_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selected_radio_one = radioGroup_question_one.getCheckedRadioButtonId();
                radioButton_question_one = (RadioButton) findViewById(selected_radio_one);

                int selected_radio_two = radioGroup_question_two.getCheckedRadioButtonId();
                radioButton_question_two = (RadioButton) findViewById((selected_radio_two));

                CheckBox checkBox_ps3 = (CheckBox) findViewById(R.id.ps3_checkbox);
                boolean ps3Checked = checkBox_ps3.isChecked();

                CheckBox checkBox_Pencil = (CheckBox) findViewById(R.id.pencil_checkbox);
                boolean pencilChecked = checkBox_Pencil.isChecked();

                CheckBox checkBox_Code = (CheckBox) findViewById(R.id.code_checkbox);
                boolean codeChecked = checkBox_Code.isChecked();


                if (radioButton_question_one.getText().equals(correct_answer_one)) {
                    score += 1;
                }

                if (radioButton_question_two.getText().equals(correct_answer_two)) {
                    score += 1;
                }

                if (editText_three.getText().toString().equals(correct_answer_three)) {
                    score += 1;
                }


                if (ps3Checked && pencilChecked) {
                    score += 1;
                }

                if (codeChecked) {
                    score += 1;
                }


                Toast.makeText(Main2Activity.this, "You answered " + score + " correctly out of 5", Toast.LENGTH_SHORT).show();
            }
        });

    }


    /**
     * Called when the Radio button at
     *
     * @Question1 is checked.
     */


    public void onRadioButtonClicked_Question1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_ten:
                if (checked)
                    // Google is 10 years old
                    break;
            case R.id.radio_twenty:
                if (checked)
                    // Google is 20 years old
                    break;

            case R.id.radio_eighteen:
                if (checked)
                    // Google is 18 years old
                    break;
        }
    }


    /**
     * Called when the Radio button at
     *
     * @Question2 is checked.
     */
    public void onRadioButtonClicked_Question2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_true:
                if (checked)
                    // Google is 10 years old
                    break;
            case R.id.radio_false:
                if (checked)
                    // Google is 20 years old
                    break;
        }
    }


}
