package J7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class k0 implements Continuation {
    public final /* synthetic */ A a;

    public k0(A a) {
        Objects.requireNonNull(a);
        this.a = a;
    }

    public final /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.a.h2()).K(null, (String) com.google.android.gms.common.internal.t.l(((C) task.getResult()).g()));
    }
}
