package x8;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ E6.d a;
    public final /* synthetic */ String b;
    public final /* synthetic */ com.google.firebase.remoteconfig.internal.b c;

    public /* synthetic */ k(E6.d dVar, String str, com.google.firebase.remoteconfig.internal.b bVar) {
        this.a = dVar;
        this.b = str;
        this.c = bVar;
    }

    public final void run() {
        l.a(this.a, this.b, this.c);
    }
}
