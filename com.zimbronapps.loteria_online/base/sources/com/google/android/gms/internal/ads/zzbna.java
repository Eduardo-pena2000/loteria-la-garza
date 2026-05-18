package com.google.android.gms.internal.ads;

import V5.o0;
import android.text.TextUtils;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbna implements zzboh {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");
    private static final Pattern zzb = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                int i = o0.b;
                W5.p.f("No label given for CSI tick.");
                return;
            }
            zzbgv zzbgvVar = zzbhe.zzcG;
            if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue() && !zza.matcher(str2).matches()) {
                int i2 = o0.b;
                W5.p.a("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                int i3 = o0.b;
                W5.p.f("No timestamp given for CSI tick.");
                return;
            }
            try {
                long b = R5.t.o().b() + (Long.parseLong(str4) - R5.t.o().a());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                if (!((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue() || zza.matcher(str3).matches()) {
                    zzcjlVar.zzq().zzb(str2, str3, b);
                    return;
                } else {
                    int i4 = o0.b;
                    W5.p.a("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            } catch (NumberFormatException e) {
                int i5 = o0.b;
                W5.p.g("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                int i6 = o0.b;
                W5.p.f("No value given for CSI experiment.");
                return;
            }
            if (!((Boolean) S5.D.c().zzd(zzbhe.zzcG)).booleanValue() || zzb.matcher(str5).matches()) {
                zzcjlVar.zzq().zzc().zzd("e", str5);
                return;
            } else {
                int i7 = o0.b;
                W5.p.a("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                int i8 = o0.b;
                W5.p.f("No value given for CSI extra.");
                return;
            }
            if (TextUtils.isEmpty(str6)) {
                int i9 = o0.b;
                W5.p.f("No name given for CSI extra.");
                return;
            }
            if (!((Boolean) S5.D.c().zzd(zzbhe.zzcG)).booleanValue() || zza.matcher(str6).matches()) {
                zzcjlVar.zzq().zzc().zzd(str6, str7);
            } else {
                int i10 = o0.b;
                W5.p.a("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            }
        }
    }
}
