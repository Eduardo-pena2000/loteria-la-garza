package J7;

import com.google.android.gms.internal.firebase-auth-api.zzac;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class f0 implements Continuation {
    public f0(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
    }

    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(null);
        }
        Exception exception = task.getException();
        return Tasks.forException(new q("INTERNAL_ERROR", zzac.zzb(exception != null ? exception.getMessage() : "")));
    }
}
