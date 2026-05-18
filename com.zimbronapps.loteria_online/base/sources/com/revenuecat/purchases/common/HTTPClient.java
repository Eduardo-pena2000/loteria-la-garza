package com.revenuecat.purchases.common;

import Ca.j;
import Ca.q;
import Ca.x;
import Da.S;
import Da.v;
import Za.B;
import Za.E;
import android.os.Build;
import com.revenuecat.purchases.ForceServerErrorStrategy;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.networking.ConnectionErrorReason;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPRequest;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import com.revenuecat.purchases.common.networking.MapConverter;
import com.revenuecat.purchases.common.networking.NullPointerReadingErrorStreamException;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.interfaces.StorefrontProvider;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class HTTPClient {
    public static final Companion Companion = new Companion(null);
    public static final int NO_STATUS_CODE = -1;
    private final AppConfig appConfig;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final ETagManager eTagManager;
    private final boolean enableExtraRequestLogging;
    private final ForceServerErrorStrategy forceServerErrorStrategy;
    private final LocaleProvider localeProvider;
    private final MapConverter mapConverter;
    private final RequestResponseListener requestResponseListener;
    private final SigningManager signingManager;
    private final StorefrontProvider storefrontProvider;
    private final HTTPTimeoutManager timeoutManager;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.AMAZON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HTTPClient(AppConfig appConfig, ETagManager eTagManager, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager, StorefrontProvider storefrontProvider, DateProvider dateProvider, MapConverter mapConverter, LocaleProvider localeProvider, ForceServerErrorStrategy forceServerErrorStrategy, RequestResponseListener requestResponseListener, HTTPTimeoutManager hTTPTimeoutManager) {
        t.g(appConfig, "appConfig");
        t.g(eTagManager, "eTagManager");
        t.g(signingManager, "signingManager");
        t.g(storefrontProvider, "storefrontProvider");
        t.g(dateProvider, "dateProvider");
        t.g(mapConverter, "mapConverter");
        t.g(localeProvider, "localeProvider");
        t.g(hTTPTimeoutManager, "timeoutManager");
        this.appConfig = appConfig;
        this.eTagManager = eTagManager;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.signingManager = signingManager;
        this.storefrontProvider = storefrontProvider;
        this.dateProvider = dateProvider;
        this.mapConverter = mapConverter;
        this.localeProvider = localeProvider;
        this.forceServerErrorStrategy = forceServerErrorStrategy;
        this.requestResponseListener = requestResponseListener;
        this.timeoutManager = hTTPTimeoutManager;
        this.enableExtraRequestLogging = false;
    }

    private final BufferedReader buffer(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    private final HttpURLConnection getConnection(HTTPRequest hTTPRequest, long j) {
        HttpURLConnection openConnection = hTTPRequest.getFullURL().openConnection();
        t.e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = openConnection;
        httpURLConnection.setConnectTimeout((int) j);
        for (Map.Entry entry : hTTPRequest.getHeaders().entrySet()) {
            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        JSONObject body = hTTPRequest.getBody();
        if (body != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            t.f(outputStream, "os");
            BufferedWriter buffer = buffer(outputStream);
            String jSONObject = body.toString();
            t.f(jSONObject, "body.toString()");
            writeFully(buffer, jSONObject);
        }
        return httpURLConnection;
    }

    private final String getETagHeader(URLConnection uRLConnection) {
        return uRLConnection.getHeaderField("X-RevenueCat-ETag");
    }

    private final Map getHeaders(Map map, URL url, boolean z, String str, boolean z2, String str2) {
        Map r = S.r(S.l(new q[]{x.a("Content-Type", "application/json"), x.a("X-Platform", getXPlatformHeader()), x.a("X-Platform-Flavor", this.appConfig.getPlatformInfo().getFlavor()), x.a("X-Platform-Flavor-Version", this.appConfig.getPlatformInfo().getVersion()), x.a("X-Platform-Version", String.valueOf(Build.VERSION.SDK_INT)), x.a("X-Platform-Device", Build.MODEL), x.a("X-Platform-Brand", Build.BRAND), x.a("X-Version", "9.26.1"), x.a("X-Preferred-Locales", B.G(this.localeProvider.getCurrentLocalesLanguageTags(), '-', '_', false, 4, (Object) null)), x.a("X-Client-Locale", this.appConfig.getLanguageTag()), x.a("X-Client-Version", this.appConfig.getVersionName()), x.a("X-Client-Bundle-ID", this.appConfig.getPackageName()), x.a("X-Observer-Mode-Enabled", this.appConfig.getFinishTransactions() ? "false" : "true"), x.a("X-Nonce", str), x.a("X-Post-Params-Hash", str2), x.a("X-Custom-Entitlements-Computation", this.appConfig.getCustomEntitlementComputation() ? "true" : null), x.a("X-UI-Preview-Mode", this.appConfig.getUiPreviewMode() ? "true" : null), x.a("X-Storefront", this.storefrontProvider.getStorefront()), x.a("X-Is-Debug-Build", String.valueOf(this.appConfig.isDebugBuild())), x.a("X-Kotlin-Version", j.f.toString()), x.a("X-Is-Backgrounded", String.valueOf(this.appConfig.isAppBackgrounded())), x.a("X-Billing-Client-Sdk-Version", "8.0.0")}), map);
        ETagManager eTagManager = this.eTagManager;
        String url2 = url.toString();
        t.f(url2, "fullURL.toString()");
        return MapExtensionsKt.filterNotNullValues(S.r(r, eTagManager.getETagHeaders$purchases_defaultsBc8Release(url2, z2, z)));
    }

    private final InputStream getInputStream(HttpURLConnection httpURLConnection) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            return httpURLConnection.getInputStream();
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException ? true : e instanceof IOException)) {
                throw e;
            }
            LogIntent logIntent = LogIntent.WARNING;
            HTTPClient$getInputStream$$inlined$log$1 hTTPClient$getInputStream$$inlined$log$1 = new HTTPClient$getInputStream$$inlined$log$1(logIntent, e);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) hTTPClient$getInputStream$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$getInputStream$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) hTTPClient$getInputStream$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) hTTPClient$getInputStream$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) hTTPClient$getInputStream$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$getInputStream$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) hTTPClient$getInputStream$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) hTTPClient$getInputStream$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) hTTPClient$getInputStream$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) hTTPClient$getInputStream$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) hTTPClient$getInputStream$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$getInputStream$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) hTTPClient$getInputStream$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$getInputStream$$inlined$log$1.invoke(), null);
                    break;
            }
            try {
                return httpURLConnection.getErrorStream();
            } catch (NullPointerException e2) {
                throw new NullPointerReadingErrorStreamException(e2.getMessage(), e2);
            }
        }
    }

    private final boolean getLoadShedderHeader(URLConnection uRLConnection) {
        String str;
        String headerField = uRLConnection.getHeaderField("x-revenuecat-fortress");
        if (headerField != null) {
            str = headerField.toLowerCase(Locale.ROOT);
            t.f(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        return t.c(str, "true");
    }

    private final Date getRequestDateHeader(URLConnection uRLConnection) {
        String requestTimeHeader = getRequestTimeHeader(uRLConnection);
        if (requestTimeHeader != null) {
            return new Date(Long.parseLong(requestTimeHeader));
        }
        return null;
    }

    private final String getRequestTimeHeader(URLConnection uRLConnection) {
        String headerField = uRLConnection.getHeaderField("X-RevenueCat-Request-Time");
        if (headerField == null || E.h0(headerField)) {
            return null;
        }
        return headerField;
    }

    private final String getXPlatformHeader() {
        return WhenMappings.$EnumSwitchMapping$0[this.appConfig.getStore().ordinal()] == 1 ? "amazon" : "android";
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.revenuecat.purchases.common.networking.HTTPResult performCall(java.net.URL r31, boolean r32, com.revenuecat.purchases.common.networking.Endpoint r33, java.util.Map r34, java.util.List r35, java.util.Map r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.HTTPClient.performCall(java.net.URL, boolean, com.revenuecat.purchases.common.networking.Endpoint, java.util.Map, java.util.List, java.util.Map, boolean):com.revenuecat.purchases.common.networking.HTTPResult");
    }

    private static final boolean performRequest$canUseFallback(Endpoint endpoint, int i, List list) {
        return endpoint.getSupportsFallbackBaseURLs() && i >= 0 && i < list.size();
    }

    public static /* synthetic */ HTTPResult performRequest$default(HTTPClient hTTPClient, URL url, Endpoint endpoint, Map map, List list, Map map2, boolean z, List list2, int i, int i2, Object obj) throws JSONException, IOException {
        return hTTPClient.performRequest(url, endpoint, map, list, map2, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? v.n() : list2, (i2 & 128) != 0 ? 0 : i);
    }

    private static final HTTPResult performRequest$performRequestToFallbackURL(List list, int i, HTTPClient hTTPClient, Endpoint endpoint, Map map, List list2, Map map2, boolean z) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        URL url = (URL) list.get(i);
        LogIntent logIntent = LogIntent.DEBUG;
        HTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1 hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1 = new HTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1(logIntent, endpoint, url);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke(), null);
                break;
        }
        return hTTPClient.performRequest(url, endpoint, map, list2, map2, z, list, i + 1);
    }

    private final String readFully(InputStream inputStream) throws IOException {
        return Na.q.e(buffer(inputStream));
    }

    private final String toCurlRequest(HTTPRequest hTTPRequest) {
        StringBuilder sb = new StringBuilder("curl -v ");
        String str = hTTPRequest.getBody() == null ? "GET" : "POST";
        sb.append("-X ");
        sb.append(str);
        sb.append(" \\\n  ");
        for (Map.Entry entry : hTTPRequest.getHeaders().entrySet()) {
            sb.append("-H \"");
            sb.append((String) entry.getKey());
            sb.append(":");
            sb.append((String) entry.getValue());
            sb.append("\" \\\n  ");
        }
        if (hTTPRequest.getBody() != null) {
            sb.append("-d '");
            sb.append(hTTPRequest.getBody().toString());
            sb.append("' \\\n  ");
        }
        sb.append("\"");
        sb.append(hTTPRequest.getFullURL());
        sb.append("\"");
        String sb2 = sb.toString();
        t.f(sb2, "builder.toString()");
        return sb2;
    }

    private final void trackHttpRequestPerformedIfNeeded(URL url, Endpoint endpoint, Date date, boolean z, HTTPResult hTTPResult, boolean z2, IOException iOException) {
        VerificationResult verificationResult;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            long between = DurationExtensionsKt.between(ab.b.b, date, this.dateProvider.getNow());
            int responseCode = z ? hTTPResult != null ? hTTPResult.getResponseCode() : 304 : -1;
            HTTPResult.Origin origin = hTTPResult != null ? hTTPResult.getOrigin() : null;
            if (hTTPResult == null || (verificationResult = hTTPResult.getVerificationResult()) == null) {
                verificationResult = VerificationResult.NOT_REQUESTED;
            }
            VerificationResult verificationResult2 = verificationResult;
            boolean z3 = z && RCHTTPStatusCodes.INSTANCE.isSuccessful(responseCode);
            ConnectionErrorReason fromIOException = iOException != null ? ConnectionErrorReason.Companion.fromIOException(iOException) : null;
            String host = url.getHost();
            t.f(host, "baseURL.host");
            diagnosticsTracker.trackHttpRequestPerformed--XzGXFE(host, endpoint, between, z3, responseCode, hTTPResult != null ? hTTPResult.getBackendErrorCode() : null, origin, verificationResult2, z2, fromIOException);
        }
    }

    private final VerificationResult verifyResponse(String str, URLConnection uRLConnection, String str2, String str3, String str4) {
        return this.signingManager.verifyResponse(str, uRLConnection.getHeaderField("X-Signature"), str3, str2, getRequestTimeHeader(uRLConnection), getETagHeader(uRLConnection), str4);
    }

    private final void writeFully(BufferedWriter bufferedWriter, String str) throws IOException {
        bufferedWriter.write(str);
        bufferedWriter.flush();
    }

    public final void clearCaches() {
        this.eTagManager.clearCaches$purchases_defaultsBc8Release();
    }

    public final SigningManager getSigningManager() {
        return this.signingManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.revenuecat.purchases.common.networking.HTTPResult performRequest(java.net.URL r23, com.revenuecat.purchases.common.networking.Endpoint r24, java.util.Map r25, java.util.List r26, java.util.Map r27, boolean r28, java.util.List r29, int r30) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.HTTPClient.performRequest(java.net.URL, com.revenuecat.purchases.common.networking.Endpoint, java.util.Map, java.util.List, java.util.Map, boolean, java.util.List, int):com.revenuecat.purchases.common.networking.HTTPResult");
    }

    private final BufferedWriter buffer(OutputStream outputStream) {
        return new BufferedWriter(new OutputStreamWriter(outputStream));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HTTPClient(AppConfig appConfig, ETagManager eTagManager, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager, StorefrontProvider storefrontProvider, DateProvider dateProvider, MapConverter mapConverter, LocaleProvider localeProvider, ForceServerErrorStrategy forceServerErrorStrategy, RequestResponseListener requestResponseListener, HTTPTimeoutManager hTTPTimeoutManager, int i, k kVar) {
        DateProvider defaultDateProvider = (i & 32) != 0 ? new DefaultDateProvider() : dateProvider;
        this(appConfig, eTagManager, diagnosticsTracker, signingManager, storefrontProvider, defaultDateProvider, (i & 64) != 0 ? new MapConverter() : mapConverter, localeProvider, (i & 256) != 0 ? null : forceServerErrorStrategy, (i & 512) != 0 ? null : requestResponseListener, (i & 1024) != 0 ? new HTTPTimeoutManager(appConfig, defaultDateProvider) : hTTPTimeoutManager);
    }
}
