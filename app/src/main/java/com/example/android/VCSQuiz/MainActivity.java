package com.example.android.VCSQuiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        CheckBox choice;
        for(boolean value : choicesValues){
            choice = (CheckBox) findViewById(getId(questionNumber , choiceNumber));
            if(value != choice.isChecked()){
                return false;
            }
            choiceNumber++;
        }
        return true;
    }

    /**
     * This function gets the id of a given question choice
     * @param questionNumber is the number of the question to get one of its choices' id
     * @param choiceNumber is the number of the choice to get its id
     * @return CheckBox id of a given choice
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
