package com.xinlan.viewpagesrc;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Administrator on 2015/8/15.
 */
public class ImageFragment extends Fragment {
    public static ImageFragment newInstance(int imageId) {
        ImageFragment f = new ImageFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("id", imageId);
        f.setArguments(bundle);
        return f;
    }

    private ImageView mImageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.view, null);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mImageView = (ImageView) getView().findViewById(R.id.imageview);
        int resId = getArguments().getInt("id", R.drawable.test);
        mImageView.setImageResource(resId);
    }
}//end class
