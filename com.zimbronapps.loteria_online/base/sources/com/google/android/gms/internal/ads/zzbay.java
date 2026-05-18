package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbay extends zzbby {
    private static final zzbbz zzh = new zzbbz();
    private final zzavz zzi;
    private final Context zzj;
    private final zzaye zzk;

    public zzbay(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2, Context context, zzavs zzavsVar, zzavz zzavzVar, zzaye zzayeVar) {
        super(zzbakVar, "ZQJAB1msowxCz8mqmvl8OKnBprztAFjM8nst6XEIBWdYMrqlQRx5Smd7STWtlGuv", "xxbBAKX4fynezd8sgu9AN42lCipqUqelmvdX3g0EV6w=", zzawgVar, i, 27);
        this.zzj = context;
        this.zzi = zzavzVar;
        this.zzk = zzayeVar;
    }

    private final zzayb zzc() throws IllegalAccessException, InvocationTargetException {
        int zzb;
        String str;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzdt)).booleanValue()) {
            zzb = ((Integer) S5.D.c().zzd(zzbhe.zzdz)).intValue();
        } else {
            zzb = this.zzi.zzb();
        }
        zzayb zzaybVar = new zzayb((String) this.zze.invoke((Object) null, new Object[]{this.zzj, Boolean.FALSE, ""}));
        zzaye zzayeVar = this.zzk;
        if (zzayeVar == null || zzayeVar.zza() == null) {
            str = "E";
        } else {
            try {
                str = (String) zzayeVar.zza().get(zzb, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
        }
        zzaybVar.zza = str;
        return zzaybVar;
    }

    private final String zzd() {
        try {
            zzbak zzbakVar = this.zza;
            if (zzbakVar.zzm() != null) {
                zzbakVar.zzm().get();
            }
            zzaxg zzl = zzbakVar.zzl();
            if (zzl == null || !zzl.zza()) {
                return null;
            }
            return zzl.zzb();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int i;
        zzayb zzaybVar;
        zzayb zzaybVar2;
        zzbbz zzbbzVar = zzh;
        Context context = this.zzj;
        AtomicReference zza = zzbbzVar.zza(context.getPackageName());
        synchronized (zza) {
            try {
                zzayb zzaybVar3 = (zzayb) zza.get();
                if (zzaybVar3 == null || zzban.zzc(zzaybVar3.zza) || zzaybVar3.zza.equals("E") || zzaybVar3.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (zzban.zzc(null)) {
                        zzban.zzc(null);
                        i = 3;
                    } else {
                        i = 5;
                    }
                    if (this.zzk != null) {
                        zzaybVar = zzc();
                    } else {
                        boolean z = false;
                        if (i == 3 && !this.zzi.zza()) {
                            z = true;
                        }
                        Boolean valueOf = Boolean.valueOf(z);
                        Boolean bool = (Boolean) S5.D.c().zzd(zzbhe.zzdh);
                        String zzb = ((Boolean) S5.D.c().zzd(zzbhe.zzdg)).booleanValue() ? zzb() : null;
                        if (bool.booleanValue() && this.zza.zzi() && zzban.zzc(zzb)) {
                            zzb = zzd();
                        }
                        zzayb zzaybVar4 = new zzayb((String) this.zze.invoke((Object) null, new Object[]{context, valueOf, zzb}));
                        String str = zzaybVar4.zza;
                        if (zzban.zzc(str) || str.equals("E")) {
                            int i2 = i - 1;
                            if (i2 == 3) {
                                String zzd = zzd();
                                if (!zzban.zzc(zzd)) {
                                    zzaybVar4.zza = zzd;
                                }
                            } else if (i2 == 4) {
                                throw null;
                            }
                        }
                        zzaybVar = zzaybVar4;
                    }
                    zza.set(zzaybVar);
                }
                zzaybVar2 = (zzayb) zza.get();
            } finally {
            }
        }
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            if (zzaybVar2 != null) {
                try {
                    zzawgVar.zzo(zzaybVar2.zza);
                    zzawgVar.zzu(zzaybVar2.zzb);
                    zzawgVar.zzt(zzaybVar2.zzc);
                    zzawgVar.zzD(zzaybVar2.zzd);
                    zzawgVar.zzE(zzaybVar2.zze);
                } finally {
                }
            }
        }
    }

    public final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzb = zzban.zzb((String) S5.D.c().zzd(zzbhe.zzdi));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzb)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzban.zzb((String) S5.D.c().zzd(zzbhe.zzdj)))));
            }
            Context context = this.zzj;
            return zzbcb.zza(context, context.getPackageName(), arrayList, this.zza.zzd());
        } catch (CertificateEncodingException | PackageManager.NameNotFoundException | ExecutionException | InterruptedException | CertificateException | NoClassDefFoundError unused) {
            return null;
        }
    }
}
