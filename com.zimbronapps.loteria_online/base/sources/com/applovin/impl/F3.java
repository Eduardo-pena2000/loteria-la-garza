package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.d;
import com.applovin.impl.e3;
import com.applovin.impl.g3;
import com.applovin.impl.s2;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class f3 extends n3 {
    private g3 a;
    private ListView b;

    public class a implements s2.a {
        final /* synthetic */ e3 a;

        public class a implements d.b {
            public a() {
            }

            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.a);
            }
        }

        public a(e3 e3Var) {
            this.a = e3Var;
        }

        public void a(j2 j2Var, r2 r2Var) {
            if (j2Var.b() != g3.a.e.ordinal()) {
                n7.a(r2Var.c(), r2Var.b(), (Context) f3.this);
                return;
            }
            com.applovin.impl.sdk.k o = this.a.o();
            e3.b y = this.a.y();
            if (!f3.a(f3.this).a(j2Var)) {
                n7.a(r2Var.c(), r2Var.b(), (Context) f3.this);
                return;
            }
            if (e3.b.READY == y) {
                d.a(f3.this, MaxDebuggerMultiAdActivity.class, o.e(), new a());
            } else if (e3.b.DISABLED != y) {
                n7.a(r2Var.c(), r2Var.b(), (Context) f3.this);
            } else {
                o.s0().a();
                n7.a(r2Var.c(), r2Var.b(), (Context) f3.this);
            }
        }
    }

    public f3() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public static /* synthetic */ g3 a(f3 f3Var) {
        return f3Var.a;
    }

    public com.applovin.impl.sdk.k getSdk() {
        g3 g3Var = this.a;
        if (g3Var != null) {
            return g3Var.h().o();
        }
        return null;
    }

    public void initialize(e3 e3Var) {
        setTitle(e3Var.g());
        g3 g3Var = new g3(e3Var, this);
        this.a = g3Var;
        g3Var.a(new a(e3Var));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView findViewById = findViewById(R.id.listView);
        this.b = findViewById;
        findViewById.setAdapter(this.a);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.a.k();
            this.a.c();
        }
    }
}
