package com.google.android.gms.measurement.internal;

import N6.b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzcq;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.internal.measurement.zzcx;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdc;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Map;
import k7.B4;
import k7.G;
import k7.I;
import k7.N4;
import k7.O3;
import k7.P4;
import k7.S5;
import k7.U6;
import k7.W4;
import k7.X4;
import k7.b5;
import k7.f4;
import k7.j3;
import k7.l7;
import k7.m7;
import k7.n4;
import k7.p4;
import k7.q3;
import k7.q4;
import k7.s5;
import k7.t6;
import w.a;

@DynamiteApi
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class AppMeasurementDynamiteService extends zzcq {
    public q3 a = null;
    public final Map b = new a();

    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        this.a.M().i(str, j);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zzb();
        this.a.B().O(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) throws RemoteException {
        zzb();
        this.a.B().n0(null);
    }

    public void endAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        this.a.M().j(str, j);
    }

    public void generateEventId(zzcu zzcuVar) throws RemoteException {
        zzb();
        long p0 = this.a.C().p0();
        zzb();
        this.a.C().b0(zzcuVar, p0);
    }

    public void getAppInstanceId(zzcu zzcuVar) throws RemoteException {
        zzb();
        this.a.b().t(new j3(this, zzcuVar));
    }

    public void getCachedAppInstanceId(zzcu zzcuVar) throws RemoteException {
        zzb();
        q1(zzcuVar, this.a.B().D());
    }

    public void getConditionalUserProperties(String str, String str2, zzcu zzcuVar) throws RemoteException {
        zzb();
        this.a.b().t(new s5(this, zzcuVar, str, str2));
    }

    public void getCurrentScreenClass(zzcu zzcuVar) throws RemoteException {
        zzb();
        q1(zzcuVar, this.a.B().R());
    }

    public void getCurrentScreenName(zzcu zzcuVar) throws RemoteException {
        zzb();
        q1(zzcuVar, this.a.B().Q());
    }

    public void getGmpAppId(zzcu zzcuVar) throws RemoteException {
        zzb();
        q1(zzcuVar, this.a.B().S());
    }

    public void getMaxUserProperties(String str, zzcu zzcuVar) throws RemoteException {
        zzb();
        this.a.B().L(str);
        zzb();
        this.a.C().c0(zzcuVar, 25);
    }

    public void getSessionId(zzcu zzcuVar) throws RemoteException {
        zzb();
        b5 B = this.a.B();
        B.a.b().t(new B4(B, zzcuVar));
    }

    public void getTestFlag(zzcu zzcuVar, int i) throws RemoteException {
        zzb();
        if (i == 0) {
            this.a.C().a0(zzcuVar, this.a.B().j0());
            return;
        }
        if (i == 1) {
            this.a.C().b0(zzcuVar, this.a.B().k0().longValue());
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.a.C().c0(zzcuVar, this.a.B().l0().intValue());
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.a.C().e0(zzcuVar, this.a.B().i0().booleanValue());
                return;
            }
        }
        l7 C = this.a.C();
        double doubleValue = this.a.B().m0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", doubleValue);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e) {
            C.a.a().r().b("Error returning double value to wrapper", e);
        }
    }

    public void getUserProperties(String str, String str2, boolean z, zzcu zzcuVar) throws RemoteException {
        zzb();
        this.a.b().t(new p4(this, zzcuVar, str, str2, z));
    }

    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    public void initialize(N6.a aVar, zzdd zzddVar, long j) throws RemoteException {
        q3 q3Var = this.a;
        if (q3Var == null) {
            this.a = q3.O((Context) t.l((Context) b.r1(aVar)), zzddVar, Long.valueOf(j));
        } else {
            q3Var.a().r().a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(zzcu zzcuVar) throws RemoteException {
        zzb();
        this.a.b().t(new S5(this, zzcuVar));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zzb();
        this.a.B().q(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcu zzcuVar, long j) throws RemoteException {
        zzb();
        t.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.a.b().t(new O3(this, zzcuVar, new I(str2, new G(bundle), "app", j), str));
    }

    public void logHealthData(int i, String str, N6.a aVar, N6.a aVar2, N6.a aVar3) throws RemoteException {
        zzb();
        this.a.a().y(i, true, false, str, aVar == null ? null : b.r1(aVar), aVar2 == null ? null : b.r1(aVar2), aVar3 != null ? b.r1(aVar3) : null);
    }

    public void onActivityCreated(N6.a aVar, Bundle bundle, long j) throws RemoteException {
        zzb();
        onActivityCreatedByScionActivityInfo(zzdf.zza((Activity) t.l((Activity) b.r1(aVar))), bundle, j);
    }

    public void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j) {
        zzb();
        N4 n4 = this.a.B().c;
        if (n4 != null) {
            this.a.B().h0();
            n4.e(zzdfVar, bundle);
        }
    }

    public void onActivityDestroyed(N6.a aVar, long j) throws RemoteException {
        zzb();
        onActivityDestroyedByScionActivityInfo(zzdf.zza((Activity) t.l((Activity) b.r1(aVar))), j);
    }

    public void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        N4 n4 = this.a.B().c;
        if (n4 != null) {
            this.a.B().h0();
            n4.b(zzdfVar);
        }
    }

    public void onActivityPaused(N6.a aVar, long j) throws RemoteException {
        zzb();
        onActivityPausedByScionActivityInfo(zzdf.zza((Activity) t.l((Activity) b.r1(aVar))), j);
    }

    public void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        N4 n4 = this.a.B().c;
        if (n4 != null) {
            this.a.B().h0();
            n4.a(zzdfVar);
        }
    }

    public void onActivityResumed(N6.a aVar, long j) throws RemoteException {
        zzb();
        onActivityResumedByScionActivityInfo(zzdf.zza((Activity) t.l((Activity) b.r1(aVar))), j);
    }

    public void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        N4 n4 = this.a.B().c;
        if (n4 != null) {
            this.a.B().h0();
            n4.d(zzdfVar);
        }
    }

    public void onActivitySaveInstanceState(N6.a aVar, zzcu zzcuVar, long j) throws RemoteException {
        zzb();
        onActivitySaveInstanceStateByScionActivityInfo(zzdf.zza((Activity) t.l((Activity) b.r1(aVar))), zzcuVar, j);
    }

    public void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zzcu zzcuVar, long j) throws RemoteException {
        zzb();
        N4 n4 = this.a.B().c;
        Bundle bundle = new Bundle();
        if (n4 != null) {
            this.a.B().h0();
            n4.c(zzdfVar, bundle);
        }
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e) {
            this.a.a().r().b("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(N6.a aVar, long j) throws RemoteException {
        zzb();
        onActivityStartedByScionActivityInfo(zzdf.zza((Activity) t.l((Activity) b.r1(aVar))), j);
    }

    public void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        if (this.a.B().c != null) {
            this.a.B().h0();
        }
    }

    public void onActivityStopped(N6.a aVar, long j) throws RemoteException {
        zzb();
        onActivityStoppedByScionActivityInfo(zzdf.zza((Activity) t.l((Activity) b.r1(aVar))), j);
    }

    public void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        if (this.a.B().c != null) {
            this.a.B().h0();
        }
    }

    public void performAction(Bundle bundle, zzcu zzcuVar, long j) throws RemoteException {
        zzb();
        zzcuVar.zzb(null);
    }

    public final void q1(zzcu zzcuVar, String str) {
        zzb();
        this.a.C().a0(zzcuVar, str);
    }

    public void registerOnMeasurementEventListener(zzda zzdaVar) throws RemoteException {
        f4 f4Var;
        zzb();
        Map map = this.b;
        synchronized (map) {
            try {
                f4Var = (f4) map.get(Integer.valueOf(zzdaVar.zzf()));
                if (f4Var == null) {
                    f4Var = new m7(this, zzdaVar);
                    map.put(Integer.valueOf(zzdaVar.zzf()), f4Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.B().J(f4Var);
    }

    public void resetAnalyticsData(long j) throws RemoteException {
        zzb();
        this.a.B().G(j);
    }

    public void retrieveAndUploadBatches(zzcx zzcxVar) {
        zzb();
        this.a.B().r0(new t6(this, zzcxVar));
    }

    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        zzb();
        if (bundle == null) {
            this.a.a().o().a("Conditional user property must not be null");
        } else {
            this.a.B().N(bundle, j);
        }
    }

    public void setConsent(Bundle bundle, long j) throws RemoteException {
    }

    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        zzb();
        this.a.B().o0(bundle, -20, j);
    }

    public void setCurrentScreen(N6.a aVar, String str, String str2, long j) throws RemoteException {
        zzb();
        setCurrentScreenByScionActivityInfo(zzdf.zza((Activity) t.l((Activity) b.r1(aVar))), str, str2, j);
    }

    public void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j) throws RemoteException {
        zzb();
        this.a.I().t(zzdfVar, str, str2);
    }

    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        b5 B = this.a.B();
        B.j();
        B.a.b().t(new n4(B, z));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        b5 B = this.a.B();
        B.a.b().t(new W4(B, bundle == null ? new Bundle() : new Bundle(bundle)));
    }

    public void setEventInterceptor(zzda zzdaVar) throws RemoteException {
        zzb();
        U6 u6 = new U6(this, zzdaVar);
        if (this.a.b().p()) {
            this.a.B().I(u6);
        } else {
            this.a.b().t(new P4(this, u6));
        }
    }

    public void setInstanceIdProvider(zzdc zzdcVar) throws RemoteException {
        zzb();
    }

    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zzb();
        this.a.B().n0(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j) throws RemoteException {
        zzb();
    }

    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zzb();
        b5 B = this.a.B();
        B.a.b().t(new q4(B, j));
    }

    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        zzb();
        b5 B = this.a.B();
        Uri data = intent.getData();
        if (data == null) {
            B.a.a().u().a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            q3 q3Var = B.a;
            q3Var.a().u().a("[sgtm] Preview Mode was not enabled.");
            q3Var.w().Q(null);
        } else {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            q3 q3Var2 = B.a;
            q3Var2.a().u().b("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            q3Var2.w().Q(queryParameter2);
        }
    }

    public void setUserId(String str, long j) throws RemoteException {
        zzb();
        b5 B = this.a.B();
        if (str != null && TextUtils.isEmpty(str)) {
            B.a.a().r().a("User ID must be non-empty or null");
        } else {
            B.a.b().t(new X4(B, str));
            B.z(null, "_id", str, true, j);
        }
    }

    public void setUserProperty(String str, String str2, N6.a aVar, boolean z, long j) throws RemoteException {
        zzb();
        this.a.B().z(str, str2, b.r1(aVar), z, j);
    }

    public void unregisterOnMeasurementEventListener(zzda zzdaVar) throws RemoteException {
        f4 f4Var;
        zzb();
        Map map = this.b;
        synchronized (map) {
            f4Var = (f4) map.remove(Integer.valueOf(zzdaVar.zzf()));
        }
        if (f4Var == null) {
            f4Var = new m7(this, zzdaVar);
        }
        this.a.B().K(f4Var);
    }

    public final void zzb() {
        if (this.a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }
}
