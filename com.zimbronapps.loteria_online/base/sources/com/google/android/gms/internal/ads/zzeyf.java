package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeyf implements zzfax {
    private final zzgzy zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzeyf(zzgzy zzgzyVar, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzgzyVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    public final x7.e zza() {
        return this.zza.zzc(new zzeye(this));
    }

    public final int zzb() {
        return 22;
    }

    public final /* synthetic */ zzeyg zzc() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgQ)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
            return new zzeyg(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgR)).booleanValue() && this.zzd.contains("native")) {
            Activity activity = this.zzc;
            if (activity instanceof Activity) {
                Activity activity2 = activity;
                Window window = activity2.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        bool = Boolean.valueOf((activity2.getPackageManager().getActivityInfo(activity2.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                return new zzeyg(bool);
            }
        }
        return new zzeyg(null);
    }
}
