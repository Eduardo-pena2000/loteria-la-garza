package ja;

import com.google.android.gms.tasks.Task;
import ja.c0;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class a0 implements c0.j {
    public static final Map a = new HashMap();

    public static /* synthetic */ void m(c0.F f, Task task) {
        n(f, task);
    }

    public static /* synthetic */ void n(c0.F f, Task task) {
        if (!task.isSuccessful()) {
            f.b(w.e(task.getException()));
            return;
        }
        J7.Z z = (J7.Z) task.getResult();
        a.put(z.d(), z);
        f.a(new c0.z.a().b(Long.valueOf(z.h())).c(Long.valueOf(z.b())).f(z.d()).e(z.a()).d(Long.valueOf(z.g())).a());
    }

    public void f(String str, String str2, c0.F f) {
        J7.W c = J7.X.c(str, str2);
        String uuid = UUID.randomUUID().toString();
        Y.d.put(uuid, c);
        f.a(uuid);
    }

    public void j(String str, c0.F f) {
        J7.X.a((J7.L) Y.b.get(str)).addOnCompleteListener(new Z(f));
    }

    public void l(String str, String str2, c0.F f) {
        J7.W b = J7.X.b((J7.Z) a.get(str), str2);
        String uuid = UUID.randomUUID().toString();
        Y.d.put(uuid, b);
        f.a(uuid);
    }
}
