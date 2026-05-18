package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.b0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class u5 extends i5 {
    private final b g;

    public interface b {
        void a(b0.b bVar);

        void a(String str);
    }

    public u5(com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchDeveloperUri", kVar);
        this.g = bVar;
    }

    public static /* synthetic */ b a(u5 u5Var) {
        return u5Var.g;
    }

    public void run() {
        String valueOf = String.valueOf(this.a.A().G().get("package_name"));
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Looking up developer URI for package name: " + valueOf);
        }
        this.a.q0().a(new a(com.applovin.impl.sdk.network.a.a(this.a).c("GET").b("https://play.google.com/store/apps/details?id=" + valueOf).a((Object) "").a(false).a(), this.a));
    }

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        public void a(String str, String str2, int i) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.b(this.b, "No developer URI found - response from the Play Store is empty");
                }
                u5.a(u5.this).a(b0.b.APP_DETAILS_NOT_FOUND);
                return;
            }
            Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").*?(?=\">)").matcher(str2);
            if (!matcher.find()) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.b(this.b, "No developer URI found - unable to find the developer_url meta tag from the Play Store listing");
                }
                u5.a(u5.this).a(b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            String group = matcher.group();
            if (!URLUtil.isValidUrl(group)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.b(this.b, "Developer URI (" + group + ") is not valid");
                }
                u5.a(u5.this).a(b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Found developer URI: " + group);
            }
            u5.a(u5.this).a(group);
        }

        public void a(String str, int i, String str2, String str3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Unable to fetch app details due to: " + str2 + ", and received error code: " + i);
            }
            u5.a(u5.this).a(b0.b.APP_DETAILS_NOT_FOUND);
        }
    }
}
