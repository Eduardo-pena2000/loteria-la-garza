package J7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class j0 implements Continuation {
    public final /* synthetic */ e a;
    public final /* synthetic */ A b;

    public j0(A a, e eVar) {
        this.a = eVar;
        Objects.requireNonNull(a);
        this.b = a;
    }

    public final /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.b.h2()).K(this.a, (String) com.google.android.gms.common.internal.t.l(((C) task.getResult()).g()));
    }
}
