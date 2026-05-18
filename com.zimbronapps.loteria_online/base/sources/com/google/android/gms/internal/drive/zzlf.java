package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzkk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzlf implements zzmg {
    private static final zzlp zzts = new zzlg();
    private final zzlp zztr;

    public zzlf() {
        this(new zzlh(zzkj.zzcv(), zzdv()));
    }

    private static boolean zza(zzlo zzloVar) {
        return zzloVar.zzec() == zzkk.zze.zzsf;
    }

    private static zzlp zzdv() {
        try {
            return (zzlp) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return zzts;
        }
    }

    public final zzmf zze(Class cls) {
        zzmh.zzg(cls);
        zzlo zzc = this.zztr.zzc(cls);
        return zzc.zzed() ? zzkk.class.isAssignableFrom(cls) ? zzlw.zza(zzmh.zzeo(), zzka.zzcl(), zzc.zzee()) : zzlw.zza(zzmh.zzem(), zzka.zzcm(), zzc.zzee()) : zzkk.class.isAssignableFrom(cls) ? zza(zzc) ? zzlu.zza(cls, zzc, zzma.zzeh(), zzla.zzdu(), zzmh.zzeo(), zzka.zzcl(), zzln.zzea()) : zzlu.zza(cls, zzc, zzma.zzeh(), zzla.zzdu(), zzmh.zzeo(), (zzjy) null, zzln.zzea()) : zza(zzc) ? zzlu.zza(cls, zzc, zzma.zzeg(), zzla.zzdt(), zzmh.zzem(), zzka.zzcm(), zzln.zzdz()) : zzlu.zza(cls, zzc, zzma.zzeg(), zzla.zzdt(), zzmh.zzen(), (zzjy) null, zzln.zzdz());
    }

    private zzlf(zzlp zzlpVar) {
        this.zztr = (zzlp) zzkm.zza((Object) zzlpVar, "messageInfoFactory");
    }
}
