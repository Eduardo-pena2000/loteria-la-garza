package J7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class l0 implements Continuation {
    public final /* synthetic */ String a;
    public final /* synthetic */ e b;
    public final /* synthetic */ A c;

    public l0(A a, String str, e eVar) {
        this.a = str;
        this.b = eVar;
        Objects.requireNonNull(a);
        this.c = a;
    }

    public final /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.c.h2()).Y((String) com.google.android.gms.common.internal.t.l(((C) task.getResult()).g()), this.a, this.b);
    }
}
