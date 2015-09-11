package com.example.hp.photogallery;

import android.support.v4.app.Fragment;

/**
 * Created by hp on 15.08.15.
 */
public class PhotoPageActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new PhotoPageFragment();
    }
}
