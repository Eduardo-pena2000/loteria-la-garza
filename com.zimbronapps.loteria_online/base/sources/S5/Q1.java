package S5;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbtp;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class q1 {
    public final zzbtp a;
    public final p2 b;
    public final AtomicBoolean c;
    public final L5.B d;
    public final C e;
    public a f;
    public L5.e g;
    public L5.h[] h;
    public M5.e i;
    public Y j;
    public L5.C k;
    public String l;
    public final ViewGroup m;
    public int n;
    public boolean o;
    public L5.t p;
    public final AtomicLong q;

    public q1(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, p2.a, null, i);
    }

    public static q2 f(Context context, L5.h[] hVarArr, int i) {
        for (L5.h hVar : hVarArr) {
            if (hVar.equals(L5.h.q)) {
                return new q2("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        q2 q2Var = new q2(context, hVarArr);
        q2Var.j = g(i);
        return q2Var;
    }

    public static boolean g(int i) {
        return i == 1;
    }

    public final void A(long j) {
        this.q.set(j);
        try {
            Y y = this.j;
            if (y != null) {
                y.zzT(j);
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final L5.t B() {
        return this.p;
    }

    public final L5.B C() {
        return this.d;
    }

    public final g1 D() {
        Y y = this.j;
        if (y != null) {
            try {
                return y.zzF();
            } catch (RemoteException e) {
                W5.p.i("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    public final void a(L5.C c) {
        this.k = c;
        try {
            Y y = this.j;
            if (y != null) {
                y.zzG(c == null ? null : new e2(c));
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final L5.C b() {
        return this.k;
    }

    public final boolean c(Y y) {
        try {
            N6.a zzb = y.zzb();
            if (zzb == null || ((View) N6.b.r1(zzb)).getParent() != null) {
                return false;
            }
            this.m.addView((View) N6.b.r1(zzb));
            this.j = y;
            return true;
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final /* synthetic */ void d(N6.a aVar) {
        this.m.addView((View) N6.b.r1(aVar));
    }

    public final /* synthetic */ L5.B e() {
        return this.d;
    }

    public final void h() {
        try {
            Y y = this.j;
            if (y != null) {
                y.zzc();
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final L5.e i() {
        return this.g;
    }

    public final L5.h j() {
        q2 zzn;
        try {
            Y y = this.j;
            if (y != null && (zzn = y.zzn()) != null) {
                return L5.F.a(zzn.e, zzn.b, zzn.a);
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
        L5.h[] hVarArr = this.h;
        if (hVarArr != null) {
            return hVarArr[0];
        }
        return null;
    }

    public final L5.h[] k() {
        return this.h;
    }

    public final String l() {
        Y y;
        if (this.l == null && (y = this.j) != null) {
            try {
                this.l = y.zzu();
            } catch (RemoteException e) {
                W5.p.i("#007 Could not call remote method.", e);
            }
        }
        return this.l;
    }

    public final M5.e m() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8 A[Catch: RemoteException -> 0x00d6, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00d6, blocks: (B:24:0x00a5, B:26:0x00ab, B:28:0x00b9, B:30:0x00cb, B:31:0x00d8), top: B:23:0x00a5, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(S5.n1 r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.q1.n(S5.n1):void");
    }

    public final void o() {
        try {
            Y y = this.j;
            if (y != null) {
                y.zzf();
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void p() {
        try {
            Y y = this.j;
            if (y != null) {
                y.zzg();
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void q(L5.e eVar) {
        this.g = eVar;
        this.e.d(eVar);
    }

    public final void r(a aVar) {
        try {
            this.f = aVar;
            Y y = this.j;
            if (y != null) {
                y.zzy(aVar != null ? new z(aVar) : null);
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void s(L5.h... hVarArr) {
        if (this.h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        t(hVarArr);
    }

    public final void t(L5.h... hVarArr) {
        this.h = hVarArr;
        try {
            Y y = this.j;
            if (y != null) {
                y.zzo(f(this.m.getContext(), this.h, this.n));
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
        this.m.requestLayout();
    }

    public final void u(String str) {
        if (this.l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.l = str;
    }

    public final void v(M5.e eVar) {
        try {
            this.i = eVar;
            Y y = this.j;
            if (y != null) {
                y.zzi(eVar != null ? new zzbdt(eVar) : null);
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void w(boolean z) {
        this.o = z;
        try {
            Y y = this.j;
            if (y != null) {
                y.zzz(z);
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final L5.z x() {
        d1 d1Var = null;
        try {
            Y y = this.j;
            if (y != null) {
                d1Var = y.zzt();
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
        return L5.z.g(d1Var);
    }

    public final void y(L5.t tVar) {
        try {
            this.p = tVar;
            Y y = this.j;
            if (y != null) {
                y.zzP(new V1(tVar));
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final long z() {
        AtomicLong atomicLong = this.q;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            Y y = this.j;
            if (y != null) {
                atomicLong.set(y.zzU());
                return atomicLong.get();
            }
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
        return 0L;
    }

    public q1(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, p2 p2Var, Y y, int i) {
        q2 q2Var;
        this.a = new zzbtp();
        this.d = new L5.B();
        this.e = new o1(this);
        this.q = new AtomicLong();
        this.m = viewGroup;
        this.b = p2Var;
        this.j = null;
        this.c = new AtomicBoolean(false);
        this.n = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                y2 y2Var = new y2(context, attributeSet);
                this.h = y2Var.a(z);
                this.l = y2Var.b();
                if (viewGroup.isInEditMode()) {
                    W5.g a = B.a();
                    L5.h hVar = this.h[0];
                    int i2 = this.n;
                    if (hVar.equals(L5.h.q)) {
                        q2Var = new q2("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        q2 q2Var2 = new q2(context, hVar);
                        q2Var2.j = g(i2);
                        q2Var = q2Var2;
                    }
                    a.l(viewGroup, q2Var, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                B.a().k(viewGroup, new q2(context, L5.h.i), e.getMessage(), e.getMessage());
            }
        }
    }
}
