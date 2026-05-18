package com.google.firebase.auth;

import J7.S;
import K7.C;
import K7.o;
import K7.q0;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.firebase-auth-api.zzac;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.b;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class f implements OnCompleteListener {
    public final /* synthetic */ a a;
    public final /* synthetic */ String b;
    public final /* synthetic */ FirebaseAuth c;

    public f(FirebaseAuth firebaseAuth, a aVar, String str) {
        this.a = aVar;
        this.b = str;
        Objects.requireNonNull(firebaseAuth);
        this.c = firebaseAuth;
    }

    public final void onComplete(Task task) {
        CharSequence d;
        String b;
        String c;
        if (task.isSuccessful()) {
            d = ((q0) task.getResult()).d();
            b = ((q0) task.getResult()).b();
            c = ((q0) task.getResult()).c();
        } else {
            Exception exception = task.getException();
            String str = "Error while validating application identity: ";
            if (exception != null) {
                str = "Error while validating application identity: " + exception.getMessage();
            }
            Log.e("FirebaseAuth", str);
            if (exception != null && C.i(exception)) {
                FirebaseAuth.d0((B7.m) exception, this.a, this.b);
                return;
            }
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            c = null;
            d = null;
            b = null;
        }
        long longValue = this.a.i().longValue();
        b.b a0 = FirebaseAuth.a0(this.c, this.a.j(), this.a.g());
        if (TextUtils.isEmpty(d)) {
            a0 = this.c.b0(this.a, a0, (q0) task.getResult());
        }
        b.b bVar = a0;
        o oVar = (o) t.l(this.a.e());
        if (zzac.zzc(c) && this.c.m0() != null && this.c.m0().d("PHONE_PROVIDER")) {
            c = "NO_RECAPTCHA";
        }
        String str2 = c;
        if (oVar.zzd()) {
            this.c.e.zza(oVar, (String) t.l(this.a.j()), FirebaseAuth.w0(this.c), longValue, this.a.f() != null, this.a.m(), (String) d, b, str2, this.c.D0(), bVar, this.a.k(), this.a.a());
        } else {
            this.c.e.zza(oVar, (S) t.l(this.a.h()), FirebaseAuth.w0(this.c), longValue, this.a.f() != null, this.a.m(), (String) d, b, str2, this.c.D0(), bVar, this.a.k(), this.a.a());
        }
    }
}
