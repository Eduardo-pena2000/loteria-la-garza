package com.unity3d.services.core.network.core;

import Ca.I;
import Ga.e;
import Ha.c;
import Ia.b;
import Ia.f;
import Ia.h;
import Ia.l;
import Na.n;
import Qa.p;
import android.content.Context;
import cb.O;
import cb.i;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OkHttp3Client implements HttpClient {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_CONNECTION_FAILED = "Network request failed";
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";
    public static final String NETWORK_CLIENT_OKHTTP = "okhttp";
    private final CleanupDirectory cleanupDirectory;
    private final OkHttpClient client;
    private final Context context;
    private final ISDKDispatchers dispatchers;
    private final AlternativeFlowReader isAlternativeFlowReader;
    private final File okHttpCache;
    private final SessionRepository sessionRepository;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class RequestComplete {
        private final Object body;
        private final Response response;

        public RequestComplete(Response response, Object obj) {
            t.g(response, "response");
            this.response = response;
            this.body = obj;
        }

        public static /* synthetic */ RequestComplete copy$default(RequestComplete requestComplete, Response response, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                response = requestComplete.response;
            }
            if ((i & 2) != 0) {
                obj = requestComplete.body;
            }
            return requestComplete.copy(response, obj);
        }

        public final Response component1() {
            return this.response;
        }

        public final Object component2() {
            return this.body;
        }

        public final RequestComplete copy(Response response, Object obj) {
            t.g(response, "response");
            return new RequestComplete(response, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestComplete)) {
                return false;
            }
            RequestComplete requestComplete = (RequestComplete) obj;
            return t.c(this.response, requestComplete.response) && t.c(this.body, requestComplete.body);
        }

        public final Object getBody() {
            return this.body;
        }

        public final Response getResponse() {
            return this.response;
        }

        public int hashCode() {
            int hashCode = this.response.hashCode() * 31;
            Object obj = this.body;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "RequestComplete(response=" + this.response + ", body=" + this.body + ')';
        }

        public /* synthetic */ RequestComplete(Response response, Object obj, int i, k kVar) {
            this(response, (i & 2) != 0 ? null : obj);
        }
    }

    @f(c = "com.unity3d.services.core.network.core.OkHttp3Client$execute$2", f = "OkHttp3Client.kt", l = {74}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(HttpRequest httpRequest, e eVar) {
            super(2, eVar);
            this.$request = httpRequest;
        }

        public final e create(Object obj, e eVar) {
            return OkHttp3Client.this.new 2(this.$request, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object access$makeRequest;
            Object f = c.f();
            int i = this.label;
            try {
                if (i == 0) {
                    Ca.t.b(obj);
                    OkHttp3Client okHttp3Client = OkHttp3Client.this;
                    HttpRequest httpRequest = this.$request;
                    long connectTimeout = httpRequest.getConnectTimeout();
                    long readTimeout = this.$request.getReadTimeout();
                    long writeTimeout = this.$request.getWriteTimeout();
                    this.label = 1;
                    access$makeRequest = OkHttp3Client.access$makeRequest(okHttp3Client, httpRequest, connectTimeout, readTimeout, writeTimeout, this);
                    if (access$makeRequest == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ca.t.b(obj);
                    access$makeRequest = obj;
                }
                RequestComplete requestComplete = (RequestComplete) access$makeRequest;
                Response component1 = requestComplete.component1();
                String component2 = requestComplete.component2();
                if (!OkHttp3Client.access$isAlternativeFlowReader$p(OkHttp3Client.this).invoke()) {
                    component2 = component2 instanceof File ? Na.l.l((File) component2, null, 1, null) : component2 instanceof byte[] ? new String((byte[]) component2, Za.c.b) : "";
                }
                int f2 = component1.f();
                Map g = component1.r().g();
                String httpUrl = component1.A().j().toString();
                Object obj2 = component2 == null ? "" : component2;
                String protocol = component1.y().toString();
                t.f(g, "toMultimap()");
                t.f(httpUrl, "toString()");
                t.f(protocol, "toString()");
                return new HttpResponse(obj2, f2, g, httpUrl, protocol, "okhttp", 0L, 64, null);
            } catch (IOException unused) {
                throw new UnityAdsNetworkException("Network request failed", null, null, this.$request.getBaseURL(), null, null, "okhttp", 54, null);
            } catch (SocketTimeoutException unused2) {
                throw new NetworkTimeoutException("Network request timeout", null, null, this.$request.getBaseURL(), null, null, "okhttp", 54, null);
            }
        }
    }

    @f(c = "com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1", f = "OkHttp3Client.kt", l = {63}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(HttpRequest httpRequest, e eVar) {
            super(2, eVar);
            this.$request = httpRequest;
        }

        public final e create(Object obj, e eVar) {
            return OkHttp3Client.this.new 1(this.$request, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                Ca.t.b(obj);
                OkHttp3Client okHttp3Client = OkHttp3Client.this;
                HttpRequest httpRequest = this.$request;
                this.label = 1;
                obj = okHttp3Client.execute(httpRequest, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return obj;
        }
    }

    public OkHttp3Client(ISDKDispatchers dispatchers, OkHttpClient client, Context context, SessionRepository sessionRepository, CleanupDirectory cleanupDirectory, AlternativeFlowReader isAlternativeFlowReader) {
        t.g(dispatchers, "dispatchers");
        t.g(client, "client");
        t.g(context, "context");
        t.g(sessionRepository, "sessionRepository");
        t.g(cleanupDirectory, "cleanupDirectory");
        t.g(isAlternativeFlowReader, "isAlternativeFlowReader");
        this.dispatchers = dispatchers;
        this.client = client;
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.isAlternativeFlowReader = isAlternativeFlowReader;
        this.okHttpCache = getOkHttpCache();
    }

    public static final /* synthetic */ ISDKDispatchers access$getDispatchers$p(OkHttp3Client okHttp3Client) {
        return okHttp3Client.dispatchers;
    }

    public static final /* synthetic */ AlternativeFlowReader access$isAlternativeFlowReader$p(OkHttp3Client okHttp3Client) {
        return okHttp3Client.isAlternativeFlowReader;
    }

    public static final /* synthetic */ Object access$makeRequest(OkHttp3Client okHttp3Client, HttpRequest httpRequest, long j, long j2, long j3, e eVar) {
        return okHttp3Client.makeRequest(httpRequest, j, j2, j3, eVar);
    }

    private final File getOkHttpCache() {
        File filesDir = this.context.getFilesDir();
        t.f(filesDir, "context.filesDir");
        File w = n.w(filesDir, "UnityAdsHttpCache");
        w.mkdirs();
        if (this.sessionRepository.getNativeConfiguration().hasCachedAssetsConfiguration()) {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = this.sessionRepository.getNativeConfiguration().getCachedAssetsConfiguration();
            this.cleanupDirectory.invoke(w, cachedAssetsConfiguration.getMaxCachedAssetSizeMb(), cachedAssetsConfiguration.getMaxCachedAssetAgeMs());
        }
        return w;
    }

    private final Object makeRequest(HttpRequest httpRequest, long j, long j2, long j3, e eVar) {
        Request okHttpProtoRequest = httpRequest.isProtobuf() ? HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(httpRequest) : HttpRequestToOkHttpRequestKt.toOkHttpRequest(httpRequest);
        OkHttpClient.Builder x = this.client.x();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient a = x.b(j, timeUnit).G(j2, timeUnit).K(j3, timeUnit).a();
        File file = new File(this.okHttpCache, StringExtensionsKt.getSHA256Hash(httpRequest.getBaseURL()));
        Number e = b.e((file.exists() && file.isFile()) ? file.length() : 0L);
        Request request = null;
        if (e.longValue() <= 0) {
            e = null;
        }
        if (e != null) {
            long longValue = e.longValue();
            DeviceLog.debug("Resuming download for " + httpRequest.getBaseURL());
            request = okHttpProtoRequest.i().a("Range", "bytes=" + longValue + '-').b();
        }
        cb.p pVar = new cb.p(Ha.b.c(eVar), 1);
        pVar.E();
        if (request != null) {
            okHttpProtoRequest = request;
        }
        a.a(okHttpProtoRequest).N0(new OkHttp3Client$makeRequest$2$1(pVar, this, file, httpRequest));
        Object w = pVar.w();
        if (w == c.f()) {
            h.c(eVar);
        }
        return w;
    }

    public Object execute(HttpRequest httpRequest, e eVar) {
        return i.g(this.dispatchers.getIo(), new 2(httpRequest, null), eVar);
    }

    public HttpResponse executeBlocking(HttpRequest request) {
        t.g(request, "request");
        return (HttpResponse) i.e(this.dispatchers.getIo(), new 1(request, null));
    }
}
