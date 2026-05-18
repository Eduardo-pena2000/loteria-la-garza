package com.applovin.impl;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class q2 {
    public TextView a;
    public TextView b;
    public ImageView c;
    public ImageView d;
    private r2 e;
    private int f;

    public void a(int i) {
        this.f = i;
    }

    public r2 b() {
        return this.e;
    }

    public int a() {
        return this.f;
    }

    public void a(r2 r2Var) {
        this.e = r2Var;
        this.a.setText(r2Var.k());
        this.a.setTextColor(r2Var.l());
        if (this.b != null) {
            if (!TextUtils.isEmpty(r2Var.f())) {
                this.b.setTypeface((Typeface) null, 0);
                this.b.setVisibility(0);
                this.b.setText(r2Var.f());
                this.b.setTextColor(r2Var.g());
                if (r2Var.p()) {
                    this.b.setTypeface((Typeface) null, 1);
                }
            } else {
                this.b.setVisibility(8);
            }
        }
        if (this.c != null) {
            if (r2Var.h() > 0) {
                this.c.setImageResource(r2Var.h());
                this.c.setColorFilter(r2Var.i());
                this.c.setVisibility(0);
            } else {
                this.c.setVisibility(8);
            }
        }
        if (this.d != null) {
            if (r2Var.d() > 0) {
                this.d.setImageResource(r2Var.d());
                this.d.setColorFilter(r2Var.e());
                this.d.setVisibility(0);
                return;
            }
            this.d.setVisibility(8);
        }
    }
}
