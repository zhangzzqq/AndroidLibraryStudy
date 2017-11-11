package com.zq.library.entity;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.zq.library.DemoBinding;
import com.zq.library.adapter.ListAdapter;

/**
 * ClassName: ViewHandler
 * Description:
 * Author: connorlin
 * Date: Created on 2016-6-28.
 */
public class DemoHandler {

    private Context mContext;
    private DemoBinding mDemoBinding;
    private ListAdapter mListAdapter;

    public DemoHandler(Context context, DemoBinding mainBinding,
                       ListAdapter listAdapter) {
        mContext = context;
        mDemoBinding = mainBinding;
        mListAdapter = listAdapter;
    }

    public void onClick(View v) {
        ObservableContact contact = new ObservableContact(mDemoBinding.editName.getText().toString(),
                mDemoBinding.editPhone.getText().toString());
        mListAdapter.addContact(contact);

        reset();

        hideInput();
    }

    private void reset() {
        mDemoBinding.getContact().setName("");
        mDemoBinding.getContact().setPhone("");
    }

    private void hideInput() {
        InputMethodManager mInputMethodManager =
                (InputMethodManager) mContext.getSystemService(Context.INPUT_METHOD_SERVICE);
        mInputMethodManager.hideSoftInputFromWindow(mDemoBinding.editPhone.getWindowToken(),
                0);
    }
}
