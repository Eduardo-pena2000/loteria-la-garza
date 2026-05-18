package com.applovin.shadow.okio;

import java.io.Closeable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class Okio__OkioKt {
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    public static final BufferedSource buffer(Source source) {
        kotlin.jvm.internal.t.g(source, "<this>");
        return new RealBufferedSource(source);
    }

    public static final Object use(Closeable closeable, Qa.l lVar) {
        Object obj;
        kotlin.jvm.internal.t.g(lVar, "block");
        Throwable th = null;
        try {
            obj = lVar.invoke(closeable);
            kotlin.jvm.internal.r.b(1);
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.r.a(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.r.b(1);
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th4) {
                    Ca.g.a(th3, th4);
                }
            }
            kotlin.jvm.internal.r.a(1);
            th = th3;
            obj = null;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.t.d(obj);
        return obj;
    }

    public static final BufferedSink buffer(Sink sink) {
        kotlin.jvm.internal.t.g(sink, "<this>");
        return new RealBufferedSink(sink);
    }
}
