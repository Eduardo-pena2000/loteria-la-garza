package R5;

import S5.B;
import S5.D;
import V5.F0;
import V5.o0;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzavh;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzayv;
import com.google.android.gms.internal.ads.zzayz;
import com.google.android.gms.internal.ads.zzazc;
import com.google.android.gms.internal.ads.zzazg;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzfvh;
import com.google.android.gms.internal.ads.zzfwe;
import com.google.android.gms.internal.ads.zzfwy;
import com.google.android.gms.internal.ads.zzgzo;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class k implements Runnable, zzazc {
    public static final long p = System.currentTimeMillis();
    public boolean d;
    public final boolean e;
    public final boolean f;
    public final Executor g;
    public final zzfvh h;
    public Context i;
    public final Context j;
    public W5.a k;
    public final W5.a l;
    public final boolean m;
    public int o;
    public final List a = new Vector();
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();
    public final CountDownLatch n = new CountDownLatch(1);

    public k(Context context, W5.a aVar) {
        this.i = context;
        this.j = context;
        this.k = aVar;
        this.l = aVar;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.g = newCachedThreadPool;
        boolean booleanValue = ((Boolean) D.c().zzd(zzbhe.zzde)).booleanValue();
        this.m = booleanValue;
        this.h = zzfvh.zza(context, newCachedThreadPool, booleanValue);
        this.e = ((Boolean) D.c().zzd(zzbhe.zzdb)).booleanValue();
        this.f = ((Boolean) D.c().zzd(zzbhe.zzdf)).booleanValue();
        if (((Boolean) D.c().zzd(zzbhe.zzdd)).booleanValue()) {
            this.o = 2;
        } else {
            this.o = 1;
        }
        if (!((Boolean) D.c().zzd(zzbhe.zzeo)).booleanValue()) {
            this.d = d();
        }
        if (((Boolean) D.c().zzd(zzbhe.zzeh)).booleanValue()) {
            zzcei.zza.execute(this);
            return;
        }
        B.a();
        if (W5.g.G()) {
            zzcei.zza.execute(this);
        } else {
            run();
        }
    }

    private final void i(boolean z) {
        String str = this.k.a;
        Context k = k(this.i);
        zzavh zze = zzavi.zze();
        zze.zzb(z);
        zze.zza(str);
        this.b.set(zzazg.zzt(k, (zzavi) zze.zzbm()));
    }

    public static final Context k(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public static final zzayz l(Context context, W5.a aVar, boolean z, boolean z2) {
        zzavh zze = zzavi.zze();
        zze.zzb(z);
        zze.zza(aVar.a);
        return zzayz.zza(k(context), (zzavi) zze.zzbm(), z2);
    }

    public final boolean a() {
        try {
            this.n.await();
            return true;
        } catch (InterruptedException e) {
            int i = o0.b;
            W5.p.g("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public final String b(Context context, byte[] bArr) {
        zzazc j;
        if (!a() || (j = j()) == null) {
            return "";
        }
        h();
        try {
            return j.zzl(k(context));
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final String c() {
        int i = this.o;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? "2" : "1";
        }
        throw null;
    }

    public final boolean d() {
        Context context = this.i;
        h hVar = new h(this);
        zzfvh zzfvhVar = this.h;
        return new zzfwy(this.i, zzfwe.zzb(context, zzfvhVar), hVar, ((Boolean) D.c().zzd(zzbhe.zzdc)).booleanValue()).zzd(1);
    }

    public final /* synthetic */ void e(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            l(this.j, this.l, z, this.m).zzm();
        } catch (NullPointerException e) {
            this.h.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    public final /* synthetic */ zzfvh f() {
        return this.h;
    }

    public final int g() {
        if (!this.e || this.d) {
            return this.o;
        }
        return 1;
    }

    public final void h() {
        List<Object[]> list = this.a;
        zzazc j = j();
        if (list.isEmpty() || j == null) {
            return;
        }
        for (Object[] objArr : list) {
            try {
                int length = objArr.length;
                if (length == 1) {
                    j.zzd((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    j.zze(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            } catch (NullPointerException unused) {
            }
        }
        this.a.clear();
    }

    public final zzazc j() {
        return g() == 2 ? (zzazc) this.c.get() : (zzazc) this.b.get();
    }

    public final void run() {
        try {
            if (((Boolean) D.c().zzd(zzbhe.zzeo)).booleanValue()) {
                this.d = d();
            }
            boolean z = this.k.d;
            boolean z2 = false;
            if (!((Boolean) D.c().zzd(zzbhe.zzbD)).booleanValue() && z) {
                z2 = true;
            }
            if (g() == 1) {
                i(z2);
                if (this.o == 2) {
                    this.g.execute(new i(this, z2));
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zzayz l = l(this.i, this.k, z2, this.m);
                    this.c.set(l);
                    if (this.f && !l.zzb()) {
                        this.o = 1;
                        i(z2);
                    }
                } catch (NullPointerException e) {
                    this.o = 1;
                    i(z2);
                    this.h.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e);
                }
            }
            this.n.countDown();
            this.i = null;
            this.k = null;
        } catch (Throwable th) {
            this.n.countDown();
            this.i = null;
            this.k = null;
            throw th;
        }
    }

    public final void zzd(MotionEvent motionEvent) {
        zzazc j = j();
        if (j == null) {
            this.a.add(new Object[]{motionEvent});
            return;
        }
        h();
        try {
            j.zzd(motionEvent);
        } catch (NullPointerException unused) {
        }
    }

    public final void zze(int i, int i2, int i3) {
        zzazc j = j();
        if (j == null) {
            this.a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        h();
        try {
            j.zze(i, i2, i3);
        } catch (NullPointerException unused) {
        }
    }

    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!a()) {
            return "";
        }
        zzazc j = j();
        if (((Boolean) D.c().zzd(zzbhe.zzme)).booleanValue()) {
            t.g();
            F0.o(view, 4, null);
        }
        if (j == null) {
            return "";
        }
        h();
        try {
            return j.zzf(k(context), str, view, activity);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    public final void zzh(View view) {
        zzazc j = j();
        if (j != null) {
            try {
                j.zzh(view);
            } catch (NullPointerException unused) {
            }
        }
    }

    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzazc j;
        zzazc j2;
        if (((Boolean) D.c().zzd(zzbhe.zzdC)).booleanValue()) {
            if (this.n.getCount() != 0 || (j2 = j()) == null) {
                return;
            }
            try {
                j2.zzi(stackTraceElementArr);
                return;
            } catch (NullPointerException unused) {
                return;
            }
        }
        if (!a() || (j = j()) == null) {
            return;
        }
        try {
            j.zzi(stackTraceElementArr);
        } catch (NullPointerException unused2) {
        }
    }

    public final String zzj(Context context, View view, Activity activity) {
        try {
            if (!((Boolean) D.c().zzd(zzbhe.zzmd)).booleanValue()) {
                zzazc j = j();
                if (((Boolean) D.c().zzd(zzbhe.zzme)).booleanValue()) {
                    t.g();
                    F0.o(view, 2, null);
                }
                return j != null ? j.zzj(context, view, activity) : "";
            }
            if (!a()) {
                return "";
            }
            zzazc j2 = j();
            if (((Boolean) D.c().zzd(zzbhe.zzme)).booleanValue()) {
                t.g();
                F0.o(view, 2, null);
            }
            return j2 != null ? j2.zzj(context, view, activity) : "";
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final String zzk(Context context) {
        try {
            return (String) zzgzo.zzd(new j(this, context), this.g).get(((Integer) D.c().zzd(zzbhe.zzdv)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzayv.zza(context, this.l.a, p, true);
        }
    }

    public final String zzl(Context context) {
        return b(context, null);
    }
}
