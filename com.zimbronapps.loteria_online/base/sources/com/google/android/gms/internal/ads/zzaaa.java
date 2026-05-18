package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaaa extends zzaag implements zzmm {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgvz zzc = zzgvz.zzc(zzzg.zza);
    public final Context zza;
    private final Object zzd;
    private zzzl zze;
    private Thread zzf;
    private zzzp zzg;
    private zzd zzh;
    private Boolean zzi;
    private final zzyt zzj;

    public zzaaa(Context context) {
        zzyt zzytVar = new zzyt();
        zzzl zzzlVar = zzzl.zzJ;
        this.zzd = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzytVar;
        if (zzzlVar != null) {
            this.zze = zzzlVar;
        } else {
            zzzk zzzkVar = new zzzk(zzzlVar, null);
            zzzkVar.zzx((zzbl) zzzlVar);
            this.zze = new zzzl(zzzkVar, null);
        }
        this.zzh = zzd.zza;
        if (this.zze.zzU && context == null) {
            zzee.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static String zzi(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static int zzj(zzv zzvVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzvVar.zzd)) {
            return 4;
        }
        String zzi = zzi(str);
        String zzi2 = zzi(zzvVar.zzd);
        if (zzi2 == null || zzi == null) {
            return (z && zzi2 == null) ? 1 : 0;
        }
        if (zzi2.startsWith(zzi) || zzi.startsWith(zzi2)) {
            return 3;
        }
        String str2 = zzfj.zza;
        return zzi2.split("-", 2)[0].equals(zzi.split("-", 2)[0]) ? 2 : 0;
    }

    public static /* synthetic */ int zzm(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ int zzn(com.google.android.gms.internal.ads.zzv r5, com.google.android.gms.internal.ads.zzguf r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L2a
            r2 = r0
        L9:
            java.util.List r3 = r5.zzc
            int r4 = r3.size()
            if (r2 >= r4) goto L27
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.zzx r3 = (com.google.android.gms.internal.ads.zzx) r3
            java.lang.String r3 = r3.zzb
            java.lang.Object r4 = r6.get(r1)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            goto L2d
        L24:
            int r2 = r2 + 1
            goto L9
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaa.zzn(com.google.android.gms.internal.ads.zzv, com.google.android.gms.internal.ads.zzguf):int");
    }

    public static /* synthetic */ zzgvz zzo() {
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final void zzl() {
        boolean z;
        zzzp zzzpVar;
        synchronized (this.zzd) {
            try {
                z = false;
                if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null && zzzpVar.zza()) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            zzs();
        }
    }

    private static void zzv(zzyn zzynVar, zzbl zzblVar, Map map) {
        for (int i = 0; i < zzynVar.zzb; i++) {
            if (((zzbh) zzblVar.zzH.get(zzynVar.zza(i))) != null) {
                throw null;
            }
        }
    }

    private static final Pair zzw(int i, zzaaf zzaafVar, int[][][] iArr, zzzr zzzrVar, Comparator comparator) {
        zzguf zzgufVar;
        boolean z;
        zzaaf zzaafVar2 = zzaafVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < 2) {
            if (i == zzaafVar2.zza(i2)) {
                zzyn zzb2 = zzaafVar2.zzb(i2);
                for (int i3 = 0; i3 < zzb2.zzb; i3++) {
                    zzbg zza = zzb2.zza(i3);
                    List zza2 = zzzrVar.zza(i2, zza, iArr[i2][i3]);
                    int i4 = zza.zza;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        zzzs zzzsVar = (zzzs) zza2.get(i5);
                        int zza3 = zzzsVar.zza();
                        if (!zArr[i5] && zza3 != 0) {
                            if (zza3 == 1) {
                                zzgufVar = zzguf.zzj(zzzsVar);
                            } else {
                                zzguf arrayList2 = new ArrayList();
                                arrayList2.add(zzzsVar);
                                for (int i7 = i6; i7 < i4; i7++) {
                                    zzzs zzzsVar2 = (zzzs) zza2.get(i7);
                                    if (zzzsVar2.zza() == 2 && zzzsVar.zzc(zzzsVar2)) {
                                        arrayList2.add(zzzsVar2);
                                        z = true;
                                        zArr[i7] = true;
                                    } else {
                                        z = true;
                                    }
                                }
                                zzgufVar = arrayList2;
                            }
                            arrayList.add(zzgufVar);
                        }
                        i5 = i6;
                    }
                }
            }
            i2++;
            zzaafVar2 = zzaafVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((zzzs) list.get(i8)).zzc;
        }
        zzzs zzzsVar3 = (zzzs) list.get(0);
        return Pair.create(new zzaab(zzzsVar3.zzb, iArr2, 0), Integer.valueOf(zzzsVar3.zza));
    }

    public final void zza(zzml zzmlVar) {
        synchronized (this.zzd) {
            boolean z = this.zze.zzY;
        }
    }

    public final void zzb() {
        zzzp zzzpVar;
        synchronized (this.zzd) {
            try {
                Thread thread = this.zzf;
                if (thread != null) {
                    zzgrc.zzj(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null) {
            zzzpVar.zze();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzzl zzc() {
        zzzl zzzlVar;
        synchronized (this.zzd) {
            zzzlVar = this.zze;
        }
        return zzzlVar;
    }

    public final boolean zzd() {
        return true;
    }

    public final void zze(zzd zzdVar) {
        if (this.zzh.equals(zzdVar)) {
            return;
        }
        this.zzh = zzdVar;
        zzl();
    }

    public final void zzf(zzzk zzzkVar) {
        boolean equals;
        zzzl zzzlVar = new zzzl(zzzkVar, null);
        synchronized (this.zzd) {
            equals = this.zze.equals(zzzlVar);
            this.zze = zzzlVar;
        }
        if (equals) {
            return;
        }
        if (zzzlVar.zzU && this.zza == null) {
            zzee.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzs();
    }

    public final zzmm zzg() {
        return this;
    }

    public final Pair zzh(zzaaf zzaafVar, int[][][] iArr, int[] iArr2, zzwk zzwkVar, zzbf zzbfVar) throws zziw {
        zzzl zzzlVar;
        boolean z;
        String str;
        String str2;
        int i;
        zzaac zza;
        int i2;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        Context context3;
        int i3 = 1;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzzlVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = Boolean.valueOf(zzfj.zzM(context3));
        }
        if (zzzlVar.zzU && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzzp(this.zza, this, this.zzi);
        }
        int i4 = 2;
        zzaab[] zzaabVarArr = new zzaab[2];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= 2) {
                z = false;
                break;
            }
            if (zzaafVar.zza(i6) == 2 && zzaafVar.zzb(i6).zzb > 0) {
                z = true;
                break;
            }
            i6++;
        }
        Pair zzw = zzw(1, zzaafVar, iArr, new zzzc(this, zzzlVar, z, iArr2), zzyy.zza);
        if (zzw != null) {
            zzaabVarArr[((Integer) zzw.second).intValue()] = (zzaab) zzw.first;
        }
        if (zzw == null) {
            str = null;
        } else {
            Object obj = zzw.first;
            str = ((zzaab) obj).zza.zza(((zzaab) obj).zzb[0]).zzd;
        }
        int i7 = zzzlVar.zzw.zzb;
        Pair zzw2 = zzw(2, zzaafVar, iArr, new zzzh(zzzlVar, str, iArr2, (!zzzlVar.zzk || (context2 = this.zza) == null) ? null : zzfj.zzO(context2)), zzzb.zza);
        int i8 = 4;
        Pair zzw3 = zzw2 == null ? zzw(4, zzaafVar, iArr, new zzze(zzzlVar), zzyz.zza) : null;
        if (zzw3 != null) {
            zzaabVarArr[((Integer) zzw3.second).intValue()] = (zzaab) zzw3.first;
        } else if (zzw2 != null) {
            zzaabVarArr[((Integer) zzw2.second).intValue()] = (zzaab) zzw2.first;
        }
        if (!zzzlVar.zzB || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            str2 = null;
        } else {
            String str3 = zzfj.zza;
            str2 = locale.toLanguageTag();
        }
        int i9 = 3;
        Pair zzw4 = zzw(3, zzaafVar, iArr, new zzzd(zzzlVar, str, str2), zzza.zza);
        if (zzw4 != null) {
            zzaabVarArr[((Integer) zzw4.second).intValue()] = (zzaab) zzw4.first;
        }
        int i10 = 0;
        while (i10 < i4) {
            int zza2 = zzaafVar.zza(i10);
            if (zza2 != i4 && zza2 != i3 && zza2 != i9 && zza2 != i8) {
                zzyn zzb2 = zzaafVar.zzb(i10);
                int[][] iArr3 = iArr[i10];
                int i11 = i5;
                int i12 = i11;
                zzbg zzbgVar = null;
                zzzj zzzjVar = null;
                while (i11 < zzb2.zzb) {
                    zzbg zza3 = zzb2.zza(i11);
                    int[] iArr4 = iArr3[i11];
                    zzzj zzzjVar2 = zzzjVar;
                    for (int i13 = i5; i13 < zza3.zza; i13++) {
                        if (zzmn.zzaa(iArr4[i13], zzzlVar.zzV)) {
                            zzzj zzzjVar3 = new zzzj(zza3.zza(i13), iArr4[i13]);
                            if (zzzjVar2 == null || zzzjVar3.zza(zzzjVar2) > 0) {
                                zzzjVar2 = zzzjVar3;
                                zzbgVar = zza3;
                                i12 = i13;
                            }
                        }
                        i3 = 1;
                    }
                    i11 += i3;
                    zzzjVar = zzzjVar2;
                    i5 = 0;
                }
                zzaabVarArr[i10] = zzbgVar == null ? null : new zzaab(zzbgVar, new int[]{i12}, 0);
                i3 = 1;
            }
            i10 += i3;
            i4 = 2;
            i5 = 0;
            i9 = 3;
            i8 = 4;
        }
        HashMap hashMap = new HashMap();
        int i14 = 2;
        for (int i15 = 0; i15 < 2; i15 += i3) {
            zzv(zzaafVar.zzb(i15), zzzlVar, hashMap);
        }
        zzv(zzaafVar.zze(), zzzlVar, hashMap);
        for (int i16 = 0; i16 < 2; i16 += i3) {
            if (((zzbh) hashMap.get(Integer.valueOf(zzaafVar.zza(i16)))) != null) {
                throw null;
            }
        }
        int i17 = 0;
        while (i17 < i14) {
            zzyn zzb3 = zzaafVar.zzb(i17);
            if (zzzlVar.zzb(i17, zzb3)) {
                if (zzzlVar.zzc(i17, zzb3) != null) {
                    throw null;
                }
                zzaabVarArr[i17] = null;
            }
            i17++;
            i14 = 2;
        }
        int i18 = 0;
        for (int i19 = i14; i18 < i19; i19 = 2) {
            int zza4 = zzaafVar.zza(i18);
            if (zzzlVar.zza(i18) || zzzlVar.zzI.contains(Integer.valueOf(zza4))) {
                zzaabVarArr[i18] = null;
                i2 = 1;
            } else {
                i2 = 1;
            }
            i18 += i2;
        }
        zzyt zzytVar = this.zzj;
        zzaas zzt = zzt();
        zzguf zzd = zzyu.zzd(zzaabVarArr);
        int i20 = 2;
        zzaac[] zzaacVarArr = new zzaac[2];
        int i21 = 0;
        while (i21 < i20) {
            zzaab zzaabVar = zzaabVarArr[i21];
            if (zzaabVar != null) {
                int[] iArr5 = zzaabVar.zzb;
                int length = iArr5.length;
                if (length == 0) {
                    i = i21;
                    i21 = i + 1;
                    i20 = 2;
                } else {
                    if (length == 1) {
                        zza = new zzaad(zzaabVar.zza, iArr5[0], 0, 0, null);
                        i = i21;
                    } else {
                        i = i21;
                        zza = zzytVar.zza(zzaabVar.zza, iArr5, 0, zzt, (zzguf) zzd.get(i21));
                    }
                    zzaacVarArr[i] = zza;
                }
            } else {
                i = i21;
            }
            i21 = i + 1;
            i20 = 2;
        }
        zzmo[] zzmoVarArr = new zzmo[i20];
        for (int i22 = 0; i22 < i20; i22++) {
            zzmoVarArr[i22] = (zzzlVar.zza(i22) || zzzlVar.zzI.contains(Integer.valueOf(zzaafVar.zza(i22))) || (zzaafVar.zza(i22) != -2 && zzaacVarArr[i22] == null)) ? null : zzmo.zza;
        }
        return Pair.create(zzmoVarArr, zzaacVarArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final /* synthetic */ boolean zzk(zzzl zzzlVar, zzv zzvVar) {
        zzzp zzzpVar;
        zzzp zzzpVar2;
        if (!zzzlVar.zzU) {
            return true;
        }
        Boolean bool = this.zzi;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        int i = zzvVar.zzG;
        char c = 65535;
        if (i == -1 || i <= 2) {
            return true;
        }
        String str = zzvVar.zzo;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals("audio/eac3-joc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 187078296:
                    if (str.equals("audio/ac3")) {
                        c = 0;
                        break;
                    }
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1504578661:
                    if (str.equals("audio/eac3")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if ((c == 0 || c == 1 || c == 2 || c == 3) && (Build.VERSION.SDK_INT < 32 || (zzzpVar2 = this.zzg) == null || !zzzpVar2.zza())) {
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null && zzzpVar.zza() && zzzpVar.zzb() && this.zzg.zzc()) {
            return this.zzg.zzd(this.zzh, zzvVar);
        }
        return false;
    }
}
