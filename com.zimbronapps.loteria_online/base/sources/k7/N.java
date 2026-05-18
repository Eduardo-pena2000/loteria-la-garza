package k7;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public enum n {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    public final char a;

    n(char c) {
        this.a = c;
    }

    public static n a(char c) {
        for (n nVar : values()) {
            if (nVar.a == c) {
                return nVar;
            }
        }
        return UNSET;
    }

    public final /* synthetic */ char b() {
        return this.a;
    }
}
