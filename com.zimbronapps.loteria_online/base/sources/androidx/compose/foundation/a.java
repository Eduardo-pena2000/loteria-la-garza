package androidx.compose.foundation;

import Ca.I;
import P0.L0;
import P0.N0;
import Qa.l;
import kotlin.jvm.internal.u;
import v0.E1;
import v0.h0;
import v0.r0;
import v0.t1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {

    public static final class a extends u implements l {
        public final /* synthetic */ float a;
        public final /* synthetic */ h0 b;
        public final /* synthetic */ E1 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, h0 h0Var, E1 e1) {
            super(1);
            this.a = f;
            this.b = h0Var;
            this.c = e1;
        }

        public final void a(N0 n0) {
            n0.d("background");
            n0.b().c("alpha", Float.valueOf(this.a));
            n0.b().c("brush", this.b);
            n0.b().c("shape", this.c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class b extends u implements l {
        public final /* synthetic */ long a;
        public final /* synthetic */ E1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, E1 e1) {
            super(1);
            this.a = j;
            this.b = e1;
        }

        public final void a(N0 n0) {
            n0.d("background");
            n0.e(r0.m(this.a));
            n0.b().c("color", r0.m(this.a));
            n0.b().c("shape", this.b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, h0 h0Var, E1 e1, float f) {
        return eVar.then(new BackgroundElement(0L, h0Var, f, e1, L0.b() ? new a(f, h0Var, e1) : L0.a(), 1, null));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, h0 h0Var, E1 e1, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            e1 = t1.a();
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return a(eVar, h0Var, e1, f);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, long j, E1 e1) {
        return eVar.then(new BackgroundElement(j, null, 1.0f, e1, L0.b() ? new b(j, e1) : L0.a(), 2, null));
    }

    public static /* synthetic */ androidx.compose.ui.e d(androidx.compose.ui.e eVar, long j, E1 e1, int i, Object obj) {
        if ((i & 2) != 0) {
            e1 = t1.a();
        }
        return c(eVar, j, e1);
    }
}
