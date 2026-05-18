package V9;

import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaFormat;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class o {
    public static MediaExtractor a(byte[] bArr) {
        a aVar = new a(bArr);
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(aVar);
        return mediaExtractor;
    }

    public static void b(byte[] bArr, p pVar) {
        try {
            c(bArr, pVar, a(bArr));
        } catch (Exception e) {
            Q9.b.c("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e);
        }
    }

    public static void c(byte[] bArr, p pVar, MediaExtractor mediaExtractor) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("image/")) {
                    int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                    int i2 = pVar.g;
                    int i3 = pVar.f;
                    if (integer != 90 && integer != 270) {
                        i3 = i2;
                        i2 = i3;
                    }
                    pVar.b = i2;
                    pVar.a = i3;
                    pVar.c = integer;
                    return;
                }
            }
        } catch (Exception e) {
            Q9.b.c("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e);
        }
    }

    public class a extends MediaDataSource {
        public final /* synthetic */ byte[] a;

        public a(byte[] bArr) {
            this.a = bArr;
        }

        public long getSize() {
            return this.a.length;
        }

        public int readAt(long j, byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.a;
            if (j >= bArr2.length) {
                return -1;
            }
            if (i2 + j > bArr2.length) {
                i2 = (int) (bArr2.length - j);
            }
            System.arraycopy(bArr2, (int) j, bArr, i, i2);
            return i2;
        }

        public void close() {
        }
    }
}
