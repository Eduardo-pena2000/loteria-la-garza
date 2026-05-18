package x6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.c;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class a implements Runnable {
    public final Uri a;
    public final ParcelFileDescriptor b;
    public final /* synthetic */ ImageManager c;

    public a(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.c = imageManager;
        this.a = uri;
        this.b = parcelFileDescriptor;
    }

    public final void run() {
        c.b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        Bitmap bitmap = null;
        boolean z = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmap = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError e) {
                Log.e("ImageManager", "OOM while loading bitmap for uri: ".concat(String.valueOf(this.a)), e);
                z = true;
            }
            try {
                this.b.close();
            } catch (IOException e2) {
                Log.e("ImageManager", "closed failed", e2);
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.c;
        ImageManager.d(imageManager).post(new com.google.android.gms.common.images.b(imageManager, this.a, bitmap, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Log.w("ImageManager", "Latch interrupted while posting ".concat(String.valueOf(this.a)));
        }
    }
}
