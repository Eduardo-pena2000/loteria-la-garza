package L;

import A.Q;
import A.m;
import O0.B0;
import W0.B;
import W0.D;
import W0.h;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b extends m {
    public boolean w;

    public /* synthetic */ b(boolean z, E.m mVar, Q q, boolean z2, h hVar, Qa.a aVar, k kVar) {
        this(z, mVar, q, z2, hVar, aVar);
    }

    public void Q1(D d) {
        B.d0(d, this.w);
    }

    public final void f2(boolean z, E.m mVar, Q q, boolean z2, h hVar, Qa.a aVar) {
        if (this.w != z) {
            this.w = z;
            B0.b(this);
        }
        super.e2(mVar, q, z2, null, hVar, aVar);
    }

    public b(boolean z, E.m mVar, Q q, boolean z2, h hVar, Qa.a aVar) {
        super(mVar, q, z2, null, hVar, aVar, null);
        this.w = z;
    }
}
