package ub;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class c0 {
    public static final b0 a(tb.b json, String source) {
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(source, "source");
        return !json.f().a() ? new b0(source) : new d0(source);
    }
}
