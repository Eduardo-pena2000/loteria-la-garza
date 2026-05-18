package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.google.android.gms.internal.play_billing.zzaz;
import com.google.android.gms.internal.play_billing.zzbi;
import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzig;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zziw;
import com.google.android.gms.internal.play_billing.zziz;
import com.google.android.gms.internal.play_billing.zzjt;
import com.google.android.gms.internal.play_billing.zzjv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import o5.m;
import o5.n;
import o5.s;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a extends BillingClient {
    public boolean A;
    public boolean B;
    public boolean C;
    public PendingPurchasesParams D;
    public boolean E;
    public boolean F;
    public volatile BillingClientStateListener G;
    public ExecutorService H;
    public final Long I;
    public zzbl J;
    public final Object a;
    public volatile int b;
    public final String c;
    public final String d;
    public final Handler e;
    public volatile s f;
    public Context g;
    public m h;
    public volatile com.google.android.gms.internal.play_billing.zzam i;
    public volatile d j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public a(Context context, PendingPurchasesParams pendingPurchasesParams, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2, UserChoiceBillingListener userChoiceBillingListener, m mVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.a = new Object();
        this.b = 0;
        this.e = new Handler(Looper.getMainLooper());
        this.m = 0;
        this.I = Long.valueOf(new Random().nextLong());
        this.J = zzaz.zza();
        this.c = str;
        this.d = z0();
        a(context, purchasesUpdatedListener, pendingPurchasesParams, userChoiceBillingListener, str, null, builder);
    }

    public static /* bridge */ /* synthetic */ void A(a aVar, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, BillingResult billingResult, zzie zzieVar, Exception exc) {
        aVar.P(alternativeBillingOnlyInformationDialogListener, billingResult, zzieVar, null);
    }

    public static /* bridge */ /* synthetic */ void B(a aVar, zzhx zzhxVar) {
        aVar.R(zzhxVar);
    }

    public static /* bridge */ /* synthetic */ int C(a aVar) {
        return aVar.b;
    }

    public static /* bridge */ /* synthetic */ int D0(a aVar) {
        return aVar.m;
    }

    public static /* bridge */ /* synthetic */ Context N0(a aVar) {
        return aVar.g;
    }

    public static /* synthetic */ Bundle O0(a aVar, String str, String str2) {
        return aVar.p0(str, str2);
    }

    public static /* synthetic */ Bundle P0(a aVar, int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) {
        return aVar.o0(i, str, str2, billingFlowParams, bundle);
    }

    public static /* bridge */ /* synthetic */ Handler Q0(a aVar) {
        return aVar.q0();
    }

    public static /* bridge */ /* synthetic */ BillingClientStateListener S0(a aVar) {
        return aVar.G;
    }

    public static /* bridge */ /* synthetic */ m T0(a aVar) {
        return aVar.h;
    }

    public static /* bridge */ /* synthetic */ BillingResult V0(a aVar) {
        return aVar.t0();
    }

    public static /* bridge */ /* synthetic */ BillingResult W0(Exception exc) {
        return exc instanceof DeadObjectException ? k.j : k.h;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.internal.play_billing.zzam Y0(a aVar) {
        return aVar.i;
    }

    public static /* bridge */ /* synthetic */ zzbl Z0(a aVar) {
        return aVar.J;
    }

    public static /* bridge */ /* synthetic */ Long a1(a aVar) {
        return aVar.I;
    }

    public static /* synthetic */ Object b1(a aVar, int i, com.google.android.gms.internal.play_billing.zzp zzpVar) {
        aVar.X(new o5.e(aVar, zzpVar), i);
        return "reconnectIfNeeded";
    }

    public static /* synthetic */ Void c(a aVar, ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        aVar.D(externalOfferAvailabilityListener);
        return null;
    }

    public static final String c0(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
    }

    public static /* synthetic */ Object c1(a aVar, ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        if (aVar.a0(30000L)) {
            aVar.G(consumeParams, consumeResponseListener);
            return null;
        }
        zzie zzieVar = zzie.zzb;
        BillingResult billingResult = k.j;
        aVar.H0(zzieVar, 4, billingResult);
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
        return null;
    }

    public static /* synthetic */ Void d(a aVar, ExternalOfferInformationDialogListener externalOfferInformationDialogListener, Activity activity, ResultReceiver resultReceiver) {
        aVar.F(externalOfferInformationDialogListener, activity, resultReceiver);
        return null;
    }

    public static /* bridge */ /* synthetic */ void d0(a aVar, zzib zzibVar) {
        aVar.T(zzibVar);
    }

    public static /* synthetic */ Object d1(a aVar, ProductDetailsResponseListener productDetailsResponseListener, QueryProductDetailsParams queryProductDetailsParams) {
        if (!aVar.a0(30000L)) {
            zzie zzieVar = zzie.zzb;
            BillingResult billingResult = k.j;
            aVar.H0(zzieVar, 7, billingResult);
            productDetailsResponseListener.onProductDetailsResponse(billingResult, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbt.zzk(), com.google.android.gms.internal.play_billing.zzbt.zzk()));
            return null;
        }
        if (aVar.u) {
            o5.j R0 = aVar.R0(queryProductDetailsParams);
            productDetailsResponseListener.onProductDetailsResponse(k.a(R0.a(), R0.b()), new QueryProductDetailsResult(R0.c(), R0.d()));
            return null;
        }
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Querying product details is not supported.");
        zzie zzieVar2 = zzie.zzt;
        BillingResult billingResult2 = k.r;
        aVar.H0(zzieVar2, 7, billingResult2);
        productDetailsResponseListener.onProductDetailsResponse(billingResult2, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbt.zzk(), com.google.android.gms.internal.play_billing.zzbt.zzk()));
        return null;
    }

    public static /* synthetic */ Void e(a aVar, ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, String str) {
        aVar.B0(externalOfferReportingDetailsListener, null);
        return null;
    }

    public static /* bridge */ /* synthetic */ void e0(a aVar, zzie zzieVar, BillingResult billingResult, int i) {
        aVar.U(zzieVar, billingResult, i);
    }

    public static /* synthetic */ Object e1(a aVar, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, AcknowledgePurchaseParams acknowledgePurchaseParams) {
        aVar.v0(acknowledgePurchaseResponseListener, acknowledgePurchaseParams);
        return null;
    }

    public static /* synthetic */ Void f(a aVar, AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        aVar.A0(alternativeBillingOnlyReportingDetailsListener);
        return null;
    }

    public static /* bridge */ /* synthetic */ void f0(a aVar, int i) {
        aVar.m = i;
        aVar.C = i >= 26;
        aVar.B = i >= 24;
        aVar.A = i >= 23;
        aVar.z = i >= 22;
        aVar.y = i >= 21;
        aVar.x = i >= 20;
        aVar.w = i >= 19;
        aVar.v = i >= 18;
        aVar.u = i >= 17;
        aVar.t = i >= 16;
        aVar.s = i >= 15;
        aVar.r = i >= 14;
        aVar.q = i >= 12;
        aVar.p = i >= 9;
        aVar.o = i >= 8;
        aVar.n = i >= 6;
    }

    public static /* synthetic */ Object f1(a aVar, Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        aVar.x0(bundle, activity, resultReceiver);
        return null;
    }

    public static /* synthetic */ Void g(a aVar, AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        aVar.C0(alternativeBillingOnlyAvailabilityListener);
        return null;
    }

    public static /* bridge */ /* synthetic */ void g0(a aVar, int i) {
        aVar.V(0);
    }

    public static /* synthetic */ Object g1(a aVar, BillingConfigResponseListener billingConfigResponseListener) {
        aVar.w0(billingConfigResponseListener);
        return null;
    }

    public static /* bridge */ /* synthetic */ void h0(a aVar, int i) {
        if (i != 0) {
            aVar.V(0);
            return;
        }
        synchronized (aVar.a) {
            try {
                if (aVar.b == 3) {
                    return;
                }
                aVar.V(2);
                s sVar = aVar.f != null ? aVar.f : null;
                if (sVar != null) {
                    sVar.g(aVar.y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ Object h1(a aVar) {
        return aVar.a;
    }

    public static Future i(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new zzaj(submit, runnable), (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void i0(a aVar) {
        aVar.Y();
    }

    public static /* bridge */ /* synthetic */ String i1(a aVar) {
        return aVar.c;
    }

    public static /* synthetic */ void j(a aVar, ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        zzie zzieVar = zzie.zzx;
        BillingResult billingResult = k.k;
        aVar.H0(zzieVar, 4, billingResult);
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
    }

    public static /* bridge */ /* synthetic */ String j1(a aVar) {
        return aVar.d;
    }

    public static /* synthetic */ void k(a aVar, PurchasesResponseListener purchasesResponseListener) {
        zzie zzieVar = zzie.zzx;
        BillingResult billingResult = k.k;
        aVar.H0(zzieVar, 9, billingResult);
        purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzbt.zzk());
    }

    public static /* bridge */ /* synthetic */ boolean k0(a aVar, long j) {
        return aVar.a0(30000L);
    }

    public static /* synthetic */ Void k1(a aVar, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, Activity activity, ResultReceiver resultReceiver) {
        aVar.E(alternativeBillingOnlyInformationDialogListener, activity, resultReceiver);
        return null;
    }

    public static /* synthetic */ void l(a aVar, BillingConfigResponseListener billingConfigResponseListener) {
        zzie zzieVar = zzie.zzx;
        BillingResult billingResult = k.k;
        aVar.H0(zzieVar, 13, billingResult);
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    public static /* bridge */ /* synthetic */ boolean l0(a aVar) {
        boolean z;
        synchronized (aVar.a) {
            z = true;
            if (aVar.b != 1) {
                z = false;
            }
        }
        return z;
    }

    public static /* synthetic */ void m(a aVar, AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        aVar.I(alternativeBillingOnlyAvailabilityListener, k.k, zzie.zzx, null);
    }

    public static /* bridge */ /* synthetic */ zzcw m0(a aVar, String str, boolean z, int i) {
        return aVar.F0(str, false, 9);
    }

    public static /* synthetic */ void n(a aVar, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        zzie zzieVar = zzie.zzx;
        BillingResult billingResult = k.k;
        aVar.H0(zzieVar, 3, billingResult);
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    public static /* bridge */ /* synthetic */ void n0(a aVar, zzie zzieVar, int i, BillingResult billingResult) {
        aVar.H0(zzieVar, 9, billingResult);
    }

    public static /* synthetic */ void o(a aVar, ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        aVar.M(externalOfferAvailabilityListener, k.k, zzie.zzx, null);
    }

    public static /* synthetic */ void p(a aVar, ProductDetailsResponseListener productDetailsResponseListener) {
        zzie zzieVar = zzie.zzx;
        BillingResult billingResult = k.k;
        aVar.H0(zzieVar, 7, billingResult);
        productDetailsResponseListener.onProductDetailsResponse(billingResult, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbt.zzk(), com.google.android.gms.internal.play_billing.zzbt.zzk()));
    }

    public static /* synthetic */ void q(a aVar, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        aVar.P(alternativeBillingOnlyInformationDialogListener, k.k, zzie.zzx, null);
    }

    public static /* synthetic */ void r(a aVar, BillingResult billingResult) {
        if (aVar.f.d() != null) {
            aVar.f.d().onPurchasesUpdated(billingResult, null);
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    public static /* synthetic */ void s(a aVar, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        aVar.N(externalOfferInformationDialogListener, k.k, zzie.zzx, null);
    }

    public static /* synthetic */ void t(a aVar, ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        aVar.L(externalOfferReportingDetailsListener, k.k, zzie.zzx, null);
    }

    public static /* synthetic */ void u(a aVar, AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        aVar.K(alternativeBillingOnlyReportingDetailsListener, k.k, zzie.zzx, null);
    }

    public static /* bridge */ /* synthetic */ void v(a aVar, int i) {
        aVar.m = i;
    }

    public static /* bridge */ /* synthetic */ void w(a aVar, com.google.android.gms.internal.play_billing.zzam zzamVar) {
        aVar.i = zzamVar;
    }

    public static /* bridge */ /* synthetic */ void x(a aVar, boolean z) {
        aVar.l = z;
    }

    public static /* bridge */ /* synthetic */ void y(a aVar, boolean z) {
        aVar.k = z;
    }

    public static /* bridge */ /* synthetic */ void z(a aVar, ExternalOfferInformationDialogListener externalOfferInformationDialogListener, BillingResult billingResult, zzie zzieVar, Exception exc) {
        aVar.N(externalOfferInformationDialogListener, billingResult, zzieVar, null);
    }

    public static String z0() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get((Object) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final /* synthetic */ Void A0(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            if (!a0(30000L)) {
                K(alternativeBillingOnlyReportingDetailsListener, k.j, zzie.zzb, null);
            } else if (this.y) {
                synchronized (this.a) {
                    zzamVar = this.i;
                }
                if (zzamVar == null) {
                    K(alternativeBillingOnlyReportingDetailsListener, k.j, zzie.zzbc, null);
                } else {
                    zzamVar.zzk(21, this.g.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzg(this.c, this.d, this.I.longValue()), new o5.f(alternativeBillingOnlyReportingDetailsListener, this.h, this.m, null));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn't support alternative billing only.");
                K(alternativeBillingOnlyReportingDetailsListener, k.D, zzie.zzan, null);
            }
        } catch (DeadObjectException e) {
            K(alternativeBillingOnlyReportingDetailsListener, k.j, zzie.zzar, e);
        } catch (Exception e2) {
            K(alternativeBillingOnlyReportingDetailsListener, k.h, zzie.zzar, e2);
        }
        return null;
    }

    public final /* synthetic */ Void B0(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, String str) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            if (!a0(30000L)) {
                L(externalOfferReportingDetailsListener, k.j, zzie.zzb, null);
            } else if (this.z) {
                synchronized (this.a) {
                    zzamVar = this.i;
                }
                if (zzamVar == null) {
                    L(externalOfferReportingDetailsListener, k.j, zzie.zzbc, null);
                } else {
                    String packageName = this.g.getPackageName();
                    long j = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).firstInstallTime;
                    String str2 = this.c;
                    String str3 = this.d;
                    long longValue = this.I.longValue();
                    int i = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str2, str3, longValue);
                    bundle.putLong("appInstallTimeMillis", j);
                    zzamVar.zzl(22, packageName, bundle, new o5.g(externalOfferReportingDetailsListener, this.h, this.m, null));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn't support external offer.");
                L(externalOfferReportingDetailsListener, k.t, zzie.zzaE, null);
            }
        } catch (DeadObjectException e) {
            L(externalOfferReportingDetailsListener, k.j, zzie.zzaF, e);
        } catch (Exception e2) {
            L(externalOfferReportingDetailsListener, k.h, zzie.zzaF, e2);
        }
        return null;
    }

    public final /* synthetic */ Void C0(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            if (!a0(30000L)) {
                I(alternativeBillingOnlyAvailabilityListener, k.j, zzie.zzb, null);
            } else if (this.y) {
                synchronized (this.a) {
                    zzamVar = this.i;
                }
                if (zzamVar == null) {
                    I(alternativeBillingOnlyAvailabilityListener, k.j, zzie.zzbc, null);
                } else {
                    zzamVar.zzp(21, this.g.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzg(this.c, this.d, this.I.longValue()), new o5.h(alternativeBillingOnlyAvailabilityListener, this.h, this.m, null));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn't support alternative billing only.");
                I(alternativeBillingOnlyAvailabilityListener, k.D, zzie.zzan, null);
            }
        } catch (DeadObjectException e) {
            I(alternativeBillingOnlyAvailabilityListener, k.j, zzie.zzaq, e);
        } catch (Exception e2) {
            I(alternativeBillingOnlyAvailabilityListener, k.h, zzie.zzaq, e2);
        }
        return null;
    }

    public final /* synthetic */ Void D(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            if (!a0(30000L)) {
                M(externalOfferAvailabilityListener, k.j, zzie.zzb, null);
            } else if (this.B) {
                synchronized (this.a) {
                    zzamVar = this.i;
                }
                if (zzamVar == null) {
                    M(externalOfferAvailabilityListener, k.j, zzie.zzbc, null);
                } else {
                    zzamVar.zzq(24, this.g.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzg(this.c, this.d, this.I.longValue()), new o5.i(externalOfferAvailabilityListener, this.h, this.m, null));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn't support launching external offer flow.");
                M(externalOfferAvailabilityListener, k.A, zzie.zzbq, null);
            }
        } catch (DeadObjectException e) {
            M(externalOfferAvailabilityListener, k.j, zzie.zzaC, e);
        } catch (Exception e2) {
            M(externalOfferAvailabilityListener, k.h, zzie.zzaC, e2);
        }
        return null;
    }

    public final /* synthetic */ Void E(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, Activity activity, ResultReceiver resultReceiver) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            synchronized (this.a) {
                zzamVar = this.i;
            }
            if (zzamVar == null) {
                P(alternativeBillingOnlyInformationDialogListener, k.j, zzie.zzbc, null);
            } else {
                zzamVar.zzm(21, this.g.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzg(this.c, this.d, this.I.longValue()), new e(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e) {
            P(alternativeBillingOnlyInformationDialogListener, k.j, zzie.zzav, e);
        } catch (Exception e2) {
            P(alternativeBillingOnlyInformationDialogListener, k.h, zzie.zzav, e2);
        }
        return null;
    }

    public final zzcw E0(int i, BillingResult billingResult, zzie zzieVar, String str, Exception exc) {
        J0(zzieVar, 9, billingResult, zzcg.zza(exc));
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", str, exc);
        return new zzcw(billingResult, null);
    }

    public final /* synthetic */ Void F(ExternalOfferInformationDialogListener externalOfferInformationDialogListener, Activity activity, ResultReceiver resultReceiver) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            synchronized (this.a) {
                zzamVar = this.i;
            }
            if (zzamVar == null) {
                N(externalOfferInformationDialogListener, k.j, zzie.zzbc, null);
            } else {
                zzamVar.zzo(22, this.g.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzg(this.c, this.d, this.I.longValue()), new g(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e) {
            N(externalOfferInformationDialogListener, k.j, zzie.zzaJ, e);
        } catch (Exception e2) {
            N(externalOfferInformationDialogListener, k.h, zzie.zzaJ, e2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.zzcw F0(java.lang.String r17, boolean r18, int r19) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.a.F0(java.lang.String, boolean, int):com.android.billingclient.api.zzcw");
    }

    public final void G(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        int zza;
        String str;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Consuming purchase with token: " + purchaseToken);
            synchronized (this.a) {
                zzamVar = this.i;
            }
            if (zzamVar == null) {
                J(consumeResponseListener, purchaseToken, k.j, zzie.zzbc, "Service has been reset to null.", null);
                return;
            }
            if (this.p) {
                String packageName = this.g.getPackageName();
                boolean z = this.p;
                String str2 = this.c;
                String str3 = this.d;
                long longValue = this.I.longValue();
                Bundle bundle = new Bundle();
                if (z) {
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str2, str3, longValue);
                }
                Bundle zze = zzamVar.zze(9, packageName, purchaseToken, bundle);
                zza = zze.getInt("RESPONSE_CODE");
                str = com.google.android.gms.internal.play_billing.zzc.zzj(zze, "BillingClient");
            } else {
                zza = zzamVar.zza(3, this.g.getPackageName(), purchaseToken);
                str = "";
            }
            BillingResult a = k.a(zza, str);
            if (zza == 0) {
                com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(a, purchaseToken);
                return;
            }
            J(consumeResponseListener, purchaseToken, a, zzie.zzw, "Error consuming purchase with token. Response code: " + zza, null);
        } catch (Exception e) {
            J(consumeResponseListener, purchaseToken, k.h, zzie.zzC, "Error consuming purchase!", e);
        } catch (DeadObjectException e2) {
            J(consumeResponseListener, purchaseToken, k.j, zzie.zzC, "Error consuming purchase!", e2);
        }
    }

    public final void G0(BillingResult billingResult, zzie zzieVar, int i) {
        zzhx zzhxVar = null;
        if (billingResult.getResponseCode() == 0) {
            int i2 = zzcg.zza;
            try {
                zzhz zzc = zzib.zzc();
                zzc.zzo(5);
                zziw zzc2 = zziz.zzc();
                zzc2.zza(i);
                zzc.zzl(zzc2.zze());
                zzhxVar = (zzib) zzc.zze();
            } catch (Exception e) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to create logging payload", e);
            }
            T(zzhxVar);
            return;
        }
        int i3 = zzcg.zza;
        try {
            zzhv zzc3 = zzhx.zzc();
            zzic zzc4 = zzig.zzc();
            zzc4.zzo(billingResult.getResponseCode());
            zzc4.zzl(billingResult.getDebugMessage());
            zzc4.zzn(zzieVar);
            zzc3.zzl(zzc4);
            zzc3.zzp(5);
            zziw zzc5 = zziz.zzc();
            zzc5.zza(i);
            zzc3.zzm(zzc5.zze());
            zzhxVar = (zzhx) zzc3.zze();
        } catch (Exception e2) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to create logging payload", e2);
        }
        R(zzhxVar);
    }

    public final void H(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, BillingResult billingResult, zzie zzieVar, Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error in acknowledge purchase!", exc);
        J0(zzieVar, 3, billingResult, zzcg.zza(exc));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    public final void H0(zzie zzieVar, int i, BillingResult billingResult) {
        try {
            int i2 = zzcg.zza;
            R(zzcg.zzb(zzieVar, i, billingResult, null, zzil.zza));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    public final void I(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, BillingResult billingResult, zzie zzieVar, Exception exc) {
        J0(zzieVar, 14, billingResult, zzcg.zza(exc));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
    }

    public final void I0(zzie zzieVar, int i, BillingResult billingResult, long j) {
        try {
            int i2 = zzcg.zza;
            try {
                this.h.d(zzcg.zzb(zzieVar, 2, billingResult, null, zzil.zza), this.m, j);
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    public final void J(ConsumeResponseListener consumeResponseListener, String str, BillingResult billingResult, zzie zzieVar, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", str2, exc);
        J0(zzieVar, 4, billingResult, zzcg.zza(exc));
        consumeResponseListener.onConsumeResponse(billingResult, str);
    }

    public final void J0(zzie zzieVar, int i, BillingResult billingResult, String str) {
        try {
            int i2 = zzcg.zza;
            R(zzcg.zzb(zzieVar, i, billingResult, str, zzil.zza));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    public final void K(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, BillingResult billingResult, zzie zzieVar, Exception exc) {
        J0(zzieVar, 15, billingResult, zzcg.zza(exc));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
    }

    public final void K0(zzie zzieVar, int i, BillingResult billingResult, long j, boolean z) {
        try {
            int i2 = zzcg.zza;
            S(zzcg.zzb(zzieVar, 2, billingResult, null, zzil.zza), j, z);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    public final void L(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, BillingResult billingResult, zzie zzieVar, Exception exc) {
        J0(zzieVar, 24, billingResult, zzcg.zza(exc));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
    }

    public final void L0(zzie zzieVar, int i, BillingResult billingResult, String str, long j, boolean z) {
        try {
            int i2 = zzcg.zza;
            S(zzcg.zzb(zzieVar, 2, billingResult, str, zzil.zza), j, z);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    public final void M(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, BillingResult billingResult, zzie zzieVar, Exception exc) {
        J0(zzieVar, 23, billingResult, zzcg.zza(exc));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
    }

    public final void M0(int i) {
        try {
            int i2 = zzcg.zza;
            T(zzcg.zzc(i, zzil.zza));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    public final void N(ExternalOfferInformationDialogListener externalOfferInformationDialogListener, BillingResult billingResult, zzie zzieVar, Exception exc) {
        J0(zzieVar, 25, billingResult, zzcg.zza(exc));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
    }

    public final void O(BillingConfigResponseListener billingConfigResponseListener, BillingResult billingResult, zzie zzieVar, Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "getBillingConfig got an exception.", exc);
        J0(zzieVar, 13, billingResult, zzcg.zza(exc));
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    public final void P(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, BillingResult billingResult, zzie zzieVar, Exception exc) {
        J0(zzieVar, 16, billingResult, zzcg.zza(exc));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
    }

    public final void Q(int i, zzie zzieVar, Exception exc) {
        zzhx zzhxVar;
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "showInAppMessages error.", exc);
        m mVar = this.h;
        String zza = zzcg.zza(exc);
        try {
            zzic zzc = zzig.zzc();
            zzc.zzo(i);
            if (zzieVar != null) {
                zzc.zzn(zzieVar);
            }
            if (zza != null) {
                zzc.zza(zza);
            }
            zzhv zzc2 = zzhx.zzc();
            zzc2.zzl(zzc);
            zzc2.zzp(30);
            zzhxVar = (zzhx) zzc2.zze();
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to create logging payload", th);
            zzhxVar = null;
        }
        mVar.b(zzhxVar);
    }

    public final void R(zzhx zzhxVar) {
        try {
            this.h.k(zzhxVar, this.m);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    public final o5.j R0(QueryProductDetailsParams queryProductDetailsParams) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String zzb = queryProductDetailsParams.zzb();
        com.google.android.gms.internal.play_billing.zzbt zza = queryProductDetailsParams.zza();
        int size = zza.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 20;
            ArrayList<QueryProductDetailsParams.Product> arrayList3 = new ArrayList(zza.subList(i, i2 > size ? size : i2));
            ArrayList arrayList4 = new ArrayList();
            int size2 = arrayList3.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList4.add(((QueryProductDetailsParams.Product) arrayList3.get(i3)).zza());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            String str = this.c;
            bundle.putString("playBillingLibraryVersion", str);
            try {
                synchronized (this.a) {
                    zzamVar = this.i;
                }
                if (zzamVar == null) {
                    return r0(k.j, zzie.zzbc, "Service has been reset to null.", null);
                }
                boolean z = this.w && this.D.b();
                y0(queryProductDetailsParams);
                y0(queryProductDetailsParams);
                y0(queryProductDetailsParams);
                y0(queryProductDetailsParams);
                Bundle zzj = zzamVar.zzj(true != this.x ? 17 : 20, this.g.getPackageName(), zzb, bundle, com.google.android.gms.internal.play_billing.zzc.zzf(str, this.d, arrayList3, (String) null, (String) null, com.google.android.gms.internal.play_billing.zza.zza(z, true, false, true, false, true), this.I.longValue()));
                if (zzj == null) {
                    return r0(k.B, zzie.zzR, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!zzj.containsKey("DETAILS_LIST")) {
                    int zzb2 = com.google.android.gms.internal.play_billing.zzc.zzb(zzj, "BillingClient");
                    String zzj2 = com.google.android.gms.internal.play_billing.zzc.zzj(zzj, "BillingClient");
                    if (zzb2 == 0) {
                        return r0(k.a(6, zzj2), zzie.zzS, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return r0(k.a(zzb2, zzj2), zzie.zzw, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + zzb2, null);
                }
                ArrayList stringArrayList = zzj.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return r0(k.B, zzie.zzT, "queryProductDetailsAsync got null response list", null);
                }
                ArrayList arrayList5 = new ArrayList();
                int size3 = stringArrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    try {
                        ProductDetails productDetails = new ProductDetails((String) stringArrayList.get(i4));
                        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Got product details: ".concat(productDetails.toString()));
                        arrayList5.add(productDetails);
                    } catch (JSONException e) {
                        return r0(k.a(6, "Error trying to decode SkuDetails."), zzie.zzU, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                    }
                }
                ArrayList stringArrayList2 = zzj.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                new ArrayList();
                try {
                    ArrayList arrayList6 = new ArrayList();
                    if (stringArrayList2 == null) {
                        for (QueryProductDetailsParams.Product product : arrayList3) {
                            Iterator it = arrayList5.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    arrayList6.add(new UnfetchedProduct(new JSONObject().put("productId", product.zza()).put("type", product.zzb()).put("statusCode", 0).toString()));
                                    break;
                                }
                                ProductDetails productDetails2 = (ProductDetails) it.next();
                                if (!product.zza().equals(productDetails2.getProductId()) || !product.zzb().equals(productDetails2.getProductType())) {
                                }
                            }
                        }
                    } else {
                        Iterator it2 = stringArrayList2.iterator();
                        while (it2.hasNext()) {
                            UnfetchedProduct unfetchedProduct = new UnfetchedProduct((String) it2.next());
                            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Got unfetchedProduct: ".concat(unfetchedProduct.toString()));
                            arrayList6.add(unfetchedProduct);
                        }
                    }
                    arrayList.addAll(arrayList5);
                    arrayList2.addAll(arrayList6);
                    i = i2;
                } catch (JSONException e2) {
                    return r0(k.a(6, "Error trying to decode SkuDetails."), zzie.zzU, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e2);
                }
            } catch (Exception e3) {
                return r0(k.h, zzie.zzQ, "queryProductDetailsAsync got a remote exception (try to reconnect).", e3);
            } catch (DeadObjectException e4) {
                return r0(k.j, zzie.zzQ, "queryProductDetailsAsync got a remote exception (try to reconnect).", e4);
            }
        }
        return new o5.j(0, "", arrayList, arrayList2);
    }

    public final void S(zzhx zzhxVar, long j, boolean z) {
        try {
            this.h.a(zzhxVar, this.m, j, z);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    public final void T(zzib zzibVar) {
        try {
            this.h.f(zzibVar, this.m);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    public final void U(zzie zzieVar, BillingResult billingResult, int i) {
        try {
            int i2 = zzcg.zza;
            zzhv zzm = zzcg.zzb(zzieVar, 6, billingResult, null, zzil.zza).zzm();
            zzjt zzc = zzjv.zzc();
            zzc.zza(i > 0);
            zzc.zzl(i);
            zzm.zzo(zzc);
            R((zzhx) zzm.zze());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    public final m U0() {
        return this.h;
    }

    public final void V(int i) {
        synchronized (this.a) {
            try {
                if (this.b == 3) {
                    return;
                }
                com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Setting clientState from " + c0(this.b) + " to " + c0(i));
                this.b = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void W() {
        ExecutorService executorService = this.H;
        if (executorService != null) {
            executorService.shutdownNow();
            this.H = null;
        }
    }

    public final void X(BillingClientStateListener billingClientStateListener, int i) {
        zzie zzieVar;
        BillingResult billingResult;
        BillingResult billingResult2;
        synchronized (this.a) {
            try {
                if (b0()) {
                    billingResult = s0(i);
                } else {
                    if (this.b == 1) {
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Client is already in the process of connecting to billing service.");
                        zzie zzieVar2 = zzie.zzK;
                        billingResult2 = k.d;
                        U(zzieVar2, billingResult2, i);
                    } else if (this.b == 3) {
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        zzie zzieVar3 = zzie.zzL;
                        billingResult2 = k.j;
                        U(zzieVar3, billingResult2, i);
                    } else {
                        V(1);
                        if (i == 0) {
                            this.G = billingClientStateListener;
                            i = 0;
                        }
                        Y();
                        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Starting in-app billing setup.");
                        this.j = new d(this, billingClientStateListener, i, null);
                        this.j.c();
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List queryIntentServices = this.g.getPackageManager().queryIntentServices(intent, 0);
                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                            zzieVar = zzie.zzO;
                        } else {
                            ServiceInfo serviceInfo = ((ResolveInfo) queryIntentServices.get(0)).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    zzieVar = zzie.zzN;
                                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.c);
                                    synchronized (this.a) {
                                        try {
                                            if (this.b == 2) {
                                                billingResult = s0(i);
                                            } else if (this.b != 1) {
                                                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                zzie zzieVar4 = zzie.zzba;
                                                billingResult2 = k.j;
                                                U(zzieVar4, billingResult2, i);
                                            } else {
                                                d dVar = this.j;
                                                if ((i <= 0 || Build.VERSION.SDK_INT < 29) ? this.g.bindService(intent2, dVar, 1) : o5.a.a(this.g, intent2, 1, h(), dVar)) {
                                                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Service was bonded successfully.");
                                                    billingResult = null;
                                                } else {
                                                    zzieVar = zzie.zzM;
                                                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Connection to Billing service is blocked.");
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                zzieVar = zzie.zzN;
                                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        V(0);
                        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Billing service unavailable on device.");
                        BillingResult billingResult3 = k.b;
                        U(zzieVar, billingResult3, i);
                        billingResult = billingResult3;
                    }
                    billingResult = billingResult2;
                }
            } finally {
            }
        }
        if (billingResult != null) {
            billingClientStateListener.onBillingSetupFinished(billingResult);
        }
    }

    public final BillingResult X0(BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.e.post(new zzac(this, billingResult));
        return billingResult;
    }

    public final void Y() {
        synchronized (this.a) {
            if (this.j != null) {
                try {
                    this.g.unbindService(this.j);
                } catch (Throwable th) {
                    try {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "There was an exception while unbinding service!", th);
                        this.i = null;
                        this.j = null;
                    } finally {
                        this.i = null;
                        this.j = null;
                    }
                }
            }
        }
    }

    public final boolean Z(long j) {
        try {
            BillingResult billingResult = (BillingResult) u0(1).get(Build.VERSION.SDK_INT < 29 ? 0L : 3000L, TimeUnit.MILLISECONDS);
            if (billingResult.getResponseCode() == 0) {
                com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Reconnection succeeded with result: " + billingResult.getResponseCode());
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Reconnection failed with result: " + billingResult.getResponseCode());
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error during reconnection attempt: ", e);
        }
        return b0();
    }

    public final void a(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, UserChoiceBillingListener userChoiceBillingListener, String str, m mVar, BillingClient.Builder builder) {
        this.g = context.getApplicationContext();
        zziq zzc = zzis.zzc();
        zzc.zzs(str);
        String str2 = this.d;
        if (str2 != null) {
            zzc.zzt(str2);
        }
        zzc.zzq(this.g.getPackageName());
        zzc.zzn(this.I.longValue());
        zzc.zzr(builder.g);
        zzc.zza(Build.VERSION.SDK_INT);
        zzc.zzp(772604006L);
        try {
            zzc.zzl(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error getting app version code.", th);
        }
        if (mVar != null) {
            this.h = mVar;
        } else {
            this.h = new n(this.g, zzc.zze());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new s(this.g, purchasesUpdatedListener, null, null, userChoiceBillingListener, this.h);
        this.D = pendingPurchasesParams;
        this.F = userChoiceBillingListener != null;
        this.E = builder.g;
    }

    public final boolean a0(long j) {
        long max;
        zzbi zzb = zzbi.zzb(this.J);
        long j2 = 30000;
        for (int i = 1; i <= 3; i++) {
            try {
                max = Math.max(0L, j2);
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error during reconnection attempt: ", e);
            }
            if (max <= 0) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "No time remaining for reconnection attempt.");
                return b0();
            }
            BillingResult billingResult = (BillingResult) u0(i).get(max, TimeUnit.MILLISECONDS);
            if (billingResult.getResponseCode() == 0) {
                com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Reconnection succeeded with result: " + billingResult.getResponseCode());
                return b0();
            }
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Reconnection failed with result: " + billingResult.getResponseCode());
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            j2 = 30000 - zzb.zza(timeUnit);
            long pow = ((long) Math.pow(2.0d, i - 1)) * 1000;
            if (j2 < pow) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Reconnection failed due to timeout limit reached.");
                return b0();
            }
            if (i < 3 && pow > 0) {
                try {
                    Thread.sleep(pow);
                    j2 = 30000 - zzb.zza(timeUnit);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error sleeping during reconnection attempt: ", e2);
                }
            }
        }
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Max retries reached.");
        return b0();
    }

    public void acknowledgePurchase(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (i(new zzaa(this, acknowledgePurchaseResponseListener, acknowledgePurchaseParams), 30000L, new zzab(this, acknowledgePurchaseResponseListener), q0(), h()) == null) {
            BillingResult t0 = t0();
            H0(zzie.zzy, 3, t0);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(t0);
        }
    }

    public final void b(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, zzb zzbVar, String str, m mVar, BillingClient.Builder builder) {
        this.g = context.getApplicationContext();
        zziq zzc = zzis.zzc();
        zzc.zzs(str);
        String str2 = this.d;
        if (str2 != null) {
            zzc.zzt(str2);
        }
        zzc.zzq(this.g.getPackageName());
        zzc.zzn(this.I.longValue());
        zzc.zzr(builder.g);
        zzc.zza(Build.VERSION.SDK_INT);
        zzc.zzp(772604006L);
        try {
            zzc.zzl(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error getting app version code.", th);
        }
        if (mVar != null) {
            this.h = mVar;
        } else {
            this.h = new n(this.g, zzc.zze());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new s(this.g, purchasesUpdatedListener, null, zzbVar, null, this.h);
        this.D = pendingPurchasesParams;
        this.F = zzbVar != null;
        this.g.getPackageName();
        this.E = builder.g;
    }

    public final boolean b0() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.b == 2 && this.i != null && this.j != null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public void consumeAsync(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        if (i(new zzak(this, consumeResponseListener, consumeParams), 30000L, new zzam(this, consumeResponseListener, consumeParams), q0(), h()) == null) {
            BillingResult t0 = t0();
            H0(zzie.zzy, 4, t0);
            consumeResponseListener.onConsumeResponse(t0, consumeParams.getPurchaseToken());
        }
    }

    public void createAlternativeBillingOnlyReportingDetailsAsync(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (i(new zzaf(this, alternativeBillingOnlyReportingDetailsListener), 30000L, new zzag(this, alternativeBillingOnlyReportingDetailsListener), q0(), h()) == null) {
            K(alternativeBillingOnlyReportingDetailsListener, t0(), zzie.zzy, null);
        }
    }

    public void createExternalOfferReportingDetailsAsync(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (i(new zzaq(this, externalOfferReportingDetailsListener, null), 30000L, new zzar(this, externalOfferReportingDetailsListener), q0(), h()) == null) {
            L(externalOfferReportingDetailsListener, t0(), zzie.zzy, null);
        }
    }

    public void endConnection() {
        M0(12);
        synchronized (this.a) {
            try {
            } finally {
                try {
                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Unbinding from service.");
                    Y();
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "There was an exception while unbinding from the service while ending connection!", th);
                }
                try {
                    W();
                    V(3);
                } catch (Throwable th2) {
                    try {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th2);
                        V(3);
                    } catch (Throwable th3) {
                        V(3);
                        this.G = null;
                        throw th3;
                    }
                }
                this.G = null;
            }
            if (this.f != null) {
                this.f.f();
                com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Unbinding from service.");
                Y();
                W();
                V(3);
                this.G = null;
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Unbinding from service.");
                Y();
                W();
                V(3);
                this.G = null;
            }
        }
    }

    public void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, BillingConfigResponseListener billingConfigResponseListener) {
        if (i(new zzad(this, billingConfigResponseListener), 30000L, new zzae(this, billingConfigResponseListener), q0(), h()) == null) {
            BillingResult t0 = t0();
            H0(zzie.zzy, 13, t0);
            billingConfigResponseListener.onBillingConfigResponse(t0, null);
        }
    }

    public final int getConnectionState() {
        int i;
        synchronized (this.a) {
            i = this.b;
        }
        return i;
    }

    public final synchronized ExecutorService h() {
        try {
            if (this.H == null) {
                this.H = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zzc.zza, new o5.b(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.H;
    }

    public void isAlternativeBillingOnlyAvailableAsync(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (i(new zzah(this, alternativeBillingOnlyAvailabilityListener), 30000L, new zzai(this, alternativeBillingOnlyAvailabilityListener), q0(), h()) == null) {
            I(alternativeBillingOnlyAvailabilityListener, t0(), zzie.zzy, null);
        }
    }

    public void isExternalOfferAvailableAsync(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (i(new zzau(this, externalOfferAvailabilityListener), 30000L, new zzv(this, externalOfferAvailabilityListener), q0(), h()) == null) {
            M(externalOfferAvailabilityListener, t0(), zzie.zzy, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.BillingResult isFeatureSupported(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.a.isFeatureSupported(java.lang.String):com.android.billingclient.api.BillingResult");
    }

    public final boolean isReady() {
        if (this.E) {
            return true;
        }
        return b0();
    }

    public final void j0(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.e.post(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity r29, com.android.billingclient.api.BillingFlowParams r30) {
        /*
            Method dump skipped, instructions count: 1709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.a.launchBillingFlow(android.app.Activity, com.android.billingclient.api.BillingFlowParams):com.android.billingclient.api.BillingResult");
    }

    public final /* synthetic */ Bundle o0(int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            synchronized (this.a) {
                zzamVar = this.i;
            }
            return zzamVar == null ? com.google.android.gms.internal.play_billing.zzc.zzd(k.j, zzie.zzbc) : zzamVar.zzg(i, this.g.getPackageName(), str, str2, (String) null, bundle);
        } catch (DeadObjectException e) {
            return com.google.android.gms.internal.play_billing.zzc.zze(k.j, zzie.zze, zzcg.zza(e));
        } catch (Exception e2) {
            return com.google.android.gms.internal.play_billing.zzc.zze(k.h, zzie.zze, zzcg.zza(e2));
        }
    }

    public final /* synthetic */ Bundle p0(String str, String str2) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            synchronized (this.a) {
                zzamVar = this.i;
            }
            return zzamVar == null ? com.google.android.gms.internal.play_billing.zzc.zzd(k.j, zzie.zzbc) : zzamVar.zzf(3, this.g.getPackageName(), str, str2, (String) null);
        } catch (DeadObjectException e) {
            return com.google.android.gms.internal.play_billing.zzc.zze(k.j, zzie.zze, zzcg.zza(e));
        } catch (Exception e2) {
            return com.google.android.gms.internal.play_billing.zzc.zze(k.h, zzie.zze, zzcg.zza(e2));
        }
    }

    public final Handler q0() {
        return Looper.myLooper() == null ? this.e : new Handler(Looper.myLooper());
    }

    public void queryProductDetailsAsync(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) {
        if (i(new zzal(this, productDetailsResponseListener, queryProductDetailsParams), 30000L, new zzap(this, productDetailsResponseListener), q0(), h()) == null) {
            BillingResult t0 = t0();
            H0(zzie.zzy, 7, t0);
            productDetailsResponseListener.onProductDetailsResponse(t0, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbt.zzk(), com.google.android.gms.internal.play_billing.zzbt.zzk()));
        }
    }

    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        if (i(new o5.c(this, purchasesResponseListener, queryPurchasesParams.zza(), false), 30000L, new zzat(this, purchasesResponseListener), q0(), h()) == null) {
            BillingResult t0 = t0();
            H0(zzie.zzy, 9, t0);
            purchasesResponseListener.onQueryPurchasesResponse(t0, com.google.android.gms.internal.play_billing.zzbt.zzk());
        }
    }

    public final o5.j r0(BillingResult billingResult, zzie zzieVar, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", str, exc);
        J0(zzieVar, 7, billingResult, zzcg.zza(exc));
        return new o5.j(billingResult.getResponseCode(), billingResult.getDebugMessage(), new ArrayList(), new ArrayList());
    }

    public final BillingResult s0(int i) {
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzhz zzc = zzib.zzc();
        zzc.zzo(6);
        zzjt zzc2 = zzjv.zzc();
        zzc2.zzn(true);
        zzc2.zza(i > 0);
        zzc2.zzl(i);
        zzc.zzn(zzc2);
        T((zzib) zzc.zze());
        return k.i;
    }

    public BillingResult showAlternativeBillingOnlyInformationDialog(Activity activity, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!Z(3000L)) {
            zzie zzieVar = zzie.zzb;
            BillingResult billingResult = k.j;
            H0(zzieVar, 16, billingResult);
            return billingResult;
        }
        if (!this.y) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            zzie zzieVar2 = zzie.zzan;
            BillingResult billingResult2 = k.D;
            H0(zzieVar2, 16, billingResult2);
            return billingResult2;
        }
        Handler handler = this.e;
        if (i(new zzy(this, alternativeBillingOnlyInformationDialogListener, activity, new b(this, handler, alternativeBillingOnlyInformationDialogListener)), 30000L, new zzz(this, alternativeBillingOnlyInformationDialogListener), handler, h()) != null) {
            return k.i;
        }
        BillingResult t0 = t0();
        H0(zzie.zzy, 16, t0);
        return t0;
    }

    public BillingResult showExternalOfferInformationDialog(Activity activity, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!Z(3000L)) {
            zzie zzieVar = zzie.zzb;
            BillingResult billingResult = k.j;
            H0(zzieVar, 25, billingResult);
            return billingResult;
        }
        if (!this.z) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current Play Store version doesn't support external offer.");
            zzie zzieVar2 = zzie.zzaE;
            BillingResult billingResult2 = k.t;
            H0(zzieVar2, 25, billingResult2);
            return billingResult2;
        }
        Handler handler = this.e;
        if (i(new zzan(this, externalOfferInformationDialogListener, activity, new c(this, handler, externalOfferInformationDialogListener)), 30000L, new zzao(this, externalOfferInformationDialogListener), handler, h()) != null) {
            return k.i;
        }
        BillingResult t0 = t0();
        H0(zzie.zzy, 25, t0);
        return t0;
    }

    public final BillingResult showInAppMessages(Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!Z(3000L)) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Service disconnected.");
            return k.j;
        }
        if (!this.q) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn't support showing in-app messages.");
            return k.s;
        }
        View findViewById = activity.findViewById(16908290);
        IBinder windowToken = findViewById.getWindowToken();
        Rect rect = new Rect();
        findViewById.getGlobalVisibleRect(rect);
        Bundle bundle = new Bundle();
        G1.g.a(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.c);
        String str = this.d;
        if (str != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str);
        }
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.a());
        Handler handler = this.e;
        i(new zzas(this, bundle, activity, new o5.d(this, handler, inAppMessageResponseListener)), 5000L, null, handler, h());
        return k.i;
    }

    public void startConnection(BillingClientStateListener billingClientStateListener) {
        X(billingClientStateListener, 0);
    }

    public final BillingResult t0() {
        BillingResult billingResult;
        int i = 0;
        int[] iArr = {0, 3};
        synchronized (this.a) {
            while (true) {
                if (i >= 2) {
                    billingResult = k.h;
                    break;
                }
                if (this.b == iArr[i]) {
                    billingResult = k.j;
                    break;
                }
                i++;
            }
        }
        return billingResult;
    }

    public final com.google.android.gms.internal.play_billing.zzcz u0(int i) {
        if (this.E && !b0()) {
            return com.google.android.gms.internal.play_billing.zzu.zza(new zzu(this, i));
        }
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Already connected or not opted into auto reconnection.");
        return com.google.android.gms.internal.play_billing.zzcu.zza(k.i);
    }

    public final /* synthetic */ Object v0(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, AcknowledgePurchaseParams acknowledgePurchaseParams) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            if (!a0(30000L)) {
                zzie zzieVar = zzie.zzb;
                BillingResult billingResult = k.j;
                H0(zzieVar, 3, billingResult);
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            } else if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Please provide a valid purchase token.");
                zzie zzieVar2 = zzie.zzz;
                BillingResult billingResult2 = k.g;
                H0(zzieVar2, 3, billingResult2);
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult2);
            } else if (this.p) {
                synchronized (this.a) {
                    zzamVar = this.i;
                }
                if (zzamVar != null) {
                    String packageName = this.g.getPackageName();
                    String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();
                    String str = this.c;
                    String str2 = this.d;
                    long longValue = this.I.longValue();
                    int i = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, longValue);
                    Bundle zzd = zzamVar.zzd(9, packageName, purchaseToken, bundle);
                    acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(k.a(com.google.android.gms.internal.play_billing.zzc.zzb(zzd, "BillingClient"), com.google.android.gms.internal.play_billing.zzc.zzj(zzd, "BillingClient")));
                    return null;
                }
                H(acknowledgePurchaseResponseListener, k.j, zzie.zzbc, null);
            } else {
                zzie zzieVar3 = zzie.zzA;
                BillingResult billingResult3 = k.a;
                H0(zzieVar3, 3, billingResult3);
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult3);
            }
            return null;
        } catch (DeadObjectException e) {
            H(acknowledgePurchaseResponseListener, k.j, zzie.zzB, e);
            return null;
        } catch (Exception e2) {
            H(acknowledgePurchaseResponseListener, k.h, zzie.zzB, e2);
            return null;
        }
    }

    public final /* synthetic */ Object w0(BillingConfigResponseListener billingConfigResponseListener) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            if (!a0(30000L)) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Service disconnected.");
                zzie zzieVar = zzie.zzb;
                BillingResult billingResult = k.j;
                H0(zzieVar, 13, billingResult);
                billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
            } else if (this.v) {
                synchronized (this.a) {
                    zzamVar = this.i;
                }
                if (zzamVar == null) {
                    O(billingConfigResponseListener, k.j, zzie.zzbc, null);
                } else {
                    String packageName = this.g.getPackageName();
                    String str = this.c;
                    String str2 = this.d;
                    long longValue = this.I.longValue();
                    int i = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, longValue);
                    zzamVar.zzn(18, packageName, bundle, new f(billingConfigResponseListener, this.h, this.m, null));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn't support get billing config.");
                zzie zzieVar2 = zzie.zzF;
                BillingResult billingResult2 = k.y;
                H0(zzieVar2, 13, billingResult2);
                billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
            }
        } catch (Exception e) {
            O(billingConfigResponseListener, k.h, zzie.zzaj, e);
        } catch (DeadObjectException e2) {
            O(billingConfigResponseListener, k.j, zzie.zzaj, e2);
        }
        return null;
    }

    public final /* synthetic */ Object x0(Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        com.google.android.gms.internal.play_billing.zzam zzamVar;
        try {
            synchronized (this.a) {
                zzamVar = this.i;
            }
            if (zzamVar == null) {
                Q(-1, zzie.zzbc, null);
            } else {
                zzamVar.zzr(12, this.g.getPackageName(), bundle, new h(new WeakReference(activity), resultReceiver, null));
            }
        } catch (Exception e) {
            Q(6, zzie.zzbb, e);
        } catch (DeadObjectException e2) {
            Q(-1, zzie.zzbb, e2);
        }
        return null;
    }

    public final String y0(QueryProductDetailsParams queryProductDetailsParams) {
        if (TextUtils.isEmpty((CharSequence) null)) {
            return this.g.getPackageName();
        }
        return null;
    }

    public a(String str, Context context, m mVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.a = new Object();
        this.b = 0;
        this.e = new Handler(Looper.getMainLooper());
        this.m = 0;
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.I = valueOf;
        this.J = zzaz.zza();
        this.c = "8.0.0";
        String z0 = z0();
        this.d = z0;
        this.g = context.getApplicationContext();
        zziq zzc = zzis.zzc();
        zzc.zzs("8.0.0");
        if (z0 != null) {
            zzc.zzt(z0);
        }
        zzc.zzq(this.g.getPackageName());
        zzc.zzn(valueOf.longValue());
        zzc.zzr(builder.g);
        zzc.zza(Build.VERSION.SDK_INT);
        zzc.zzp(772604006L);
        try {
            zzc.zzl(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error getting app version code.", th);
        }
        this.h = new n(this.g, zzc.zze());
        this.g.getPackageName();
        this.E = builder.g;
    }

    public a(String str, PendingPurchasesParams pendingPurchasesParams, Context context, zzco zzcoVar, m mVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.a = new Object();
        this.b = 0;
        this.e = new Handler(Looper.getMainLooper());
        this.m = 0;
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.I = valueOf;
        this.J = zzaz.zza();
        this.c = "8.0.0";
        String z0 = z0();
        this.d = z0;
        this.g = context.getApplicationContext();
        zziq zzc = zzis.zzc();
        zzc.zzs("8.0.0");
        if (z0 != null) {
            zzc.zzt(z0);
        }
        zzc.zzq(this.g.getPackageName());
        zzc.zzn(valueOf.longValue());
        zzc.zzr(builder.g);
        zzc.zza(Build.VERSION.SDK_INT);
        zzc.zzp(772604006L);
        try {
            zzc.zzl(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error getting app version code.", th);
        }
        this.h = new n(this.g, zzc.zze());
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f = new s(this.g, null, null, null, null, this.h);
        this.D = pendingPurchasesParams;
        this.g.getPackageName();
        this.E = builder.g;
    }

    public a(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzb zzbVar, m mVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.a = new Object();
        this.b = 0;
        this.e = new Handler(Looper.getMainLooper());
        this.m = 0;
        this.I = Long.valueOf(new Random().nextLong());
        this.J = zzaz.zza();
        this.c = "8.0.0";
        this.d = z0();
        b(context, purchasesUpdatedListener, pendingPurchasesParams, null, "8.0.0", null, builder);
    }

    public a(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, m mVar, ExecutorService executorService, BillingClient.Builder builder) {
        this(context, pendingPurchasesParams, purchasesUpdatedListener, "8.0.0", null, userChoiceBillingListener, null, null, builder);
    }
}
