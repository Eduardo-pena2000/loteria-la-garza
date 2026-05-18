package org.apache.tika.utils;

import java.util.function.Predicate;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class e implements Predicate {
    public final /* synthetic */ String a;

    public /* synthetic */ e(String str) {
        this.a = str;
    }

    public final boolean test(Object obj) {
        return this.a.equals((String) obj);
    }
}
