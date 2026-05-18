package com.applovin.shadow.okio;

import java.util.zip.Deflater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class -DeflaterSinkExtensions {
    public static final DeflaterSink deflate(Sink sink, Deflater deflater) {
        kotlin.jvm.internal.t.g(sink, "<this>");
        kotlin.jvm.internal.t.g(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }

    public static /* synthetic */ DeflaterSink deflate$default(Sink sink, Deflater deflater, int i, Object obj) {
        if ((i & 1) != 0) {
            deflater = new Deflater();
        }
        kotlin.jvm.internal.t.g(sink, "<this>");
        kotlin.jvm.internal.t.g(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }
}
