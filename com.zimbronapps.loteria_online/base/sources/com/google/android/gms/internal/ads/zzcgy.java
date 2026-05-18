package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcgy implements zzhb {
    private final Context zza;
    private final zzhb zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbfp zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzhf zzl;

    public zzcgy(Context context, zzhb zzhbVar, String str, int i, zzhz zzhzVar, zzcgx zzcgxVar) {
        this.zza = context;
        this.zzb = zzhbVar;
        this.zzc = str;
        this.zzd = i;
        new AtomicLong(-1L);
        this.zze = ((Boolean) S5.D.c().zzd(zzbhe.zzcw)).booleanValue();
    }

    private final boolean zzf() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzfm)).booleanValue() || this.zzj) {
            return ((Boolean) S5.D.c().zzd(zzbhe.zzfn)).booleanValue() && !this.zzk;
        }
        return true;
    }

    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
    }

    public final long zzb(zzhf zzhfVar) throws IOException {
        Long l;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzhfVar.zza;
        this.zzh = uri;
        this.zzl = zzhfVar;
        this.zzi = zzbfp.zza(uri);
        zzbfm zzbfmVar = null;
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzfj)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzhfVar.zze;
                this.zzi.zzi = zzgrt.zza(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbfmVar = R5.t.n().zzc(this.zzi);
            }
            if (zzbfmVar != null && zzbfmVar.zza()) {
                this.zzj = zzbfmVar.zzg();
                this.zzk = zzbfmVar.zze();
                if (!zzf()) {
                    this.zzf = zzbfmVar.zzb();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzhfVar.zze;
            this.zzi.zzi = zzgrt.zza(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l = (Long) S5.D.c().zzd(zzbhe.zzfl);
            } else {
                l = (Long) S5.D.c().zzd(zzbhe.zzfk);
            }
            long longValue = l.longValue();
            R5.t.o().b();
            R5.t.D();
            Future zza = zzbga.zza(this.zza, this.zzi);
            try {
                try {
                    zzbgb zzbgbVar = (zzbgb) zza.get(longValue, TimeUnit.MILLISECONDS);
                    zzbgbVar.zzc();
                    this.zzj = zzbgbVar.zzd();
                    this.zzk = zzbgbVar.zzf();
                    zzbgbVar.zze();
                    if (!zzf()) {
                        this.zzf = zzbgbVar.zzb();
                    }
                } catch (ExecutionException | TimeoutException unused) {
                    zza.cancel(false);
                } catch (InterruptedException unused2) {
                    zza.cancel(false);
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable unused3) {
            }
            R5.t.o().b();
            throw null;
        }
        if (this.zzi != null) {
            zzhe zzb = zzhfVar.zzb();
            zzb.zza(Uri.parse(this.zzi.zza));
            this.zzl = zzb.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    public final Uri zzc() {
        return this.zzh;
    }

    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            E6.m.b(inputStream);
            this.zzf = null;
        }
    }

    public final void zze(zzhz zzhzVar) {
    }
}
