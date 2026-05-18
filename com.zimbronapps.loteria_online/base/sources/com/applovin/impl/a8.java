package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class a8 {
    private static final DateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
    private static final Random b = new Random(System.currentTimeMillis());

    public static void a(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, t7 t7Var, int i, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
        }
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
        Set a2 = a(s7Var, kVar);
        if (CollectionUtils.isEmpty((Collection) a2)) {
            return;
        }
        a(a2, t7Var, kVar);
    }

    public static boolean b(o7 o7Var) {
        b8 p1;
        List g;
        return (o7Var == null || (p1 = o7Var.p1()) == null || (g = p1.g()) == null || g.isEmpty()) ? false : true;
    }

    public static t7 c(o7 o7Var) {
        if (b(o7Var) || a(o7Var)) {
            return null;
        }
        return t7.g;
    }

    private static String b() {
        DateFormat dateFormat = a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    public static boolean a(o7 o7Var) {
        r7 g1;
        w7 e;
        if (o7Var == null || (g1 = o7Var.g1()) == null || (e = g1.e()) == null) {
            return false;
        }
        return e.c() != null || StringUtils.isValidString(e.b());
    }

    public static boolean b(p8 p8Var) {
        if (p8Var != null) {
            return p8Var.b("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    public static Uri a(String str, long j, Uri uri, t7 t7Var, com.applovin.impl.sdk.k kVar) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String num = Integer.toString(t7Var.b());
                String replace = str.replace("[ERRORCODE]", num).replace("[REASON]", num);
                if (j >= 0) {
                    replace = replace.replace("[CONTENTPLAYHEAD]", a(j));
                }
                if (uri != null) {
                    replace = replace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(replace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
            } catch (Throwable th) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastUtils", "Unable to replace macros in URL string " + str, th);
                }
                kVar.D().a("VastUtils", th);
                return null;
            }
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().b("VastUtils", "Unable to replace macros in invalid URL string.");
        }
        return null;
    }

    private static String a(long j) {
        if (j > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long hours = timeUnit.toHours(j);
            long minutes = timeUnit.toMinutes(j);
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            return String.format(Locale.US, "%02d:%02d:%02d.000", new Object[]{Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j % timeUnit2.toSeconds(1L))});
        }
        return "00:00:00.000";
    }

    private static String a() {
        return Integer.toString(b.nextInt(89999999) + 10000000);
    }

    public static void a(Set set, com.applovin.impl.sdk.k kVar) {
        a(set, -1L, (Uri) null, t7.b, kVar);
    }

    public static void a(Set set, t7 t7Var, com.applovin.impl.sdk.k kVar) {
        a(set, -1L, (Uri) null, t7Var, kVar);
    }

    public static void a(Set set, long j, Uri uri, t7 t7Var, com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            if (set == null || set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                y7 y7Var = (y7) it.next();
                Uri a2 = a(y7Var.c(), j, uri, t7Var, kVar);
                if (a2 != null) {
                    kVar.f0().a(com.applovin.impl.sdk.network.d.b().d(a2.toString()).a(false).b(y7Var.d()).a(), false);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
    }

    public static void a(p8 p8Var, Map map, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        List<p8> a2;
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (p8Var == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastUtils", "Unable to render event trackers; null node provided");
                return;
            }
            return;
        }
        if (map == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastUtils", "Unable to render event trackers; null event trackers provided");
                return;
            }
            return;
        }
        p8 c = p8Var.c("TrackingEvents");
        if (c == null || (a2 = c.a("Tracking")) == null) {
            return;
        }
        for (p8 p8Var2 : a2) {
            String str = (String) p8Var2.a().get("event");
            if (StringUtils.isValidString(str)) {
                y7 a3 = y7.a(p8Var2, s7Var, kVar);
                if (a3 != null) {
                    Set set = (Set) map.get(str);
                    if (set != null) {
                        set.add(a3);
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(a3);
                        map.put(str, hashSet);
                    }
                }
            } else {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().b("VastUtils", "Could not find event for tracking node = " + p8Var2);
                }
            }
        }
    }

    public static void a(List list, Set set, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastUtils", "Unable to render trackers; null nodes provided");
                return;
            }
            return;
        }
        if (set == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastUtils", "Unable to render trackers; null trackers provided");
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y7 a2 = y7.a((p8) it.next(), s7Var, kVar);
            if (a2 != null) {
                set.add(a2);
            }
        }
    }

    public static boolean a(p8 p8Var) {
        if (p8Var != null) {
            return p8Var.b("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static String a(s7 s7Var) {
        p8 b2;
        if (s7Var != null) {
            List a2 = s7Var.a();
            int size = s7Var.a().size();
            if (size <= 0 || (b2 = ((p8) a2.get(size - 1)).b("VASTAdTagURI")) == null) {
                return null;
            }
            return b2.d();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    public static String a(p8 p8Var, String str, String str2) {
        p8 c = p8Var.c(str);
        if (c != null) {
            String d = c.d();
            if (StringUtils.isValidString(d)) {
                return d;
            }
        }
        return str2;
    }

    private static Set a(s7 s7Var, com.applovin.impl.sdk.k kVar) {
        List a2;
        if (s7Var == null) {
            return null;
        }
        List<p8> a3 = s7Var.a();
        HashSet hashSet = new HashSet(a3.size());
        for (p8 p8Var : a3) {
            p8 b2 = p8Var.b("Wrapper");
            if (b2 == null) {
                b2 = p8Var.b("InLine");
            }
            if (b2 != null) {
                a2 = b2.a("Error");
            } else {
                a2 = p8Var.a("Error");
            }
            hashSet = a(hashSet, a2, s7Var, kVar);
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().a("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    private static HashSet a(HashSet hashSet, List list, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        if (list == null) {
            return hashSet;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y7 a2 = y7.a((p8) it.next(), s7Var, kVar);
            if (a2 != null) {
                hashSet.add(a2);
            }
        }
        return hashSet;
    }
}
