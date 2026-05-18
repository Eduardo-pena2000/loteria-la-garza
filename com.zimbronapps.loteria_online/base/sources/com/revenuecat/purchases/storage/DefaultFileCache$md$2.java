package com.revenuecat.purchases.storage;

import Qa.a;
import java.security.MessageDigest;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DefaultFileCache$md$2 extends u implements a {
    public static final DefaultFileCache$md$2 INSTANCE = new DefaultFileCache$md$2();

    public DefaultFileCache$md$2() {
        super(0);
    }

    public final MessageDigest invoke() {
        return MessageDigest.getInstance("MD5");
    }
}
