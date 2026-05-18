package Y4;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class d {
    public static /* bridge */ /* synthetic */ AssetFileDescriptor a(ContentResolver contentResolver, Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) {
        return contentResolver.openTypedAssetFile(uri, str, bundle, cancellationSignal);
    }
}
