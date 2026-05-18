package tb;

import ub.e0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class v extends E {
    public final boolean a;
    public final qb.e b;
    public final String c;

    public /* synthetic */ v(Object obj, boolean z, qb.e eVar, int i, kotlin.jvm.internal.k kVar) {
        this(obj, z, (i & 4) != 0 ? null : eVar);
    }

    public String a() {
        return this.c;
    }

    public boolean b() {
        return this.a;
    }

    public final qb.e e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return b() == vVar.b() && kotlin.jvm.internal.t.c(a(), vVar.a());
    }

    public int hashCode() {
        return (Boolean.hashCode(b()) * 31) + a().hashCode();
    }

    public String toString() {
        if (!b()) {
            return a();
        }
        StringBuilder sb = new StringBuilder();
        e0.c(sb, a());
        String sb2 = sb.toString();
        kotlin.jvm.internal.t.f(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Object body, boolean z, qb.e eVar) {
        super(null);
        kotlin.jvm.internal.t.g(body, "body");
        this.a = z;
        this.b = eVar;
        this.c = body.toString();
        if (eVar != null && !eVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
