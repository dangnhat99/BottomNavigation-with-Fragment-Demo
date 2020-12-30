package android.training.fragmentdemo.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.training.fragmentdemo.R;
import android.widget.Button;
import android.widget.Toast;

public class PhoneFragment extends Fragment {
    Button btnPhone;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.phone_frag, container, false);

        initView(view);
        initListener();

        return view;
    }

    private void initView(View view) {
        btnPhone = view.findViewById(R.id.btnPhone);
    }

    private void initListener() {
        btnPhone.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Phone Fragment", Toast.LENGTH_SHORT).show();
        });
    }
}