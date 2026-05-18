package p5;

import com.applovin.shadow.okhttp3.internal.Util;
import java.util.concurrent.ThreadFactory;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class a implements ThreadFactory {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ a(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final Thread newThread(Runnable runnable) {
        return Util.b(this.a, this.b, runnable);
    }
}
