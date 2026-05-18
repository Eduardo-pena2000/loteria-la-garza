package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class a implements Runnable {
    public final d a;
    public final /* synthetic */ ImageManager b;

    public a(ImageManager imageManager, d dVar) {
        this.b = imageManager;
        this.a = dVar;
    }

    public final void run() {
        com.google.android.gms.common.internal.c.a("LoadImageRunnable must be executed on the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) ImageManager.i(this.b).get(this.a);
        if (imageReceiver != null) {
            ImageManager imageManager = this.b;
            ImageManager.i(imageManager).remove(this.a);
            imageReceiver.d(this.a);
        }
        d dVar = this.a;
        x6.b bVar = dVar.a;
        Uri uri = bVar.a;
        if (uri == null) {
            ImageManager imageManager2 = this.b;
            dVar.b(ImageManager.c(imageManager2), ImageManager.e(imageManager2), true);
            return;
        }
        Long l = (Long) ImageManager.h(this.b).get(uri);
        if (l != null) {
            if (SystemClock.elapsedRealtime() - l.longValue() < 3600000) {
                d dVar2 = this.a;
                ImageManager imageManager3 = this.b;
                dVar2.b(ImageManager.c(imageManager3), ImageManager.e(imageManager3), true);
                return;
            } else {
                ImageManager imageManager4 = this.b;
                ImageManager.h(imageManager4).remove(bVar.a);
            }
        }
        this.a.a(null, false, true, false);
        ImageManager imageManager5 = this.b;
        ImageManager.ImageReceiver imageReceiver2 = (ImageManager.ImageReceiver) ImageManager.j(imageManager5).get(bVar.a);
        if (imageReceiver2 == null) {
            ImageManager.ImageReceiver imageReceiver3 = new ImageManager.ImageReceiver(this.b, bVar.a);
            ImageManager imageManager6 = this.b;
            ImageManager.j(imageManager6).put(bVar.a, imageReceiver3);
            imageReceiver2 = imageReceiver3;
        }
        imageReceiver2.c(this.a);
        d dVar3 = this.a;
        if (!(dVar3 instanceof c)) {
            ImageManager.i(this.b).put(dVar3, imageReceiver2);
        }
        synchronized (ImageManager.f()) {
            try {
                if (!ImageManager.g().contains(bVar.a)) {
                    ImageManager.g().add(bVar.a);
                    imageReceiver2.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
