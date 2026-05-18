package V9;

import android.graphics.ImageDecoder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class j implements ImageDecoder.OnHeaderDecodedListener {
    public final /* synthetic */ k a;

    public /* synthetic */ j(k kVar) {
        this.a = kVar;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        k.b(this.a, imageDecoder, imageInfo, source);
    }
}
