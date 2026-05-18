package s8;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import s8.k0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class h0 extends Binder {
    public final a a;

    public interface a {
        Task a(Intent intent);
    }

    public h0(a aVar) {
        this.a = aVar;
    }

    public static /* synthetic */ void a(k0.a aVar, Task task) {
        b(aVar, task);
    }

    public static /* synthetic */ void b(k0.a aVar, Task task) {
        aVar.d();
    }

    public void c(k0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.a.a(aVar.a).addOnCompleteListener((Executor) new c4.k(), (OnCompleteListener) new g0(aVar));
    }
}
