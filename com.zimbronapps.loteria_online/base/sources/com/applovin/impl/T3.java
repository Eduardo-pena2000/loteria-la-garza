package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class t3 {
    private a a;
    private String b;

    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    public t3(a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    public a a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public static t3 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new t3(a.AD_UNIT_ID, str);
    }

    public static t3 a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new t3(a.AD_FORMAT, label);
    }

    public static t3 a(y2 y2Var) {
        String Q = y2Var.Q();
        MaxAdFormat format = y2Var.getFormat();
        if (TextUtils.isEmpty(Q) || format == null) {
            return null;
        }
        return new q3(new j3(Q, format));
    }
}
