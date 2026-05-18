package ub;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class o extends n {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(A writer, boolean z) {
        super(writer);
        kotlin.jvm.internal.t.g(writer, "writer");
        this.c = z;
    }

    public void n(String value) {
        kotlin.jvm.internal.t.g(value, "value");
        if (this.c) {
            super.n(value);
        } else {
            super.k(value);
        }
    }
}
