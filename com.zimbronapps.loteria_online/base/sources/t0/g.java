package t0;

import Ca.I;
import O0.p0;
import androidx.compose.ui.focus.FocusTargetNode;
import w.Q;
import w.f0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g {
    public final k a;
    public final p0 b;
    public final Q c = f0.b();
    public final Q d = f0.b();
    public boolean e;

    public /* synthetic */ class a extends kotlin.jvm.internal.q implements Qa.a {
        public a(Object obj) {
            super(0, obj, g.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            g.a((g) ((kotlin.jvm.internal.f) this).receiver);
        }
    }

    public g(k kVar, p0 p0Var) {
        this.a = kVar;
        this.b = p0Var;
    }

    public static final /* synthetic */ void a(g gVar) {
        gVar.c();
    }

    public final boolean b() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.g.c():void");
    }

    public final void d() {
        if (this.a.f() == null || this.a.o() == q.d) {
            this.a.b();
        }
    }

    public final void e() {
        if (this.e) {
            return;
        }
        this.b.i(new a(this));
        this.e = true;
    }

    public final void f(FocusTargetNode focusTargetNode) {
        if (this.c.h(focusTargetNode)) {
            e();
        }
    }

    public final void g(e eVar) {
        if (this.d.h(eVar)) {
            e();
        }
    }
}
