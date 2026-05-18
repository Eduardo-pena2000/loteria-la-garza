package com.revenuecat.purchases.common.networking;

import Qa.l;
import android.net.Uri;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Endpoint$WebBillingGetProducts$getPath$1 extends u implements l {
    public static final Endpoint$WebBillingGetProducts$getPath$1 INSTANCE = new Endpoint$WebBillingGetProducts$getPath$1();

    public Endpoint$WebBillingGetProducts$getPath$1() {
        super(1);
    }

    public final CharSequence invoke(String str) {
        t.g(str, "it");
        String encode = Uri.encode(str);
        t.f(encode, "encode(it)");
        return encode;
    }
}
