package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzank implements zzamf {
    private final zzer zza = new zzer();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzank(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = "sans-serif";
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(zzfj.zzj(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.zzg = i;
        boolean z = (bArr[0] & 32) != 0;
        this.zzb = z;
        if (z) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 != 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                    z = false;
                }
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            } else {
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zza(byte[] bArr, int i, int i2, zzame zzameVar, zzdr zzdrVar) {
        String zzK;
        int i3;
        int i4;
        int i5;
        int i6;
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i + i2);
        zzerVar.zzh(i);
        int i7 = 1;
        int i8 = 0;
        int i9 = 2;
        zzgrc.zza(zzerVar.zzd() >= 2);
        int zzt = zzerVar.zzt();
        if (zzt == 0) {
            zzK = "";
        } else {
            int zzg = zzerVar.zzg();
            Charset zzR = zzerVar.zzR();
            int zzg2 = zzerVar.zzg() - zzg;
            if (zzR == null) {
                zzR = StandardCharsets.UTF_8;
            }
            zzK = zzerVar.zzK(zzt - zzg2, zzR);
        }
        if (zzK.isEmpty()) {
            zzdrVar.zza(new zzalx(zzguf.zzi(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        CharSequence spannableStringBuilder = new SpannableStringBuilder(zzK);
        int i10 = this.zzc;
        zzb(spannableStringBuilder, i10, 0, 0, spannableStringBuilder.length(), 16711680);
        int i11 = this.zzd;
        zzc(spannableStringBuilder, i11, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.zzf;
        while (zzerVar.zzd() >= 8) {
            int zzg3 = zzerVar.zzg();
            int zzB = zzerVar.zzB();
            int zzB2 = zzerVar.zzB();
            if (zzB2 == 1937013100) {
                zzgrc.zza(zzerVar.zzd() >= i9 ? i7 : i8);
                int zzt2 = zzerVar.zzt();
                int i12 = i8;
                while (i12 < zzt2) {
                    zzgrc.zza(zzerVar.zzd() >= 12 ? i7 : i8);
                    int zzt3 = zzerVar.zzt();
                    int zzt4 = zzerVar.zzt();
                    zzerVar.zzk(i9);
                    int zzs = zzerVar.zzs();
                    zzerVar.zzk(i7);
                    int zzB3 = zzerVar.zzB();
                    if (zzt4 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        i5 = zzt2;
                        StringBuilder sb = new StringBuilder(String.valueOf(zzt4).length() + 44 + String.valueOf(length2).length() + 2);
                        sb.append("Truncating styl end (");
                        sb.append(zzt4);
                        sb.append(") to cueText.length() (");
                        sb.append(length2);
                        sb.append(").");
                        zzee.zzc("Tx3gParser", sb.toString());
                        i6 = spannableStringBuilder.length();
                    } else {
                        i5 = zzt2;
                        i6 = zzt4;
                    }
                    if (zzt3 >= i6) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(zzt3).length() + 36 + String.valueOf(i6).length() + 2);
                        sb2.append("Ignoring styl with start (");
                        sb2.append(zzt3);
                        sb2.append(") >= end (");
                        sb2.append(i6);
                        sb2.append(").");
                        zzee.zzc("Tx3gParser", sb2.toString());
                    } else {
                        int i13 = i6;
                        zzb(spannableStringBuilder, zzs, i10, zzt3, i13, 0);
                        zzc(spannableStringBuilder, zzB3, i11, zzt3, i13, 0);
                    }
                    i12++;
                    zzt2 = i5;
                    i7 = 1;
                    i8 = 0;
                    i9 = 2;
                }
                i3 = i7;
                i4 = i9;
            } else {
                i3 = i7;
                if (zzB2 == 1952608120 && this.zzb) {
                    i4 = 2;
                    zzgrc.zza(zzerVar.zzd() >= 2 ? i3 : 0);
                    float zzt5 = zzerVar.zzt();
                    int i14 = this.zzg;
                    String str2 = zzfj.zza;
                    f = Math.max(0.0f, Math.min(zzt5 / i14, 0.95f));
                } else {
                    i4 = 2;
                }
            }
            zzerVar.zzh(zzg3 + zzB);
            i7 = i3;
            i9 = i4;
            i8 = 0;
        }
        zzcw zzcwVar = new zzcw();
        zzcwVar.zza(spannableStringBuilder);
        zzcwVar.zzf(f, 0);
        zzcwVar.zzg(0);
        zzdrVar.zza(new zzalx(zzguf.zzj(zzcwVar.zzr()), -9223372036854775807L, -9223372036854775807L));
    }
}
