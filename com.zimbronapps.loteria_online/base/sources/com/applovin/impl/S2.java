package com.applovin.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class s2 extends BaseAdapter implements View.OnClickListener {
    protected Context a;
    private List b = new ArrayList();
    private Map c = new HashMap();
    private a d;

    public interface a {
        void a(j2 j2Var, r2 r2Var);
    }

    public s2(Context context) {
        this.a = context.getApplicationContext();
    }

    public r2 a() {
        return null;
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    public abstract int b();

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r2 getItem(int i) {
        return (r2) this.b.get(i);
    }

    public abstract List c(int i);

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new J4(this));
    }

    public abstract int d(int i);

    public abstract r2 e(int i);

    public int getCount() {
        return this.b.size();
    }

    public long getItemId(int i) {
        return i;
    }

    public int getItemViewType(int i) {
        return getItem(i).m();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        q2 q2Var;
        r2 item = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            q2Var = new q2();
            q2Var.a = view.findViewById(16908308);
            q2Var.b = view.findViewById(16908309);
            q2Var.c = view.findViewById(R.id.imageView);
            q2Var.d = view.findViewById(R.id.detailImageView);
            view.setTag(q2Var);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            q2Var = (q2) view.getTag();
        }
        q2Var.a(i);
        q2Var.a(item);
        view.setEnabled(item.o());
        return view;
    }

    public int getViewTypeCount() {
        return r2.n();
    }

    public boolean isEnabled(int i) {
        return getItem(i).o();
    }

    public void notifyDataSetChanged() {
        int i;
        this.b = new ArrayList();
        int b = b();
        this.c = new HashMap(b);
        r2 a2 = a();
        if (a2 != null) {
            this.b.add(a2);
            i = 1;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < b; i2++) {
            int d = d(i2);
            if (d != 0) {
                this.b.add(e(i2));
                this.b.addAll(c(i2));
                this.c.put(Integer.valueOf(i2), Integer.valueOf(i));
                i += d + 1;
            }
        }
        this.b.add(new v4(""));
        super.notifyDataSetChanged();
    }

    public void onClick(View view) {
        q2 q2Var = (q2) view.getTag();
        r2 b = q2Var.b();
        j2 a2 = a(q2Var.a());
        a aVar = this.d;
        if (aVar == null || a2 == null) {
            return;
        }
        aVar.a(a2, b);
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    private j2 a(int i) {
        for (int i2 = 0; i2 < b(); i2++) {
            Integer num = (Integer) this.c.get(Integer.valueOf(i2));
            if (num != null) {
                if (i <= num.intValue() + d(i2)) {
                    return new j2(i2, i - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    private Drawable a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(m0.a(R.color.applovin_sdk_highlightListItemColor, this.a));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }
}
