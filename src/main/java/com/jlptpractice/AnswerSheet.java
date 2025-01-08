package com.jlptpractice;

import com.jlptpractice.database.ManageDB;

public class AnswerSheet {
    static int correctAns;

    static void setCorrectAns(){
        for (String cs: ManageDB.correctAns()){
            System.out.println(cs);
        }
    }
}
