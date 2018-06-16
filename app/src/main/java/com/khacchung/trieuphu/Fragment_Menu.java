package com.khacchung.trieuphu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Administrator on 10/07/2017.
 */

public class Fragment_Menu extends Fragment {
    private Button btnPlay;
    private Button btnZalo;
    private ImageView imgTronXoay;
    private Animation animation;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_menu, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        btnPlay = (Button) getActivity().findViewById(R.id.btnPlay);
        btnZalo = (Button) getActivity().findViewById(R.id.btnZalo);
        imgTronXoay = (ImageView) getActivity().findViewById(R.id.imgTronXoay);
        animation = AnimationUtils.loadAnimation(getActivity(), R.anim.rotate_image);
        imgTronXoay.startAnimation(animation);
    }

}
