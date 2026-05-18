package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class a implements DynamiteModule.b {
    public final DynamiteModule.b.b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.b bVar = new DynamiteModule.b.b();
        int b = aVar.b(context, str);
        bVar.a = b;
        bVar.c = b != 0 ? -1 : 0;
        return bVar;
    }
}
