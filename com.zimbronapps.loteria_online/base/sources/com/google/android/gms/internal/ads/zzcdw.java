package com.google.android.gms.internal.ads;

import S5.l2;
import V5.o0;
import V5.q0;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.applovin.impl.H3;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcdw {
    final String zzf;
    private final q0 zzl;
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    private final Object zzj = new Object();
    private final Object zzk = new Object();
    int zzg = 0;
    int zzh = 0;
    int zzi = 0;
    private int zzm = 0;
    private final Map zzn = new HashMap();
    private final Map zzo = new HashMap();

    public zzcdw(String str, q0 q0Var) {
        this.zzf = str;
        this.zzl = q0Var;
    }

    private final void zzj() {
        if (((Boolean) zzbjl.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final void zza() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzb() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }

    public final int zzd() {
        int i;
        synchronized (this.zzj) {
            i = this.zzi;
        }
        return i;
    }

    public final void zze(l2 l2Var, long j) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                q0 q0Var = this.zzl;
                long zzm = q0Var.zzm();
                long a = R5.t.o().a();
                if (this.zzb == -1) {
                    if (a - zzm > ((Long) S5.D.c().zzd(zzbhe.zzbB)).longValue()) {
                        this.zzd = -1;
                    } else {
                        this.zzd = q0Var.zzo();
                    }
                    this.zzb = j;
                    this.zza = j;
                } else {
                    this.zza = j;
                }
                if (((Boolean) S5.D.c().zzd(zzbhe.zzew)).booleanValue() || (bundle = l2Var.c) == null || bundle.getInt("gw", 2) != 1) {
                    this.zzc++;
                    int i = this.zzd + 1;
                    this.zzd = i;
                    if (i == 0) {
                        this.zze = 0L;
                        q0Var.m(a);
                    } else {
                        this.zze = a - q0Var.zzq();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf() {
        zzj();
    }

    public final void zzg() {
        zzj();
    }

    public final Bundle zzh(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                bundle = new Bundle();
                if (!this.zzl.zzx()) {
                    bundle.putString("session_id", this.zzf);
                }
                bundle.putLong("basets", this.zzb);
                bundle.putLong("currts", this.zza);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.zzc);
                bundle.putInt("preqs_in_session", this.zzd);
                bundle.putLong("time_in_session", this.zze);
                bundle.putInt("pclick", this.zzg);
                bundle.putInt("pimp", this.zzh);
                Context zza = zzcae.zza(context);
                int identifier = zza.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z = false;
                if (identifier == 0) {
                    int i = o0.b;
                    W5.p.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == zza.getPackageManager().getActivityInfo(new ComponentName(zza.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z = true;
                        } else {
                            int i2 = o0.b;
                            W5.p.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        int i3 = o0.b;
                        W5.p.f("Fail to fetch AdActivity theme");
                        W5.p.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z);
                bundle.putInt("consent_form_action_identifier", zzd());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final zzcdv zzi(Set set, String str) {
        synchronized (this.zzk) {
            try {
                int i = this.zzm;
                this.zzm = i + 1;
                if (set.isEmpty()) {
                    return new zzcdv(i, -1, -1);
                }
                String a = H3.a(",", new TreeSet(set));
                Map map = this.zzn;
                Integer num = (Integer) map.get(a);
                int i2 = 0;
                int intValue = num == null ? 0 : num.intValue();
                map.put(a, Integer.valueOf(intValue + 1));
                if (str == null) {
                    return new zzcdv(i, intValue, -1);
                }
                StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(a).length());
                sb.append(str);
                sb.append("|");
                sb.append(a);
                String sb2 = sb.toString();
                Map map2 = this.zzo;
                Integer num2 = (Integer) map2.get(sb2);
                if (num2 != null) {
                    i2 = num2.intValue();
                }
                map2.put(sb2, Integer.valueOf(i2 + 1));
                return new zzcdv(i, intValue, i2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
