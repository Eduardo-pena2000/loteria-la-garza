package k7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzcu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class e6 extends h2 {
    public final Y5 c;
    public j2 d;
    public volatile Boolean e;
    public final z f;
    public ScheduledExecutorService g;
    public final A6 h;
    public final List i;
    public final z j;

    public e6(q3 q3Var) {
        super(q3Var);
        this.i = new ArrayList();
        this.h = new A6(q3Var.e());
        this.c = new Y5(this);
        this.f = new E5(this, q3Var);
        this.j = new I5(this, q3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void J() {
        h();
        this.h.a();
        this.a.w();
        this.f.b(((Long) f2.Z.b(null)).longValue());
    }

    public final void A() {
        h();
        j();
        Y5 y5 = this.c;
        y5.b();
        try {
            D6.a.b().c(this.a.d(), y5);
        } catch (IllegalStateException | IllegalArgumentException unused) {
        }
        this.d = null;
    }

    public final void B(zzcu zzcuVar, I i, String str) {
        h();
        j();
        q3 q3Var = this.a;
        if (q3Var.C().X(12451000) == 0) {
            T(new H5(this, i, str, zzcuVar));
        } else {
            q3Var.a().r().a("Not bundling data. Service unavailable or out of date");
            q3Var.C().d0(zzcuVar, new byte[0]);
        }
    }

    public final boolean C() {
        h();
        j();
        return !y() || this.a.C().W() >= ((Integer) f2.K0.b(null)).intValue();
    }

    public final boolean D() {
        h();
        j();
        return !y() || this.a.C().W() >= 241200;
    }

    public final /* synthetic */ void E() {
        j2 j2Var = this.d;
        if (j2Var == null) {
            this.a.a().o().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            n7 V = V(false);
            com.google.android.gms.common.internal.t.l(V);
            j2Var.H0(V);
            J();
        } catch (RemoteException e) {
            this.a.a().o().b("Failed to send storage consent settings to the service", e);
        }
    }

    public final /* synthetic */ void F() {
        j2 j2Var = this.d;
        if (j2Var == null) {
            this.a.a().o().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            n7 V = V(false);
            com.google.android.gms.common.internal.t.l(V);
            j2Var.O0(V);
            J();
        } catch (RemoteException e) {
            this.a.a().o().b("Failed to send Dma consent settings to the service", e);
        }
    }

    public final /* synthetic */ void G(AtomicReference atomicReference, n7 n7Var, Bundle bundle) {
        j2 j2Var;
        synchronized (atomicReference) {
            try {
                j2Var = this.d;
            } catch (RemoteException e) {
                this.a.a().o().b("Failed to request trigger URIs; remote exception", e);
                atomicReference.notifyAll();
            }
            if (j2Var == null) {
                this.a.a().o().a("Failed to request trigger URIs; not connected to service");
                return;
            }
            com.google.android.gms.common.internal.t.l(n7Var);
            j2Var.I(n7Var, bundle, new w5(this, atomicReference));
            J();
        }
    }

    public final /* synthetic */ void H(AtomicReference atomicReference, n7 n7Var, I6 i6) {
        j2 j2Var;
        synchronized (atomicReference) {
            try {
                j2Var = this.d;
            } catch (RemoteException e) {
                this.a.a().o().b("[sgtm] Failed to get upload batches; remote exception", e);
                atomicReference.notifyAll();
            }
            if (j2Var == null) {
                this.a.a().o().a("[sgtm] Failed to get upload batches; not connected to service");
                return;
            }
            com.google.android.gms.common.internal.t.l(n7Var);
            j2Var.z0(n7Var, i6, new x5(this, atomicReference));
            J();
        }
    }

    public final /* synthetic */ void I(n7 n7Var, g gVar) {
        j2 j2Var = this.d;
        if (j2Var == null) {
            this.a.a().o().a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            j2Var.b1(n7Var, gVar);
            J();
        } catch (RemoteException e) {
            this.a.a().o().c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(gVar.a), e);
        }
    }

    public final /* synthetic */ void K(ComponentName componentName) {
        h();
        if (this.d != null) {
            this.d = null;
            this.a.a().w().b("Disconnected from device MeasurementService", componentName);
            h();
            w();
        }
    }

    public final /* synthetic */ Y5 M() {
        return this.c;
    }

    public final /* synthetic */ j2 N() {
        return this.d;
    }

    public final /* synthetic */ void O(j2 j2Var) {
        this.d = null;
    }

    public final /* synthetic */ ScheduledExecutorService P() {
        return this.g;
    }

    public final /* synthetic */ void Q(ScheduledExecutorService scheduledExecutorService) {
        this.g = scheduledExecutorService;
    }

    public final boolean R() {
        this.a.c();
        return true;
    }

    public final void T(Runnable runnable) {
        h();
        if (W()) {
            runnable.run();
            return;
        }
        List list = this.i;
        long size = list.size();
        q3 q3Var = this.a;
        q3Var.w();
        if (size >= 1000) {
            q3Var.a().o().a("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.j.b(60000L);
        w();
    }

    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void L() {
        h();
        A2 w = this.a.a().w();
        List list = this.i;
        w.b("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                this.a.a().o().b("Task exception while flushing queue", e);
            }
        }
        this.i.clear();
        this.j.d();
    }

    public final n7 V(boolean z) {
        Pair b;
        q3 q3Var = this.a;
        q3Var.c();
        q2 L = this.a.L();
        String str = null;
        if (z) {
            q3 q3Var2 = q3Var.a().a;
            if (q3Var2.x().e != null && (b = q3Var2.x().e.b()) != null && b != Q2.A) {
                String valueOf = String.valueOf(b.second);
                String str2 = (String) b.first;
                StringBuilder sb = new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length());
                sb.append(valueOf);
                sb.append(":");
                sb.append(str2);
                str = sb.toString();
            }
        }
        return L.o(str);
    }

    public final boolean W() {
        h();
        j();
        return this.d != null;
    }

    public final void X() {
        h();
        j();
        T(new J5(this, V(true)));
    }

    public final void Y(boolean z) {
        h();
        j();
        if (C()) {
            T(new K5(this, V(false)));
        }
    }

    public final void Z(boolean z) {
        h();
        j();
        T(new d6(this));
    }

    public final void a0() {
        h();
        j();
        T(new Z5(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b0(k7.j2 r58, y6.a r59, k7.n7 r60) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.e6.b0(k7.j2, y6.a, k7.n7):void");
    }

    public final void c0(I i, String str) {
        com.google.android.gms.common.internal.t.l(i);
        h();
        j();
        R();
        T(new L5(this, true, V(true), this.a.E().p(i), i, str));
    }

    public final void d0(i iVar) {
        com.google.android.gms.common.internal.t.l(iVar);
        h();
        j();
        this.a.c();
        T(new M5(this, true, V(true), this.a.E().r(iVar), new i(iVar), iVar));
    }

    public final void e0(AtomicReference atomicReference, String str, String str2, String str3) {
        h();
        j();
        T(new N5(this, atomicReference, null, str2, str3, V(false)));
    }

    public final void f0(zzcu zzcuVar, String str, String str2) {
        h();
        j();
        T(new O5(this, str, str2, V(false), zzcuVar));
    }

    public final void g0(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        h();
        j();
        T(new P5(this, atomicReference, null, str2, str3, V(false), z));
    }

    public final void h0(zzcu zzcuVar, String str, String str2, boolean z) {
        h();
        j();
        T(new v5(this, str, str2, V(false), z, zzcuVar));
    }

    public final void i0(AtomicReference atomicReference, Bundle bundle) {
        h();
        j();
        T(new a6(this, atomicReference, V(false), bundle));
    }

    public final void j0(AtomicReference atomicReference, I6 i6) {
        h();
        j();
        T(new b6(this, atomicReference, V(false), i6));
    }

    public final void k0(g gVar) {
        h();
        j();
        n7 V = V(true);
        com.google.android.gms.common.internal.t.l(V);
        T(new c6(this, V, gVar));
    }

    public final p l0() {
        h();
        j();
        j2 j2Var = this.d;
        if (j2Var == null) {
            w();
            this.a.a().v().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        n7 V = V(false);
        com.google.android.gms.common.internal.t.l(V);
        try {
            p n0 = j2Var.n0(V);
            J();
            return n0;
        } catch (RemoteException e) {
            this.a.a().o().b("Failed to get consents; remote exception", e);
            return null;
        }
    }

    public final boolean m() {
        return false;
    }

    public final void o(h7 h7Var) {
        h();
        j();
        R();
        T(new y5(this, V(true), this.a.E().q(h7Var), h7Var));
    }

    public final void p() {
        h();
        j();
        n7 V = V(false);
        R();
        this.a.E().o();
        T(new z5(this, V));
    }

    public final void q(AtomicReference atomicReference) {
        h();
        j();
        T(new A5(this, atomicReference, V(false)));
    }

    public final void r(zzcu zzcuVar) {
        h();
        j();
        T(new B5(this, V(false), zzcuVar));
    }

    public final void s() {
        h();
        j();
        n7 V = V(true);
        R();
        this.a.w().H(null, f2.c1);
        this.a.E().u();
        T(new C5(this, V, true));
    }

    public final void t() {
        h();
        j();
        T(new D5(this, V(true)));
    }

    public final void u(m5 m5Var) {
        h();
        j();
        T(new F5(this, m5Var));
    }

    public final void v(Bundle bundle) {
        h();
        j();
        G g = new G(bundle);
        R();
        T(new G5(this, true, V(false), this.a.w().H(null, f2.c1) && this.a.E().s(g), g, bundle));
    }

    public final void w() {
        h();
        j();
        if (W()) {
            return;
        }
        if (y()) {
            this.c.c();
            return;
        }
        q3 q3Var = this.a;
        if (q3Var.w().m()) {
            return;
        }
        q3Var.c();
        List queryIntentServices = q3Var.d().getPackageManager().queryIntentServices(new Intent().setClassName(q3Var.d(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            q3Var.a().o().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context d = q3Var.d();
        q3Var.c();
        intent.setComponent(new ComponentName(d, "com.google.android.gms.measurement.AppMeasurementService"));
        this.c.a(intent);
    }

    public final Boolean x() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean y() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.e6.y():boolean");
    }

    public final void z(j2 j2Var) {
        h();
        com.google.android.gms.common.internal.t.l(j2Var);
        this.d = j2Var;
        J();
        L();
    }
}
