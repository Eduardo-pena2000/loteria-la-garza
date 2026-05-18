package com.unity3d.services.core.network.core;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.B0;
import cb.O;
import cb.P;
import cb.Z;
import cb.i;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.k;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class UnityAdsUrlRequestCallback extends UrlRequest.Callback {
    private static final int BYTE_BUFFER_CAPACITY_BYTES = 16384;
    public static final Companion Companion = new Companion(null);
    private final ByteArrayOutputStream bytesReceived;
    private final ISDKDispatchers dispatchers;
    private final long readTimeout;
    private final WritableByteChannel receiveChannel;
    private B0 task;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @f(c = "com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback$startTimer$1", f = "UnityAdsUrlRequestCallback.kt", l = {75}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ UrlRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(UrlRequest urlRequest, e eVar) {
            super(2, eVar);
            this.$request = urlRequest;
        }

        public final e create(Object obj, e eVar) {
            return UnityAdsUrlRequestCallback.this.new 1(this.$request, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                long readTimeout = UnityAdsUrlRequestCallback.this.getReadTimeout();
                this.label = 1;
                if (Z.a(readTimeout, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            this.$request.cancel();
            return I.a;
        }
    }

    public UnityAdsUrlRequestCallback(ISDKDispatchers dispatchers, long j) {
        kotlin.jvm.internal.t.g(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
        this.readTimeout = j;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.bytesReceived = byteArrayOutputStream;
        this.receiveChannel = Channels.newChannel(byteArrayOutputStream);
    }

    private final void cancelTimer() {
        B0 b0 = this.task;
        if (b0 != null) {
            B0.a.b(b0, null, 1, null);
        }
        this.task = null;
    }

    public static /* synthetic */ void getTask$annotations() {
    }

    public final long getReadTimeout() {
        return this.readTimeout;
    }

    public final B0 getTask() {
        return this.task;
    }

    public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        super.onCanceled(urlRequest, urlResponseInfo);
        cancelTimer();
    }

    public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        cancelTimer();
    }

    public final void onReadCompleted(UrlRequest request, UrlResponseInfo info, ByteBuffer byteBuffer) {
        kotlin.jvm.internal.t.g(request, "request");
        kotlin.jvm.internal.t.g(info, "info");
        kotlin.jvm.internal.t.g(byteBuffer, "byteBuffer");
        cancelTimer();
        byteBuffer.flip();
        try {
            this.receiveChannel.write(byteBuffer);
        } catch (IOException e) {
            DeviceLog.info("IOException during ByteBuffer read. Details: ", e);
        }
        byteBuffer.clear();
        startTimer(request);
        request.read(byteBuffer);
    }

    public void onRedirectReceived(UrlRequest request, UrlResponseInfo urlResponseInfo, String str) {
        kotlin.jvm.internal.t.g(request, "request");
        request.followRedirect();
    }

    public final void onResponseStarted(UrlRequest request, UrlResponseInfo info) {
        kotlin.jvm.internal.t.g(request, "request");
        kotlin.jvm.internal.t.g(info, "info");
        startTimer(request);
        request.read(ByteBuffer.allocateDirect(16384));
    }

    public final void onSucceeded(UrlRequest request, UrlResponseInfo info) {
        kotlin.jvm.internal.t.g(request, "request");
        kotlin.jvm.internal.t.g(info, "info");
        cancelTimer();
        byte[] bodyBytes = this.bytesReceived.toByteArray();
        kotlin.jvm.internal.t.f(bodyBytes, "bodyBytes");
        onSucceeded(request, info, bodyBytes);
    }

    public abstract void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, byte[] bArr);

    public final void setTask(B0 b0) {
        this.task = b0;
    }

    public final void startTimer(UrlRequest request) {
        kotlin.jvm.internal.t.g(request, "request");
        cancelTimer();
        this.task = i.d(P.a(this.dispatchers.getIo()), null, null, new 1(request, null), 3, null);
    }
}
