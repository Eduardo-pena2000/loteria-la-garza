package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class w {
    public final Resources a;
    public final String b;

    public w(Context context) {
        t.l(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(v6.n.a);
    }

    public String a(String str) {
        String str2 = this.b;
        Resources resources = this.a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
