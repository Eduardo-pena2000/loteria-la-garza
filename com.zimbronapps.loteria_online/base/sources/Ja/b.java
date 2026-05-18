package ja;

import com.google.firebase.auth.FirebaseAuth;
import da.c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class b implements c.d {
    public final FirebaseAuth a;
    public FirebaseAuth.a b;

    public b(FirebaseAuth firebaseAuth) {
        this.a = firebaseAuth;
    }

    public static /* synthetic */ void a(AtomicBoolean atomicBoolean, Map map, c.b bVar, FirebaseAuth firebaseAuth) {
        b(atomicBoolean, map, bVar, firebaseAuth);
    }

    public static /* synthetic */ void b(AtomicBoolean atomicBoolean, Map map, c.b bVar, FirebaseAuth firebaseAuth) {
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            return;
        }
        J7.A j = firebaseAuth.j();
        if (j == null) {
            map.put("user", (Object) null);
        } else {
            map.put("user", c1.c(c1.j(j)));
        }
        bVar.a(map);
    }

    public void i(Object obj) {
        FirebaseAuth.a aVar = this.b;
        if (aVar != null) {
            this.a.q(aVar);
            this.b = null;
        }
    }

    public void k(Object obj, c.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.a.i().q());
        a aVar = new a(new AtomicBoolean(true), hashMap, bVar);
        this.b = aVar;
        this.a.a(aVar);
    }
}
