package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhh implements zzhb {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzhb zzc;
    private zzhb zzd;
    private zzhb zze;
    private zzhb zzf;
    private zzhb zzg;
    private zzhb zzh;
    private zzhb zzi;
    private zzhb zzj;
    private zzhb zzk;

    public zzhh(Context context, zzhb zzhbVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzhbVar;
    }

    private final zzhb zzf() {
        if (this.zze == null) {
            zzgs zzgsVar = new zzgs(this.zza);
            this.zze = zzgsVar;
            zzg(zzgsVar);
        }
        return this.zze;
    }

    private final void zzg(zzhb zzhbVar) {
        int i = 0;
        while (true) {
            List list = this.zzb;
            if (i >= list.size()) {
                return;
            }
            zzhbVar.zze((zzhz) list.get(i));
            i++;
        }
    }

    private static final void zzh(zzhb zzhbVar, zzhz zzhzVar) {
        if (zzhbVar != null) {
            zzhbVar.zze(zzhzVar);
        }
    }

    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        zzhb zzhbVar = this.zzk;
        zzhbVar.getClass();
        return zzhbVar.zza(bArr, i, i2);
    }

    public final long zzb(zzhf zzhfVar) throws IOException {
        zzhb zzhbVar;
        zzgrc.zzi(this.zzk == null);
        Uri uri = zzhfVar.zza;
        String scheme = uri.getScheme();
        String str = zzfj.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzho zzhoVar = new zzho();
                    this.zzd = zzhoVar;
                    zzg(zzhoVar);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzf();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzf();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                zzgy zzgyVar = new zzgy(this.zza);
                this.zzf = zzgyVar;
                zzg(zzgyVar);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzhb zzhbVar2 = (zzhb) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor((Class[]) null).newInstance((Object[]) null);
                    this.zzg = zzhbVar2;
                    zzg(zzhbVar2);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                } catch (ClassNotFoundException unused) {
                    zzee.zzc("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzib zzibVar = new zzib(2000);
                this.zzh = zzibVar;
                zzg(zzibVar);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzgz zzgzVar = new zzgz();
                this.zzi = zzgzVar;
                zzg(zzgzVar);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzhx zzhxVar = new zzhx(this.zza);
                    this.zzj = zzhxVar;
                    zzg(zzhxVar);
                }
                zzhbVar = this.zzj;
            } else {
                zzhbVar = this.zzc;
            }
            this.zzk = zzhbVar;
        }
        return this.zzk.zzb(zzhfVar);
    }

    public final Uri zzc() {
        zzhb zzhbVar = this.zzk;
        if (zzhbVar == null) {
            return null;
        }
        return zzhbVar.zzc();
    }

    public final void zzd() throws IOException {
        zzhb zzhbVar = this.zzk;
        if (zzhbVar != null) {
            try {
                zzhbVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    public final void zze(zzhz zzhzVar) {
        zzhzVar.getClass();
        this.zzc.zze(zzhzVar);
        this.zzb.add(zzhzVar);
        zzh(this.zzd, zzhzVar);
        zzh(this.zze, zzhzVar);
        zzh(this.zzf, zzhzVar);
        zzh(this.zzg, zzhzVar);
        zzh(this.zzh, zzhzVar);
        zzh(this.zzi, zzhzVar);
        zzh(this.zzj, zzhzVar);
    }

    public final Map zzj() {
        zzhb zzhbVar = this.zzk;
        return zzhbVar == null ? Collections.emptyMap() : zzhbVar.zzj();
    }
}
