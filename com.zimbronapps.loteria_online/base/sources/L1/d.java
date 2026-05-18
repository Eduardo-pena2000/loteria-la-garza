package l1;

import v0.h0;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d implements p {
    public final long b;

    public /* synthetic */ d(long j, kotlin.jvm.internal.k kVar) {
        this(j);
    }

    public float a() {
        return r0.t(e());
    }

    public long e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && r0.s(this.b, ((d) obj).b);
    }

    public int hashCode() {
        return r0.y(this.b);
    }

    public h0 l() {
        return null;
    }

    public String toString() {
        return "ColorStyle(value=" + r0.z(this.b) + ')';
    }

    public d(long j) {
        this.b = j;
        if (j != 16) {
            return;
        }
        g1.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }
}
