package com.kamron.pogoiv.activities;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.WindowManager;

import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.github.paolorotolo.appintro.model.SliderPage;
import com.kamron.pogoiv.R;

/**
 * Created by MARTINI1 on 2/10/2017.
 */

public class TutorialActivity extends AppIntro2 {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams
                .FLAG_FULLSCREEN);
        Resources res = getResources();

        // welcome
        SliderPage sliderPage1 = new SliderPage();
        sliderPage1.setTitle(res.getString(R.string.tut1_title));
        sliderPage1.setDescription(res.getString(R.string.tut1_desc));
        sliderPage1.setImageDrawable(R.drawable.goiv);
        sliderPage1.setBgColor(Color.BLACK);
        addSlide(AppIntroFragment.newInstance(sliderPage1));

        // permissions
        SliderPage sliderPage2 = new SliderPage();
        sliderPage2.setTitle(res.getString(R.string.tut2_title));
        sliderPage2.setDescription(res.getString(R.string.tut2_desc));
        sliderPage2.setImageDrawable(R.drawable.tut2);
        sliderPage2.setBgColor(Color.parseColor("#20d2bb"));
        sliderPage2.setDescColor(Color.BLACK);
        sliderPage2.setTitleColor(Color.BLACK);
        addSlide(AppIntroFragment.newInstance(sliderPage2));

        // set level & team
        SliderPage sliderPage3 = new SliderPage();
        sliderPage3.setTitle(res.getString(R.string.tut3_title));
        sliderPage3.setDescription(res.getString(R.string.tut3_desc));
        sliderPage3.setImageDrawable(R.drawable.tut3);
        sliderPage3.setBgColor(Color.parseColor("#3E50B3"));
        addSlide(AppIntroFragment.newInstance(sliderPage3));

        // iv button
        SliderPage sliderPage4 = new SliderPage();
        sliderPage4.setTitle(res.getString(R.string.tut4_title));
        sliderPage4.setDescription(res.getString(R.string.tut4_desc));
        sliderPage4.setImageDrawable(R.drawable.tut4);
        sliderPage4.setBgColor(Color.parseColor("#f64c73"));
        addSlide(AppIntroFragment.newInstance(sliderPage4));

        // appraisal
        SliderPage sliderPage5 = new SliderPage();
        sliderPage5.setTitle(res.getString(R.string.tut5_title));
        sliderPage5.setDescription(res.getString(R.string.tut5_desc));
        sliderPage5.setImageDrawable(R.drawable.tut5);
        sliderPage5.setBgColor(Color.parseColor("#3395ff"));
        addSlide(AppIntroFragment.newInstance(sliderPage5));

        // calibration
        SliderPage sliderPage6 = new SliderPage();
        sliderPage6.setTitle(res.getString(R.string.tut6_title));
        sliderPage6.setDescription(res.getString(R.string.tut6_desc));
        sliderPage6.setImageDrawable(R.drawable.tut6);
        sliderPage6.setBgColor(Color.parseColor("#c873f4"));
        addSlide(AppIntroFragment.newInstance(sliderPage6));

        setDepthAnimation();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Finish tutorial when users tap on Skip button.
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Finish tutorial when users tap on Done button.
        finish();
    }
}