package va;

import android.media.MediaScannerConnection;
import android.net.Uri;
import va.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class n implements MediaScannerConnection.OnScanCompletedListener {
    public final /* synthetic */ m.f a;

    public /* synthetic */ n(m.f fVar) {
        this.a = fVar;
    }

    public final void onScanCompleted(String str, Uri uri) {
        m.b.c(this.a, str, uri);
    }
}
