package A9;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class a extends e6.b {
    public String a;
    public w9.a b;

    public a(String str, w9.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public void onFailure(String str) {
        this.b.b(str);
    }

    public void onSuccess(e6.a aVar) {
        this.b.a(this.a, aVar.b(), aVar);
    }
}
