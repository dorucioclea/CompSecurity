// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Producer;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorTake

class val.child extends Subscriber
{

    boolean completed;
    int count;
    final OperatorTake this$0;
    final Subscriber val$child;

    public void onCompleted()
    {
        if (!completed)
        {
            completed = true;
            val$child.onCompleted();
        }
    }

    public void onError(Throwable throwable)
    {
        if (completed)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        completed = true;
        val$child.onError(throwable);
        unsubscribe();
        return;
        throwable;
        unsubscribe();
        throw throwable;
    }

    public void onNext(Object obj)
    {
        if (isUnsubscribed())
        {
            break MISSING_BLOCK_LABEL_67;
        }
        int i = count + 1;
        count = i;
        if (i >= limit)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        val$child.onNext(obj);
        if (!i || completed)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        completed = true;
        val$child.onCompleted();
        unsubscribe();
        return;
        obj;
        unsubscribe();
        throw obj;
    }

    public void setProducer(final Producer producer)
    {
        val$child.setProducer(new Producer() {

            final AtomicLong requested = new AtomicLong(0L);
            final OperatorTake._cls1 this$1;
            final Producer val$producer;

            public void request(long l)
            {
                if (l <= 0L || completed) goto _L2; else goto _L1
_L1:
                long l1;
                long l2;
                l1 = requested.get();
                l2 = Math.min(l, (long)limit - l1);
                if (l2 != 0L)
                {
                    continue; /* Loop/switch isn't completed */
                }
_L2:
                return;
                if (!requested.compareAndSet(l1, l1 + l2)) goto _L1; else goto _L3
_L3:
                producer.request(l2);
                return;
            }

            
            {
                this$1 = OperatorTake._cls1.this;
                producer = producer1;
                super();
            }
        });
    }

    _cls1.val.producer()
    {
        this$0 = final_operatortake;
        val$child = Subscriber.this;
        super();
    }
}
