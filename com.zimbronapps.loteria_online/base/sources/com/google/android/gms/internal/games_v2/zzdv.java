package com.google.android.gms.internal.games_v2;

import T6.n;
import W6.k;
import android.content.Intent;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzdv implements r {
    public final /* synthetic */ n zza;

    public /* synthetic */ zzdv(n nVar) {
        this.zza = nVar;
    }

    public final void accept(Object obj, Object obj2) {
        Intent N1 = ((k) obj).getService().N1(new PlayerEntity(this.zza));
        N1.setExtrasClassLoader(PlayerEntity.class.getClassLoader());
        ((TaskCompletionSource) obj2).setResult(N1);
    }
}
