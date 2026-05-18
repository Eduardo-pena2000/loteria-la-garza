package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzcp extends zzbl implements zzcr {
    public zzcp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j);
        zzc(23, zza);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbn.zzc(zza, bundle);
        zzc(9, zza);
    }

    public final void clearMeasurementEnabled(long j) throws RemoteException {
        throw null;
    }

    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j);
        zzc(24, zza);
    }

    public final void generateEventId(zzcu zzcuVar) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzd(zza, zzcuVar);
        zzc(22, zza);
    }

    public final void getAppInstanceId(zzcu zzcuVar) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzd(zza, zzcuVar);
        zzc(20, zza);
    }

    public final void getCachedAppInstanceId(zzcu zzcuVar) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzd(zza, zzcuVar);
        zzc(19, zza);
    }

    public final void getConditionalUserProperties(String str, String str2, zzcu zzcuVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbn.zzd(zza, zzcuVar);
        zzc(10, zza);
    }

    public final void getCurrentScreenClass(zzcu zzcuVar) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzd(zza, zzcuVar);
        zzc(17, zza);
    }

    public final void getCurrentScreenName(zzcu zzcuVar) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzd(zza, zzcuVar);
        zzc(16, zza);
    }

    public final void getGmpAppId(zzcu zzcuVar) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzd(zza, zzcuVar);
        zzc(21, zza);
    }

    public final void getMaxUserProperties(String str, zzcu zzcuVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbn.zzd(zza, zzcuVar);
        zzc(6, zza);
    }

    public final void getSessionId(zzcu zzcuVar) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzd(zza, zzcuVar);
        zzc(46, zza);
    }

    public final void getTestFlag(zzcu zzcuVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzd(zza, zzcuVar);
        zza.writeInt(i);
        zzc(38, zza);
    }

    public final void getUserProperties(String str, String str2, boolean z, zzcu zzcuVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        int i = zzbn.zza;
        zza.writeInt(z ? 1 : 0);
        zzbn.zzd(zza, zzcuVar);
        zzc(5, zza);
    }

    public final void initForTests(Map map) throws RemoteException {
        throw null;
    }

    public final void initialize(N6.a aVar, zzdd zzddVar, long j) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzd(zza, aVar);
        zzbn.zzc(zza, zzddVar);
        zza.writeLong(j);
        zzc(1, zza);
    }

    public final void isDataCollectionEnabled(zzcu zzcuVar) throws RemoteException {
        throw null;
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbn.zzc(zza, bundle);
        zza.writeInt(z ? 1 : 0);
        zza.writeInt(z2 ? 1 : 0);
        zza.writeLong(j);
        zzc(2, zza);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcu zzcuVar, long j) throws RemoteException {
        throw null;
    }

    public final void logHealthData(int i, String str, N6.a aVar, N6.a aVar2, N6.a aVar3) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(5);
        zza.writeString(str);
        zzbn.zzd(zza, aVar);
        zzbn.zzd(zza, aVar2);
        zzbn.zzd(zza, aVar3);
        zzc(33, zza);
    }

    public final void onActivityCreated(N6.a aVar, Bundle bundle, long j) throws RemoteException {
        throw null;
    }

    public final void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzc(zza, zzdfVar);
        zzbn.zzc(zza, bundle);
        zza.writeLong(j);
        zzc(53, zza);
    }

    public final void onActivityDestroyed(N6.a aVar, long j) throws RemoteException {
        throw null;
    }

    public final void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzc(zza, zzdfVar);
        zza.writeLong(j);
        zzc(54, zza);
    }

    public final void onActivityPaused(N6.a aVar, long j) throws RemoteException {
        throw null;
    }

    public final void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzc(zza, zzdfVar);
        zza.writeLong(j);
        zzc(55, zza);
    }

    public final void onActivityResumed(N6.a aVar, long j) throws RemoteException {
        throw null;
    }

    public final void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzc(zza, zzdfVar);
        zza.writeLong(j);
        zzc(56, zza);
    }

    public final void onActivitySaveInstanceState(N6.a aVar, zzcu zzcuVar, long j) throws RemoteException {
        throw null;
    }

    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zzcu zzcuVar, long j) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzc(zza, zzdfVar);
        zzbn.zzd(zza, zzcuVar);
        zza.writeLong(j);
        zzc(57, zza);
    }

    public final void onActivityStarted(N6.a aVar, long j) throws RemoteException {
        throw null;
    }

    public final void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzc(zza, zzdfVar);
        zza.writeLong(j);
        zzc(51, zza);
    }

    public final void onActivityStopped(N6.a aVar, long j) throws RemoteException {
        throw null;
    }

    public final void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzc(zza, zzdfVar);
        zza.writeLong(j);
        zzc(52, zza);
    }

    public final void performAction(Bundle bundle, zzcu zzcuVar, long j) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzc(zza, bundle);
        zzbn.zzd(zza, zzcuVar);
        zza.writeLong(j);
        zzc(32, zza);
    }

    public final void registerOnMeasurementEventListener(zzda zzdaVar) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzd(zza, zzdaVar);
        zzc(35, zza);
    }

    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzc(12, zza);
    }

    public final void retrieveAndUploadBatches(zzcx zzcxVar) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzd(zza, zzcxVar);
        zzc(58, zza);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzc(zza, bundle);
        zza.writeLong(j);
        zzc(8, zza);
    }

    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        throw null;
    }

    public final void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzc(zza, bundle);
        zza.writeLong(j);
        zzc(45, zza);
    }

    public final void setCurrentScreen(N6.a aVar, String str, String str2, long j) throws RemoteException {
        throw null;
    }

    public final void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzc(zza, zzdfVar);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeLong(j);
        zzc(50, zza);
    }

    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzbn.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(39, zza);
    }

    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzc(zza, bundle);
        zzc(42, zza);
    }

    public final void setEventInterceptor(zzda zzdaVar) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzd(zza, zzdaVar);
        zzc(34, zza);
    }

    public final void setInstanceIdProvider(zzdc zzdcVar) throws RemoteException {
        throw null;
    }

    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel zza = zza();
        int i = zzbn.zza;
        zza.writeInt(z ? 1 : 0);
        zza.writeLong(j);
        zzc(11, zza);
    }

    public final void setMinimumSessionDuration(long j) throws RemoteException {
        throw null;
    }

    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzc(14, zza);
    }

    public final void setSgtmDebugInfo(Intent intent) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzc(zza, intent);
        zzc(48, zza);
    }

    public final void setUserId(String str, long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j);
        zzc(7, zza);
    }

    public final void setUserProperty(String str, String str2, N6.a aVar, boolean z, long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbn.zzd(zza, aVar);
        zza.writeInt(z ? 1 : 0);
        zza.writeLong(j);
        zzc(4, zza);
    }

    public final void unregisterOnMeasurementEventListener(zzda zzdaVar) throws RemoteException {
        Parcel zza = zza();
        zzbn.zzd(zza, zzdaVar);
        zzc(36, zza);
    }
}
