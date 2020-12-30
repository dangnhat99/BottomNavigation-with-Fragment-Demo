package android.training.fragmentdemo.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.training.fragmentdemo.R;
import android.training.fragmentdemo.fragment.NoteFragment;
import android.training.fragmentdemo.fragment.PhoneFragment;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView mbottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListener();

        loadFragment(new PhoneFragment());
    }

    private void initView() {
        mbottomNavigationView = findViewById(R.id.bottom_navigation);
    }

    private void initListener() {
         mbottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_phone:
                loadFragment(new PhoneFragment());
                return true;
            case R.id.navigation_note:
                loadFragment(new NoteFragment());
                return true;
        }
        return false;
    }

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
//        transaction.addToBackStack(null);
        transaction.commit();

    }
}