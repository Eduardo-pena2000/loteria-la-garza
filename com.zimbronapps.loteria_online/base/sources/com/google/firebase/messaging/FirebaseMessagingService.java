package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import s8.U;
import s8.V;
import s8.h;
import s8.n;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class FirebaseMessagingService extends h {
    public static final Queue g = new ArrayDeque(10);
    public u6.c f;

    public Intent e(Intent intent) {
        return V.b().c();
    }

    public void f(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            p(intent);
            return;
        }
        if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            t(intent.getStringExtra("token"));
            return;
        }
        Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
    }

    public final boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue queue = g;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    public final void m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (c.t(extras)) {
            c cVar = new c(extras);
            ExecutorService e = n.e();
            try {
                if (new s8.e(this, cVar, e).a()) {
                    return;
                }
                e.shutdown();
                if (b.E(intent)) {
                    b.w(intent);
                }
            } finally {
                e.shutdown();
            }
        }
        r(new d(extras));
    }

    public final String n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    public final u6.c o(Context context) {
        if (this.f == null) {
            this.f = new u6.c(context.getApplicationContext());
        }
        return this.f;
    }

    public final void p(Intent intent) {
        if (!l(intent.getStringExtra("google.message_id"))) {
            v(intent);
        }
        o(this).b(new u6.a(intent));
    }

    public void q() {
    }

    public void r(d dVar) {
    }

    public void s(String str) {
    }

    public void t(String str) {
    }

    public void u(String str, Exception exc) {
    }

    public final void v(Intent intent) {
        String stringExtra;
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                q();
                break;
            case "gcm":
                b.y(intent);
                m(intent);
                break;
            case "send_error":
                u(n(intent), new U(intent.getStringExtra("error")));
                break;
            case "send_event":
                s(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }
}
