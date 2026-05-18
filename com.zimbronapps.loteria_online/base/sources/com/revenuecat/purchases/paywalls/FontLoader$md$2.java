package com.revenuecat.purchases.paywalls;

import java.security.MessageDigest;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FontLoader$md$2 extends u implements Qa.a {
    public static final FontLoader$md$2 INSTANCE = new FontLoader$md$2();

    public FontLoader$md$2() {
        super(0);
    }

    public final MessageDigest invoke() {
        return MessageDigest.getInstance("MD5");
    }
}
