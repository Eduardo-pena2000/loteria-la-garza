package com.applovin.impl.privacy.cmp;

import com.applovin.impl.k0;
import com.applovin.impl.privacy.cmp.a;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class h implements ConsentForm.OnConsentFormDismissedListener {
    public final /* synthetic */ a a;
    public final /* synthetic */ k0 b;
    public final /* synthetic */ a.a c;

    public /* synthetic */ h(a aVar, k0 k0Var, a.a aVar2) {
        this.a = aVar;
        this.b = k0Var;
        this.c = aVar2;
    }

    public final void onConsentFormDismissed(FormError formError) {
        a.f(this.a, this.b, this.c, formError);
    }
}
