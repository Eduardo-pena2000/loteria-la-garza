package W6;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.games_v2.zzac;
import com.google.android.gms.internal.games_v2.zzaf;
import com.google.android.gms.internal.games_v2.zzfg;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class k extends com.google.android.gms.common.internal.i {
    public static final /* synthetic */ int i = 0;
    public final zzac a;
    public final String b;
    public PlayerEntity c;
    public final q d;
    public boolean e;
    public final long f;
    public final T6.J g;
    public final r h;

    public k(Context context, Looper looper, com.google.android.gms.common.internal.f fVar, T6.J j, com.google.android.gms.common.api.internal.f fVar2, com.google.android.gms.common.api.internal.o oVar, r rVar) {
        super(context, looper, 1, fVar, fVar2, oVar);
        this.a = new D(this);
        this.e = false;
        this.b = fVar.h();
        this.h = (r) com.google.android.gms.common.internal.t.l(rVar);
        q d = q.d(this, fVar.g());
        this.d = d;
        this.f = hashCode();
        this.g = j;
        boolean z = j.h;
        if (fVar.j() != null || (context instanceof Activity)) {
            d.f(fVar.j());
        }
    }

    public static /* bridge */ /* synthetic */ void A(k kVar, TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setException(T6.e.b(T6.i.c(26703, ((p) kVar.getService()).K1())));
        } catch (RemoteException e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* bridge */ /* synthetic */ void B(RemoteException remoteException) {
        y(remoteException);
    }

    public static void y(RemoteException remoteException) {
        zzfg.zzh("GamesGmsClientImpl", "service died", remoteException);
    }

    public final void C() {
        if (isConnected()) {
            try {
                ((p) getService()).zzp();
            } catch (RemoteException e) {
                y(e);
            }
        }
    }

    public final void D(TaskCompletionSource taskCompletionSource, c7.a aVar, c7.g gVar) {
        c7.b I1 = aVar.I1();
        com.google.android.gms.common.internal.t.p(!I1.n1(), "Snapshot already closed");
        BitmapTeleporter zza = gVar.zza();
        if (zza != null) {
            zza.M1(getContext().getCacheDir());
        }
        H6.a zza2 = I1.zza();
        I1.zzb();
        try {
            ((p) getService()).U1(new K(taskCompletionSource), aVar.e().J1(), (c7.h) gVar, zza2);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void E(TaskCompletionSource taskCompletionSource, String str) {
        try {
            ((p) getService()).V1(new L(taskCompletionSource), str);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void F(TaskCompletionSource taskCompletionSource, boolean z) {
        try {
            ((p) getService()).v1(new g(taskCompletionSource), null, z);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void G(TaskCompletionSource taskCompletionSource, String str, int i2) {
        try {
            ((p) getService()).Y1(taskCompletionSource == null ? null : new H(taskCompletionSource), str, i2, this.d.c(), this.d.b());
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void H(String str, int i2) {
        this.a.zzc(str, i2);
    }

    public final void I(TaskCompletionSource taskCompletionSource, boolean z) {
        try {
            ((p) getService()).a2(new J(taskCompletionSource), z);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void J(TaskCompletionSource taskCompletionSource, String str, int i2, int i3) {
        try {
            ((p) getService()).X1(new Q(this, taskCompletionSource), null, str, i2, i3);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void connect(d.c cVar) {
        this.c = null;
        super.connect(cVar);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
        return queryLocalInterface instanceof p ? (p) queryLocalInterface : new p(iBinder);
    }

    public final void disconnect() {
        this.e = false;
        if (isConnected()) {
            try {
                this.a.zzb();
                ((p) getService()).T1(this.f);
            } catch (RemoteException unused) {
                zzfg.zzg("GamesGmsClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.disconnect();
    }

    public final void e(TaskCompletionSource taskCompletionSource, boolean z) {
        this.a.zzb();
        try {
            ((p) getService()).b2(new M(taskCompletionSource), z);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void f(TaskCompletionSource taskCompletionSource, boolean z, String... strArr) {
        this.a.zzb();
        try {
            ((p) getService()).c2(new M(taskCompletionSource), z, strArr);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void g(TaskCompletionSource taskCompletionSource, String str, boolean z) {
        try {
            ((p) getService()).q1(new P(taskCompletionSource), str, z);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final v6.d[] getApiFeatures() {
        return T6.z.h;
    }

    public final Bundle getConnectionHint() {
        return null;
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        String locale = getContext().getResources().getConfiguration().locale.toString();
        Bundle a = this.g.a();
        a.putString("com.google.android.gms.games.key.gamePackageName", this.b);
        a.putString("com.google.android.gms.games.key.desiredLocale", locale);
        a.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(this.d.c()));
        if (!a.containsKey("com.google.android.gms.games.key.API_VERSION")) {
            a.putInt("com.google.android.gms.games.key.API_VERSION", 9);
        }
        a.putBundle("com.google.android.gms.games.key.signInOptions", o7.a.e(getClientSettings()));
        return a;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final Set getScopesForConnectionlessNonSignIn() {
        return getScopes();
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.games.service.START";
    }

    public final void h(TaskCompletionSource taskCompletionSource, boolean z) {
        try {
            ((p) getService()).r1(new c(taskCompletionSource), z);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void i(TaskCompletionSource taskCompletionSource, a7.f fVar, int i2, int i3) {
        try {
            ((p) getService()).s1(new b(this, taskCompletionSource), fVar.b().a(), i2, i3);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void j(TaskCompletionSource taskCompletionSource, String str, boolean z) {
        try {
            ((p) getService()).v1(new g(taskCompletionSource), str, z);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void k(TaskCompletionSource taskCompletionSource, String str, int i2, int i3, int i4, boolean z) {
        try {
            ((p) getService()).t1(new b(this, taskCompletionSource), str, i2, i3, i4, z);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void l(TaskCompletionSource taskCompletionSource, boolean z) {
        try {
            ((p) getService()).u1(new e(taskCompletionSource), z);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void m(TaskCompletionSource taskCompletionSource, String str, int i2, boolean z, boolean z2) {
        if (!str.equals("played_with") && !str.equals("friends_all")) {
            throw new IllegalArgumentException("Invalid player collection: ".concat(str));
        }
        try {
            ((p) getService()).w1(new f(this, taskCompletionSource), str, i2, z, z2);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void n(TaskCompletionSource taskCompletionSource, boolean z) {
        try {
            ((p) getService()).x1(new d(taskCompletionSource), z);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void o(TaskCompletionSource taskCompletionSource, String str, int i2, int i3, int i4, boolean z) {
        try {
            ((p) getService()).y1(new b(this, taskCompletionSource), str, i2, i3, i4, z);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final /* bridge */ /* synthetic */ void onConnectedLocked(IInterface iInterface) {
        p pVar = (p) iInterface;
        super.onConnectedLocked(pVar);
        if (this.e) {
            this.d.g();
            this.e = false;
        }
        boolean z = this.g.a;
        try {
            pVar.A1(new E(new zzaf(this.d.e())), this.f);
        } catch (RemoteException e) {
            y(e);
        }
    }

    public final void onConnectionFailed(v6.b bVar) {
        super.onConnectionFailed(bVar);
        this.e = false;
    }

    public final void onPostInitHandler(int i2, IBinder iBinder, Bundle bundle, int i3) {
        if (i2 == 0) {
            i2 = 0;
            if (bundle != null) {
                bundle.setClassLoader(k.class.getClassLoader());
                this.e = bundle.getBoolean("show_welcome_popup");
                this.c = (PlayerEntity) bundle.getParcelable("com.google.android.gms.games.current_player");
            }
        }
        super.onPostInitHandler(i2, iBinder, bundle, i3);
    }

    public final void onUserSignOut(d.e eVar) {
        try {
            F f = new F(eVar);
            this.a.zzb();
            try {
                ((p) getService()).G1(new G(f));
            } catch (SecurityException unused) {
                f.setFailedResult(T6.i.b(4));
            }
        } catch (RemoteException unused2) {
            eVar.a();
        }
    }

    public final void p(TaskCompletionSource taskCompletionSource, String str, boolean z, int i2) {
        try {
            ((p) getService()).z1(new j(taskCompletionSource), str, z, i2);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void q(TaskCompletionSource taskCompletionSource, String str, boolean z) {
        ((p) getService()).B1(new O(taskCompletionSource), str, z);
    }

    public final void r(TaskCompletionSource taskCompletionSource, String str, String str2, c7.g gVar, c7.b bVar) {
        com.google.android.gms.common.internal.t.p(!bVar.n1(), "SnapshotContents already closed");
        BitmapTeleporter zza = gVar.zza();
        if (zza != null) {
            zza.M1(getContext().getCacheDir());
        }
        H6.a zza2 = bVar.zza();
        bVar.zzb();
        try {
            ((p) getService()).C1(new j(taskCompletionSource), str, str2, (c7.h) gVar, zza2);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final boolean requiresAccount() {
        return true;
    }

    public final boolean requiresSignIn() {
        if (this.g.p.b()) {
            return false;
        }
        String str = this.g.l;
        return true;
    }

    public final void s(TaskCompletionSource taskCompletionSource, String str) {
        try {
            ((p) getService()).D1(taskCompletionSource == null ? null : new I(taskCompletionSource), str, this.d.c(), this.d.b());
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void t(TaskCompletionSource taskCompletionSource, String str, int i2) {
        try {
            ((p) getService()).E1(taskCompletionSource == null ? null : new H(taskCompletionSource), str, i2, this.d.c(), this.d.b());
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void u(IBinder iBinder, Bundle bundle) {
        if (isConnected()) {
            if (this.g.p.d() && this.h.c()) {
                return;
            }
            try {
                ((p) getService()).F1(iBinder, bundle);
                this.h.b();
            } catch (RemoteException e) {
                y(e);
            }
        }
    }

    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void v(TaskCompletionSource taskCompletionSource, String str, long j, String str2) {
        try {
            ((p) getService()).H1(new i(taskCompletionSource), str, j, str2);
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final void w(x xVar) {
        xVar.e(this.d);
    }

    public final void x(TaskCompletionSource taskCompletionSource, String str) {
        try {
            ((p) getService()).I1(taskCompletionSource == null ? null : new I(taskCompletionSource), str, this.d.c(), this.d.b());
        } catch (SecurityException e) {
            T6.k.b(taskCompletionSource, e);
        }
    }

    public final T6.n z() {
        checkConnected();
        synchronized (this) {
            try {
                if (this.c == null) {
                    T6.o oVar = new T6.o(((p) getService()).S1());
                    try {
                        if (oVar.getCount() > 0) {
                            this.c = new PlayerEntity(oVar.get(0));
                        }
                        oVar.release();
                    } catch (Throwable th) {
                        oVar.release();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.c;
    }
}
