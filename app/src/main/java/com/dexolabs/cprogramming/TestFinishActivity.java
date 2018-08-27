package com.dexolabs.cprogramming;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.dexolabs.cprogramming.appdata.Keys;
import com.dexolabs.cprogramming.model.Question;
import com.dexolabs.cprogramming.structure.BaseActivity;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.Utils;

import java.util.ArrayList;

public class TestFinishActivity extends BaseActivity {
    private ArrayList<Question> questionList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitiy_test_finish);
        PieChart pieChart = (PieChart) findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            questionList = bundle.getParcelableArrayList(Keys.Extras.MCQ_LIST);
        }
        int correct = 0, unanswered = 0, incorrect = 0;
        int selectedOption, answerKey;

        if (questionList != null) {
            for (Question question : questionList) {
                selectedOption = question.getSelectedOption();

                if (question.getSelectedOption() != 0) {
                    answerKey = question.getAnswer();
                    if (selectedOption == answerKey) {
                        correct++;
                    } else {
                        incorrect++;
                    }
                } else {
                    unanswered++;
                }
            }
        }

        ArrayList<PieEntry> yvalues = new ArrayList<>();
        if (correct != 0)
            yvalues.add(new PieEntry(correct, "Correct", 0));

        if (incorrect != 0)
            yvalues.add(new PieEntry(incorrect, "Incorrect", 1));

        if (unanswered != 0)
            yvalues.add(new PieEntry(unanswered, "Unattempted", 2));

        PieDataSet dataSet = new PieDataSet(yvalues, "Test Results");
        final int[] PIE_COLORS = {Color.rgb(0, 204, 102), Color.rgb(255, 77, 77), Color.rgb(191, 128, 64)};
        dataSet.setColors(PIE_COLORS);
        PieData data = new PieData(dataSet);
        data.setValueFormatter(new PercentFormatter());
        data.setValueTextSize(Utils.convertDpToPixel(8));
        pieChart.setData(data);
        pieChart.getDescription().setText("");
        pieChart.getLegend().setEnabled(false);
        pieChart.animateY(6000, Easing.EasingOption.EaseInOutBack);

    }
}
