package V9;

import V9.c;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Size;
import java.io.IOException;
import java.nio.ByteBuffer;
import v0.M0;
import v0.O0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class k implements d {
    public final c.a a;

    public k(c.a aVar) {
        this.a = aVar;
    }

    public static /* synthetic */ void b(k kVar, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        kVar.c(imageDecoder, imageInfo, source);
    }

    public Bitmap a(ByteBuffer byteBuffer, p pVar) {
        try {
            return f.a(e.a(byteBuffer), new j(this));
        } catch (IOException e) {
            Q9.b.c("FlutterImageDecoderImplDefault", "Failed to decode image", e);
            return null;
        }
    }

    public final /* synthetic */ void c(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        g.a(imageDecoder, O0.a(M0.a()));
        h.a(imageDecoder, 1);
        if (this.a != null) {
            Size a = i.a(imageInfo);
            this.a.a(a.getWidth(), a.getHeight());
        }
    }
}
