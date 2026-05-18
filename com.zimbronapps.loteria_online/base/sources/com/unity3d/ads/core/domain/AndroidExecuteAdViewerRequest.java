package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.o;
import Ca.s;
import Ca.t;
import Da.S;
import Da.r;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Na.b;
import Qa.p;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import cb.K;
import cb.O;
import cb.i;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import java.io.InputStream;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidExecuteAdViewerRequest implements ExecuteAdViewerRequest {
    private final GetCachedAsset getCachedAsset;
    private final HttpClient httpClient;
    private final K ioDispatcher;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                iArr[RequestType.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestType.HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestType.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @f(c = "com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2", f = "AndroidExecuteAdViewerRequest.kt", l = {29}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ Object[] $parameters;
        final /* synthetic */ RequestType $type;
        int label;
        final /* synthetic */ AndroidExecuteAdViewerRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Object[] objArr, AndroidExecuteAdViewerRequest androidExecuteAdViewerRequest, RequestType requestType, e eVar) {
            super(2, eVar);
            this.$parameters = objArr;
            this.this$0 = androidExecuteAdViewerRequest;
            this.$type = requestType;
        }

        public final e create(Object obj, e eVar) {
            return new 2(this.$parameters, this.this$0, this.$type, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object b;
            WebResourceResponse invoke$default;
            InputStream data;
            Object f = c.f();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            Object b0 = r.b0(this.$parameters, 1);
            byte[] bArr = null;
            String str = b0 instanceof String ? (String) b0 : null;
            if (str == null) {
                str = "";
            }
            if (str.length() <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            try {
                s.a aVar = s.b;
                Uri parse = Uri.parse(str);
                kotlin.jvm.internal.t.f(parse, "parse(this)");
                b = s.b(parse);
            } catch (Throwable th) {
                s.a aVar2 = s.b;
                b = s.b(t.a(th));
            }
            if (s.g(b)) {
                b = null;
            }
            Uri uri = (Uri) b;
            if (uri != null) {
                if (this.$type != RequestType.GET) {
                    uri = null;
                }
                if (uri != null && (invoke$default = GetCachedAsset.invoke$default(AndroidExecuteAdViewerRequest.access$getGetCachedAsset$p(this.this$0), uri, null, 2, null)) != null && (data = invoke$default.getData()) != null) {
                    kotlin.jvm.internal.t.f(data, "data");
                    bArr = b.c(data);
                }
            }
            byte[] bArr2 = bArr;
            if (bArr2 != null) {
                return new HttpResponse(bArr2, 0, null, null, null, null, 0L, 126, null);
            }
            HttpClient access$getHttpClient$p = AndroidExecuteAdViewerRequest.access$getHttpClient$p(this.this$0);
            HttpRequest access$createRequest = AndroidExecuteAdViewerRequest.access$createRequest(this.this$0, this.$type, this.$parameters);
            this.label = 1;
            Object execute = access$getHttpClient$p.execute(access$createRequest, this);
            return execute == f ? f : execute;
        }
    }

    public AndroidExecuteAdViewerRequest(K ioDispatcher, HttpClient httpClient, GetCachedAsset getCachedAsset) {
        kotlin.jvm.internal.t.g(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.t.g(httpClient, "httpClient");
        kotlin.jvm.internal.t.g(getCachedAsset, "getCachedAsset");
        this.ioDispatcher = ioDispatcher;
        this.httpClient = httpClient;
        this.getCachedAsset = getCachedAsset;
    }

    public static final /* synthetic */ HttpRequest access$createRequest(AndroidExecuteAdViewerRequest androidExecuteAdViewerRequest, RequestType requestType, Object[] objArr) {
        return androidExecuteAdViewerRequest.createRequest(requestType, objArr);
    }

    public static final /* synthetic */ GetCachedAsset access$getGetCachedAsset$p(AndroidExecuteAdViewerRequest androidExecuteAdViewerRequest) {
        return androidExecuteAdViewerRequest.getCachedAsset;
    }

    public static final /* synthetic */ HttpClient access$getHttpClient$p(AndroidExecuteAdViewerRequest androidExecuteAdViewerRequest) {
        return androidExecuteAdViewerRequest.httpClient;
    }

    private final HttpRequest createRequest(RequestType requestType, Object[] objArr) {
        Map h;
        Map h2;
        String str = (String) r.b0(objArr, 1);
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[requestType.ordinal()];
        if (i == 1 || i == 2) {
            JSONArray jSONArray = (JSONArray) r.b0(objArr, 2);
            Integer num = (Integer) r.b0(objArr, 3);
            Integer num2 = (Integer) r.b0(objArr, 4);
            if (jSONArray == null || (h = JSONArrayExtensionsKt.getHeadersMap(jSONArray)) == null) {
                h = S.h();
            }
            return new HttpRequest(str, null, requestType, null, h, null, null, null, null, num != null ? num.intValue() : 30000, num2 != null ? num2.intValue() : 30000, 0, 0, false, null, null, 0, 129514, null);
        }
        if (i != 3) {
            throw new o();
        }
        String str2 = (String) r.b0(objArr, 2);
        JSONArray jSONArray2 = (JSONArray) r.b0(objArr, 3);
        Integer num3 = (Integer) r.b0(objArr, 4);
        Integer num4 = (Integer) r.b0(objArr, 5);
        if (jSONArray2 == null || (h2 = JSONArrayExtensionsKt.getHeadersMap(jSONArray2)) == null) {
            h2 = S.h();
        }
        return new HttpRequest(str, null, requestType, str2, h2, null, null, null, null, num3 != null ? num3.intValue() : 30000, num4 != null ? num4.intValue() : 30000, 0, 0, false, null, null, 0, 129506, null);
    }

    public Object invoke(RequestType requestType, Object[] objArr, e eVar) {
        return i.g(this.ioDispatcher, new 2(objArr, this, requestType, null), eVar);
    }
}
