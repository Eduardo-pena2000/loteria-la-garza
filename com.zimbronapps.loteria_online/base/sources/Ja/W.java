package ja;

import ja.c0;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class w {
    public static c0.g a() {
        return new c0.g("PROVIDER_ALREADY_LINKED", "User has already been linked to the given provider.", null);
    }

    public static c0.g b() {
        return new c0.g("INVALID_CREDENTIAL", "The supplied auth credential is malformed, has expired or is not currently supported.", null);
    }

    public static c0.g c() {
        return new c0.g("NO_SUCH_PROVIDER", "User was not linked to an account with the given provider.", null);
    }

    public static c0.g d() {
        return new c0.g("NO_CURRENT_USER", "No user currently signed in.", null);
    }

    public static c0.g e(Exception exc) {
        if (exc == null) {
            return new c0.g("UNKNOWN", null, null);
        }
        String message = exc.getMessage();
        HashMap hashMap = new HashMap();
        if (exc instanceof J7.u) {
            J7.u uVar = (J7.u) exc;
            HashMap hashMap2 = new HashMap();
            J7.K b = uVar.b();
            List N1 = b.N1();
            J7.L O1 = b.O1();
            String uuid = UUID.randomUUID().toString();
            Y.b.put(uuid, O1);
            String uuid2 = UUID.randomUUID().toString();
            Y.c.put(uuid2, b);
            List d = c1.d(N1);
            hashMap2.put("appName", uVar.b().M1().i().q());
            hashMap2.put("multiFactorHints", d);
            hashMap2.put("multiFactorSessionId", uuid);
            hashMap2.put("multiFactorResolverId", uuid2);
            return new c0.g(uVar.a(), uVar.getLocalizedMessage(), hashMap2);
        }
        if ((exc instanceof B7.o) || (exc.getCause() != null && (exc.getCause() instanceof B7.o))) {
            return new c0.g("network-request-failed", "A network error (such as timeout, interrupted connection or unreachable host) has occurred.", null);
        }
        if ((exc instanceof B7.d) || (exc.getCause() != null && (exc.getCause() instanceof B7.d))) {
            return new c0.g("api-not-available", "The requested API is not available.", null);
        }
        if ((exc instanceof B7.q) || (exc.getCause() != null && (exc.getCause() instanceof B7.q))) {
            return new c0.g("too-many-requests", "We have blocked all requests from this device due to unusual activity. Try again later.", null);
        }
        if (exc.getMessage() != null && exc.getMessage().startsWith("Cannot create PhoneAuthCredential without either verificationProof")) {
            return new c0.g("invalid-verification-code", "The verification ID used to create the phone auth credential is invalid.", null);
        }
        if (message != null && message.contains("User has already been linked to the given provider.")) {
            return a();
        }
        String a = exc instanceof J7.q ? ((J7.q) exc).a() : "UNKNOWN";
        if (exc instanceof J7.y) {
            message = ((J7.y) exc).b();
        }
        if (exc instanceof J7.x) {
            J7.x xVar = (J7.x) exc;
            String b2 = xVar.b();
            if (b2 != null) {
                hashMap.put("email", b2);
            }
            J7.h c = xVar.c();
            if (c != null) {
                hashMap.put("authCredential", c1.h(c));
            }
        }
        return new c0.g(a, message, hashMap);
    }
}
