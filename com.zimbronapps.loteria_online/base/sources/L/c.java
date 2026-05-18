package L;

import A.Q;
import A.m;
import Ca.I;
import O0.B0;
import Qa.l;
import W0.B;
import W0.D;
import W0.h;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c extends m {
    public boolean w;
    public l x;
    public final Qa.a y;

    public static final class a extends u implements Qa.a {
        public final /* synthetic */ l a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, boolean z) {
            super(0);
            this.a = lVar;
            this.b = z;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.a.invoke(Boolean.valueOf(!this.b));
        }
    }

    public static final class b extends u implements Qa.a {
        public b() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            c.f2(c.this).invoke(Boolean.valueOf(!c.g2(c.this)));
        }
    }

    public /* synthetic */ c(boolean z, E.m mVar, Q q, boolean z2, h hVar, l lVar, k kVar) {
        this(z, mVar, q, z2, hVar, lVar);
    }

    public static final /* synthetic */ l f2(c cVar) {
        return cVar.x;
    }

    public static final /* synthetic */ boolean g2(c cVar) {
        return cVar.w;
    }

    public void Q1(D d) {
        B.p0(d, Y0.b.a(this.w));
    }

    public final void h2(boolean z, E.m mVar, Q q, boolean z2, h hVar, l lVar) {
        if (this.w != z) {
            this.w = z;
            B0.b(this);
        }
        this.x = lVar;
        super.e2(mVar, q, z2, null, hVar, this.y);
    }

    public c(boolean z, E.m mVar, Q q, boolean z2, h hVar, l lVar) {
        super(mVar, q, z2, null, hVar, new a(lVar, z), null);
        this.w = z;
        this.x = lVar;
        this.y = new b();
    }
}
