package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.base.zam;
import com.google.android.gms.internal.base.zat;
import com.google.android.gms.internal.base.zau;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class ImageManager {
    public static final Object h = new Object();
    public static final HashSet i = new HashSet();
    public static ImageManager j;
    public final Context a;
    public final Handler b = new zau(Looper.getMainLooper());
    public final ExecutorService c = zat.zaa().zab(4, 2);
    public final zam d = new zam();
    public final Map e = new HashMap();
    public final Map f = new HashMap();
    public final Map g = new HashMap();

    @KeepName
    public final class ImageReceiver extends ResultReceiver {
        public final Uri a;
        public final ArrayList b;

        public ImageReceiver(Uri uri) {
            super(new zau(Looper.getMainLooper()));
            this.a = uri;
            this.b = new ArrayList();
        }

        public static /* bridge */ /* synthetic */ ArrayList b(ImageReceiver imageReceiver) {
            return imageReceiver.b;
        }

        public final void c(d dVar) {
            com.google.android.gms.common.internal.c.a("ImageReceiver.addImageRequest() must be called in the main thread");
            this.b.add(dVar);
        }

        public final void d(d dVar) {
            com.google.android.gms.common.internal.c.a("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.b.remove(dVar);
        }

        public final void i() {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.setPackage("com.google.android.gms");
            intent.putExtra("com.google.android.gms.extras.uri", this.a);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            ImageManager.c(ImageManager.this).sendBroadcast(intent);
        }

        public final void onReceiveResult(int i, Bundle bundle) {
            ParcelFileDescriptor parcelable = bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager imageManager = ImageManager.this;
            ImageManager.k(imageManager).execute(new x6.a(imageManager, this.a, parcelable));
        }
    }

    public interface a {
        void a(Uri uri, Drawable drawable, boolean z);
    }

    public ImageManager(Context context, boolean z) {
        this.a = context.getApplicationContext();
    }

    public static ImageManager a(Context context) {
        if (j == null) {
            j = new ImageManager(context, false);
        }
        return j;
    }

    public static /* bridge */ /* synthetic */ Context c(ImageManager imageManager) {
        return imageManager.a;
    }

    public static /* bridge */ /* synthetic */ Handler d(ImageManager imageManager) {
        return imageManager.b;
    }

    public static /* bridge */ /* synthetic */ zam e(ImageManager imageManager) {
        return imageManager.d;
    }

    public static /* bridge */ /* synthetic */ Object f() {
        return h;
    }

    public static /* bridge */ /* synthetic */ HashSet g() {
        return i;
    }

    public static /* bridge */ /* synthetic */ Map h(ImageManager imageManager) {
        return imageManager.g;
    }

    public static /* bridge */ /* synthetic */ Map i(ImageManager imageManager) {
        return imageManager.e;
    }

    public static /* bridge */ /* synthetic */ Map j(ImageManager imageManager) {
        return imageManager.f;
    }

    public static /* bridge */ /* synthetic */ ExecutorService k(ImageManager imageManager) {
        return imageManager.c;
    }

    public void b(a aVar, Uri uri) {
        l(new c(aVar, uri));
    }

    public final void l(d dVar) {
        com.google.android.gms.common.internal.c.a("ImageManager.loadImage() must be called in the main thread");
        new com.google.android.gms.common.images.a(this, dVar).run();
    }
}
