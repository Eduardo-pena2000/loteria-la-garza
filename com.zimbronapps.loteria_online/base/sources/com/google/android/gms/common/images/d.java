package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.internal.base.zam;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class d {
    public final x6.b a;
    public int b;

    public d(Uri uri, int i) {
        this.b = 0;
        this.a = new x6.b(uri);
        this.b = i;
    }

    public abstract void a(Drawable drawable, boolean z, boolean z2, boolean z3);

    public final void b(Context context, zam zamVar, boolean z) {
        int i = this.b;
        a(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }

    public final void c(Context context, Bitmap bitmap, boolean z) {
        com.google.android.gms.common.internal.c.c(bitmap);
        a(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
