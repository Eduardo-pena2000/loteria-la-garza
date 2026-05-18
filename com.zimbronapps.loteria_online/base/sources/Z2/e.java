package Z2;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e {
    public final LinkedHashMap a;

    public class a extends LinkedHashMap {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, float f, boolean z, int i2) {
            super(i, f, z);
            this.a = i2;
        }

        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > this.a;
        }
    }

    public e(int i) {
        this.a = new a(i + 1, 1.0f, false, i);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return (byte[]) this.a.put((Uri) P2.a.e(uri), (byte[]) P2.a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return (byte[]) this.a.remove(P2.a.e(uri));
    }
}
