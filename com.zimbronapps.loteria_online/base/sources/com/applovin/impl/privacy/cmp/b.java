package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import com.applovin.impl.privacy.cmp.a;
import com.google.android.ump.ConsentInformation;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class b implements ConsentInformation.OnConsentInfoUpdateSuccessListener {
    public final /* synthetic */ a a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ a.a c;

    public /* synthetic */ b(a aVar, Activity activity, a.a aVar2) {
        this.a = aVar;
        this.b = activity;
        this.c = aVar2;
    }

    public final void onConsentInfoUpdateSuccess() {
        a.b(this.a, this.b, this.c);
    }
}
