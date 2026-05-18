package com.amazon.device.iap.internal.util;

import com.amazon.device.iap.internal.a.e;
import com.amazon.device.iap.internal.a.f;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Receipt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class c {
    private static final String a = "c";

    public static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static Receipt a(JSONObject jSONObject, String str, String str2) throws e, f, IllegalArgumentException {
        int i = 1.a[b(jSONObject).ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? e(jSONObject, str, str2) : d(jSONObject, str, str2) : b(jSONObject, str, str2) : c(jSONObject, str, str2);
    }

    private static Receipt b(JSONObject jSONObject, String str, String str2) throws e, f {
        String optString = jSONObject.optString("signature");
        if (com.amazon.a.a.o.f.a(optString)) {
            b.b(a, "a signature was not found in the receipt for request ID " + str2);
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString);
            throw new f(str2, null, optString);
        }
        try {
            Receipt a2 = a(jSONObject);
            String str3 = str + "-" + a2.getReceiptId();
            boolean a3 = com.amazon.a.a.a(str3, optString);
            b.a(a, "stringToVerify/legacy:\n" + str3 + "\nsignature:\n" + optString);
            if (a3) {
                return a2;
            }
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, str3, optString);
            throw new f(str2, str3, optString);
        } catch (JSONException e) {
            throw new e(str2, jSONObject.toString(), e);
        }
    }

    private static Receipt c(JSONObject jSONObject, String str, String str2) throws e, f {
        String optString = jSONObject.optString("DeviceId");
        String optString2 = jSONObject.optString("signature");
        if (com.amazon.a.a.o.f.a(optString2)) {
            b.b(a, "a signature was not found in the receipt for request ID " + str2);
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString2);
            throw new f(str2, null, optString2);
        }
        try {
            Receipt a2 = a(jSONObject);
            ProductType productType = a2.getProductType();
            String sku = a2.getSku();
            String receiptId = a2.getReceiptId();
            ProductType productType2 = ProductType.SUBSCRIPTION;
            String format = String.format("%s|%s|%s|%s|%s|%s|%s|%tQ|%tQ", new Object[]{"2.10.5.0", str, optString, productType, sku, receiptId, str2, productType2 == a2.getProductType() ? a2.getPurchaseDate() : null, productType2 == a2.getProductType() ? a2.getCancelDate() : null});
            b.a(a, "stringToVerify/v1:\n" + format + "\nsignature:\n" + optString2);
            if (com.amazon.a.a.a(format, optString2)) {
                return a2;
            }
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, format, optString2);
            throw new f(str2, format, optString2);
        } catch (JSONException e) {
            throw new e(str2, jSONObject.toString(), e);
        }
    }

    private static Receipt d(JSONObject jSONObject, String str, String str2) throws e, f {
        String optString = jSONObject.optString("DeviceId");
        String optString2 = jSONObject.optString("signature");
        Date date = null;
        if (com.amazon.a.a.o.f.a(optString2)) {
            b.b(a, "a signature was not found in the receipt for request ID " + str2);
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString2);
            throw new f(str2, null, optString2);
        }
        try {
            String string = jSONObject.getString("receiptId");
            String string2 = jSONObject.getString("sku");
            ProductType valueOf = ProductType.valueOf(jSONObject.getString("itemType").toUpperCase());
            String optString3 = jSONObject.optString("purchaseDate");
            Date b = a(optString3) ? null : b(optString3);
            String optString4 = jSONObject.optString("cancelDate");
            if (!a(optString4)) {
                date = b(optString4);
            }
            Receipt build = new ReceiptBuilder().setReceiptId(string).setSku(string2).setProductType(valueOf).setPurchaseDate(b).setCancelDate(date).build();
            String format = String.format("%s|%s|%s|%s|%s|%tQ|%tQ", new Object[]{str, optString, build.getProductType(), build.getSku(), build.getReceiptId(), build.getPurchaseDate(), build.getCancelDate()});
            b.a(a, "stringToVerify/v2:\n" + format + "\nsignature:\n" + optString2);
            if (com.amazon.a.a.a(format, optString2)) {
                return build;
            }
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, format, optString2);
            throw new f(str2, format, optString2);
        } catch (JSONException e) {
            throw new e(str2, jSONObject.toString(), e);
        }
    }

    private static Receipt e(JSONObject jSONObject, String str, String str2) throws e, f {
        String optString = jSONObject.optString("DeviceId");
        String optString2 = jSONObject.optString("signature");
        Date date = null;
        if (com.amazon.a.a.o.f.a(optString2)) {
            b.b(a, "a signature was not found in the receipt for request ID " + str2);
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString2);
            throw new f(str2, null, optString2);
        }
        try {
            String string = jSONObject.getString("receiptId");
            String string2 = jSONObject.getString("sku");
            String optString3 = jSONObject.optString("termSku", (String) null);
            String optString4 = jSONObject.optString("deferredSku", (String) null);
            ProductType valueOf = ProductType.valueOf(jSONObject.getString("itemType").toUpperCase());
            String optString5 = jSONObject.optString("purchaseDate");
            Date b = a(optString5) ? null : b(optString5);
            String optString6 = jSONObject.optString("cancelDate");
            Date b2 = a(optString6) ? null : b(optString6);
            String optString7 = jSONObject.optString("deferredDate");
            if (!a(optString7)) {
                date = b(optString7);
            }
            Receipt build = new ReceiptBuilder().setReceiptId(string).setSku(string2).setProductType(valueOf).setPurchaseDate(b).setCancelDate(b2).setDeferredDate(date).setDeferredSku(optString4).setTermSku(optString3).build();
            String format = String.format("%s|%s|%s|%s|%s|%s|%s|%tQ|%tQ|%tQ", new Object[]{str, optString, build.getProductType(), build.getSku(), build.getReceiptId(), build.getDeferredSku(), build.getTermSku(), build.getPurchaseDate(), build.getCancelDate(), build.getDeferredDate()});
            b.a(a, "stringToVerify/v3:\n" + format + "\nsignature:\n" + optString2);
            if (com.amazon.a.a.a(format, optString2)) {
                return build;
            }
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, format, optString2);
            throw new f(str2, format, optString2);
        } catch (JSONException e) {
            throw new e(str2, jSONObject.toString(), e);
        }
    }

    private static Receipt a(JSONObject jSONObject) throws JSONException {
        String optString = jSONObject.optString("token");
        String string = jSONObject.getString("sku");
        ProductType valueOf = ProductType.valueOf(jSONObject.getString("itemType").toUpperCase());
        String optString2 = jSONObject.optString("startDate");
        Date b = a(optString2) ? null : b(optString2);
        String optString3 = jSONObject.optString("endDate");
        return new ReceiptBuilder().setReceiptId(optString).setSku(string).setProductType(valueOf).setPurchaseDate(b).setCancelDate(a(optString3) ? null : b(optString3)).build();
    }

    public static Date b(String str) throws JSONException {
        try {
            Date parse = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(str);
            if (0 == parse.getTime()) {
                return null;
            }
            return parse;
        } catch (ParseException e) {
            throw new JSONException(e.getMessage());
        }
    }

    private static d b(JSONObject jSONObject) {
        String optString = jSONObject.optString("DeviceId");
        String optString2 = jSONObject.optString("receiptId");
        String optString3 = jSONObject.optString("iapReceiptType");
        if (!com.amazon.a.a.o.f.a(optString3)) {
            d dVar = d.d;
            if (optString3.equals(dVar.name())) {
                return dVar;
            }
        }
        if (!com.amazon.a.a.o.f.a(optString2)) {
            return d.c;
        }
        if (com.amazon.a.a.o.f.a(optString)) {
            return d.a;
        }
        return d.b;
    }

    public static boolean a(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static JSONObject a(Receipt receipt, String str) {
        JSONObject jSONObject = new JSONObject();
        if (receipt != null && !com.amazon.a.a.o.f.a(str)) {
            try {
                jSONObject.put("receiptId", receipt.getReceiptId());
                jSONObject.put("sku", receipt.getSku());
                jSONObject.put("itemType", receipt.getProductType());
                jSONObject.put("purchaseDate", receipt.getPurchaseDate());
                jSONObject.put("endDate", receipt.getCancelDate());
                jSONObject.put("signature", str);
            } catch (JSONException unused) {
                b.b(a, "Failure during toJsonInternal: " + receipt + ", signature:" + str);
            }
        }
        return jSONObject;
    }

    public static String b(Receipt receipt, String str) {
        try {
            return a(receipt, str).toString(4);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static List a(String str, String str2, String str3) throws JSONException, e, f, IllegalArgumentException {
        if (str2 == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str2);
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(a(jSONArray.getJSONObject(i), str, str3));
            } catch (e e) {
                b.b(a, "fail to parse receipt, requestId:" + e.a());
                throw e;
            } catch (f e2) {
                b.b(a, "fail to verify receipt, requestId:" + e2.a());
                throw e2;
            } catch (Throwable th) {
                b.b(a, "fail to verify receipt, requestId:" + th.getMessage());
                throw th;
            }
        }
        return arrayList;
    }
}
