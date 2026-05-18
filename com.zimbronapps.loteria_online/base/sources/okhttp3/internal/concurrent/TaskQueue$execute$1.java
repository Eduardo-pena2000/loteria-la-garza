package okhttp3.internal.concurrent;

import Qa.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TaskQueue$execute$1 extends Task {
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(String str, boolean z, a aVar) {
        super(str, z);
        this.e = str;
        this.f = z;
        this.g = aVar;
    }

    public long f() {
        this.g.invoke();
        return -1L;
    }
}
