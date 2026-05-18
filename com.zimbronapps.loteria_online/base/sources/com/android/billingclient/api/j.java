package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.android.billingclient.api.BillingClient;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o5.l;
import o5.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class j extends a {
    public final Context K;
    public volatile int L;
    public volatile com.google.android.gms.internal.play_billing.zzau M;
    public volatile i N;
    public volatile ScheduledExecutorService O;

    public j(String str, Context context, m mVar, ExecutorService executorService, BillingClient.Builder builder) {
        super(null, context, null, null, builder);
        this.L = 0;
        this.K = context;
    }

    public static /* bridge */ /* synthetic */ boolean A1(j jVar, int i) {
        return n1(i);
    }

    public static /* bridge */ /* synthetic */ BillingResult C1(j jVar, int i, int i2) {
        return jVar.o1(i, i2);
    }

    public static /* synthetic */ Object D1(j jVar, int i, com.google.android.gms.internal.play_billing.zzp zzpVar) {
        try {
            if (jVar.M == null) {
                throw null;
            }
            jVar.M.zza(jVar.K.getPackageName(), i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW", new l(zzpVar));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e) {
            jVar.q1(zzie.zzaQ, 28, k.F);
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            zzpVar.zzb(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public static /* bridge */ /* synthetic */ void E1(j jVar, zzie zzieVar, int i, BillingResult billingResult) {
        jVar.q1(zzieVar, 28, billingResult);
    }

    public static /* bridge */ /* synthetic */ void F1(j jVar, int i) {
        jVar.r1(26);
    }

    public static final boolean n1(int i) {
        return i > 0;
    }

    public static /* synthetic */ BillingResult t1(j jVar, Activity activity, BillingFlowParams billingFlowParams) {
        return super.launchBillingFlow(activity, billingFlowParams);
    }

    public static /* synthetic */ void u1(j jVar, AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        super.acknowledgePurchase(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
    }

    public static /* synthetic */ void v1(j jVar, ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        super.consumeAsync(consumeParams, consumeResponseListener);
    }

    public static /* synthetic */ void w1(j jVar, QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) {
        super.queryProductDetailsAsync(queryProductDetailsParams, productDetailsResponseListener);
    }

    public static /* synthetic */ void x1(j jVar, BillingResult billingResult) {
        super.X0(billingResult);
    }

    public static /* bridge */ /* synthetic */ void y1(j jVar, com.google.android.gms.internal.play_billing.zzau zzauVar) {
        jVar.M = zzauVar;
    }

    public static /* bridge */ /* synthetic */ void z1(j jVar, int i) {
        jVar.L = i;
    }

    public final synchronized boolean B1() {
        if (this.L == 2 && this.M != null) {
            if (this.N != null) {
                return true;
            }
        }
        return false;
    }

    public final int G1(com.google.android.gms.internal.play_billing.zzcz zzczVar) {
        try {
            return ((Integer) zzczVar.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            q1(zzie.zzaX, 28, k.F);
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
            return 0;
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            q1(zzie.zzaQ, 28, k.F);
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
            return 0;
        }
    }

    public final synchronized ScheduledExecutorService H1() {
        try {
            if (this.O == null) {
                this.O = Executors.newSingleThreadScheduledExecutor();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.O;
    }

    public final void acknowledgePurchase(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        Objects.requireNonNull(acknowledgePurchaseResponseListener);
        s1(3, new zzbw(acknowledgePurchaseResponseListener), new zzbx(this, acknowledgePurchaseParams, acknowledgePurchaseResponseListener));
    }

    public final void consumeAsync(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        s1(4, new zzbt(consumeResponseListener, consumeParams), new zzbu(this, consumeParams, consumeResponseListener));
    }

    public final void endConnection() {
        l1();
        super.endConnection();
    }

    public final synchronized void l1() {
        r1(27);
        try {
            try {
                if (this.N != null && this.M != null) {
                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClientTesting", "Unbinding from Billing Override Service.");
                    this.K.unbindService(this.N);
                    this.N = new i(this, null);
                }
                this.M = null;
                if (this.O != null) {
                    this.O.shutdownNow();
                    this.O = null;
                }
            } catch (RuntimeException e) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
            }
            this.L = 3;
        } catch (Throwable th) {
            this.L = 3;
            throw th;
        }
    }

    public final BillingResult launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams) {
        zzby zzbyVar = new zzby(this);
        zzbz zzbzVar = new zzbz(this, activity, billingFlowParams);
        int G1 = G1(p1(2));
        if (n1(G1)) {
            BillingResult o1 = o1(2, G1);
            zzbyVar.accept(o1);
            return o1;
        }
        try {
            return (BillingResult) zzbzVar.call();
        } catch (Exception e) {
            zzie zzieVar = zzie.zzaY;
            BillingResult billingResult = k.h;
            q1(zzieVar, 2, billingResult);
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "An internal error occurred.", e);
            return billingResult;
        }
    }

    public final synchronized void m1() {
        if (B1()) {
            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            r1(26);
            return;
        }
        if (this.L == 1) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.L == 3) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            q1(zzie.zzL, 26, k.a(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.L = 1;
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClientTesting", "Starting Billing Override Service setup.");
        this.N = new i(this, null);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        Context context = this.K;
        List queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        zzie zzieVar = zzie.zza;
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            zzieVar = zzie.zzO;
        } else {
            ServiceInfo serviceInfo = ((ResolveInfo) queryIntentServices.get(0)).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    zzieVar = zzie.zzM;
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (context.bindService(intent2, this.N, 1)) {
                        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    } else {
                        zzieVar = zzie.zzM;
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                    }
                }
            }
        }
        this.L = 0;
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClientTesting", "Billing Override Service unavailable on device.");
        q1(zzieVar, 26, k.a(2, "Billing Override Service unavailable on device."));
    }

    public final BillingResult o1(int i, int i2) {
        BillingResult a = k.a(i2, "Billing override value was set by a license tester.");
        q1(zzie.zzaO, i, a);
        return a;
    }

    public final com.google.android.gms.internal.play_billing.zzcz p1(int i) {
        if (B1()) {
            return com.google.android.gms.internal.play_billing.zzu.zza(new zzbv(this, i));
        }
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Billing Override Service is not ready.");
        q1(zzie.zzaP, 28, k.a(-1, "Billing Override Service connection is disconnected."));
        return com.google.android.gms.internal.play_billing.zzcu.zza(0);
    }

    public final void q1(zzie zzieVar, int i, BillingResult billingResult) {
        int i2 = zzcg.zza;
        zzhx zzb = zzcg.zzb(zzieVar, i, billingResult, null, zzil.zza);
        Objects.requireNonNull(zzb, "ApiFailure should not be null");
        U0().b(zzb);
    }

    public final void queryProductDetailsAsync(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) {
        s1(7, new zzbr(productDetailsResponseListener), new zzbs(this, queryProductDetailsParams, productDetailsResponseListener));
    }

    public final void r1(int i) {
        int i2 = zzcg.zza;
        zzib zzc = zzcg.zzc(i, zzil.zza);
        Objects.requireNonNull(zzc, "ApiSuccess should not be null");
        U0().i(zzc);
    }

    public final void s1(int i, S1.b bVar, Runnable runnable) {
        com.google.android.gms.internal.play_billing.zzcu.zzc(com.google.android.gms.internal.play_billing.zzcu.zzb(p1(i), 28500L, TimeUnit.MILLISECONDS, H1()), new o5.k(this, i, bVar, runnable), h());
    }

    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        m1();
        super.startConnection(billingClientStateListener);
    }

    public j(String str, PendingPurchasesParams pendingPurchasesParams, Context context, zzco zzcoVar, m mVar, ExecutorService executorService, BillingClient.Builder builder) {
        super(null, pendingPurchasesParams, context, null, null, null, builder);
        this.L = 0;
        this.K = context;
    }

    public j(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzb zzbVar, m mVar, ExecutorService executorService, BillingClient.Builder builder) {
        super((String) null, pendingPurchasesParams, context, purchasesUpdatedListener, (zzb) null, (m) null, (ExecutorService) null, builder);
        this.L = 0;
        this.K = context;
    }

    public j(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, m mVar, ExecutorService executorService, BillingClient.Builder builder) {
        super((String) null, pendingPurchasesParams, context, purchasesUpdatedListener, userChoiceBillingListener, (m) null, (ExecutorService) null, builder);
        this.L = 0;
        this.K = context;
    }
}
