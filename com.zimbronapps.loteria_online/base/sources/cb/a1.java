package cb;

import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class a1 extends CancellationException {
    public final transient B0 a;

    public a1(String str, B0 b0) {
        super(str);
        this.a = b0;
    }

    public a1(String str) {
        this(str, null);
    }
}
