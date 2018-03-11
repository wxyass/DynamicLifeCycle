package com.dynamiclifecycle.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ContactFragment extends Fragment {
	private static final String TAG = "MainActivity";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.i(TAG, "onCreateView..............fragment");
		TextView textView = new TextView(getActivity());
		textView.setText("我是联系人界面");
		return textView;
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		Log.i(TAG, "onAttach..............fragment");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate..............fragment");
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.i(TAG, "onActivityCreated..............fragment");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.i(TAG, "onStart..............fragment");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.i(TAG, "onResume..............fragment");
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.i(TAG, "onPause..............fragment");
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.i(TAG, "onStop..............fragment");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "onDestroy..............fragment");
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.i(TAG, "onDestroyView..............fragment");
	}

	@Override
	public void onDetach() {
		super.onDetach();
		Log.i(TAG, "onDetach..............fragment");
	}

}
