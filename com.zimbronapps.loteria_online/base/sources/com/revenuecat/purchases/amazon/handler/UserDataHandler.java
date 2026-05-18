package com.revenuecat.purchases.amazon.handler;

import Ca.I;
import Qa.l;
import android.os.Handler;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.listener.UserDataResponseListener;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.utils.DefaultTimestampProvider;
import com.revenuecat.purchases.utils.TimestampProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UserDataHandler implements UserDataResponseListener {
    private static final long CACHE_EXPIRATION_TIME_MILLIS = 300000;
    public static final Companion Companion = new Companion(null);
    private static final long GET_USER_DATA_TIMEOUT_MILLIS = 10000;
    private Long lastUserDataRequestTimestamp;
    private final Handler mainHandler;
    private final PurchasingServiceProvider purchasingServiceProvider;
    private final Map requests;
    private final TimestampProvider timestampProvider;
    private UserData userDataCache;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Request {
        private final l onError;
        private final l onReceive;

        public Request(l lVar, l lVar2) {
            t.g(lVar, "onReceive");
            t.g(lVar2, "onError");
            this.onReceive = lVar;
            this.onError = lVar2;
        }

        public static /* synthetic */ Request copy$default(Request request, l lVar, l lVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                lVar = request.onReceive;
            }
            if ((i & 2) != 0) {
                lVar2 = request.onError;
            }
            return request.copy(lVar, lVar2);
        }

        public final l component1() {
            return this.onReceive;
        }

        public final l component2() {
            return this.onError;
        }

        public final Request copy(l lVar, l lVar2) {
            t.g(lVar, "onReceive");
            t.g(lVar2, "onError");
            return new Request(lVar, lVar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return t.c(this.onReceive, request.onReceive) && t.c(this.onError, request.onError);
        }

        public final l getOnError() {
            return this.onError;
        }

        public final l getOnReceive() {
            return this.onReceive;
        }

        public int hashCode() {
            return (this.onReceive.hashCode() * 31) + this.onError.hashCode();
        }

        public String toString() {
            return "Request(onReceive=" + this.onReceive + ", onError=" + this.onError + ')';
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserDataResponse.RequestStatus.values().length];
            try {
                iArr[UserDataResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserDataResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserDataResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UserDataHandler(PurchasingServiceProvider purchasingServiceProvider, Handler handler, TimestampProvider timestampProvider) {
        t.g(purchasingServiceProvider, "purchasingServiceProvider");
        t.g(handler, "mainHandler");
        t.g(timestampProvider, "timestampProvider");
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.mainHandler = handler;
        this.timestampProvider = timestampProvider;
        this.requests = new LinkedHashMap();
    }

    public static /* synthetic */ void a(UserDataHandler userDataHandler, RequestId requestId) {
        addTimeoutToUserDataRequest$lambda$8(userDataHandler, requestId);
    }

    private final void addTimeoutToUserDataRequest(RequestId requestId) {
        this.mainHandler.postDelayed(new b(this, requestId), 10000L);
    }

    private static final void addTimeoutToUserDataRequest$lambda$8(UserDataHandler userDataHandler, RequestId requestId) {
        Request request = userDataHandler.getRequest(requestId);
        if (request == null) {
            return;
        }
        request.getOnError().invoke(new PurchasesError(PurchasesErrorCode.UnknownError, "Timeout error trying to get Amazon user data."));
    }

    private final synchronized UserData getCachedUserDataIfAvailable() {
        Long l;
        UserData userData = this.userDataCache;
        if (userData != null && (l = this.lastUserDataRequestTimestamp) != null) {
            if (this.timestampProvider.getCurrentTimeMillis() - l.longValue() < 300000) {
                return userData;
            }
        }
        return null;
    }

    private final synchronized Request getRequest(RequestId requestId) {
        return (Request) this.requests.remove(requestId);
    }

    private final void invokeWithStoreProblem(l lVar, String str) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, str));
    }

    public void getUserData(l lVar, l lVar2) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        UserData cachedUserDataIfAvailable = getCachedUserDataIfAvailable();
        if (cachedUserDataIfAvailable == null) {
            RequestId userData = this.purchasingServiceProvider.getUserData();
            Request request = new Request(lVar, lVar2);
            synchronized (this) {
                this.requests.put(userData, request);
                addTimeoutToUserDataRequest(userData);
                I i = I.a;
            }
            return;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        UserDataHandler$getUserData$lambda$4$$inlined$log$1 userDataHandler$getUserData$lambda$4$$inlined$log$1 = new UserDataHandler$getUserData$lambda$4$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke(), null);
                break;
        }
        lVar.invoke(cachedUserDataIfAvailable);
    }

    public void onUserDataResponse(UserDataResponse userDataResponse) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        t.g(userDataResponse, "response");
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            UserDataHandler$onUserDataResponse$$inlined$log$1 userDataHandler$onUserDataResponse$$inlined$log$1 = new UserDataHandler$onUserDataResponse$$inlined$log$1(logIntent, userDataResponse);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke(), null);
                    break;
            }
            RequestId requestId = userDataResponse.getRequestId();
            t.f(requestId, "response.requestId");
            Request request = getRequest(requestId);
            if (request == null) {
                return;
            }
            UserDataResponse.RequestStatus requestStatus = userDataResponse.getRequestStatus();
            int i = requestStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[requestStatus.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    invokeWithStoreProblem(request.getOnError(), "Failed to get user data. Make sure sandbox mode is enabled if using App Tester. https://rev.cat/enter-amazon-sandbox");
                    return;
                } else if (i != 3) {
                    invokeWithStoreProblem(request.getOnError(), "Failed to get user data. There was an Amazon store problem.");
                    return;
                } else {
                    invokeWithStoreProblem(request.getOnError(), "Failed to get user data. Call is not supported.");
                    return;
                }
            }
            synchronized (this) {
                this.lastUserDataRequestTimestamp = Long.valueOf(this.timestampProvider.getCurrentTimeMillis());
                this.userDataCache = userDataResponse.getUserData();
                I i2 = I.a;
            }
            l onReceive = request.getOnReceive();
            UserData userData = userDataResponse.getUserData();
            t.f(userData, "response.userData");
            onReceive.invoke(userData);
        } catch (Exception e) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception in onUserDataResponse", e);
            throw e;
        }
    }

    public /* synthetic */ UserDataHandler(PurchasingServiceProvider purchasingServiceProvider, Handler handler, TimestampProvider timestampProvider, int i, k kVar) {
        this(purchasingServiceProvider, handler, (i & 4) != 0 ? new DefaultTimestampProvider() : timestampProvider);
    }
}
