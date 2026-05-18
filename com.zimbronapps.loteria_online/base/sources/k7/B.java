package K7;

import android.app.Activity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class b implements OnCompleteListener {
    public /* synthetic */ C a;
    public /* synthetic */ TaskCompletionSource b;
    public /* synthetic */ FirebaseAuth c;
    public /* synthetic */ RecaptchaAction d;
    public /* synthetic */ String e;
    public /* synthetic */ Activity f;
    public /* synthetic */ boolean g;
    public /* synthetic */ boolean h;
    public /* synthetic */ j0 i;

    public /* synthetic */ b(C c, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, RecaptchaAction recaptchaAction, String str, Activity activity, boolean z, boolean z2, j0 j0Var) {
        this.a = c;
        this.b = taskCompletionSource;
        this.c = firebaseAuth;
        this.d = recaptchaAction;
        this.e = str;
        this.f = activity;
        this.g = z;
        this.h = z2;
        this.i = j0Var;
    }

    public final void onComplete(Task task) {
        C.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, task);
    }
}
