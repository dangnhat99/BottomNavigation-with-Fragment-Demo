package android.training.fragmentdemo.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.training.fragmentdemo.R;
import android.widget.Button;
import android.widget.Toast;


public class NoteFragment extends Fragment {
    Button btnNote;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.note_frag, container, false);
        return view;
    }

    private void initView(View view) {
        btnNote = view.findViewById(R.id.btnNote);
    }

    private void initListener() {
        btnNote.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Note Fragment", Toast.LENGTH_SHORT).show();
        });
    }
}