package ja;

import com.google.firebase.auth.FirebaseAuth;
import da.c;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class a implements FirebaseAuth.a {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ c.b c;

    public /* synthetic */ a(AtomicBoolean atomicBoolean, Map map, c.b bVar) {
        this.a = atomicBoolean;
        this.b = map;
        this.c = bVar;
    }

    public final void a(FirebaseAuth firebaseAuth) {
        b.a(this.a, this.b, this.c, firebaseAuth);
    }
}
