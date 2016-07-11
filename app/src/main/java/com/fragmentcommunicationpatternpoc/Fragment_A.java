package com.fragmentcommunicationpatternpoc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragment_A extends Fragment implements View.OnClickListener {
    private Button mBtnClick;
    CommunicatorInterface comm;
    private int counter = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mBtnClick = (Button) getActivity().findViewById(R.id.btn_click);
        mBtnClick.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        comm = (CommunicatorInterface) getActivity();
        comm.putData("btn clicked" + counter++ + "times");


    }
}
