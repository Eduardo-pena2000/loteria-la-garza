package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.b;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int a = 0;
    public final HashMap b = new HashMap();
    public final RemoteCallbackList c = new a();
    public final b.a d = new b();

    public class a extends RemoteCallbackList {
        public a() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(androidx.room.a aVar, Object obj) {
            HashMap hashMap = MultiInstanceInvalidationService.this.b;
            Integer num = (Integer) obj;
            num.intValue();
            hashMap.remove(num);
        }
    }

    public class b extends b.a {
        public b() {
        }

        public void b0(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.c) {
                try {
                    String str = (String) MultiInstanceInvalidationService.this.b.get(Integer.valueOf(i));
                    if (str == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return;
                    }
                    int beginBroadcast = MultiInstanceInvalidationService.this.c.beginBroadcast();
                    for (int i2 = 0; i2 < beginBroadcast; i2++) {
                        try {
                            Integer num = (Integer) MultiInstanceInvalidationService.this.c.getBroadcastCookie(i2);
                            int intValue = num.intValue();
                            String str2 = (String) MultiInstanceInvalidationService.this.b.get(num);
                            if (i != intValue && str.equals(str2)) {
                                try {
                                    ((androidx.room.a) MultiInstanceInvalidationService.this.c.getBroadcastItem(i2)).o(strArr);
                                } catch (RemoteException e) {
                                    Log.w("ROOM", "Error invoking a remote callback", e);
                                }
                            }
                        } finally {
                            MultiInstanceInvalidationService.this.c.finishBroadcast();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void m1(androidx.room.a aVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.c) {
                MultiInstanceInvalidationService.this.c.unregister(aVar);
                MultiInstanceInvalidationService.this.b.remove(Integer.valueOf(i));
            }
        }

        public int u0(androidx.room.a aVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.c) {
                try {
                    MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                    int i = multiInstanceInvalidationService.a + 1;
                    multiInstanceInvalidationService.a = i;
                    if (multiInstanceInvalidationService.c.register(aVar, Integer.valueOf(i))) {
                        MultiInstanceInvalidationService.this.b.put(Integer.valueOf(i), str);
                        return i;
                    }
                    MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                    multiInstanceInvalidationService2.a--;
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.d;
    }
}
