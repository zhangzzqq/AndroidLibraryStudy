package com.zq.library.entity;

import android.content.Context;
import android.content.Intent;

/**
 * ClassName: Presentr
 * Description:
 * Author: connorlin
 * Date: Created on 2016-7-1.
 */
public class Presenter {

    public void onTypeClick(Context context, RecyclerItem recyclerItem) {
        Intent intent = new Intent(recyclerItem.getAction());
        context.startActivity(intent);
    }
}
