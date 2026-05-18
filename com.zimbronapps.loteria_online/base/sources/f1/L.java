package f1;

import Z0.W0;
import Z0.X0;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l {
    public U a = new U(Z0.g.f(), W0.b.a(), (W0) null, (kotlin.jvm.internal.k) null);
    public m b = new m(this.a.i(), this.a.k(), null);

    public static /* synthetic */ CharSequence a(i iVar, l lVar, i iVar2) {
        return d(iVar, lVar, iVar2);
    }

    public static final CharSequence d(i iVar, l lVar, i iVar2) {
        return (iVar == iVar2 ? " > " : "   ") + lVar.f(iVar2);
    }

    public final U b(List list) {
        i iVar;
        Exception e;
        i iVar2;
        try {
            int size = list.size();
            int i = 0;
            iVar = null;
            while (i < size) {
                try {
                    iVar2 = (i) list.get(i);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    iVar2.a(this.b);
                    i++;
                    iVar = iVar2;
                } catch (Exception e3) {
                    e = e3;
                    iVar = iVar2;
                    throw new RuntimeException(c(list, iVar), e);
                }
            }
            Z0.e s = this.b.s();
            long i2 = this.b.i();
            W0 b = W0.b(i2);
            b.r();
            W0 w0 = W0.m(this.a.k()) ? null : b;
            U u = new U(s, w0 != null ? w0.r() : X0.b(W0.k(i2), W0.l(i2)), this.b.d(), (kotlin.jvm.internal.k) null);
            this.a = u;
            return u;
        } catch (Exception e4) {
            iVar = null;
            e = e4;
        }
    }

    public final String c(List list, i iVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.b.h() + ", composition=" + this.b.d() + ", selection=" + W0.q(this.b.i()) + "):");
        kotlin.jvm.internal.t.f(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.t.f(sb, "append(...)");
        Da.D.l0(list, sb, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new k(iVar, this), 60, (Object) null);
        String sb2 = sb.toString();
        kotlin.jvm.internal.t.f(sb2, "toString(...)");
        return sb2;
    }

    public final void e(U u, c0 c0Var) {
        boolean c = kotlin.jvm.internal.t.c(u.j(), this.b.d());
        boolean z = true;
        boolean z2 = false;
        if (!kotlin.jvm.internal.t.c(this.a.i().j(), u.i().j())) {
            this.b = new m(u.i(), u.k(), null);
        } else if (W0.g(this.a.k(), u.k())) {
            z = false;
        } else {
            this.b.p(W0.l(u.k()), W0.k(u.k()));
            z2 = true;
            z = false;
        }
        if (u.j() == null) {
            this.b.a();
        } else if (!W0.h(u.j().r())) {
            this.b.n(W0.l(u.j().r()), W0.k(u.j().r()));
        }
        if (z || (!z2 && !c)) {
            this.b.a();
            u = U.g(u, null, 0L, null, 3, null);
        }
        U u2 = this.a;
        this.a = u;
        if (c0Var != null) {
            c0Var.d(u2, u);
        }
    }

    public final String f(i iVar) {
        if (iVar instanceof a) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommitTextCommand(text.length=");
            a aVar = (a) iVar;
            sb.append(aVar.c().length());
            sb.append(", newCursorPosition=");
            sb.append(aVar.b());
            sb.append(')');
            return sb.toString();
        }
        if (iVar instanceof P) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SetComposingTextCommand(text.length=");
            P p = (P) iVar;
            sb2.append(p.c().length());
            sb2.append(", newCursorPosition=");
            sb2.append(p.b());
            sb2.append(')');
            return sb2.toString();
        }
        if (iVar instanceof O) {
            return ((O) iVar).toString();
        }
        if (iVar instanceof g) {
            return ((g) iVar).toString();
        }
        if (iVar instanceof h) {
            return ((h) iVar).toString();
        }
        if (iVar instanceof Q) {
            return ((Q) iVar).toString();
        }
        if (iVar instanceof o) {
            return ((o) iVar).toString();
        }
        if (iVar instanceof f) {
            return ((f) iVar).toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unknown EditCommand: ");
        String e = kotlin.jvm.internal.P.b(iVar.getClass()).e();
        if (e == null) {
            e = "{anonymous EditCommand}";
        }
        sb3.append(e);
        return sb3.toString();
    }

    public final U g() {
        return this.a;
    }
}
