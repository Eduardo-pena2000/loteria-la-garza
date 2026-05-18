package ja;

import J7.N;
import J7.e;
import android.net.Uri;
import ja.c0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class c1 {
    public static J7.e a(c0.q qVar) {
        e.a T1 = J7.e.T1();
        T1.g(qVar.i());
        if (qVar.e() != null) {
            T1.c(qVar.e());
        }
        if (qVar.h() != null) {
            T1.f(qVar.h());
        }
        T1.d(qVar.f().booleanValue());
        if (qVar.d() != null) {
            T1.b(qVar.d(), qVar.b().booleanValue(), qVar.c());
        }
        if (qVar.g() != null) {
            T1.e(qVar.g());
        }
        return T1.a();
    }

    public static J7.h b(Map map) {
        String str;
        String str2;
        String str3;
        String str4;
        if (map.get("token") != null) {
            Integer num = (Integer) map.get("token");
            num.intValue();
            J7.h hVar = (J7.h) v.i.get(num);
            if (hVar != null) {
                return hVar;
            }
            throw w.b();
        }
        Object obj = map.get("signInMethod");
        Objects.requireNonNull(obj);
        String str5 = (String) obj;
        str = (String) map.get("secret");
        str2 = (String) map.get("idToken");
        str3 = (String) map.get("accessToken");
        str4 = (String) map.get("rawNonce");
        switch (str5) {
            case "twitter.com":
                Objects.requireNonNull(str3);
                Objects.requireNonNull(str);
                return J7.b0.a(str3, str);
            case "playgames.google.com":
                Object obj2 = map.get("serverAuthCode");
                Objects.requireNonNull(obj2);
                return J7.U.a((String) obj2);
            case "google.com":
                return J7.G.a(str2, str3);
            case "facebook.com":
                Objects.requireNonNull(str3);
                return J7.m.a(str3);
            case "oauth":
                Object obj3 = map.get("providerId");
                Objects.requireNonNull(obj3);
                N.b f = J7.N.f((String) obj3);
                if (str3 != null) {
                    f.b(str3);
                }
                if (str4 == null) {
                    Objects.requireNonNull(str2);
                    f.c(str2);
                } else {
                    Objects.requireNonNull(str2);
                    f.d(str2, str4);
                }
                return f.a();
            case "phone":
                Object obj4 = map.get("verificationId");
                Objects.requireNonNull(obj4);
                Object obj5 = map.get("smsCode");
                Objects.requireNonNull(obj5);
                return com.google.firebase.auth.b.a((String) obj4, (String) obj5);
            case "password":
                Object obj6 = map.get("email");
                Objects.requireNonNull(obj6);
                Objects.requireNonNull(str);
                return J7.k.a((String) obj6, str);
            case "github.com":
                Objects.requireNonNull(str3);
                return J7.E.a(str3);
            case "emailLink":
                Object obj7 = map.get("email");
                Objects.requireNonNull(obj7);
                Object obj8 = map.get("emailLink");
                Objects.requireNonNull(obj8);
                return J7.k.b((String) obj7, (String) obj8);
            default:
                return null;
        }
    }

    public static List c(c0.B b) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(b.c().n());
        arrayList.add(b.b());
        return arrayList;
    }

    public static List d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = e(list).iterator();
        while (it.hasNext()) {
            arrayList.add(((c0.v) it.next()).g());
        }
        return arrayList;
    }

    public static List e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            J7.S s = (J7.J) it.next();
            if (s instanceof J7.S) {
                arrayList.add(new c0.v.a().e(s.z()).b(s.getDisplayName()).c(Double.valueOf(s.M1())).f(s.b()).d(s.N1()).a());
            } else {
                arrayList.add(new c0.v.a().b(s.getDisplayName()).c(Double.valueOf(s.M1())).f(s.b()).d(s.N1()).a());
            }
        }
        return arrayList;
    }

    public static c0.o f(J7.d dVar) {
        c0.o.a aVar = new c0.o.a();
        c0.p.a aVar2 = new c0.p.a();
        int b = dVar.b();
        if (b == 0) {
            aVar.c(c0.a.PASSWORD_RESET);
        } else if (b == 1) {
            aVar.c(c0.a.VERIFY_EMAIL);
        } else if (b == 2) {
            aVar.c(c0.a.RECOVER_EMAIL);
        } else if (b == 4) {
            aVar.c(c0.a.EMAIL_SIGN_IN);
        } else if (b == 5) {
            aVar.c(c0.a.VERIFY_AND_CHANGE_EMAIL);
        } else if (b == 6) {
            aVar.c(c0.a.REVERT_SECOND_FACTOR_ADDITION);
        }
        J7.a a = dVar.a();
        if ((a != null && b == 1) || b == 0) {
            aVar2.b(a.a());
        } else if (b == 2 || b == 5) {
            Objects.requireNonNull(a);
            J7.a aVar3 = a;
            aVar2.b(aVar3.a());
            aVar2.c(aVar3.b());
        }
        aVar.b(aVar2.a());
        return aVar.a();
    }

    public static c0.r g(J7.g gVar) {
        if (gVar == null) {
            return null;
        }
        c0.r.a aVar = new c0.r.a();
        aVar.b(Boolean.valueOf(gVar.n0()));
        aVar.c(gVar.getProfile());
        aVar.d(gVar.f());
        aVar.e(gVar.X0());
        return aVar.a();
    }

    public static c0.s h(J7.h hVar) {
        if (hVar == null) {
            return null;
        }
        int hashCode = hVar.hashCode();
        v.i.put(Integer.valueOf(hashCode), hVar);
        c0.s.a aVar = new c0.s.a();
        aVar.d(hVar.M1());
        aVar.e(hVar.N1());
        aVar.c(Long.valueOf(hashCode));
        if (hVar instanceof J7.M) {
            aVar.b(((J7.M) hVar).P1());
        }
        return aVar.a();
    }

    public static c0.A i(J7.i iVar) {
        c0.A.a aVar = new c0.A.a();
        aVar.b(g(iVar.i1()));
        aVar.c(h(iVar.l1()));
        aVar.d(j(iVar.i0()));
        return aVar.a();
    }

    public static c0.B j(J7.A a) {
        if (a == null) {
            return null;
        }
        c0.B.a aVar = new c0.B.a();
        c0.C.a aVar2 = new c0.C.a();
        aVar2.c(a.getDisplayName());
        aVar2.d(a.B1());
        aVar2.f(Boolean.valueOf(a.H0()));
        aVar2.e(Boolean.valueOf(a.S1()));
        if (a.O1() != null) {
            aVar2.b(Long.valueOf(a.O1().C()));
            aVar2.g(Long.valueOf(a.O1().P()));
        }
        aVar2.h(a.z());
        aVar2.i(k(a.z0()));
        aVar2.k(a.b());
        aVar2.j(a.R1());
        aVar.c(aVar2.a());
        aVar.b(m(a.Q1()));
        return aVar.a();
    }

    public static String k(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        if ("".equals(uri2)) {
            return null;
        }
        return uri2;
    }

    public static c0.u l(J7.C c) {
        c0.u.a aVar = new c0.u.a();
        aVar.h(c.g());
        aVar.f(c.e());
        aVar.b(Long.valueOf(c.a() * 1000));
        aVar.d(Long.valueOf(c.c() * 1000));
        aVar.e(Long.valueOf(c.d() * 1000));
        aVar.c(c.b());
        aVar.g(c.f());
        return aVar.a();
    }

    public static List m(List list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            J7.c0 c0Var = (J7.c0) it.next();
            if (c0Var != null && !"firebase".equals(c0Var.f())) {
                arrayList.add(n(c0Var));
            }
        }
        return arrayList;
    }

    public static Map n(J7.c0 c0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("displayName", c0Var.getDisplayName());
        hashMap.put("email", c0Var.B1());
        hashMap.put("isEmailVerified", Boolean.valueOf(c0Var.H0()));
        hashMap.put("phoneNumber", c0Var.z());
        hashMap.put("photoUrl", k(c0Var.z0()));
        hashMap.put("uid", c0Var.b() == null ? "" : c0Var.b());
        hashMap.put("providerId", c0Var.f());
        hashMap.put("isAnonymous", Boolean.FALSE);
        return hashMap;
    }
}
