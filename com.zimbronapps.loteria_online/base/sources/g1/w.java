package G1;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class w implements Iterable {
    public final ArrayList a = new ArrayList();
    public final Context b;

    public interface a {
        Intent g();
    }

    public w(Context context) {
        this.b = context;
    }

    public static w e(Context context) {
        return new w(context);
    }

    public w a(Intent intent) {
        this.a.add(intent);
        return this;
    }

    public w b(Activity activity) {
        Intent g = activity instanceof a ? ((a) activity).g() : null;
        if (g == null) {
            g = k.a(activity);
        }
        if (g != null) {
            ComponentName component = g.getComponent();
            if (component == null) {
                component = g.resolveActivity(this.b.getPackageManager());
            }
            c(component);
            a(g);
        }
        return this;
    }

    public w c(ComponentName componentName) {
        int size = this.a.size();
        try {
            Intent b = k.b(this.b, componentName);
            while (b != null) {
                this.a.add(size, b);
                b = k.b(this.b, b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public void f() {
        g(null);
    }

    public void g(Bundle bundle) {
        if (this.a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (H1.a.startActivities(this.b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.b.startActivity(intent);
    }

    public Iterator iterator() {
        return this.a.iterator();
    }
}
