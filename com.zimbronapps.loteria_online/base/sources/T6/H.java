package T6;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class h {
    public static final a.g a;
    public static final a.a b;
    public static final a.a c;
    public static final Scope d;
    public static final Scope e;
    public static final com.google.android.gms.common.api.a f;
    public static final Scope g;

    static {
        a.g gVar = new a.g();
        a = gVar;
        C c2 = new C();
        b = c2;
        D d2 = new D();
        c = d2;
        d = new Scope("https://www.googleapis.com/auth/games");
        e = new Scope("https://www.googleapis.com/auth/games_lite");
        new Scope("https://www.googleapis.com/auth/drive.appdata");
        f = new com.google.android.gms.common.api.a("Games.API", c2, gVar);
        g = new Scope("https://www.googleapis.com/auth/games.firstparty");
        new com.google.android.gms.common.api.a("Games.API_1P", d2, gVar);
    }
}
