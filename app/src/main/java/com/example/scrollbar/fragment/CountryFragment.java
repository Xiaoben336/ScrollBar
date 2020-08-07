package com.example.scrollbar.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import androidx.fragment.app.Fragment;

import com.example.mylibrary.QuickScroll;
import com.example.scrollbar.R;
import com.example.scrollbar.adapter.CountryAdapter;

public class CountryFragment extends Fragment {

	public CountryFragment() {
		super();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		final ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.fragment_countrylist, container, false);

		final CountryAdapter adapter = new CountryAdapter(getActivity());

		final ExpandableListView list = ExpandableListView.class.cast(layout.findViewById(R.id.fragment_country_list));

		list.setAdapter(adapter);
		
		final QuickScroll quickscroll = (QuickScroll) layout.findViewById(R.id.quickscroll);
		quickscroll.init(QuickScroll.TYPE_POPUP, list, adapter, QuickScroll.STYLE_HOLO);

		return layout;
	}

}
