package M;

import n1.t;
import u0.k;
import u0.m;
import v0.i1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h extends a {
    public h(b bVar, b bVar2, b bVar3, b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
    }

    public i1 c(long j, float f, float f2, float f3, float f4, t tVar) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new i1.b(m.c(j));
        }
        u0.h c = m.c(j);
        t tVar2 = t.a;
        return new i1.c(k.b(c, u0.b.b(tVar == tVar2 ? f : f2, 0.0f, 2, null), u0.b.b(tVar == tVar2 ? f2 : f, 0.0f, 2, null), u0.b.b(tVar == tVar2 ? f3 : f4, 0.0f, 2, null), u0.b.b(tVar == tVar2 ? f4 : f3, 0.0f, 2, null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.t.c(g(), hVar.g()) && kotlin.jvm.internal.t.c(f(), hVar.f()) && kotlin.jvm.internal.t.c(d(), hVar.d()) && kotlin.jvm.internal.t.c(e(), hVar.e());
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public h a(b bVar, b bVar2, b bVar3, b bVar4) {
        return new h(bVar, bVar2, bVar3, bVar4);
    }

    public int hashCode() {
        return (((((g().hashCode() * 31) + f().hashCode()) * 31) + d().hashCode()) * 31) + e().hashCode();
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + g() + ", topEnd = " + f() + ", bottomEnd = " + d() + ", bottomStart = " + e() + ')';
    }
}
