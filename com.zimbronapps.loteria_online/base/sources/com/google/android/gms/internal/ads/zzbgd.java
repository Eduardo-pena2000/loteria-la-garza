package com.google.android.gms.internal.ads;

import V5.F0;
import V5.o0;
import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzbgj;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbgd {
    private final zzbgi zza;
    private final zzbgj.zzt.zza zzb;
    private final boolean zzc;

    private zzbgd() {
        this.zzb = zzbgj.zzt.zzx();
        this.zzc = false;
        this.zza = new zzbgi();
    }

    public static zzbgd zza() {
        return new zzbgd();
    }

    private final synchronized void zzd(int i) {
        zzbgj.zzt.zza zzaVar = this.zzb;
        zzaVar.zzE();
        zzaVar.zzD(F0.X());
        zzbgh zzbghVar = new zzbgh(this.zza, ((zzbgj.zzt) zzaVar.zzbu()).zzaN(), null);
        int i2 = i - 1;
        zzbghVar.zzb(i2);
        zzbghVar.zza();
        o0.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    private final synchronized void zze(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfxl.zza().zza(externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(zzf(i).getBytes());
                } catch (IOException unused) {
                    o0.k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        o0.k("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    o0.k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            o0.k("Could not find file for Clearcut");
        }
    }

    private final synchronized String zzf(int i) {
        zzbgj.zzt.zza zzaVar;
        zzaVar = this.zzb;
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{zzaVar.zzf(), Long.valueOf(R5.t.o().b()), Integer.valueOf(i - 1), Base64.encodeToString(((zzbgj.zzt) zzaVar.zzbu()).zzaN(), 3)});
    }

    public final synchronized void zzb(zzbgc zzbgcVar) {
        if (this.zzc) {
            try {
                zzbgcVar.zza(this.zzb);
            } catch (NullPointerException e) {
                R5.t.l().zzg(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.zzc) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzge)).booleanValue()) {
                zze(i);
            } else {
                zzd(i);
            }
        }
    }

    public zzbgd(zzbgi zzbgiVar) {
        this.zzb = zzbgj.zzt.zzx();
        this.zza = zzbgiVar;
        this.zzc = ((Boolean) S5.D.c().zzd(zzbhe.zzgd)).booleanValue();
    }
}
