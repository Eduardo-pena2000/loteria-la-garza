package E;

import Ca.I;
import Ca.t;
import b0.C0;
import b0.U1;
import b0.b0;
import b0.h2;
import b0.m;
import b0.w;
import cb.O;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {

    public static final class a extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ k b;
        public final /* synthetic */ C0 c;

        public static final class a implements fb.f {
            public final /* synthetic */ List a;
            public final /* synthetic */ C0 b;

            public a(List list, C0 c0) {
                this.a = list;
                this.b = c0;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(j jVar, Ga.e eVar) {
                if (jVar instanceof g) {
                    this.a.add(jVar);
                } else if (jVar instanceof h) {
                    this.a.remove(((h) jVar).a());
                }
                this.b.setValue(Ia.b.a(!this.a.isEmpty()));
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, C0 c0, Ga.e eVar) {
            super(2, eVar);
            this.b = kVar;
            this.c = c0;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new a(this.b, this.c, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                t.b(obj);
                ArrayList arrayList = new ArrayList();
                fb.e b = this.b.b();
                a aVar = new a(arrayList, this.c);
                this.a = 1;
                if (b.collect(aVar, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return I.a;
        }
    }

    public static final h2 a(k kVar, b0.m mVar, int i) {
        if (w.L()) {
            w.U(1206586544, i, -1, "androidx.compose.foundation.interaction.collectIsHoveredAsState (HoverInteraction.kt:64)");
        }
        Object C = mVar.C();
        m.a aVar = b0.m.a;
        if (C == aVar.a()) {
            C = U1.i(Boolean.FALSE, null, 2, null);
            mVar.t(C);
        }
        C0 c0 = (C0) C;
        int i2 = i & 14;
        boolean z = ((i2 ^ 6) > 4 && mVar.U(kVar)) || (i & 6) == 4;
        Object C2 = mVar.C();
        if (z || C2 == aVar.a()) {
            C2 = new a(kVar, c0, null);
            mVar.t(C2);
        }
        b0.d(kVar, (Qa.p) C2, mVar, i2);
        if (w.L()) {
            w.T();
        }
        return c0;
    }
}
