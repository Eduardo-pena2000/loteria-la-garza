package ja;

import android.app.Activity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.a;
import com.google.firebase.auth.b;
import da.c;
import ja.c0;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class b1 implements c.d {
    public static final HashMap k = new HashMap();
    public final AtomicReference a;
    public final FirebaseAuth b;
    public final String c;
    public final J7.S d;
    public final int e;
    public final b f;
    public final J7.L g;
    public String h;
    public Integer i;
    public c.b j;

    public class a extends b.b {
        public a() {
        }

        public void onCodeAutoRetrievalTimeOut(String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("verificationId", str);
            hashMap.put("name", "Auth#phoneCodeAutoRetrievalTimeout");
            if (b1.a(b1.this) != null) {
                b1.a(b1.this).a(hashMap);
            }
        }

        public void onCodeSent(String str, b.a aVar) {
            int hashCode = aVar.hashCode();
            b1.b().put(Integer.valueOf(hashCode), aVar);
            HashMap hashMap = new HashMap();
            hashMap.put("verificationId", str);
            hashMap.put("forceResendingToken", Integer.valueOf(hashCode));
            hashMap.put("name", "Auth#phoneCodeSent");
            if (b1.a(b1.this) != null) {
                b1.a(b1.this).a(hashMap);
            }
        }

        public void onVerificationCompleted(J7.O o) {
            int hashCode = o.hashCode();
            b1.this.f.a(o);
            HashMap hashMap = new HashMap();
            hashMap.put("token", Integer.valueOf(hashCode));
            if (o.P1() != null) {
                hashMap.put("smsCode", o.P1());
            }
            hashMap.put("name", "Auth#phoneVerificationCompleted");
            if (b1.a(b1.this) != null) {
                b1.a(b1.this).a(hashMap);
            }
        }

        public void onVerificationFailed(B7.m mVar) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            c0.g e = w.e(mVar);
            hashMap2.put("code", e.a.replaceAll("ERROR_", "").toLowerCase(Locale.ROOT).replaceAll("_", "-"));
            hashMap2.put("message", e.getMessage());
            hashMap2.put("details", e.b);
            hashMap.put("error", hashMap2);
            hashMap.put("name", "Auth#phoneVerificationFailed");
            if (b1.a(b1.this) != null) {
                b1.a(b1.this).a(hashMap);
            }
        }
    }

    public interface b {
        void a(J7.O o);
    }

    public b1(Activity activity, c0.b bVar, c0.E e, J7.L l, J7.S s, b bVar2) {
        AtomicReference atomicReference = new AtomicReference((Object) null);
        this.a = atomicReference;
        atomicReference.set(activity);
        this.g = l;
        this.d = s;
        this.b = v.O0(bVar);
        this.c = e.f();
        this.e = Math.toIntExact(e.g().longValue());
        if (e.b() != null) {
            this.h = e.b();
        }
        if (e.c() != null) {
            this.i = Integer.valueOf(Math.toIntExact(e.c().longValue()));
        }
        this.f = bVar2;
    }

    public static /* bridge */ /* synthetic */ c.b a(b1 b1Var) {
        return b1Var.j;
    }

    public static /* bridge */ /* synthetic */ HashMap b() {
        return k;
    }

    public void i(Object obj) {
        this.j = null;
        this.a.set((Object) null);
    }

    public void k(Object obj, c.b bVar) {
        b.a aVar;
        this.j = bVar;
        a aVar2 = new a();
        if (this.h != null) {
            this.b.l().c(this.c, this.h);
        }
        a.a aVar3 = new a.a(this.b);
        aVar3.b((Activity) this.a.get());
        aVar3.c(aVar2);
        String str = this.c;
        if (str != null) {
            aVar3.g(str);
        }
        J7.L l = this.g;
        if (l != null) {
            aVar3.f(l);
        }
        J7.S s = this.d;
        if (s != null) {
            aVar3.e(s);
        }
        aVar3.h(Long.valueOf(this.e), TimeUnit.MILLISECONDS);
        Integer num = this.i;
        if (num != null && (aVar = (b.a) k.get(num)) != null) {
            aVar3.d(aVar);
        }
        com.google.firebase.auth.b.b(aVar3.a());
    }
}
