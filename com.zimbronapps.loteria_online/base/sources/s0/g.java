package s0;

import Ca.I;
import kotlin.jvm.internal.u;
import n1.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g implements n1.d {
    public d a = m.a;
    public k b;
    public x0.c c;
    public Qa.a d;

    public static final class a extends u implements Qa.l {
        public final /* synthetic */ Qa.l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Qa.l lVar) {
            super(1);
            this.a = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((x0.c) obj);
            return I.a;
        }

        public final void invoke(x0.c cVar) {
            this.a.invoke(cVar);
            cVar.B1();
        }
    }

    public final void B(k kVar) {
        this.b = kVar;
    }

    public final void J(Qa.a aVar) {
        this.d = aVar;
    }

    public final long e() {
        return this.a.e();
    }

    public float e1() {
        return this.a.getDensity().e1();
    }

    public final k g() {
        return this.b;
    }

    public float getDensity() {
        return this.a.getDensity().getDensity();
    }

    public final t getLayoutDirection() {
        return this.a.getLayoutDirection();
    }

    public final k j(Qa.l lVar) {
        return p(new a(lVar));
    }

    public final k p(Qa.l lVar) {
        k kVar = new k(lVar);
        this.b = kVar;
        return kVar;
    }

    public final void q(d dVar) {
        this.a = dVar;
    }

    public final void z(x0.c cVar) {
        this.c = cVar;
    }
}
