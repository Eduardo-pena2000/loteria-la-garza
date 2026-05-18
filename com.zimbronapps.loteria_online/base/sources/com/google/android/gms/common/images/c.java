package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.r;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class c extends d {
    public final WeakReference c;

    public c(ImageManager.a aVar, Uri uri) {
        super(uri, 0);
        com.google.android.gms.common.internal.c.c(aVar);
        this.c = new WeakReference(aVar);
    }

    public final void a(Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageManager.a aVar;
        if (z2 || (aVar = (ImageManager.a) this.c.get()) == null) {
            return;
        }
        aVar.a(this.a.a, drawable, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        ImageManager.a aVar = (ImageManager.a) this.c.get();
        ImageManager.a aVar2 = (ImageManager.a) cVar.c.get();
        return aVar2 != null && aVar != null && r.b(aVar2, aVar) && r.b(cVar.a, this.a);
    }

    public final int hashCode() {
        return r.c(this.a);
    }
}
