package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbqf implements zzarr {
    private volatile zzbps zza;
    private final Context zzb;

    public zzbqf(Context context) {
        this.zzb = context;
    }

    public final zzaru zza(zzary zzaryVar) throws zzash {
        Parcelable.Creator creator = zzbpt.CREATOR;
        Map zzm = zzaryVar.zzm();
        int size = zzm.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry entry : zzm.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        zzbpt zzbptVar = new zzbpt(zzaryVar.zzh(), strArr, strArr2);
        long b = R5.t.o().b();
        try {
            zzcen zzcenVar = new zzcen();
            this.zza = new zzbps(this.zzb, R5.t.w().a(), new zzbqd(this, zzcenVar), new zzbqe(this, zzcenVar));
            this.zza.checkAvailabilityAndConnect();
            zzbqb zzbqbVar = new zzbqb(this, zzbptVar);
            zzgzy zzgzyVar = zzcei.zza;
            x7.e zzi = zzgzo.zzi(zzgzo.zzj(zzcenVar, zzbqbVar, zzgzyVar), ((Integer) S5.D.c().zzd(zzbhe.zzfr)).intValue(), TimeUnit.MILLISECONDS, zzcei.zzd);
            zzi.addListener(new zzbqc(this), zzgzyVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzi.get();
            long b2 = R5.t.o().b() - b;
            StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 32);
            sb.append("Http assets remote cache took ");
            sb.append(b2);
            sb.append("ms");
            o0.k(sb.toString());
            zzbpv zzbpvVar = (zzbpv) new zzbzs(parcelFileDescriptor).zza(zzbpv.CREATOR);
            if (zzbpvVar == null) {
                return null;
            }
            if (zzbpvVar.zza) {
                throw new zzash(zzbpvVar.zzb);
            }
            String[] strArr3 = zzbpvVar.zze;
            String[] strArr4 = zzbpvVar.zzf;
            if (strArr3.length != strArr4.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < strArr3.length; i2++) {
                hashMap.put(strArr3[i2], strArr4[i2]);
            }
            return new zzaru(zzbpvVar.zzc, zzbpvVar.zzd, (Map) hashMap, zzbpvVar.zzg, zzbpvVar.zzh);
        } catch (InterruptedException | ExecutionException unused) {
            long b3 = R5.t.o().b() - b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(b3).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(b3);
            sb2.append("ms");
            o0.k(sb2.toString());
            return null;
        } catch (Throwable th) {
            long b4 = R5.t.o().b() - b;
            StringBuilder sb3 = new StringBuilder(String.valueOf(b4).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(b4);
            sb3.append("ms");
            o0.k(sb3.toString());
            throw th;
        }
    }

    public final /* synthetic */ void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zza.disconnect();
        Binder.flushPendingCommands();
    }

    public final /* synthetic */ zzbps zzc() {
        return this.zza;
    }
}
