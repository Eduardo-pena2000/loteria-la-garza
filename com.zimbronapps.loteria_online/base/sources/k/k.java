package K;

import Ca.I;
import M0.p;
import kotlin.jvm.internal.u;
import n1.s;
import u0.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class k {

    public static final class a extends u implements Qa.a {
        public final /* synthetic */ u0.h a;
        public final /* synthetic */ p b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u0.h hVar, p pVar) {
            super(0);
            this.a = hVar;
            this.b = pVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u0.h invoke() {
            u0.h hVar = this.a;
            if (hVar != null) {
                return hVar;
            }
            p pVar = this.b;
            if (!pVar.g()) {
                pVar = null;
            }
            if (pVar != null) {
                return m.c(s.d(pVar.a()));
            }
            return null;
        }
    }

    public static final Object a(O0.j jVar, u0.h hVar, Ga.e eVar) {
        if (!jVar.getNode().isAttached()) {
            return I.a;
        }
        p l = O0.k.l(jVar);
        K.a c = d.c(jVar);
        if (c == null) {
            return I.a;
        }
        Object K0 = c.K0(l, new a(hVar, l), eVar);
        return K0 == Ha.c.f() ? K0 : I.a;
    }

    public static /* synthetic */ Object b(O0.j jVar, u0.h hVar, Ga.e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar = null;
        }
        return j.a(jVar, hVar, eVar);
    }
}
