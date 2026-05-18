package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzbi;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzig;
import com.google.android.gms.internal.play_billing.zzij;
import com.google.android.gms.internal.play_billing.zzjm;
import com.google.android.gms.internal.play_billing.zzjo;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjt;
import com.google.android.gms.internal.play_billing.zzjv;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import o5.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class d implements ServiceConnection {
    public final BillingClientStateListener a;
    public final zzbi b;
    public final zzbi c;
    public final int d;
    public final /* synthetic */ a e;

    public /* synthetic */ d(a aVar, BillingClientStateListener billingClientStateListener, int i, zzbp zzbpVar) {
        Objects.requireNonNull(aVar);
        this.e = aVar;
        this.b = zzbi.zzc(a.Z0(aVar));
        this.c = zzbi.zzc(a.Z0(aVar));
        this.a = billingClientStateListener;
        this.d = i;
    }

    public static /* synthetic */ Object a(d dVar) {
        Bundle bundle;
        com.google.android.gms.internal.play_billing.zzam Y0;
        a aVar = dVar.e;
        synchronized (a.h1(aVar)) {
            try {
                if (a.C(aVar) != 3) {
                    boolean z = a.C(aVar) == 1;
                    if (TextUtils.isEmpty((CharSequence) null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", (String) null);
                        com.google.android.gms.internal.play_billing.zzc.zzc(bundle, a.i1(aVar), a.j1(aVar), a.a1(aVar).longValue());
                    }
                    zzie zzieVar = zzie.zza;
                    synchronized (a.h1(aVar)) {
                        Y0 = a.Y0(aVar);
                    }
                    if (Y0 == null) {
                        a aVar2 = dVar.e;
                        a.g0(aVar2, 0);
                        int i = dVar.d;
                        zzie zzieVar2 = zzie.zzbc;
                        BillingResult billingResult = k.j;
                        a.e0(aVar2, zzieVar2, billingResult, i);
                        dVar.g(billingResult);
                    } else {
                        a aVar3 = dVar.e;
                        String packageName = a.N0(aVar3).getPackageName();
                        int i2 = 25;
                        int i3 = 3;
                        int i4 = 25;
                        while (true) {
                            if (i4 < 3) {
                                i4 = 0;
                                break;
                            }
                            if (bundle == null) {
                                try {
                                    i3 = Y0.zzw(i4, packageName, "subs");
                                } catch (Exception e) {
                                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                    zzie zzieVar3 = e instanceof DeadObjectException ? zzie.zzaM : e instanceof RemoteException ? zzie.zzaL : e instanceof SecurityException ? zzie.zzaN : zzie.zzP;
                                    String zza = zzieVar3.equals(zzie.zzP) ? zzcg.zza(e) : null;
                                    a.g0(dVar.e, 0);
                                    dVar.f(a.W0(e), zzieVar3, zza, z);
                                    dVar.g(a.W0(e));
                                }
                            } else {
                                i3 = Y0.zzc(i4, packageName, "subs", bundle);
                            }
                            if (i3 == 0) {
                                com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "highestLevelSupportedForSubs: " + i4);
                                break;
                            }
                            i4--;
                        }
                        a.x(aVar3, i4 >= 5);
                        a.y(aVar3, i4 >= 3);
                        if (i4 < 3) {
                            zzieVar = zzie.zzi;
                            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "In-app billing API does not support subscription on this device.");
                        }
                        while (true) {
                            if (i2 < 3) {
                                break;
                            }
                            i3 = bundle == null ? Y0.zzw(i2, packageName, "inapp") : Y0.zzc(i2, packageName, "inapp", bundle);
                            if (i3 == 0) {
                                a.v(aVar3, i2);
                                com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "mHighestLevelSupportedForInApp: " + a.D0(aVar3));
                                break;
                            }
                            i2--;
                        }
                        a.f0(aVar3, a.D0(aVar3));
                        if (a.D0(aVar3) < 3) {
                            zzieVar = zzie.zzJ;
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "In-app billing API version 3 is not supported on this device.");
                        }
                        a.h0(aVar3, i3);
                        if (i3 != 0) {
                            BillingResult billingResult2 = k.b;
                            dVar.f(billingResult2, zzieVar, null, z);
                            dVar.g(billingResult2);
                        } else {
                            try {
                                Long e2 = dVar.e(z);
                                if (z) {
                                    zzhz zzc = zzib.zzc();
                                    zzc.zzo(6);
                                    zzjt zzc2 = zzjv.zzc();
                                    int i5 = dVar.d;
                                    zzc2.zza(i5 > 0);
                                    zzc2.zzl(i5);
                                    if (e2 != null) {
                                        zzc2.zzm(e2.longValue());
                                    }
                                    a aVar4 = dVar.e;
                                    zzc.zzn(zzc2);
                                    a.d0(aVar4, zzc.zze());
                                } else {
                                    zzjm zzc3 = zzjo.zzc();
                                    zzic zzc4 = zzig.zzc();
                                    zzc4.zzo(0);
                                    zzc3.zza(zzc4);
                                    if (e2 != null) {
                                        zzc3.zzl(e2.longValue());
                                    }
                                    a.T0(dVar.e).g((zzjo) zzc3.zze());
                                }
                            } catch (Throwable th) {
                                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
                            }
                            dVar.g(k.i);
                        }
                    }
                }
            } finally {
            }
        }
        return null;
    }

    public static /* synthetic */ void b(d dVar) {
        a aVar = dVar.e;
        a.g0(aVar, 0);
        zzie zzieVar = zzie.zzx;
        BillingResult billingResult = k.k;
        a.e0(aVar, zzieVar, billingResult, dVar.d);
        dVar.g(billingResult);
    }

    public final void c() {
        zzbi zzbiVar = this.b;
        zzbiVar.zzd();
        zzbiVar.zze();
    }

    public final boolean d() {
        return this.d > 0;
    }

    public final Long e(boolean z) {
        if (z) {
            zzbi zzbiVar = this.b;
            if (!zzbiVar.zzg()) {
                return null;
            }
            zzbiVar.zzf();
            return Long.valueOf(zzbiVar.zza(TimeUnit.MILLISECONDS));
        }
        zzbi zzbiVar2 = this.c;
        if (!zzbiVar2.zzg()) {
            return null;
        }
        zzbiVar2.zzf();
        return Long.valueOf(zzbiVar2.zza(TimeUnit.MILLISECONDS));
    }

    public final void f(BillingResult billingResult, zzie zzieVar, String str, boolean z) {
        try {
            zzic zzc = zzig.zzc();
            zzc.zzo(billingResult.getResponseCode());
            zzc.zzl(billingResult.getDebugMessage());
            zzc.zzn(zzieVar);
            if (str != null) {
                zzc.zza(str);
            }
            Long e = e(z);
            if (!z) {
                zzjm zzc2 = zzjo.zzc();
                zzc2.zza(zzc);
                if (e != null) {
                    zzc2.zzl(e.longValue());
                }
                a.T0(this.e).g((zzjo) zzc2.zze());
                return;
            }
            zzjt zzc3 = zzjv.zzc();
            int i = this.d;
            zzc3.zza(i > 0);
            zzc3.zzl(i);
            if (e != null) {
                zzc3.zzm(e.longValue());
            }
            a aVar = this.e;
            zzhv zzc4 = zzhx.zzc();
            zzc4.zzl(zzc);
            zzc4.zzp(6);
            zzc4.zzo(zzc3);
            a.B(aVar, zzc4.zze());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    public final void g(BillingResult billingResult) {
        a aVar = this.e;
        synchronized (a.h1(aVar)) {
            try {
                if (a.C(aVar) == 3) {
                    return;
                }
                try {
                    this.a.onBillingSetupFinished(billingResult);
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void onBindingDied(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing service died.");
        try {
            a aVar = this.e;
            if (a.l0(aVar)) {
                m T0 = a.T0(aVar);
                zzhv zzc = zzhx.zzc();
                zzc.zzp(6);
                zzic zzc2 = zzig.zzc();
                zzc2.zzn(zzie.zzbf);
                zzc.zzl(zzc2);
                zzjt zzc3 = zzjv.zzc();
                int i = this.d;
                zzc3.zza(i > 0);
                zzc3.zzl(i);
                zzc.zzo(zzc3);
                T0.b((zzhx) zzc.zze());
            } else {
                a.T0(aVar).e(zzij.zzd());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
        a aVar2 = this.e;
        synchronized (a.h1(aVar2)) {
            if (a.C(aVar2) != 3 && a.C(aVar2) != 0) {
                a.g0(aVar2, 0);
                a.i0(aVar2);
                try {
                    this.a.onBillingServiceDisconnected();
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Billing service connected.");
        a aVar = this.e;
        synchronized (a.h1(aVar)) {
            try {
                if (a.C(aVar) == 3) {
                    return;
                }
                a.w(aVar, com.google.android.gms.internal.play_billing.zzal.zzs(iBinder));
                if (a.i(new zzbd(this), 30000L, new zzbe(this), a.Q0(aVar), aVar.h()) == null) {
                    int i = this.d;
                    BillingResult V0 = a.V0(aVar);
                    a.e0(aVar, zzie.zzy, V0, i);
                    g(V0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing service disconnected.");
        try {
            a aVar = this.e;
            if (a.l0(aVar)) {
                m T0 = a.T0(aVar);
                zzhv zzc = zzhx.zzc();
                zzc.zzp(6);
                zzic zzc2 = zzig.zzc();
                zzc2.zzn(zzie.zzbe);
                zzc.zzl(zzc2);
                zzjt zzc3 = zzjv.zzc();
                int i = this.d;
                zzc3.zza(i > 0);
                zzc3.zzl(i);
                zzc.zzo(zzc3);
                T0.b((zzhx) zzc.zze());
            } else {
                a.T0(aVar).j(zzjs.zzd());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
        zzbi zzbiVar = this.c;
        zzbiVar.zzd();
        zzbiVar.zze();
        a aVar2 = this.e;
        synchronized (a.h1(aVar2)) {
            try {
                if (a.C(aVar2) == 3) {
                    return;
                }
                a.g0(aVar2, 0);
                try {
                    this.a.onBillingServiceDisconnected();
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
