package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfyj extends zzfxx {
    private zzgru zza;
    private zzgru zzb;
    private zzfxz zzc;
    private HttpURLConnection zzd;

    public zzfyj(zzgru zzgruVar, zzgru zzgruVar2, zzfxz zzfxzVar) {
        this.zza = zzgruVar;
        this.zzb = zzgruVar2;
        this.zzc = zzfxzVar;
    }

    private static /* synthetic */ Integer zzA() {
        return -1;
    }

    private static /* synthetic */ Integer zzB() {
        return -1;
    }

    public static void zzi(HttpURLConnection httpURLConnection) {
        zzfxy.zzb();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public static /* synthetic */ Integer zzk() {
        return zzB();
    }

    public static /* synthetic */ Integer zzl() {
        return zzA();
    }

    public static /* synthetic */ Integer zzm(int i) {
        return zzz(i);
    }

    public static /* synthetic */ URLConnection zzn(URL url) {
        return zzy(url);
    }

    public static /* synthetic */ Integer zzo(int i) {
        return zzx(i);
    }

    public static /* synthetic */ Integer zzp(int i) {
        return zzw(i);
    }

    public static /* synthetic */ URLConnection zzq(Network network, URL url) {
        return zzv(network, url);
    }

    public static /* synthetic */ Integer zzr(int i) {
        return zzu(i);
    }

    public static /* synthetic */ Integer zzs(int i) {
        return zzt(i);
    }

    private static /* synthetic */ Integer zzt(int i) {
        return Integer.valueOf(i);
    }

    private static /* synthetic */ Integer zzu(int i) {
        return Integer.valueOf(i);
    }

    private static /* synthetic */ URLConnection zzv(Network network, URL url) throws IOException {
        return network.openConnection(url);
    }

    private static /* synthetic */ Integer zzw(int i) {
        return Integer.valueOf(i);
    }

    private static /* synthetic */ Integer zzx(int i) {
        return Integer.valueOf(i);
    }

    private static /* synthetic */ URLConnection zzy(URL url) throws IOException {
        int i = zzfxs.zzb;
        return url.openConnection();
    }

    private static /* synthetic */ Integer zzz(int i) {
        return Integer.valueOf(i);
    }

    public void close() {
        zzi(this.zzd);
    }

    public URLConnection zzf(URL url, int i) throws IOException {
        this.zza = new zzfyb(i);
        this.zzc = new zzfyc(url);
        return zzj();
    }

    public HttpURLConnection zzg(Network network, URL url, int i, int i2) throws IOException {
        this.zza = new zzfyd(i);
        this.zzb = new zzfye(i2);
        this.zzc = new zzfyf(network, url);
        return zzj();
    }

    public HttpURLConnection zzh(zzfxz zzfxzVar, int i, int i2) throws IOException {
        this.zza = new zzfyg(i);
        this.zzb = new zzfyh(i2);
        this.zzc = zzfxzVar;
        return zzj();
    }

    public HttpURLConnection zzj() throws IOException {
        zzfxy.zza(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfxz zzfxzVar = this.zzc;
        zzfxzVar.getClass();
        HttpURLConnection zza = zzfxzVar.zza();
        this.zzd = zza;
        return zza;
    }

    public zzfyj() {
        this(zzfyi.zza, zzfya.zza, null);
    }
}
