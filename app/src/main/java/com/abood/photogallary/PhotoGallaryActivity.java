package com.abood.photogallary;

import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;

public class PhotoGallaryActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {

        return PhotoGallaryFragment.newInstance();

    }

    public static Intent newIntent(Context context) {
        return new Intent(context, PhotoGallaryActivity.class);
    }

}
