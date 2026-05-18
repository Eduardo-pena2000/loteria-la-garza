package com.google.android.gms.internal.games_v2;

import T6.J;
import T6.h;
import android.content.Context;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzd extends g {
    public zzd(Context context, J j) {
        super(context, h.f, j, g.a.c);
    }

    public final f.a createClientSettingsBuilder() {
        f.a createClientSettingsBuilder = super.createClientSettingsBuilder();
        if (getApiOptions() != null) {
            String str = getApiOptions().l;
        }
        return createClientSettingsBuilder;
    }
}
