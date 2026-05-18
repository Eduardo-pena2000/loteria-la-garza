package androidx.compose.ui;

import Ca.I;
import M0.A;
import M0.C;
import O0.E;
import Qa.l;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f extends e.c implements E {
    public float a;

    public static final class a extends u implements l {
        public final /* synthetic */ q a;
        public final /* synthetic */ f b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar, f fVar) {
            super(1);
            this.a = qVar;
            this.b = fVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
            aVar.K(this.a, 0, 0, this.b.E1());
        }
    }

    public f(float f) {
        this.a = f;
    }

    public final float E1() {
        return this.a;
    }

    public final void F1(float f) {
        this.a = f;
    }

    public C measure-3p2s80s(androidx.compose.ui.layout.l lVar, A a2, long j) {
        q C0 = a2.C0(j);
        return androidx.compose.ui.layout.l.O0(lVar, C0.W0(), C0.P0(), null, new a(C0, this), 4, null);
    }

    public String toString() {
        return "ZIndexModifier(zIndex=" + this.a + ')';
    }
}
