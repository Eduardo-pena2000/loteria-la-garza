package com.google.android.gms.ads;

import L5.v;
import L5.w;
import N6.b;
import S5.B;
import S5.Y0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.zzbtp;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class OutOfContextTestingActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Y0 h = B.b().h(this, new zzbtp());
        if (h == null) {
            finish();
            return;
        }
        setContentView(w.a);
        LinearLayout findViewById = findViewById(v.a);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            h.zze(stringExtra, b.s1(this), b.s1(findViewById));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
