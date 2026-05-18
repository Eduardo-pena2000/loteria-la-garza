package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import Ca.x;
import Da.S;
import Za.B;
import Za.E;
import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.BillingOriginalJsonResponse;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ProductDetailsBridge extends GenericBridge implements BillingOriginalJsonResponse {
    public static final Companion Companion = new Companion(null);
    private static final String TO_STRING_METHOD = "toString";
    private final Object internalRef;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsBridge(Object internalRef) {
        super(S.j(x.a("toString", new Class[0])));
        t.g(internalRef, "internalRef");
        this.internalRef = internalRef;
    }

    private final String parseOriginalJson(String str) {
        try {
            int f0 = E.f0(str, "jsonString='", 0, false, 6, null) + 12;
            int f02 = E.f0(str, "', parsedJson=", 0, false, 6, null);
            if (1 > f0 || f0 >= f02) {
                return null;
            }
            String substring = str.substring(f0, f02);
            t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return B.H(substring, "\\/", "/", false, 4, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getClassName() {
        return "com.android.billingclient.api.ProductDetails";
    }

    public JSONObject getOriginalJson() {
        try {
            String parseOriginalJson = parseOriginalJson(toString());
            return parseOriginalJson != null ? new JSONObject(parseOriginalJson) : new JSONObject();
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public String toString() {
        Object callNonVoidMethod = callNonVoidMethod("toString", this.internalRef, new Object[0]);
        t.e(callNonVoidMethod, "null cannot be cast to non-null type kotlin.String");
        return (String) callNonVoidMethod;
    }
}
