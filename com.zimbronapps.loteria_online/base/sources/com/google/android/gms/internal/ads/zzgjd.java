package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.HashSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgjd {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzika zzd;
    private final zzgoe zze;

    public zzgjd(Context context, SharedPreferences sharedPreferences, zzika zzikaVar, zzgoe zzgoeVar) {
        this.zzc = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        zzfws.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        zzfws.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzikaVar;
        this.zze = zzgoeVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(((zzbch) this.zzd.zzb()).zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int zza = ((zzbch) this.zzd.zzb()).zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 6);
        sb.append("FBAMTD");
        sb.append(zza);
        return sb.toString();
    }

    private final String zzf() {
        int zza = ((zzbch) this.zzd.zzb()).zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 6);
        sb.append("LATMTD");
        sb.append(zza);
        return sb.toString();
    }

    public final boolean zza(zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        boolean z;
        String zza = zzgduVar.zza().zza();
        if (!TextUtils.isEmpty(zza) && bArr2.length != 0) {
            File file = this.zza;
            zzfws.zze(file);
            file.mkdirs();
            File zzc = zzfws.zzc(zza, file);
            zzc.getClass();
            zzc.mkdirs();
            File zza2 = zzfws.zza(zza, "pcam.jar", file);
            zza2.getClass();
            if (bArr == null || bArr.length <= 0 || zzfws.zzb(zza2, bArr)) {
                File zza3 = zzfws.zza(zza, "pcbc", file);
                zza3.getClass();
                if (zzfws.zzb(zza3, bArr2)) {
                    String zza4 = zzgduVar.zza().zza();
                    if (TextUtils.isEmpty(zza4)) {
                        z = false;
                    } else {
                        File zza5 = zzfws.zza(zza4, "pcam.jar", file);
                        zza5.getClass();
                        File zza6 = zzfws.zza(zza4, "pcbc", file);
                        zza6.getClass();
                        File zza7 = zzfws.zza(zza4, "pcam.jar", zzd());
                        zza7.getClass();
                        File zza8 = zzfws.zza(zza4, "pcbc", zzd());
                        zza8.getClass();
                        if (zza5.exists() && !zza5.renameTo(zza7)) {
                            this.zze.zzb(15318);
                        } else if (zza6.exists() && zza6.renameTo(zza8)) {
                            zzgdu zzc2 = zzc(1);
                            SharedPreferences.Editor edit = this.zzc.edit();
                            if (zzc2 != null && !zzgduVar.zza().zza().equals(zzc2.zza().zza())) {
                                edit.putString(zze(), E6.l.a(zzc2.zzaN()));
                            }
                            edit.putString(zzf(), E6.l.a(zzgduVar.zzaN()));
                            if (edit.commit()) {
                                z = true;
                            } else {
                                this.zze.zzb(15320);
                            }
                        } else {
                            this.zze.zzb(15319);
                        }
                        z = false;
                    }
                    HashSet hashSet = new HashSet();
                    zzgdu zzc3 = zzc(1);
                    if (zzc3 != null) {
                        hashSet.add(zzc3.zza().zza());
                    }
                    zzgdu zzc4 = zzc(2);
                    if (zzc4 != null) {
                        hashSet.add(zzc4.zza().zza());
                    }
                    File[] listFiles = zzd().listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File zzc5 = zzfws.zzc(name, zzd());
                                zzc5.getClass();
                                zzfws.zze(zzc5);
                            }
                        }
                    }
                    return z;
                }
            }
        }
        this.zze.zzb(15316);
        return false;
    }

    public final zzfwq zzb(int i) {
        zzgdu zzc = zzc(1);
        if (zzc == null) {
            this.zze.zzb(15315);
            return null;
        }
        String zza = zzc.zza().zza();
        File zza2 = zzfws.zza(zza, "pcam.jar", zzd());
        zza2.getClass();
        if (!zza2.exists()) {
            zza2 = zzfws.zza(zza, "pcam", zzd());
            zza2.getClass();
        }
        File zza3 = zzfws.zza(zza, "pcopt", zzd());
        zza3.getClass();
        File zza4 = zzfws.zza(zza, "pcbc", zzd());
        zza4.getClass();
        return new zzfwq(zzc.zza(), zza2, zza4, zza3);
    }

    public final zzgdu zzc(int i) {
        zzgdu zzd;
        String zza;
        File zza2;
        String string = i == 1 ? this.zzc.getString(zzf(), (String) null) : this.zzc.getString(zze(), (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] d = E6.l.d(string);
            zzian zzianVar = zzian.zza;
            zzd = zzgdu.zzd(zzian.zzs(d, 0, d.length));
            zza = zzd.zza().zza();
            zza2 = zzfws.zza(zza, "pcam.jar", zzd());
        } catch (zzicg unused) {
            this.zze.zzb(15317);
        }
        if (zza2 == null) {
            throw null;
        }
        if (!zza2.exists() && (zza2 = zzfws.zza(zza, "pcam", zzd())) == null) {
            throw null;
        }
        File zza3 = zzfws.zza(zza, "pcbc", zzd());
        if (zza3 == null) {
            throw null;
        }
        if (zza2.exists() && zza3.exists()) {
            return zzd;
        }
        return null;
    }
}
