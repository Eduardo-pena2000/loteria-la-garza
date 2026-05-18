package com.amazon.a.a.i;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a extends h {
    private static final String b = "a";
    private static final String e = "http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl";
    private static final String f = "Amazon Appstore required";
    private static final String g = "Amazon Appstore Update Required";
    private static final long j = 31536000;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a h;
    private final c i;

    public a(c cVar) {
        super(cVar);
        this.i = cVar;
    }

    public long h() {
        return 31536000L;
    }

    public void i() {
        if ("Amazon Appstore required".equalsIgnoreCase(this.i.e()) || "Amazon Appstore Update Required".equalsIgnoreCase(this.i.e())) {
            try {
                Activity b2 = this.h.b();
                if (b2 == null) {
                    b2 = this.h.a();
                }
                b2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl")));
            } catch (Exception unused) {
            }
        }
    }

    public String toString() {
        return b;
    }
}
