package com.applovin.shadow.okio;

import java.util.zip.Inflater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class -InflaterSourceExtensions {
    public static final InflaterSource inflate(Source source, Inflater inflater) {
        kotlin.jvm.internal.t.g(source, "<this>");
        kotlin.jvm.internal.t.g(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }

    public static /* synthetic */ InflaterSource inflate$default(Source source, Inflater inflater, int i, Object obj) {
        if ((i & 1) != 0) {
            inflater = new Inflater();
        }
        kotlin.jvm.internal.t.g(source, "<this>");
        kotlin.jvm.internal.t.g(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }
}
