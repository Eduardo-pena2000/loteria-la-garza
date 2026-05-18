package R2;

import java.io.IOException;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s extends q {
    public final int d;
    public final String e;
    public final Map f;
    public final byte[] g;

    public s(int i, String str, IOException iOException, Map map, j jVar, byte[] bArr) {
        super("Response code: " + i, iOException, jVar, 2004, 1);
        this.d = i;
        this.e = str;
        this.f = map;
        this.g = bArr;
    }
}
