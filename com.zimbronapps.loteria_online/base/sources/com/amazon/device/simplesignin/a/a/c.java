package com.amazon.device.simplesignin.a.a;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.amazon.a.a.n.a.h;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import lombok.NonNull;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class c extends h {
    private static final String b = "c";

    public class 1 implements Runnable {
        final /* synthetic */ Object a;
        final /* synthetic */ ISimpleSignInResponseHandler b;

        public 1(Object obj, ISimpleSignInResponseHandler iSimpleSignInResponseHandler) {
            this.a = obj;
            this.b = iSimpleSignInResponseHandler;
        }

        public void run() {
            try {
                Object obj = this.a;
                if (obj instanceof GetUserAndLinksResponse) {
                    this.b.onGetUserAndLinksResponse((GetUserAndLinksResponse) obj);
                } else if (obj instanceof LinkUserAccountResponse) {
                    this.b.onLinkUserAccountResponse((LinkUserAccountResponse) obj);
                } else if (obj instanceof ShowLoginSelectionResponse) {
                    this.b.onShowLoginSelectionResponse((ShowLoginSelectionResponse) obj);
                } else if (obj instanceof RecordMetricsEventResponse) {
                    this.b.onRecordMetricsEventResponse((RecordMetricsEventResponse) obj);
                } else {
                    com.amazon.device.simplesignin.a.d.a.b(c.o(), "Unknown response type:" + this.a.getClass().getName());
                }
            } catch (Exception e) {
                com.amazon.device.simplesignin.a.d.a.b(c.o(), "Error in sending response to callback: " + e);
            }
        }
    }

    public c(d dVar, String str, String str2) {
        super(dVar, str, str2, dVar.e().toString(), "1.0.0");
        super.b(false);
    }

    public static /* synthetic */ String o() {
        return b;
    }

    public abstract void a(RequestStatus requestStatus);

    public void a(@NonNull Object obj) {
        if (obj == null) {
            throw new NullPointerException("response is marked non-null but is null");
        }
        String str = b;
        com.amazon.device.simplesignin.a.d.a.a(str, "Response type received: " + obj.getClass().getSimpleName());
        Context c = com.amazon.device.simplesignin.a.c.a().c();
        ISimpleSignInResponseHandler d = com.amazon.device.simplesignin.a.c.a().d();
        if (c == null || d == null) {
            com.amazon.device.simplesignin.a.d.a.a(str, "Dropping the response as context of response handler is null.");
        } else {
            new Handler(c.getMainLooper()).post(new 1(obj, d));
        }
    }

    public void b(com.amazon.d.a.h hVar) {
        String g;
        try {
            g = hVar.g();
        } catch (RemoteException unused) {
            com.amazon.device.simplesignin.a.d.a.b(b, "Exception while fetching reason for failure");
        }
        if ("CVA_VERSION_NOT_SUPPORTED".equals(g)) {
            a(RequestStatus.NOT_SUPPORTED);
            return;
        }
        if ("SSI_FEATURE_NOT_AVAILABLE".equals(g)) {
            a(RequestStatus.NOT_AVAILABLE);
            return;
        }
        if ("SSI_DUPLICATE_REQUEST".equals(g)) {
            a(RequestStatus.DUPLICATE_REQUEST);
            return;
        }
        if ("SSI_FEATURE_TURNED_OFF".equals(g)) {
            a(RequestStatus.FEATURE_TURNED_OFF);
            return;
        }
        if ("SSI_RETRYABLE_FAILURE".equals(g)) {
            a(RequestStatus.RETRYABLE_FAILURE);
            return;
        }
        if ("SSI_INVALID_LINK_SIGNING_KEY_ENCRYPTION".equals(g)) {
            a(RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION);
            return;
        }
        if ("SSI_INVALID_LINK_SIGNING_KEY".equals(g)) {
            a(RequestStatus.INVALID_LINK_SIGNING_KEY);
            return;
        }
        a(RequestStatus.FAILURE);
    }
}
