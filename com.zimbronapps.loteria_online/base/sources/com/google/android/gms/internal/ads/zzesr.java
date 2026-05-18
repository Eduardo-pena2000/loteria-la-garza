package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzesr implements zzfax {
    private final zzgzy zza;
    private final Context zzb;
    private final zzfjk zzc;
    private final View zzd;

    public zzesr(zzgzy zzgzyVar, Context context, zzfjk zzfjkVar, ViewGroup viewGroup) {
        this.zza = zzgzyVar;
        this.zzb = context;
        this.zzc = zzfjkVar;
        this.zzd = viewGroup;
    }

    public final x7.e zza() {
        zzbhe.zza(this.zzb);
        return this.zza.submit(new zzesq(this));
    }

    public final int zzb() {
        return 3;
    }

    public final /* synthetic */ zzess zzc() {
        ArrayList arrayList = new ArrayList();
        View view = this.zzd;
        while (view != null) {
            ViewGroup parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? parent.indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzess(this.zzb, this.zzc.zzf, arrayList);
    }
}
