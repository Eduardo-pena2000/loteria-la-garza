package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b implements Runnable {
    public final Uri a;
    public final Bitmap b;
    public final CountDownLatch c;
    public final /* synthetic */ ImageManager d;

    public b(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.d = imageManager;
        this.a = uri;
        this.b = bitmap;
        this.c = countDownLatch;
    }

    public final void run() {
        com.google.android.gms.common.internal.c.a("OnBitmapLoadedRunnable must be executed in the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) ImageManager.j(this.d).remove(this.a);
        if (imageReceiver != null) {
            ArrayList b = ImageManager.ImageReceiver.b(imageReceiver);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                d dVar = (d) b.get(i);
                Bitmap bitmap = this.b;
                if (bitmap != null) {
                    dVar.c(ImageManager.c(this.d), bitmap, false);
                } else {
                    ImageManager.h(this.d).put(this.a, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager = this.d;
                    dVar.b(ImageManager.c(imageManager), ImageManager.e(imageManager), false);
                }
                if (!(dVar instanceof c)) {
                    ImageManager.i(this.d).remove(dVar);
                }
            }
        }
        this.c.countDown();
        synchronized (ImageManager.f()) {
            ImageManager.g().remove(this.a);
        }
    }
}
