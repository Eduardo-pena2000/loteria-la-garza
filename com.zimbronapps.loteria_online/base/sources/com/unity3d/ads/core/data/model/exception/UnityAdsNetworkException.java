package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.data.model.OperationType;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class UnityAdsNetworkException extends Exception {
    private final String client;
    private final Integer code;
    private final Integer cronetCode;
    private final String message;
    private final String protocol;
    private final OperationType type;
    private final String url;

    public /* synthetic */ UnityAdsNetworkException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4, int i, k kVar) {
        this(str, (i & 2) != 0 ? OperationType.UNKNOWN : operationType, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num2, (i & 64) == 0 ? str4 : null);
    }

    public final String getClient() {
        return this.client;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final Integer getCronetCode() {
        return this.cronetCode;
    }

    public String getMessage() {
        return this.message;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final OperationType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsNetworkException(String message, OperationType type, Integer num, String str, String str2, Integer num2, String str3) {
        super(message);
        t.g(message, "message");
        t.g(type, "type");
        this.message = message;
        this.type = type;
        this.code = num;
        this.url = str;
        this.protocol = str2;
        this.cronetCode = num2;
        this.client = str3;
    }
}
