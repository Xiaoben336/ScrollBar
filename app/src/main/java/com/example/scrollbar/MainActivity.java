package com.example.scrollbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.ViewGroup;

import com.example.scrollbar.adapter.QuickScrollPagerAdapter;
import com.example.scrollbar.fragment.ContactListFragment;
import com.example.scrollbar.fragment.CountryFragment;
import com.example.scrollbar.fragment.EventListFragment;
import com.example.scrollbar.fragment.InfoFragment;
import com.example.scrollbar.fragment.MovieListFragment;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ViewGroup layout = (ViewGroup) getLayoutInflater().inflate(R.layout.activity_main, null);

        final ViewPager pager = (ViewPager) layout.findViewById(R.id.main_pager);

        final QuickScrollPagerAdapter adapter = new QuickScrollPagerAdapter(getSupportFragmentManager(), this);
        adapter.addPage("base_popup_holo_nohandle", ContactListFragment.class, null);
        adapter.addPage("expandable_indicator_holo_nohandle", CountryFragment.class, null);
        adapter.addPage("base_indicator_holo_handle", EventListFragment.class, null);
        adapter.addPage("base_popup_customlayout_colored_nohandle", MovieListFragment.class, null);
        adapter.addPage("info", InfoFragment.class, null);
        pager.setAdapter(adapter);
        setContentView(layout);
    }
}