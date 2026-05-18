package androidx.compose.ui.layout;

import Ca.I;
import M0.O;
import M0.V;
import O0.H;
import O0.I0;
import android.graphics.Rect;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import b0.A0;
import b0.C0;
import java.util.List;
import w.L;
import w.c0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x extends e.c implements O0.E, I0 {
    public int a = -1;
    public f b;
    public final Qa.l c;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ q a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar) {
            super(1);
            this.a = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
            q.a.P(aVar, this.a, 0, 0, 0.0f, 4, null);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ f b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar) {
            super(1);
            this.b = fVar;
        }

        public final void a(O o) {
            x xVar = x.this;
            xVar.J1(xVar.G1().getIntValue());
            if (x.this.H1() > 0) {
                long a = o.x().a();
                c0 j = this.b.j();
                int i = (int) (a >> 32);
                int i2 = (int) (a & 4294967295L);
                for (C c : E.a()) {
                    Object e = j.e(c);
                    kotlin.jvm.internal.t.d(e);
                    V v = (V) e;
                    E.d(o, c.a(), v.a(), i, i2);
                    if (v.g()) {
                        E.d(o, v.c(), v.d(), i, i2);
                        E.d(o, v.e(), v.f(), i, i2);
                    }
                    E.d(o, c.b(), v.b(), i, i2);
                }
                if (x.this.E1().g()) {
                    L E1 = x.this.E1();
                    x xVar2 = x.this;
                    Object[] objArr = E1.a;
                    int i3 = E1.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        C0 c0 = (C0) objArr[i4];
                        s sVar = (s) xVar2.F1().get(i4);
                        Rect rect = (Rect) c0.getValue();
                        o.z0(sVar.a(), rect.left);
                        o.z0(sVar.b(), rect.top);
                        o.z0(sVar.c(), rect.right);
                        o.z0(sVar.d(), rect.bottom);
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((O) obj);
            return I.a;
        }
    }

    public x(f fVar) {
        this.b = fVar;
        this.c = new b(fVar);
    }

    public Object B() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    public final L E1() {
        return this.b.h();
    }

    public final List F1() {
        return this.b.g();
    }

    public final A0 G1() {
        return this.b.i();
    }

    public final int H1() {
        return this.a;
    }

    public final void I1(f fVar) {
        if (this.b != fVar) {
            this.b = fVar;
            H.c(this);
        }
    }

    public final void J1(int i) {
        this.a = i;
    }

    public M0.C measure-3p2s80s(l lVar, M0.A a2, long j) {
        q C0 = a2.C0(j);
        return l.j0(lVar, C0.W0(), C0.P0(), null, this.c, new a(C0), 4, null);
    }
}
