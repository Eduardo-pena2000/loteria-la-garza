package androidx.compose.ui;

import P0.L0;
import Qa.l;
import Qa.p;
import Qa.q;
import androidx.compose.ui.e;
import b0.m;
import kotlin.jvm.internal.V;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {

    public static final class a extends u implements l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(e.b bVar) {
            return Boolean.valueOf(!(bVar instanceof androidx.compose.ui.b));
        }
    }

    public static final class b extends u implements p {
        public final /* synthetic */ m a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m mVar) {
            super(2);
            this.a = mVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke(e eVar, e.b bVar) {
            boolean z = bVar instanceof androidx.compose.ui.b;
            e eVar2 = bVar;
            if (z) {
                q b = ((androidx.compose.ui.b) bVar).b();
                t.e(b, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                eVar2 = c.a(this.a, (e) ((q) V.e(b, 3)).invoke(e.a, this.a, 0));
            }
            return eVar.then(eVar2);
        }
    }

    public static final /* synthetic */ e a(m mVar, e eVar) {
        return e(mVar, eVar);
    }

    public static final e b(e eVar, l lVar, q qVar) {
        return eVar.then(new androidx.compose.ui.b(lVar, qVar));
    }

    public static /* synthetic */ e c(e eVar, l lVar, q qVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = L0.a();
        }
        return b(eVar, lVar, qVar);
    }

    public static final /* synthetic */ e d(m mVar, e eVar) {
        return g(mVar, eVar);
    }

    public static final e e(m mVar, e eVar) {
        if (eVar.all(a.a)) {
            return eVar;
        }
        mVar.B(1219399079);
        e eVar2 = (e) eVar.foldIn(e.a, new b(mVar));
        mVar.T();
        return eVar2;
    }

    public static final e f(m mVar, e eVar) {
        mVar.V(439770924);
        e e = e(mVar, eVar);
        mVar.P();
        return e;
    }

    public static final e g(m mVar, e eVar) {
        return eVar == e.a ? eVar : f(mVar, new CompositionLocalMapInjectionElement(mVar.r()).then(eVar));
    }
}
