.class Lcom/facebook/push/mqtt/cb;
.super Ljava/lang/Object;
.source "MqttPushServiceManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/ca;


# direct methods
.method constructor <init>(Lcom/facebook/push/mqtt/ca;)V
    .locals 0

    .prologue
    .line 90
    iput-object p1, p0, Lcom/facebook/push/mqtt/cb;->a:Lcom/facebook/push/mqtt/ca;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/facebook/push/mqtt/cb;->a:Lcom/facebook/push/mqtt/ca;

    invoke-static {v0}, Lcom/facebook/push/mqtt/ca;->a(Lcom/facebook/push/mqtt/ca;)V

    .line 94
    return-void
.end method
