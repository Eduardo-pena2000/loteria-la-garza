package com.revenuecat.purchases;

import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import java.net.URL;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface ForceServerErrorStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ForceServerErrorStrategy doNotFail = new c();
        private static final ForceServerErrorStrategy failAll = new d();
        private static final ForceServerErrorStrategy failExceptFallbackUrls = new e();

        private Companion() {
        }

        public static /* synthetic */ boolean a(URL url, Endpoint endpoint) {
            return doNotFail$lambda$0(url, endpoint);
        }

        public static /* synthetic */ boolean b(URL url, Endpoint endpoint) {
            return failAll$lambda$1(url, endpoint);
        }

        public static /* synthetic */ boolean c(URL url, Endpoint endpoint) {
            return failExceptFallbackUrls$lambda$2(url, endpoint);
        }

        private static final boolean doNotFail$lambda$0(URL url, Endpoint endpoint) {
            t.g(url, "<anonymous parameter 0>");
            t.g(endpoint, "<anonymous parameter 1>");
            return false;
        }

        private static final boolean failAll$lambda$1(URL url, Endpoint endpoint) {
            t.g(url, "<anonymous parameter 0>");
            t.g(endpoint, "<anonymous parameter 1>");
            return true;
        }

        private static final boolean failExceptFallbackUrls$lambda$2(URL url, Endpoint endpoint) {
            t.g(url, "baseURL");
            t.g(endpoint, "<anonymous parameter 1>");
            return !t.c(url.toString(), AppConfig.Companion.getFallbackURL().toString());
        }

        public final ForceServerErrorStrategy getDoNotFail() {
            return doNotFail;
        }

        public final ForceServerErrorStrategy getFailAll() {
            return failAll;
        }

        public final ForceServerErrorStrategy getFailExceptFallbackUrls() {
            return failExceptFallbackUrls;
        }
    }

    public static final class DefaultImpls {
        @Deprecated
        public static HTTPResult fakeResponseWithoutPerformingRequest(ForceServerErrorStrategy forceServerErrorStrategy, URL url, Endpoint endpoint) {
            t.g(url, "baseURL");
            t.g(endpoint, "endpoint");
            return ForceServerErrorStrategy.access$fakeResponseWithoutPerformingRequest$jd(forceServerErrorStrategy, url, endpoint);
        }

        @Deprecated
        public static String getServerErrorURL(ForceServerErrorStrategy forceServerErrorStrategy) {
            return ForceServerErrorStrategy.access$getServerErrorURL$jd(forceServerErrorStrategy);
        }
    }

    static /* synthetic */ HTTPResult access$fakeResponseWithoutPerformingRequest$jd(ForceServerErrorStrategy forceServerErrorStrategy, URL url, Endpoint endpoint) {
        return super.fakeResponseWithoutPerformingRequest(url, endpoint);
    }

    static /* synthetic */ String access$getServerErrorURL$jd(ForceServerErrorStrategy forceServerErrorStrategy) {
        return super.getServerErrorURL();
    }

    default HTTPResult fakeResponseWithoutPerformingRequest(URL url, Endpoint endpoint) {
        t.g(url, "baseURL");
        t.g(endpoint, "endpoint");
        return null;
    }

    default String getServerErrorURL() {
        return "https://api.revenuecat.com/force-server-failure";
    }

    boolean shouldForceServerError(URL url, Endpoint endpoint);
}
