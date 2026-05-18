package com.unity3d.ads.core.data.datasource;

import Qa.l;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class a implements OnSuccessListener {
    public final /* synthetic */ l a;

    public /* synthetic */ a(l lVar) {
        this.a = lVar;
    }

    public final void onSuccess(Object obj) {
        AndroidAppSetIdDataSource.a(this.a, obj);
    }
}
