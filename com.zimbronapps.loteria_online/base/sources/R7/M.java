package r7;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class m implements l {
    public static final m b = new m(null);
    public final Object a;

    public m(Object obj) {
        this.a = obj;
    }

    public static l b(Object obj) {
        if (obj != null) {
            return new m(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public final Object a() {
        return this.a;
    }
}
