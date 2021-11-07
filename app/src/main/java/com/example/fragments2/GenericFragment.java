package com.example.fragments2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class GenericFragment extends Fragment {
    private int backgroundColor;
    private String title;

    private static final String FRAGMENT_COLOR = "FRAGMENT_COLOR";
    private static final String FRAGMENT_TITLE = "FRAGMENT_TITLE";

    public static GenericFragment newInstance(int color, String data)
    {
        GenericFragment fragment = new GenericFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(FRAGMENT_COLOR, color);
        bundle.putString(FRAGMENT_TITLE, data);

        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_generic, container, false);

        RelativeLayout relative = view.findViewById(R.id.relative);
        TextView text = view.findViewById(R.id.text);

        Bundle bundle = getArguments();
        backgroundColor = bundle.getInt(FRAGMENT_COLOR);
        title = bundle.getString(FRAGMENT_TITLE);

        relative.setBackgroundColor(backgroundColor);
        text.setText(title);

        return view;
    }
}
