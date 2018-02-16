package com.example.android.VCSQuiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This function is called when submit_answer button is clicked
     * @param view is the button that is clicked
     */
    public void submitAnswer(View view){
        EditText nameEditText = (EditText) findViewById(R.id.name_edit_text);
        String studentName = nameEditText.getText().toString();
        Toast toast = Toast.makeText(this , "You 've got " + calculateGrade() + " out of 8 , " + studentName , Toast.LENGTH_LONG);
        toast.show();
    }

    /**
     * This function calculates student grade
     * @return student grade from 0 to 9
     */
    private int calculateGrade(){
        EditText question9Answer;
        int grade = 0;
        if(isQuestionAnswerCorrect(1 , true , false)){
            grade++;
        }
        if(isQuestionAnswerCorrect(2 , false , true , true , false)){
            grade++;
        }
        if(isQuestionAnswerCorrect(3 , true , false , false , true)){
            grade++;
        }
        if(isQuestionAnswerCorrect(4 , false , false , true , false)){
            grade++;
        }
        if(isQuestionAnswerCorrect(5 , false , true , false , false)){
            grade++;
        }
        if(isQuestionAnswerCorrect(6 , true , false , false , false)){
            grade++;
        }
        if(isQuestionAnswerCorrect(7 , false , false , false , true)){
            grade++;
        }
        if(isQuestionAnswerCorrect(8 , false , true)){
            grade++;
        }
        question9Answer = (EditText) findViewById(R.id.question9_edit_text);
        if(question9Answer.getText().equals(getResources().getString(R.string.question9_answer))){
            grade++;
        }
        return grade;
    }

    /**
     * This function determines whether the student has solved a specific question correctly or not
     * @param questionNumber is the number of the question to be evaluated
     * @param choicesValues the correct answers of this question will be passed as true and wrong answers will be passed as false
     * @return true if the user answer is correct and false otherwise
     */
    private boolean isQuestionAnswerCorrect(int questionNumber , boolean... choicesValues){
        boolean isCorrect = true;
        int choiceNumber = 1;
        CheckBox checkBoxChoice;
        RadioButton radioButtonChoice;
        for(boolean value : choicesValues){
            if(questionNumber == 1 || questionNumber == 8){
                radioButtonChoice = (RadioButton) findViewById(getId(questionNumber , choiceNumber));
                if(value != radioButtonChoice.isChecked()) {
                    return false;
                }
            }
            else{
                checkBoxChoice = (CheckBox) findViewById(getId(questionNumber , choiceNumber));
                if(value != checkBoxChoice.isChecked()) {
                    return false;
                }
            }
            choiceNumber++;
        }
        return true;
    }

    /**
     * This function gets the id of a given question choice
     * @param questionNumber is the number of the question to get one of its choices' id
     * @param choiceNumber is the number of the choice to get its id
     * @return CheckBox or RadioButton id of a given choice
     */
    private int getId(int questionNumber , int choiceNumber){
        switch(questionNumber){
            case 1 : switch (choiceNumber){
                case 1 : return R.id.question1_choice1;
                case 2 : return R.id.question1_choice2;
                default : return 0;
            }
            case 2 : switch (choiceNumber){
                case 1 : return R.id.question2_choice1;
                case 2 : return R.id.question2_choice2;
                case 3 : return R.id.question2_choice3;
                case 4 : return R.id.question2_choice4;
                default : return 0;
            }
            case 3 : switch (choiceNumber){
                case 1 : return R.id.question3_choice1;
                case 2 : return R.id.question3_choice2;
                case 3 : return R.id.question3_choice3;
                case 4 : return R.id.question3_choice4;
                default : return 0;
            }
            case 4 : switch (choiceNumber){
                case 1 : return R.id.question4_choice1;
                case 2 : return R.id.question4_choice2;
                case 3 : return R.id.question4_choice3;
                case 4 : return R.id.question4_choice4;
                default : return 0;
            }
            case 5 : switch (choiceNumber){
                case 1 : return R.id.question5_choice1;
                case 2 : return R.id.question5_choice2;
                case 3 : return R.id.question5_choice3;
                case 4 : return R.id.question5_choice4;
                default : return 0;
            }
            case 6 : switch (choiceNumber){
                case 1 : return R.id.question6_choice1;
                case 2 : return R.id.question6_choice2;
                case 3 : return R.id.question6_choice3;
                case 4 : return R.id.question6_choice4;
                default : return 0;
            }
            case 7 : switch (choiceNumber){
                case 1 : return R.id.question7_choice1;
                case 2 : return R.id.question7_choice2;
                case 3 : return R.id.question7_choice3;
                case 4 : return R.id.question7_choice4;
                default : return 0;
            }
            case 8 : switch (choiceNumber){
                case 1 : return R.id.question8_choice1;
                case 2 : return R.id.question8_choice2;
                default : return 0;
            }
            default : return 0;
        }
    }

}
